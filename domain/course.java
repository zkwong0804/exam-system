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
public class course {
    private String courseID;
    private String courseName;
    private String courseDescription;
    public course(){}
    public course(String courseID, String courseName, String courseDescription){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        
    }
    
    public void setcourseID(String courseID){
        this.courseID = courseID;
        
    }
    
    public String getcourseID(){
        return courseID;
    }
    
    public void setcourseName(String courseName){
        this.courseName = courseName;
        
    }
    
    public String getcourseName(){
        return courseName;
        
    }
    
    public void setcourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
        
    }
    
    public String getcourseDescription(){
        return courseDescription;
        
    }
}
