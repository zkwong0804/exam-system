/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.swing.JOptionPane;
import control.MaintainExaminationSystem;

/**
 *
 * @author tommy
 */

public class examiner {
    private String examinerID;
    private String examinerName;
    private int    examinerAge;
    private String examinerContactNumber;
    private String examinerContactNumber_front;
    private String examinerContactNumber_back;
    private String examinerIC;
    private String examinerIC_front;
    private String examinerIC_middle;
    private String examinerIC_back;
    private int    examinerIntakeYear;
    private String examinerCourse;
    private double examinerBalance;
    private String examinerPassword;
    private String examinerAnswer;
    private int    loginTimes;
    
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    
    public examiner(){}
    public examiner(String examinerID, String examinerName, int examinerAge, String examinerContactNumber, String examinerIC, int examinerIntakeYear, String examinerCourse, double examinerBalance, String examinerPassword, String examinerAnswer, int loginTimes){
        this.examinerID = examinerID;
        this.examinerName = examinerName;
        this.examinerAge = examinerAge;
        this.examinerContactNumber = examinerContactNumber;
        this.examinerIC = examinerIC;
        this.examinerIntakeYear = examinerIntakeYear;
        this.examinerCourse = examinerCourse;
        this.examinerBalance = examinerBalance;
        this.examinerPassword = examinerPassword;
        this.examinerAnswer = examinerAnswer;
        this.loginTimes = loginTimes;
    }
    
    public void setexaminerID(String examinerID){
        for(int i=0;i<maintainExamSys.getCourseList().size();i++){
            if(examinerCourse.equalsIgnoreCase(maintainExamSys.getCourseList().get(i).getcourseName())==true)
                this.examinerID = String.valueOf(String.valueOf(getexaminerIntakeYear()).charAt(2))+String.valueOf(String.valueOf(getexaminerIntakeYear()).charAt(3))+maintainExamSys.getCourseList().get(i).getcourseID()+examinerID;
        }
        
    }
    
    public String getexaminerID(){
        return examinerID;
    }
    
    public void setexaminerName(String examinerName){
        this.examinerName = examinerName;
    }
    
    public String getexaminerName(){
        return examinerName;
    }
    
    public void setexaminerAge(int examinerAge){
        this.examinerAge = examinerAge;
        
    }
    
    public int getexaminerAge(){
        return examinerAge;
    }
    
    public void setexaminerContactNumber_front(String examinerContactNumber_front){
        this.examinerContactNumber_front =examinerContactNumber_front;
    }
    
    public String getexaminerContactNumber_front(){
        return examinerContactNumber_front;
    }
    
    public void setexaminerContactNumber_back(String examinerContactNumber_back){
        this.examinerContactNumber_back =examinerContactNumber_back;
    }
    
    public String getexaminerContactNumber_back(){
        return examinerContactNumber_back;
    }
    
    public void setexaminerContactNumber(){
        examinerContactNumber = String.valueOf(examinerContactNumber_front)+"-"+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(0))+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(1))+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(2))+" "+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(3))+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(4))+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(5))+String.valueOf(String.valueOf(examinerContactNumber_back).charAt(6));;
    }
    
    public String getexaminerContactNumber(){
        return examinerContactNumber;
    }
    
    public void setexaminerIC_front(String examinerIC_front){
        this.examinerIC_front = examinerIC_front;
    }
    
    public String getexaminerIC_front(){
        return examinerIC_front;
    }
    
    public void setexaminerIC_middle(String examinerIC_middle){
        this.examinerIC_middle = examinerIC_middle;
    }
    
    public String getexaminerIC_middle(){
        return examinerIC_middle;
    }
    
    public void setexaminerIC_back(String examinerIC_back){
        this.examinerIC_back = examinerIC_back;
    }
    
    public String getexaminerIC_back(){
        return examinerIC_back;
    }
    
    public String getexaminerIC(){
        return examinerIC;
    }
    
    public void setexaminerIC(){
        examinerIC = String.valueOf(examinerIC_front)+"-"+String.valueOf(examinerIC_middle)+"-"+String.valueOf(examinerIC_back);
    }
    
    public void setexaminerIntakeYear(int examinerIntakeYear){
        this.examinerIntakeYear = examinerIntakeYear;
    }
    
    public int getexaminerIntakeYear(){
        return examinerIntakeYear;
    }
    
    public void setexaminerCourse(String examinerCourse){
        this.examinerCourse = examinerCourse;
    }
    
    public String getexaminerCourse(){
        return examinerCourse;
    }
    
    public void setexaminerBalance(double examinerBalance){
        this.examinerBalance = examinerBalance;
    }
    
    public double getexaminerBalance(){
        return examinerBalance;
    }
    
    public void setexaminerPassword(String examinerPassword){
        this.examinerPassword = examinerPassword;
    }
    
    public String getexaminerPassword(){
        return examinerPassword;
    }
    
    public void setexaminerAnswer(String examinerAnswer){
        this.examinerAnswer = examinerAnswer;
    }
    
    public String getexaminerAnswer(){
        return examinerAnswer;
    }
    
    public int getloginTimes(){
        return loginTimes;
    }
    
    public void setloginTimes(int loginTimes){
        this.loginTimes = loginTimes;
    }
}
