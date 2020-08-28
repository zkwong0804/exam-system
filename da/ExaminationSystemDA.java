/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import domain.*;
import static java.awt.image.ImageObserver.HEIGHT;

/**
 *
 * @author tommy
 */
public class ExaminationSystemDA {
    private String host = "jdbc:derby://localhost:1527/f:/examinationSystemDB;create=true";
    private String user = "taruc";
    private String password = "taruc";
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public ExaminationSystemDA(){
        createConnection();
    }
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setPaymentReport(){
        ArrayList<payment> paymentList = getPaymentList();
        paymentReport pReport = new paymentReport();
        String paymentType = "";
        int totalPeopleOfRenewID = 0, totalPeopleOfRegisterSubject = 0;
        double totalTransactionOfRenewID = 0, totalTransactionOfRegisterSubject = 0;
        //get payment report database
        ArrayList<paymentReport> paymentReportList = new ArrayList<paymentReport>();
        paymentReport paymentReport = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"PAYMENT REPORT\"";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                paymentReportList.add(paymentReport = new paymentReport(rs.getString("paymentType"), rs.getInt("totalPeople"), rs.getDouble("totalTransaction")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        //start update or create
        if(paymentReportList.isEmpty()==false){
            System.out.println("This is update payment report");
            for(int i=0;i<paymentList.size();i++){
            if(paymentList.get(i).getPaymentName().equalsIgnoreCase("RENEW STUDENT ID")){
                totalPeopleOfRenewID++;
                totalTransactionOfRenewID+=paymentList.get(i).getPaymentCost();
            }
            else{
                totalPeopleOfRegisterSubject++;
                totalTransactionOfRegisterSubject+=paymentList.get(i).getPaymentCost();
            }
        }
        try {
            String sqlQueryStr = "UPDATE \"PAYMENT REPORT\" SET \"totalPeople\" = ?, \"totalTransaction\" = ? WHERE \"paymentType\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setInt(1, totalPeopleOfRenewID);
            stmt.setDouble(2, totalTransactionOfRenewID);
            stmt.setString(3, "RENEW STUDENT ID");
            stmt.executeUpdate();
            
            sqlQueryStr = "UPDATE \"PAYMENT REPORT\" SET \"totalPeople\" = ?, \"totalTransaction\" = ? WHERE \"paymentType\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setInt(1, totalPeopleOfRegisterSubject);
            stmt.setDouble(2, totalTransactionOfRegisterSubject);
            stmt.setString(3, "REGISTER EXAMINATION");
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
            System.out.println("This is create payment report");
            for(int i=0;i<paymentList.size();i++){
            if(paymentList.get(i).getPaymentName().equalsIgnoreCase("RENEW STUDENT ID")){
                totalPeopleOfRenewID++;
                totalTransactionOfRenewID+=paymentList.get(i).getPaymentCost();
            }
            else{
                totalPeopleOfRegisterSubject++;
                totalTransactionOfRegisterSubject+=paymentList.get(i).getPaymentCost();
            }
        }
        try {
            String sqlQueryStr = "INSERT INTO \"PAYMENT REPORT\" VALUES (?,?,?)";
            stmt = conn.prepareStatement(sqlQueryStr);
             stmt.setString(1, "RENEW STUDENT ID");
            stmt.setInt(2, totalPeopleOfRenewID);
            stmt.setDouble(3, totalTransactionOfRenewID);
           
            stmt.executeUpdate();
            
            sqlQueryStr = "INSERT INTO \"PAYMENT REPORT\" VALUES (?,?,?)";
            stmt = conn.prepareStatement(sqlQueryStr);
             stmt.setString(1, "REGISTER EXAMINATION");
            stmt.setInt(2, totalPeopleOfRegisterSubject);
            stmt.setDouble(3, totalTransactionOfRegisterSubject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }
    
    public ArrayList<admin> getAdminList(){
        ArrayList<admin> adminList = new ArrayList<admin>();
        admin admin = null;
        try {
            String sqlQueryStr = "SELECT * FROM ADMIN";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                adminList.add(admin = new admin(rs.getString("adminID"), rs.getString("adminName"), rs.getString("adminContactNumber"), rs.getString("adminPassword"), rs.getString("adminAnswer"), rs.getInt("loginTimes")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return adminList;        
    }
    
    public ArrayList<examiner> getExaminerList(){
        ArrayList<examiner> examinerList = new ArrayList<examiner>();
        examiner examiner = null;
        try {
            String sqlQueryStr = "SELECT * FROM EXAMINER";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                examinerList.add(examiner = new examiner(rs.getString("examinerID"), rs.getString("examinerName"), rs.getInt("examinerAge"), rs.getString("examinerContactNumber"), rs.getString("examinerIC"), rs.getInt("examinerIntakeYear"), rs.getString("examinerCourse"), rs.getDouble("examinerBalance"), rs.getString("examinerPassword"), rs.getString("examinerAnswer"), rs.getInt("loginTimes")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return examinerList;        
    }
    
    public ArrayList<course> getCourseList(){
        ArrayList<course> courseList = new ArrayList<course>();
        course course = null;
        try {
            String sqlQueryStr = "SELECT * FROM COURSE";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                courseList.add(course = new course(rs.getString("courseID"), rs.getString("courseName"), rs.getString("courseDescription")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return courseList;        
    }
    
    public void createCourse(course course){
        String sqlQueryStr = "INSERT INTO COURSE VALUES(?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, course.getcourseID());
            stmt.setString(2, course.getcourseName());
            stmt.setString(3, course.getcourseDescription());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Create record success!", "CREATE RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateCourse(course course){
        try {
            String sqlQueryStr = "UPDATE COURSE SET \"courseName\" = ?, \"courseDescription\" = ? WHERE \"courseID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, course.getcourseName());
            stmt.setString(2, course.getcourseDescription());
            stmt.setString(3, course.getcourseID());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update success","UPDATE RECORD SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public course getSelectedCourse(String courseID){
        course selectedCourse = null;
        try {
            String sqlQueryStr = "SELECT * FROM COURSE WHERE \"courseID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, courseID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                selectedCourse = new course(rs.getString("courseID"), rs.getString("courseName"), rs.getString("courseDescription"));
            }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return selectedCourse;
    }
    
    public ArrayList<subject> getSubjectListByCourseID(String courseID){
        ArrayList<subject> subjectList = new ArrayList<subject>();
        subject subject = null;
        try {
            String sqlQueryStr = "SELECT * FROM SUBJECT WHERE \"courseID\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, courseID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                subjectList.add(subject = new subject(rs.getString("subjectID"), rs.getString("subjectName"), rs.getString("subjectDescription"), rs.getString("courseID"), rs.getString("lecturer"), rs.getInt("totalExaminer"), rs.getDouble("passRate"), rs.getString("courseName")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return subjectList;        
    }
    
    public String getSubjectIDBySubjectName(String subjectName){
        String subjectID = "";
        try {
            String sqlQueryStr = "SELECT \"subjectID\" FROM SUBJECT WHERE \"subjectName\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, subjectName);
            rs = stmt.executeQuery();
            while (rs.next()) {
                subjectID = rs.getString("subjectID");
                }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return subjectID;        
    }
    
    public String getCourseIDByCourseName(String courseName){
        String courseID = "";
        try {
            String sqlQueryStr = "SELECT * FROM COURSE WHERE \"courseName\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, courseName);
            rs = stmt.executeQuery();
            while (rs.next()) {
                courseID = rs.getString("courseID");
                }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return courseID;        
    }
    
    public String getCourseNameByCourseID(String courseID){
        String courseName = "";
        try {
            String sqlQueryStr = "SELECT * FROM COURSE WHERE \"courseID\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, courseID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                courseName = rs.getString("courseName");
                }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return courseName;        
    }
    
    public String getLecturerBySubjectName(String subjectName){
        String lecturer = "";
        try {
            String sqlQueryStr = "SELECT \"lecturer\" FROM SUBJECT WHERE \"subjectName\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, subjectName);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                lecturer = rs.getString("lecturer");
                }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lecturer;        
    }
    
    public ArrayList<subject> getSubjectList(){
        ArrayList<subject> subjectList = new ArrayList<subject>();
        subject subject = null;
        try {
            String sqlQueryStr = "SELECT * FROM SUBJECT";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                subjectList.add(subject = new subject(rs.getString("subjectID"), rs.getString("subjectName"), rs.getString("subjectDescription"), rs.getString("courseID"), rs.getString("lecturer"), rs.getInt("totalExaminer"), rs.getDouble("passRate"), rs.getString("courseName")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return subjectList;        
    }
    
    public void createSubject(subject subject){
        String sqlQueryStr = "INSERT INTO SUBJECT VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, subject.getSubjectID());
            stmt.setString(2, subject.getSubjectName());
            stmt.setString(3, subject.getSubjectDescription());
            stmt.setString(4, subject.getCourseID());
            stmt.setString(5, subject.getLecturer());
            stmt.setInt(6, subject.getTotalExaminer());
            stmt.setDouble(7, subject.getPassRate());
            stmt.setString(8, subject.getCourseName());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Create record success!", "CREATE RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateSubject(subject subject){
        try {
            System.out.println("you in updateSubject");
            String sqlQueryStr = "UPDATE SUBJECT SET \"subjectName\" = ?, \"subjectDescription\" = ?, \"courseID\" = ?, \"lecturer\" = ?, \"totalExaminer\"=?, \"passRate\"=?, \"courseName\"=? WHERE \"subjectID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, subject.getSubjectName());
            stmt.setString(2, subject.getSubjectDescription());
            stmt.setString(3, subject.getCourseID());
            stmt.setString(4, subject.getLecturer());
            stmt.setInt(5, subject.getTotalExaminer());
            stmt.setDouble(6, subject.getPassRate());
            stmt.setString(7, subject.getCourseName());
            stmt.setString(8, subject.getSubjectID());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setPassrate(){
        int totalExaminerTakingThisSubject = 0, totalExamienrPassThisSubject = 0;
        double passrate = 0;
        String subjectID = "";
        ArrayList<subject> subjectList = getSubjectList();
        ArrayList<examinerResult> examinerResultList;
        for(int i=0;i<subjectList.size();i++){
            subjectID = subjectList.get(i).getSubjectID();
            totalExaminerTakingThisSubject= subjectList.get(i).getTotalExaminer();
            examinerResultList = getExaminerResultBySubjectID(subjectID);
            for(int j=0;j<examinerResultList.size();j++){
                if(examinerResultList.get(j).getGrade()!='f'){
                    totalExamienrPassThisSubject++;
                }
            }
            subject subject = subjectList.get(i);
            passrate = (totalExamienrPassThisSubject/totalExaminerTakingThisSubject)*100;
            subject.setPassRate(passrate);
            updateSubject(subject);
            totalExamienrPassThisSubject = 0;
            passrate = 0;
            totalExaminerTakingThisSubject = 0;
        }
    }
    
    public subject getSelectedSubject(String subjectID){
        subject selectedSubject = null;
        try {
            String sqlQueryStr = "SELECT * FROM SUBJECT WHERE \"subjectID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, subjectID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                selectedSubject = new subject(rs.getString("subjectID"), rs.getString("subjectName"), rs.getString("subjectDescription"), rs.getString("courseID"), rs.getString("lecturer"), rs.getInt("totalExaminer"), rs.getDouble("passRate"), rs.getString("courseName"));
            }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return selectedSubject;
    }
    
    public void updateAdmin(admin newAdmin){
        try {
            String sqlQueryStr = "UPDATE ADMIN SET \"adminName\" = ?, \"adminContactNumber\" = ?, \"adminPassword\" = ?, \"adminAnswer\" = ?, \"loginTimes\" = ? WHERE \"adminID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, newAdmin.getAdminName());
            stmt.setString(2, newAdmin.getAdminContactNumber());
            stmt.setString(3, newAdmin.getAdminPassword());
            stmt.setString(4, newAdmin.getAdminAnswer());
            stmt.setInt(5, 1);
            stmt.setString(6, newAdmin.getAdminID());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<staff> getStaffList(){
        ArrayList<staff> staffList = new ArrayList<staff>();
        staff staff = null;
        try {
            String sqlQueryStr = "SELECT * FROM STAFF";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                staffList.add(staff = new staff(rs.getString("staffID"), rs.getString("staffName"), rs.getInt("staffAge"), rs.getString("staffContactNumber"), rs.getString("staffIC"), rs.getString("staffAddress"), rs.getString("staffPassword"), rs.getString("staffAnswer"), rs.getInt("loginTimes")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return staffList;        
    }
    
    public void createExaminer(examiner examiner){
        String sqlQueryStr = "INSERT INTO EXAMINER VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examiner.getexaminerID());
            stmt.setString(2, examiner.getexaminerName());
            stmt.setInt(3, examiner.getexaminerAge());
            stmt.setString(4, examiner.getexaminerContactNumber());
            stmt.setString(5, examiner.getexaminerIC());
            stmt.setInt(6, examiner.getexaminerIntakeYear());
            stmt.setString(7, examiner.getexaminerCourse());
            stmt.setDouble(8, examiner.getexaminerBalance());
            stmt.setString(9, examiner.getexaminerPassword());
            stmt.setString(10, examiner.getexaminerAnswer());
            stmt.setDouble(11, 0.00);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Create record success!", "CREATE RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public examiner getSelectedExaminer(String examinerID){
        examiner selectedExaminer = null;
        try {
            String sqlQueryStr = "SELECT * FROM EXAMINER WHERE \"examinerID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examinerID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                selectedExaminer = new examiner(rs.getString("examinerID"), rs.getString("examinerName"), rs.getInt("examinerAge"), rs.getString("examinerContactNumber"), rs.getString("examinerIC"), rs.getInt("examinerIntakeYear"), rs.getString("examinerCourse"), rs.getDouble("examinerBalance"), rs.getString("examinerPassword"), rs.getString("examinerAnswer"), rs.getInt("loginTimes"));
            }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return selectedExaminer;
    }
    
    public staff getSelectedStaff(String staffID){
        staff selectedStaff = null;
        try {
            String sqlQueryStr = "SELECT * FROM STAFF WHERE \"staffID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, staffID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                selectedStaff = new staff(rs.getString("staffID"), rs.getString("staffName"), rs.getInt("staffAge"), rs.getString("staffContactNumber"), rs.getString("staffIC"), rs.getString("staffAddress"), rs.getString("staffPassword"), rs.getString("staffAnswer"), rs.getInt("loginTimes"));
            }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return selectedStaff;
    }
    
    public void removeRecord(String id, String tableName){
        try {
            String deleteStr = "DELETE FROM " + tableName + " WHERE \""+tableName.toLowerCase()+"ID\" = ?";
            stmt = conn.prepareStatement(deleteStr);
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Remove record success!", "REMOVE RECORD SUCCESS", HEIGHT);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void topupBalance(String examinerID, double topupBalance){
        try {
            String sqlQueryStr = "UPDATE EXAMINER SET \"examinerBalance\"=? WHERE \"examinerID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setDouble(1, topupBalance);
            stmt.setString(2, examinerID);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update record success!", "Update RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateExaminer(examiner examiner){
        
        try {
            String sqlQueryStr = "UPDATE EXAMINER SET \"examinerName\" = ?, \"examinerAge\" = ?, \"examinerContactNumber\" = ?, \"examinerIC\" = ?, \"examinerIntakeYear\" = ?, \"examinerCourse\" = ?, \"examinerBalance\" = ?, \"examinerPassword\" = ?, \"examinerAnswer\" = ?, \"loginTimes\" = ? WHERE \"examinerID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examiner.getexaminerName());
            stmt.setInt(2, examiner.getexaminerAge());
            stmt.setString(3, examiner.getexaminerContactNumber());
            stmt.setString(4, examiner.getexaminerIC());
            stmt.setInt(5, examiner.getexaminerIntakeYear());
            stmt.setString(6, examiner.getexaminerCourse());
            stmt.setDouble(7, examiner.getexaminerBalance());
            stmt.setString(8, examiner.getexaminerPassword());
            stmt.setString(9, examiner.getexaminerAnswer());
            stmt.setInt(10, 1);
            stmt.setString(11, examiner.getexaminerID());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update record success!", "Update RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateStaff(staff staff){
        
        try {
            String sqlQueryStr = "UPDATE STAFF SET \"staffName\" = ?, \"staffAge\" = ?, \"staffContactNumber\" = ?, \"staffIC\" = ?, \"staffAddress\" = ?, \"staffPassword\" = ?, \"staffAnswer\" = ?, \"loginTimes\" = ? WHERE \"staffID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, staff.getSatffName());
            stmt.setInt(2, staff.getStaffAge());
            stmt.setString(3, staff.getStaffContactNumber());
            stmt.setString(4, staff.getStaffIC());
            stmt.setString(5, staff.getStaffAddress());
            stmt.setString(6, staff.getStaffPassword());
            stmt.setString(7, staff.getStaffAnswer());
            stmt.setInt(8, 1);
            stmt.setString(9, staff.getStaffID());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update record success!", "Update RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void createStaff(staff staff){
         String sqlQueryStr = "INSERT INTO STAFF VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, staff.getStaffID());
            stmt.setString(2, staff.getSatffName());
            stmt.setInt(3, staff.getStaffAge());
            stmt.setString(4, staff.getStaffContactNumber());
            stmt.setString(5, staff.getStaffIC());
            stmt.setString(6, staff.getStaffAddress());
            stmt.setString(7, staff.getStaffIC_front());
            stmt.setString(8, "");
            stmt.setInt(9, 0);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Create record success!", "CREATE RECORD SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     }
     
     //timetable
     public void createTimetable(timetable timetable){
        String sqlQueryStr = "INSERT INTO TIMETABLE VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, timetable.getTimetableID());
            stmt.setString(2, timetable.getTimetableName());
            stmt.setString(3, timetable.getDay());
            if(timetable.getNineAM_TenAM()==null)
                stmt.setString(4, "");
            else
                stmt.setString(4, timetable.getNineAM_TenAM());
            
            if(timetable.getTenAM_ElevenAM()==null)
                stmt.setString(5, "");
            else
                stmt.setString(5, timetable.getTenAM_ElevenAM());
            
            if(timetable.getElevenAM_TwelvePM()==null)
                stmt.setString(6, "");
            else
                stmt.setString(6, timetable.getElevenAM_TwelvePM());
            
            if(timetable.getTwelvePM_OnePM()==null)
                stmt.setString(7, "");
            else
                stmt.setString(7, timetable.getTwelvePM_OnePM());
            
            if(timetable.getOnePM_TwoPM()==null)
                stmt.setString(8, "");
            else
                stmt.setString(8, timetable.getOnePM_TwoPM());
            
            if(timetable.getTwoPM_ThreePM()==null)
                stmt.setString(9, "");
            else
                stmt.setString(9, timetable.getTwoPM_ThreePM());
            
            if(timetable.getThreePM_FourPM()==null)
                stmt.setString(10, "");
            else
                stmt.setString(10, timetable.getThreePM_FourPM());
            
            if(timetable.getFourPM_FivePM()==null)
                stmt.setString(11, "");
            else
                stmt.setString(11, timetable.getFourPM_FivePM());
            
            if(timetable.getFivePM_SixPM()==null)
                stmt.setString(12, "");
            else
                stmt.setString(12, timetable.getFivePM_SixPM());
            
            stmt.setString(13, timetable.getCourseID());
            if(timetable.getLecturerDetail()==null)
                stmt.setString(14, "");
            else
               stmt.setString(14, timetable.getLecturerDetail());
            
            
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateTimetable(timetable timetable){
        try {
            String sqlQueryStr = "UPDATE TIMETABLE SET \"timetableName\" = ? , \"day\" = ?, \"9.00am_10.00am\" = ?, \"10.00am_11.00am\" = ?, \"11.00am_12.00pm\" = ?, \"12.00pm_1.00pm\" = ?, \"1.00pm_2.00pm\" = ?, \"2.00pm_3.00pm\" = ?, \"3.00pm_4.00pm\" = ?, \"4.00pm_5.00pm\" = ?, \"5.00pm_6.00pm\" = ?, \"courseID\" = ?, \"lecturerDetail\" = ? WHERE \"timetableID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, timetable.getTimetableName());
            stmt.setString(2, timetable.getDay());
            stmt.setString(3, timetable.getNineAM_TenAM());
            stmt.setString(4, timetable.getTenAM_ElevenAM());
            stmt.setString(5, timetable.getElevenAM_TwelvePM());
            stmt.setString(6, timetable.getTwelvePM_OnePM());
            stmt.setString(7, timetable.getOnePM_TwoPM());
            stmt.setString(8, timetable.getTwoPM_ThreePM());
            stmt.setString(9, timetable.getThreePM_FourPM());
            stmt.setString(10, timetable.getFourPM_FivePM());
            stmt.setString(11, timetable.getFivePM_SixPM());
            stmt.setString(12, timetable.getCourseID());
            stmt.setString(13, timetable.getLecturerDetail());
            stmt.setString(14, timetable.getTimetableID());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public timetable getSelectedTimetable(String timetableID){
        timetable selectedTimetable = null;
        try {
            String sqlQueryStr = "SELECT * FROM TIMETABLE WHERE \"timetableID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, timetableID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                selectedTimetable = new timetable(rs.getString("timetableID"), rs.getString("timetableName"), rs.getString("day"), rs.getString("9.00am_10.00am"), rs.getString("10.00am_11.00am"), rs.getString("11.00am_12.00pm"), rs.getString("12.00pm_1.00pm"), rs.getString("1.00pm_2.00pm"), rs.getString("2.00pm_3.00pm"), rs.getString("3.00pm_4.00pm"), rs.getString("4.00pm_5.00pm"), rs.getString("5.00pm_6.00pm"), rs.getString("courseID"), rs.getString("lecturerDetail"));
            }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return selectedTimetable;
    }
    
    //payment
     public void createPayment(payment payment){
        String sqlQueryStr = "INSERT INTO PAYMENT VALUES(?, ?, ?, ?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, payment.getPaymentID());
            stmt.setString(2, payment.getExaminerID());
            stmt.setString(3, payment.getExaminerName());
            stmt.setString(4, payment.getPaymentName());
            stmt.setDouble(5, payment.getPaymentCost());
            stmt.setString(6, payment.getPaymentDescription());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Renew Student ID success!", "RENEW STUDENT ID SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public payment getSelectedPayment(String paymentID){
        payment selectedPayment = null;
        try {
            String sqlQueryStr = "SELECT * FROM PAYMENT WHERE \"paymentID\" = ?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, paymentID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                selectedPayment = new payment(rs.getString("paymentID"), rs.getString("examinerID"), rs.getString("examinerName"), rs.getString("paymentName"), rs.getDouble("paymentCost"), rs.getString("paymentDescription"));
            }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return selectedPayment;
    }
    
    public ArrayList<payment> getPaymentList(){
        ArrayList<payment> paymentList = new ArrayList<payment>();
        payment paymentRecord = null;
        try {
            String sqlQueryStr = "SELECT * FROM PAYMENT";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                paymentList.add(paymentRecord = new payment(rs.getString("paymentID"), rs.getString("examinerID"), rs.getString("examinerName"), rs.getString("paymentName"), rs.getDouble("paymentCost"), rs.getString("paymentDescription")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return paymentList;        
    }
    
    //registered subject
     public void createRegisteredSubject(registeredSubject registeredSubject){
        String sqlQueryStr = "INSERT INTO \"REGISTERED SUBJECT\" VALUES(?, ?, ?, ?, ?)";
        
        try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, registeredSubject.getRegisterDate());
            stmt.setString(2, registeredSubject.getSubjectName());
            stmt.setString(3, registeredSubject.getExaminerID());
            stmt.setString(4, registeredSubject.getSubjectID());
            stmt.setString(5, registeredSubject.getExaminerName());
            stmt.executeUpdate();
            subject subject = getSelectedSubject(registeredSubject.getSubjectID());
            subject.setTotalExaminer(subject.getTotalExaminer()+1);
            updateSubject(subject);
            JOptionPane.showMessageDialog(null, "Register success!", "REGISTER SUBJECT SUCCESS", HEIGHT);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public ArrayList<registeredSubject> getRegisteredSubjectList(){
        ArrayList<registeredSubject> registeredSubjectList = new ArrayList<registeredSubject>();
        registeredSubject registeredSubject = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"REGISTERED SUBJECT\"";
            stmt = conn.prepareStatement(sqlQueryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                registeredSubjectList.add(registeredSubject = new registeredSubject(rs.getString("registerDate"), rs.getString("subjectName"), rs.getString("examinerID"), rs.getString("subjectID"), rs.getString("examinerName")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return registeredSubjectList;        
    }
     
     public ArrayList<registeredSubject> getRegisteredSubjectListByExaminerID(String examinerID){
        ArrayList<registeredSubject> registeredSubjectList = new ArrayList<registeredSubject>();
        registeredSubject registeredSubject = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"REGISTERED SUBJECT\" WHERE \"examinerID\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examinerID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                registeredSubjectList.add(registeredSubject = new registeredSubject(rs.getString("registerDate"), rs.getString("subjectName"), rs.getString("examinerID"), rs.getString("subjectID"), rs.getString("examinerName")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return registeredSubjectList;        
    }
     
     
     //examiner result
     
     public String createExaminerResult(examinerResult examinerResult){
         String text = "PASS";
        String sqlQueryStr = "INSERT INTO \"EXAMINER RESULT\" VALUES(?, ?, ?, ?, ?, ?, ?)";
        boolean isExist = true;
        if(getExaminerResultByExaminerID(examinerResult.getExaminerID()).isEmpty()==false){
            
            for(int i=0; i< getExaminerResultByExaminerID(examinerResult.getExaminerID()).size();i++){
            boolean isSubjectEqual = examinerResult.getSubjectID().equalsIgnoreCase(getExaminerResultByExaminerID(examinerResult.getExaminerID()).get(i).getSubjectID());
            boolean isIDEqual = examinerResult.getResultID().equalsIgnoreCase(getExaminerResultByExaminerID(examinerResult.getExaminerID()).get(i).getResultID());
            if(isSubjectEqual==true&&isIDEqual==true){
                JOptionPane.showMessageDialog(null, "Result found in database, please kindly use the update function if you want modify this result", "RECORD FOUND", JOptionPane.ERROR_MESSAGE);
                isExist = true;
                i=100;
            }
            else
                isExist = false;
        }
        }
        else
            isExist=false;
        
        if(isExist==false){
            try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examinerResult.getResultID());
            stmt.setString(2, examinerResult.getExaminerName());
            stmt.setString(3, examinerResult.getExaminerID());
            stmt.setString(4, examinerResult.getSubjectID());
            stmt.setString(5, String.valueOf(examinerResult.getGrade()));
            stmt.setDouble(6, examinerResult.getGPA());
            stmt.setDouble(7, examinerResult.getCGPA());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        else
            text="FAIL";
        
        return text;
    }
     
     public String updateExaminerResult(examinerResult examinerResult){
         String text = "PASS";
        String sqlQueryStr = "UPDATE \"EXAMINER RESULT\" SET \"resultID\" = ?, \"examinerName\" = ?, \"examinerID\"=?, \"grade\" = ?, \"GPA\" = ?, \"CGPA\" = ? WHERE \"subjectID\" = ?";
        
            try {
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examinerResult.getResultID());
            stmt.setString(2, examinerResult.getExaminerName());
            stmt.setString(3, examinerResult.getExaminerID());
            stmt.setString(4, String.valueOf(examinerResult.getGrade()));
            stmt.setDouble(5, examinerResult.getGPA());
            stmt.setDouble(6, examinerResult.getCGPA());
            stmt.setString(7, examinerResult.getSubjectID());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return text;
    }
     
     public ArrayList<examinerResult> getExaminerResultBySubjectID(String subjectID){
        ArrayList<examinerResult> examinerResultList = new ArrayList<examinerResult>();
        examinerResult examinerResult = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"EXAMINER RESULT\" WHERE \"subjectID\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, subjectID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                examinerResultList.add(examinerResult = new examinerResult(rs.getString("resultID"), rs.getString("examinerName"), rs.getString("examinerID"), rs.getString("subjectID"), rs.getString("grade").charAt(0), rs.getDouble("gpa"), rs.getDouble("cgpa")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return examinerResultList;        
    }
     
     public ArrayList<examinerResult> getExaminerResultByExaminerID(String examinerID){
        ArrayList<examinerResult> examinerResultList = new ArrayList<examinerResult>();
        examinerResult examinerResult = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"EXAMINER RESULT\" WHERE \"examinerID\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, examinerID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                examinerResultList.add(examinerResult = new examinerResult(rs.getString("resultID"), rs.getString("examinerName"), rs.getString("examinerID"), rs.getString("subjectID"), rs.getString("grade").charAt(0), rs.getDouble("gpa"), rs.getDouble("cgpa")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return examinerResultList;        
    }
     
     public ArrayList<examinerResult> getExaminerResultByResultID(String resultID){
        ArrayList<examinerResult> examinerResultList = new ArrayList<examinerResult>();
        examinerResult examinerResult = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"EXAMINER RESULT\" WHERE \"resultID\"=?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, resultID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                examinerResultList.add(examinerResult = new examinerResult(rs.getString("resultID"), rs.getString("examinerName"), rs.getString("examinerID"), rs.getString("subjectID"), rs.getString("grade").charAt(0), rs.getDouble("gpa"), rs.getDouble("cgpa")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return examinerResultList;        
    }
     
     public ArrayList<examinerResult> getExaminerResultNotByResultID(String resultID){
        ArrayList<examinerResult> examinerResultList = new ArrayList<examinerResult>();
        examinerResult examinerResult = null;
        try {
            String sqlQueryStr = "SELECT * FROM \"EXAMINER RESULT\" WHERE \"resultID\"<>?";
            stmt = conn.prepareStatement(sqlQueryStr);
            stmt.setString(1, resultID);
            rs = stmt.executeQuery();
            while (rs.next()) {
                examinerResultList.add(examinerResult = new examinerResult(rs.getString("resultID"), rs.getString("examinerName"), rs.getString("examinerID"), rs.getString("subjectID"), rs.getString("grade").charAt(0), rs.getDouble("gpa"), rs.getDouble("cgpa")));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return examinerResultList;        
    }
     
     public void removeResult(String id){
        try {
            String deleteStr = "DELETE FROM \"EXAMINER RESULT\" WHERE \"resultID\" = ?";
            stmt = conn.prepareStatement(deleteStr);
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Remove record success!", "REMOVE RECORD SUCCESS", HEIGHT);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
}
