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
public class admin {
    private String adminID;
    private String adminName;
    private String adminContactNumber;
    private String adminPassword;
    private String adminAnswer;
    private int    loginTimes;
    
    public admin(){}
    
    public admin(String adminID, String adminName, String adminContactNumber, String adminPassword, String adminAnswer, int loginTimes){
        this.adminID            = adminID;
        this.adminName          = adminName;
        this.adminContactNumber = adminContactNumber;
        this.adminPassword      = adminPassword;
        this.adminAnswer        = adminAnswer;
        this.loginTimes         = loginTimes;
    }
    
    public void setAdminID(String adminID){
        this.adminID = adminID;
    }
    
    public String getAdminID(){
        return adminID;
    }
    
     public void setAdminName(String adminName){
        this.adminName = adminName;
    }
    
    public String getAdminName(){
        return adminName;
    }
    
     public void setAdminContactNumber(String adminContactNumber){
        this.adminContactNumber = adminContactNumber;
    }
    
    public String getAdminContactNumber(){
        return adminContactNumber;
    }
    
     public void setAdminPassword(String adminPassword){
        this.adminPassword = adminPassword;
    }
    
    public String getAdminPassword(){
        return adminPassword;
    }
    
     public void setAdminAnswer(String adminAnswer){
        this.adminAnswer = adminAnswer;
    }
    
    public String getAdminAnswer(){
        return adminAnswer;
    }
    
    public void setLoginTimes(int loginTimes){
        this.loginTimes = loginTimes;
    }
    
    public int getLoginTimes(){
        return loginTimes;
    }
}
