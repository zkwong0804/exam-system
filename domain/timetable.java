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
public class timetable {
    private String timetableID;
    private String timetableName;
    private String day;
    private String nineAM_tenAM;
    private String tenAM_elevenAM;
    private String elevenAM_twelvePM;
    private String twelvePM_onePM;
    private String onePM_twoPM;
    private String twoPM_threePM;
    private String threePM_fourPM;
    private String fourPM_fivePM;
    private String fivePM_sixPM;
    private String courseID;
    private String lecturerDetail;
    
    public timetable(){}
    public timetable(String timetableID, String timetableName, String day, String nineAM_tenAM, String tenAM_elevenAM, String elevenAM_twelvePM, String twelvePM_onePM, String onePM_twoPM, String twoPM_threePM, String threePM_fourPM, String fourPM_fivePM, String fivePM_sixPM, String courseID, String lecturerDetail){
        this.timetableID = timetableID;
        this.timetableName = timetableName;
        this.day = day;
        this.nineAM_tenAM = nineAM_tenAM;
        this.tenAM_elevenAM = tenAM_elevenAM;
        this.elevenAM_twelvePM = elevenAM_twelvePM;
        this.twelvePM_onePM = twelvePM_onePM;
        this.onePM_twoPM = onePM_twoPM;
        this.twoPM_threePM = twoPM_threePM;
        this.threePM_fourPM = threePM_fourPM;
        this.fourPM_fivePM = fourPM_fivePM;
        this.fivePM_sixPM = fivePM_sixPM;
        this.courseID = courseID;
        this.lecturerDetail = lecturerDetail;
        
    }
    
    public void setTimetableID(String timetableID){
        this.timetableID = timetableID;
    }
    
    public String getTimetableID(){
        return timetableID;
    }
    
    public void setTimetableName(String timetableName){
        this.timetableName = timetableName;
    }
    
    public String getTimetableName(){
        return timetableName;
    }
    
    public void setDay(String day){
        this.day = day;
    }
    
    public String getDay(){
        return day;
    }
    
    public void setNineAM_TenAM(String nineAM_tenAM){
        this.nineAM_tenAM = nineAM_tenAM;
    }
    
    public String getNineAM_TenAM(){
        return nineAM_tenAM;
    }
    
    public void setTenAM_ElevenAM(String tenAM_elevenAM){
        this.tenAM_elevenAM = tenAM_elevenAM;
    }
    
    public String getTenAM_ElevenAM(){
        return tenAM_elevenAM;
    }
    
    public void setElevenAM_TwelvePM(String elevenAM_twelvePM){
        this.elevenAM_twelvePM = elevenAM_twelvePM;
    }
    
    public String getElevenAM_TwelvePM(){
        return elevenAM_twelvePM;
    }
    
    public void setTwelvePM_OnePM(String twelvePM_onePM){
        this.twelvePM_onePM = twelvePM_onePM;
    }
    
    public String getTwelvePM_OnePM(){
        return twelvePM_onePM;
    }
    
    public void setOnePM_TwoPM(String onePM_twoPM){
        this.onePM_twoPM = onePM_twoPM;
    }
    
    public String getOnePM_TwoPM(){
        return onePM_twoPM;
    }
    
    public void setTwoPM_ThreePM(String twoPM_threePM){
        this.twoPM_threePM = twoPM_threePM;
    }
    
    public String getTwoPM_ThreePM(){
        return twoPM_threePM;
    }
    
    public void setThreePM_FourPM(String threePM_fourPM){
        this.threePM_fourPM = threePM_fourPM;
    }
    
    public String getThreePM_FourPM(){
        return threePM_fourPM;
    }
    
    public void setFourPM_FivePM(String fourPM_fivePM){
        this.fourPM_fivePM = fourPM_fivePM;
    }
    
    public String getFourPM_FivePM(){
        return fourPM_fivePM;
    }
    
    public void setFivePM_SixPM(String fivePM_sixPM){
        this.fivePM_sixPM = fivePM_sixPM;
    }
    
    public String getFivePM_SixPM(){
        return fivePM_sixPM;
    }
    
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    
    public String getCourseID(){
        return courseID;
    }
    
    public void setLecturerDetail(String lecturerDetail){
        this.lecturerDetail = lecturerDetail;
    }
    
    public String getLecturerDetail(){
        return lecturerDetail;
    }
    
    
    
}
