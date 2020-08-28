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
public class payment {
    private String paymentID;
    private String examinerID;
    private String examinerName;
    private String paymentName;
    private double paymentCost;
    private String paymentDescription;
    
    
    public payment(){}
    public payment(String paymentID, String examinerID, String examinerName, String paymentName, double paymentCost, String paymentDescription){
        this.paymentID = paymentID;
        this.examinerID = examinerID;
        this.examinerName = examinerName;
        this.paymentName = paymentName;
        this.paymentCost = paymentCost;
        this.paymentDescription = paymentDescription;
    }
    
    public void setPaymentID(String paymentID){
        this.paymentID = paymentID;
    }
    
    public String getPaymentID(){
        return paymentID;
    }
    
    public void setExaminerID(String examinerID){
        this.examinerID = examinerID;
    }
    
    public String getExaminerID(){
        return examinerID;
    }
    
    public void setExaminerName(String examinerName){
        this.examinerName = examinerName;
    }
    
    public String getExaminerName(){
        return examinerName;
    }
    
    public void setPaymentName(String paymentName){
        this.paymentName = paymentName;
    }
    
    public String getPaymentName(){
        return paymentName;
    }
    
    public void setPaymentCost(double paymentCost){
        this.paymentCost = paymentCost;
    }
    
    public double getPaymentCost(){
        return paymentCost;
    }
    
    public void setPaymentDescription(String paymentDescription){
        this.paymentDescription = paymentDescription;
    }
    
    public String getPaymentDescription(){
        return paymentDescription;
    }
}
