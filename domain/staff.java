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
public class staff {
    private String staffID;
    private String staffName;
    private int    staffAge;
    private String staffContactNumber;
    private String staffIC;
    private String staffAddress;
    private String staffPassword;
    private String staffAnswer;
    private int    loginTimes;
    private String staffContactNumber_front;
    private String staffContactNumber_back;
    private String staffIC_front;
    private String staffIC_middle;
    private String staffIC_back;
    
    public staff(){}
    
    public staff(String staffID, String staffName, int staffAge, String staffContactNumber, String staffIC, String staffAddress, String staffPassword, String staffAnswer, int loginTimes){
        this.staffID            = staffID;
        this.staffName          = staffName;
        this.staffAge           = staffAge;
        this.staffContactNumber = staffContactNumber;
        this.staffIC            = staffIC;
        this.staffAddress       = staffAddress;
        this.staffPassword      = staffPassword;
        this.staffAnswer        = staffAnswer;
        this.loginTimes         = loginTimes;
    }
    
    public void setStaffID(String staffID){
        this.staffID = "STAFF"+staffID;
    }
    
    public String getStaffID(){
        return staffID;
    }
    
    public void setStafName(String staffName){
        this.staffName = staffName;
    }
    
    public String getSatffName(){
        return staffName;
    }
    
    public void setStaffAge(int staffAge){
        this.staffAge = staffAge;
    }
    
    public int getStaffAge(){
        return staffAge;
    }
     public void setStaffContactNumber_front(String examinerContactNumber_front){
        this.staffContactNumber_front =examinerContactNumber_front;
    }
    
    public String getStaffContactNumber_front(){
        return staffContactNumber_front;
    }
    
    public void setStaffContactNumber_back(String examinerContactNumber_back){
        this.staffContactNumber_back =examinerContactNumber_back;
    }
    
    public String getStaffContactNumber_back(){
        return staffContactNumber_back;
    }
    
    public void setStaffContactNumber(){
        this.staffContactNumber = String.valueOf(staffContactNumber_front)+"-"+String.valueOf(String.valueOf(staffContactNumber_back).charAt(0))+String.valueOf(String.valueOf(staffContactNumber_back).charAt(1))+String.valueOf(String.valueOf(staffContactNumber_back).charAt(2))+" "+String.valueOf(String.valueOf(staffContactNumber_back).charAt(3))+String.valueOf(String.valueOf(staffContactNumber_back).charAt(4))+String.valueOf(String.valueOf(staffContactNumber_back).charAt(5))+String.valueOf(String.valueOf(staffContactNumber_back).charAt(6));;
    }
    
    public String getStaffContactNumber(){
        return staffContactNumber;
    }
    
    public void setStaffIC_front(String staffIC_front){
        this.staffIC_front = staffIC_front;
    }
    
    public String getStaffIC_front(){
        return staffIC_front;
    }
    
    public void setStaffIC_middle(String staffIC_middle){
        this.staffIC_middle = staffIC_middle;
    }
    
    public String getStaffIC_middle(){
        return staffIC_middle;
    }
    
    public void setStaffIC_back(String staffIC_back){
        this.staffIC_back = staffIC_back;
    }
    
    public String getStaffIC_back(){
        return staffIC_back;
    }
    
    public String getStaffIC(){
        return staffIC;
    }
    
    public void setStaffIC(){
        staffIC = String.valueOf(staffIC_front)+"-"+String.valueOf(staffIC_middle)+"-"+String.valueOf(staffIC_back);
    }
    
     public void setStaffAddress(String staffAddress){
        this.staffAddress = staffAddress;
    }
    
    public String getStaffAddress(){
        return staffAddress;
    }
    
     public void setStaffPassword(String staffPassword){
        this.staffPassword = staffPassword;
    }
    
    public String getStaffPassword(){
        return staffPassword;
    }
    
     public void setStaffAnswer(String staffAnswer){
        this.staffAnswer = staffAnswer;
    }
    
    public String getStaffAnswer(){
        return staffAnswer;
    }
    
    public void setLoginTimes(int loginTimes){
        this.loginTimes = loginTimes;
    }
    
    public int getLoginTimes(){
        return loginTimes;
    }
}
