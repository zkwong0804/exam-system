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
public class registeredSubject {
    private String registerDate;
    private String subjectName;
    private String examinerID;
    private String subjectID;
    private String examinerName;
    
    public registeredSubject(){}
    public registeredSubject(String registerDate, String subjectName, String examinerID, String subjectID, String examinerName){
        this.registerDate = registerDate;
        this.subjectName = subjectName;
        this.examinerID = examinerID;
        this.subjectID = subjectID;
        this.examinerName = examinerName;
    }
    
    public void setRegisterDate(String registerDate){
        this.registerDate = registerDate;
    }
    
    public String getRegisterDate(){
        return registerDate;
    }
    
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    
    public String getSubjectName(){
        return subjectName;
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
    public void setExaminerName(String examinerName){
        this.examinerName = examinerName;
    }
    
    public String getExaminerName(){
        return examinerName;
    }
    
}
