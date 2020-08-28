/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author tommy
 */
public class examinerResult {
    private String resultID;
    private String examinerName;
    private String examinerID;
    private String subjectID;
    private char grade;
    private double gpa;
    private double cgpa;
    
    public examinerResult(){}
    public examinerResult(String resultID, String examinerName, String examinerID, String subjectID, char grade, double gpa, double cgpa){
        this.resultID = resultID;
        this.examinerName = examinerName;
        this.examinerID = examinerID;
        this.subjectID = subjectID;
        this.grade = grade;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }
    
    public void setResultID(String resultID){
        this.resultID = resultID;
    }
    
    public String getResultID(){
        return resultID;
    }
    
    public void setExaminerName(String examinerName){
        this.examinerName = examinerName;
    }
    
    public String getExaminerName(){
        return examinerName;
    }
    
    public void setExaminerID(String examinerID){
        this.examinerID = examinerID;
    }
    
    public String getExaminerID(){
        return examinerID;
    }
    
    public void setSubjectID(String subjectID){
        this.subjectID = subjectID;
    }
    
    public String getSubjectID(){
        return subjectID;
    }
    
    public void setGrade(char grade){
        this.grade = grade;
    }
    
    public char getGrade(){
        return grade;
    }
    
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public void setCGPA(double cgpa){
        this.cgpa = cgpa;
    }
    
    public double getCGPA(){
        return cgpa;
    }
}
