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
public class subject {
    private String subjectID;
    private String subjectName;
    private String subjectDescription;
    private String courseID;
    private String lecturer;
    private int totalExaminer;
    private double passRate;
    private String courseName;
    
    public subject(){}
    public subject(String subjectID, String subjectName, String subjectDescription, String courseID, String lecturer, int totalExaminer, double passRate, String courseName){
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
        this.courseID = courseID;
        this.lecturer = lecturer;
        this.totalExaminer = totalExaminer;
        this.passRate = passRate;
        this.courseName = courseName;
        
    }
    
    public void setSubjectID(String subjectID){
        this.subjectID = "S"+subjectID;
    }
    
    public String getSubjectID(){
        return subjectID;
    }
    
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    
    public String getSubjectName(){
        return subjectName;
    }
    
    public void setSubjectDescription(String subjectDescription){
        this.subjectDescription = subjectDescription;
    }
    
    public String getSubjectDescription(){
        return subjectDescription;
    }
    
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    
    public String getCourseID(){
        return courseID;
    }
    
    public void setLecturer(String lecturer){
        this.lecturer = lecturer;
    }
    
    public String getLecturer(){
        return lecturer;
    }
    public void setTotalExaminer(int totalExaminer){
        this.totalExaminer = totalExaminer;
    }
    
    public int getTotalExaminer(){
        return totalExaminer;
    }
    public void setPassRate(double passRate){
        this.passRate = passRate;
    }
    
    public double getPassRate(){
        return passRate;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
}
