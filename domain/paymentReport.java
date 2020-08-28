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
public class paymentReport {
    String paymentType;
    int totalPeople;
    double totalTransaction;
    
    public paymentReport(){}
    public paymentReport(String paymentType, int totalPeople, double totalTransaction){
        this.paymentType = paymentType;
        this.totalPeople = totalPeople;
        this.totalTransaction = totalTransaction;
    }
    
    public void setPaymentType(String paymentType){
        this.paymentType = paymentType;
    }
    
    public String getPaymentType(){
        return paymentType;
    }
    
    public void setTotalPeople(int totalPeople){
        this.totalPeople = totalPeople;
    }
    
    public int getTotalPeople(){
        return totalPeople;
    }
    
    public void setTotalTransaction(double totalTransaction){
        this.totalTransaction = totalTransaction;
    }
    
    public double getTotalTransaction(){
        return totalTransaction;
    }
}
