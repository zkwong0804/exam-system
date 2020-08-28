/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import da.ExaminationSystemDA;
import domain.*;
import java.util.ArrayList;
import javax.swing.JTable;


/**
 *
 * @author tommy
 */
public class MaintainExaminationSystem {
    private ExaminationSystemDA examSysDA;
    
    public void setPassrate(){
        examSysDA.setPassrate();
     }
    
     public void setPaymentReport(){
         examSysDA.setPaymentReport();
     }

    public MaintainExaminationSystem() {
        examSysDA = new ExaminationSystemDA();
    }
    
    public ArrayList<admin> getAdminList() {
        return examSysDA.getAdminList();
    }
    
    public ArrayList<examiner> getExaminerList(){
        return examSysDA.getExaminerList();
    }
    
    public ArrayList<staff> getStaffList() {
        return examSysDA.getStaffList();
    }
    
    public void updateAdmin(admin newAdmin){
        examSysDA.updateAdmin(newAdmin);
    }
    
    public void createExaminer(examiner examiner){
        examSysDA.createExaminer(examiner);
    }
    
    public ArrayList<course> getCourseList(){
        return examSysDA.getCourseList();
    }
    
    public void createCourse(course course){
        examSysDA.createCourse(course);
    }
    
    public void updateCourse(course course){
        examSysDA.updateCourse(course);
    }
    
    public course getSelectedCourse(String courseID){
        
        return examSysDA.getSelectedCourse(courseID);
    }
    
    public ArrayList<subject> getSubjectListByCourseID(String courseID){
        return examSysDA.getSubjectListByCourseID(courseID);
    }
    
    public String getCourseIDByCourseName(String courseName){
        return examSysDA.getCourseIDByCourseName(courseName);
    }
    
    public String getCourseNameByCourseID(String courseID){
        return examSysDA.getCourseNameByCourseID(courseID);
    }
    
    public String getLecturerBySubjectName(String subjectName){
        return examSysDA.getLecturerBySubjectName(subjectName);
    }
    
    public ArrayList<subject> getSubjectList(){
        return examSysDA.getSubjectList();
    }
    
    public void createSubject(subject subject){
        examSysDA.createSubject(subject);
    }
    
    public void updateSubject(subject subject){
        examSysDA.updateSubject(subject);
    }
    
    public subject getSelectedSubject(String subjectID){
        
        return examSysDA.getSelectedSubject(subjectID);
    }
    
    public String getSubjectIDBySubjectName(String subjectName){
        return examSysDA.getSubjectIDBySubjectName(subjectName);
    }
    
    public examiner getSelectedExaminer(String examinerID){
        return examSysDA.getSelectedExaminer(examinerID);
    }
    
    public staff getSelectedStaff(String staffID){
        return examSysDA.getSelectedStaff(staffID);
    }
    
    public void removeRecord(String id, String tableName){
        examSysDA.removeRecord(id, tableName);
    }
    
    public void topupBalance(String examinerID, double topupBalance){
        examSysDA.topupBalance(examinerID, topupBalance);
    }
    
    public void updateExaminer(examiner examiner){
        examSysDA.updateExaminer(examiner);
    }
    
    public void createStaff(staff staff){
        examSysDA.createStaff(staff);
    }
    
    public void updateStaff(staff staff){
        examSysDA.updateStaff(staff);
    }
    
    //timetable
    public void createTimetable(timetable timetable){
        examSysDA.createTimetable(timetable);
    }
    
    public void updateTimetable(timetable timetable){
        examSysDA.updateTimetable(timetable);
    }
    
    public timetable getSelectedTimetable(String timetableID){
        return examSysDA.getSelectedTimetable(timetableID);
    }
    
    //payment
     public void createPayment(payment payment){
        examSysDA.createPayment(payment);
    }
    
    public payment getSelectedPayment(String paymentID){
        
        return examSysDA.getSelectedPayment(paymentID);
    }
    
     public ArrayList<payment> getPaymentList(){
         return examSysDA.getPaymentList();
     }
     
     //registered subject
     public void createRegisteredSubject(registeredSubject registeredSubject){
         examSysDA.createRegisteredSubject(registeredSubject);
     }
     
      public ArrayList<registeredSubject> getRegisteredSubjectList(){
          return examSysDA.getRegisteredSubjectList();
      }
      
      public ArrayList<registeredSubject> getRegisteredSubjectListByExaminerID(String examinerID){
          return examSysDA.getRegisteredSubjectListByExaminerID(examinerID);
      }
      //examiner result
     
     public String createExaminerResult(examinerResult examinerResult){
         return examSysDA.createExaminerResult(examinerResult);
     }
     
     public ArrayList<examinerResult> getExaminerResultByExaminerID(String examinerID){
         return examSysDA.getExaminerResultByExaminerID(examinerID);
     }
     public ArrayList<examinerResult> getExaminerResultByResultID(String resultID){
         return examSysDA.getExaminerResultByResultID(resultID);
     }
     public void removeResult(String id){
         examSysDA.removeResult(id);
     }
     
     public String updateExaminerResult(examinerResult examinerResult){
         return examSysDA.updateExaminerResult(examinerResult);
     }
     
     public ArrayList<examinerResult> getExaminerResultNotByResultID(String resultID){
         return examSysDA.getExaminerResultNotByResultID(resultID);
     }
}
