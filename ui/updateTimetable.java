package ui;

import control.MaintainExaminationSystem;
import javax.swing.JOptionPane;
import domain.timetable;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tommy
 */
public class updateTimetable extends javax.swing.JPanel {

    /**
     * Creates new form createExaminer
     */
    private timetable  MondayTimetable = new timetable();
    private timetable  TuesdayTimetable = new timetable();
    private timetable  ThursdayTimetable = new timetable();
    private timetable  FridayTimetable = new timetable();
    private timetable  WednesdayTimetable = new timetable();
    private JFrame frm = new JFrame();
    private String courseName = "";
    private int time = 0;
    private String courseID = "";
    private JComboBox chooseSubject = new JComboBox();
    public updateTimetable(String courseID, JFrame frm) {
        initComponents();
        this.frm = frm;
        this.courseID = courseID;
        
        //get timetable from database
        MondayTimetable  = maintainExamSys.getSelectedTimetable(courseID.toUpperCase()+"MON");
        System.out.println("MondayTimetable ID: "+MondayTimetable.getTimetableID());
        TuesdayTimetable  = maintainExamSys.getSelectedTimetable(courseID.toUpperCase()+"TUE");
        System.out.println("TuesdayTimetable ID: "+TuesdayTimetable.getTimetableID());
        WednesdayTimetable  = maintainExamSys.getSelectedTimetable(courseID.toUpperCase()+"WED");
        System.out.println("WednesdayTimetable ID: "+WednesdayTimetable.getTimetableID());
        ThursdayTimetable  = maintainExamSys.getSelectedTimetable(courseID.toUpperCase()+"THU");
        System.out.println("ThursdayTimetable ID: "+ThursdayTimetable.getTimetableID());
        FridayTimetable  = maintainExamSys.getSelectedTimetable(courseID.toUpperCase()+"FRI");
        System.out.println("FridayTimetable ID: "+FridayTimetable.getTimetableID());
        
        //create subject list
        ArrayList<String> subjectList = new ArrayList<String>();
        for(int i=0;i<maintainExamSys.getSubjectListByCourseID(courseID).size();i++){
            subjectList.add(maintainExamSys.getSubjectListByCourseID(courseID).get(i).getSubjectName());
        }
        subjectList.add("Empty");
        String[] subjectArr = new String[subjectList.size()];
        subjectArr = subjectList.toArray(subjectArr);
        chooseSubject = new JComboBox(subjectArr);
        
        //set text on jbt
        //monday
        if(MondayTimetable.getNineAM_TenAM().isEmpty()==false)
            jbt_mon9to10.setText(MondayTimetable.getNineAM_TenAM());
        
        if(MondayTimetable.getTenAM_ElevenAM().isEmpty()==false)
            jbt_mon10to11.setText(MondayTimetable.getTenAM_ElevenAM());
        
        if(MondayTimetable.getElevenAM_TwelvePM().isEmpty()==false)
            jbt_mon11to12.setText(MondayTimetable.getElevenAM_TwelvePM());
        
        if(MondayTimetable.getTwelvePM_OnePM().isEmpty()==false)
            jbt_mon12to1.setText(MondayTimetable.getTwelvePM_OnePM());
        
        if(MondayTimetable.getOnePM_TwoPM().isEmpty()==false)
            jbt_mon1to2.setText(MondayTimetable.getOnePM_TwoPM());
        
        if(MondayTimetable.getTwoPM_ThreePM().isEmpty()==false)
            jbt_mon2to3.setText(MondayTimetable.getTwoPM_ThreePM());
        
        if(MondayTimetable.getThreePM_FourPM().isEmpty()==false)
            jbt_mon3to4.setText(MondayTimetable.getThreePM_FourPM());
        
        if(MondayTimetable.getFourPM_FivePM().isEmpty()==false)
            jbt_mon4to5.setText(MondayTimetable.getFourPM_FivePM());
        
        if(MondayTimetable.getFivePM_SixPM().isEmpty()==false)
            jbt_mon5to6.setText(MondayTimetable.getFivePM_SixPM());
        
        //tuesday
        if(TuesdayTimetable.getNineAM_TenAM().isEmpty()==false)
            jbt_tue9to10.setText(TuesdayTimetable.getNineAM_TenAM());
        
        if(TuesdayTimetable.getTenAM_ElevenAM().isEmpty()==false)
            jbt_tue10to11.setText(TuesdayTimetable.getTenAM_ElevenAM());
        
        if(TuesdayTimetable.getElevenAM_TwelvePM().isEmpty()==false)
            jbt_tue11to12.setText(TuesdayTimetable.getElevenAM_TwelvePM());
        
        if(TuesdayTimetable.getTwelvePM_OnePM().isEmpty()==false)
            jbt_tue12to1.setText(TuesdayTimetable.getTwelvePM_OnePM());
        
        if(TuesdayTimetable.getOnePM_TwoPM().isEmpty()==false)
            jbt_tue1to2.setText(TuesdayTimetable.getOnePM_TwoPM());
        
        if(TuesdayTimetable.getTwoPM_ThreePM().isEmpty()==false)
            jbt_tue2to3.setText(TuesdayTimetable.getTwoPM_ThreePM());
        
        if(TuesdayTimetable.getThreePM_FourPM().isEmpty()==false)
            jbt_tue3to4.setText(TuesdayTimetable.getThreePM_FourPM());
        
        if(TuesdayTimetable.getFourPM_FivePM().isEmpty()==false)
            jbt_tue4to5.setText(TuesdayTimetable.getFourPM_FivePM());
        
        if(TuesdayTimetable.getFivePM_SixPM().isEmpty()==false)
            jbt_tue5to6.setText(TuesdayTimetable.getFivePM_SixPM());
        
        //wednesday
        if(WednesdayTimetable.getNineAM_TenAM().isEmpty()==false)
            jbt_wed9to10.setText(WednesdayTimetable.getNineAM_TenAM());
        
        if(WednesdayTimetable.getTenAM_ElevenAM().isEmpty()==false)
            jbt_wed10to11.setText(WednesdayTimetable.getTenAM_ElevenAM());
        
        if(WednesdayTimetable.getElevenAM_TwelvePM().isEmpty()==false)
            jbt_wed11to12.setText(WednesdayTimetable.getElevenAM_TwelvePM());
        
        if(WednesdayTimetable.getTwelvePM_OnePM().isEmpty()==false)
            jbt_wed12to1.setText(WednesdayTimetable.getTwelvePM_OnePM());
        
        if(WednesdayTimetable.getOnePM_TwoPM().isEmpty()==false)
            jbt_wed1to2.setText(WednesdayTimetable.getOnePM_TwoPM());
        
        if(WednesdayTimetable.getTwoPM_ThreePM().isEmpty()==false)
            jbt_wed2to3.setText(WednesdayTimetable.getTwoPM_ThreePM());
        
        if(WednesdayTimetable.getThreePM_FourPM().isEmpty()==false)
            jbt_wed3to4.setText(WednesdayTimetable.getThreePM_FourPM());
        
        if(WednesdayTimetable.getFourPM_FivePM().isEmpty()==false)
            jbt_wed4to5.setText(WednesdayTimetable.getFourPM_FivePM());
        
        if(WednesdayTimetable.getFivePM_SixPM().isEmpty()==false)
            jbt_wed5to6.setText(WednesdayTimetable.getFivePM_SixPM());
        
        //thursday
        if(ThursdayTimetable.getNineAM_TenAM().isEmpty()==false)
            jbt_thu9to10.setText(ThursdayTimetable.getNineAM_TenAM());
        
        if(ThursdayTimetable.getTenAM_ElevenAM().isEmpty()==false)
            jbt_thu10to11.setText(ThursdayTimetable.getTenAM_ElevenAM());
        
        if(ThursdayTimetable.getElevenAM_TwelvePM().isEmpty()==false)
            jbt_thu11to12.setText(ThursdayTimetable.getElevenAM_TwelvePM());
        
        if(ThursdayTimetable.getTwelvePM_OnePM().isEmpty()==false)
            jbt_thu12to1.setText(ThursdayTimetable.getTwelvePM_OnePM());
        
        if(ThursdayTimetable.getOnePM_TwoPM().isEmpty()==false)
            jbt_thu1to2.setText(ThursdayTimetable.getOnePM_TwoPM());
        
        if(ThursdayTimetable.getTwoPM_ThreePM().isEmpty()==false)
            jbt_thu2to3.setText(ThursdayTimetable.getTwoPM_ThreePM());
        
        if(ThursdayTimetable.getThreePM_FourPM().isEmpty()==false)
            jbt_thu3to4.setText(ThursdayTimetable.getThreePM_FourPM());
        
        if(ThursdayTimetable.getFourPM_FivePM().isEmpty()==false)
            jbt_thu4to5.setText(ThursdayTimetable.getFourPM_FivePM());
        
        if(ThursdayTimetable.getFivePM_SixPM().isEmpty()==false)
            jbt_thu5to6.setText(ThursdayTimetable.getFivePM_SixPM());
        
        //friday
        if(FridayTimetable.getNineAM_TenAM().isEmpty()==false)
            jbt_fri9to10.setText(FridayTimetable.getNineAM_TenAM());
        
        if(FridayTimetable.getTenAM_ElevenAM().isEmpty()==false)
            jbt_fri10to11.setText(FridayTimetable.getTenAM_ElevenAM());
        
        if(FridayTimetable.getElevenAM_TwelvePM().isEmpty()==false)
            jbt_fri11to12.setText(FridayTimetable.getElevenAM_TwelvePM());
        
        if(FridayTimetable.getTwelvePM_OnePM().isEmpty()==false)
            jbt_fri12to1.setText(FridayTimetable.getTwelvePM_OnePM());
        
        if(FridayTimetable.getOnePM_TwoPM().isEmpty()==false)
            jbt_fri1to2.setText(FridayTimetable.getOnePM_TwoPM());
        
        if(FridayTimetable.getTwoPM_ThreePM().isEmpty()==false)
            jbt_fri2to3.setText(FridayTimetable.getTwoPM_ThreePM());
        
        if(FridayTimetable.getThreePM_FourPM().isEmpty()==false)
            jbt_fri3to4.setText(FridayTimetable.getThreePM_FourPM());
        
        if(FridayTimetable.getFourPM_FivePM().isEmpty()==false)
            jbt_fri4to5.setText(FridayTimetable.getFourPM_FivePM());
        
        if(FridayTimetable.getFivePM_SixPM().isEmpty()==false)
            jbt_fri5to6.setText(FridayTimetable.getFivePM_SixPM());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        editTimetablePanel_mainPanel = new javax.swing.JPanel();
        jbt_updateTimetable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbt_mon9to10 = new javax.swing.JButton();
        editTimeTablePane_day1 = new javax.swing.JLabel();
        editTimeTablePanel_time1 = new javax.swing.JLabel();
        editTimeTablePanel_time3 = new javax.swing.JLabel();
        editTimeTablePanel_time = new javax.swing.JLabel();
        editTimeTablePanel_time10 = new javax.swing.JLabel();
        editTimeTablePanel_time11 = new javax.swing.JLabel();
        editTimeTablePanel_time12 = new javax.swing.JLabel();
        editTimeTablePanel_time13 = new javax.swing.JLabel();
        editTimeTablePanel_time14 = new javax.swing.JLabel();
        editTimeTablePanel_time15 = new javax.swing.JLabel();
        jbt_mon10to11 = new javax.swing.JButton();
        jbt_mon11to12 = new javax.swing.JButton();
        jbt_mon12to1 = new javax.swing.JButton();
        jbt_mon1to2 = new javax.swing.JButton();
        jbt_mon2to3 = new javax.swing.JButton();
        jbt_mon3to4 = new javax.swing.JButton();
        jbt_mon4to5 = new javax.swing.JButton();
        jbt_mon5to6 = new javax.swing.JButton();
        editTimeTablePane_day2 = new javax.swing.JLabel();
        jbt_tue9to10 = new javax.swing.JButton();
        jbt_tue10to11 = new javax.swing.JButton();
        jbt_tue11to12 = new javax.swing.JButton();
        jbt_tue12to1 = new javax.swing.JButton();
        jbt_tue1to2 = new javax.swing.JButton();
        jbt_tue2to3 = new javax.swing.JButton();
        jbt_tue3to4 = new javax.swing.JButton();
        jbt_tue4to5 = new javax.swing.JButton();
        jbt_tue5to6 = new javax.swing.JButton();
        editTimeTablePane_day3 = new javax.swing.JLabel();
        jbt_wed9to10 = new javax.swing.JButton();
        jbt_wed10to11 = new javax.swing.JButton();
        jbt_wed11to12 = new javax.swing.JButton();
        jbt_wed12to1 = new javax.swing.JButton();
        jbt_wed1to2 = new javax.swing.JButton();
        jbt_wed2to3 = new javax.swing.JButton();
        jbt_wed3to4 = new javax.swing.JButton();
        jbt_wed4to5 = new javax.swing.JButton();
        jbt_wed5to6 = new javax.swing.JButton();
        editTimeTablePane_day4 = new javax.swing.JLabel();
        jbt_thu10to11 = new javax.swing.JButton();
        jbt_thu9to10 = new javax.swing.JButton();
        jbt_thu11to12 = new javax.swing.JButton();
        jbt_thu12to1 = new javax.swing.JButton();
        jbt_thu1to2 = new javax.swing.JButton();
        jbt_thu2to3 = new javax.swing.JButton();
        jbt_thu3to4 = new javax.swing.JButton();
        jbt_thu4to5 = new javax.swing.JButton();
        jbt_thu5to6 = new javax.swing.JButton();
        editTimeTablePane_day5 = new javax.swing.JLabel();
        jbt_fri9to10 = new javax.swing.JButton();
        jbt_fri10to11 = new javax.swing.JButton();
        jbt_fri11to12 = new javax.swing.JButton();
        jbt_fri12to1 = new javax.swing.JButton();
        jbt_fri1to2 = new javax.swing.JButton();
        jbt_fri2to3 = new javax.swing.JButton();
        jbt_fri3to4 = new javax.swing.JButton();
        jbt_fri4to5 = new javax.swing.JButton();
        jbt_fri5to6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        editTimetablePanel_mainPanel.setBackground(new java.awt.Color(204, 255, 204));
        editTimetablePanel_mainPanel.setToolTipText("");

        jbt_updateTimetable.setBackground(new java.awt.Color(255, 204, 153));
        jbt_updateTimetable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_updateTimetable.setText("Update");
        jbt_updateTimetable.setToolTipText("Click to create record");
        jbt_updateTimetable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_updateTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_updateTimetableActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setToolTipText("Bonjour");

        jLabel2.setToolTipText("Bonjour");

        jbt_mon9to10.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon9to10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon9to10.setText("Empty");
        jbt_mon9to10.setToolTipText("Click to create record");
        jbt_mon9to10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon9to10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon9to10ActionPerformed(evt);
            }
        });

        editTimeTablePane_day1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editTimeTablePane_day1.setText("MON");

        editTimeTablePanel_time1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time1.setText("   10am-11am ");

        editTimeTablePanel_time3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time3.setText("   11am-12pm ");

        editTimeTablePanel_time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time.setText("   9am-10am ");

        editTimeTablePanel_time10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time10.setText("   12pm-1pm");

        editTimeTablePanel_time11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time11.setText("   1pm-2pm");

        editTimeTablePanel_time12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time12.setText("   2pm-3pm");

        editTimeTablePanel_time13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time13.setText("   3pm-4pm");

        editTimeTablePanel_time14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time14.setText("   4pm-5pm");

        editTimeTablePanel_time15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTimeTablePanel_time15.setText("   5pm-6pm");

        jbt_mon10to11.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon10to11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon10to11.setText("Empty");
        jbt_mon10to11.setToolTipText("Click to create record");
        jbt_mon10to11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon10to11ActionPerformed(evt);
            }
        });

        jbt_mon11to12.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon11to12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon11to12.setText("Empty");
        jbt_mon11to12.setToolTipText("Click to create record");
        jbt_mon11to12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon11to12ActionPerformed(evt);
            }
        });

        jbt_mon12to1.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon12to1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon12to1.setText("Empty");
        jbt_mon12to1.setToolTipText("Click to create record");
        jbt_mon12to1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon12to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon12to1ActionPerformed(evt);
            }
        });

        jbt_mon1to2.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon1to2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon1to2.setText("Empty");
        jbt_mon1to2.setToolTipText("Click to create record");
        jbt_mon1to2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon1to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon1to2ActionPerformed(evt);
            }
        });

        jbt_mon2to3.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon2to3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon2to3.setText("Empty");
        jbt_mon2to3.setToolTipText("Click to create record");
        jbt_mon2to3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon2to3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon2to3ActionPerformed(evt);
            }
        });

        jbt_mon3to4.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon3to4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon3to4.setText("Empty");
        jbt_mon3to4.setToolTipText("Click to create record");
        jbt_mon3to4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon3to4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon3to4ActionPerformed(evt);
            }
        });

        jbt_mon4to5.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon4to5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon4to5.setText("Empty");
        jbt_mon4to5.setToolTipText("Click to create record");
        jbt_mon4to5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon4to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon4to5ActionPerformed(evt);
            }
        });

        jbt_mon5to6.setBackground(new java.awt.Color(204, 204, 255));
        jbt_mon5to6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_mon5to6.setText("Empty");
        jbt_mon5to6.setToolTipText("Click to create record");
        jbt_mon5to6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_mon5to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mon5to6ActionPerformed(evt);
            }
        });

        editTimeTablePane_day2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editTimeTablePane_day2.setText("TUE");

        jbt_tue9to10.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue9to10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue9to10.setText("Empty");
        jbt_tue9to10.setToolTipText("Click to create record");
        jbt_tue9to10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue9to10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue9to10ActionPerformed(evt);
            }
        });

        jbt_tue10to11.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue10to11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue10to11.setText("Empty");
        jbt_tue10to11.setToolTipText("Click to create record");
        jbt_tue10to11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue10to11ActionPerformed(evt);
            }
        });

        jbt_tue11to12.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue11to12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue11to12.setText("Empty");
        jbt_tue11to12.setToolTipText("Click to create record");
        jbt_tue11to12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue11to12ActionPerformed(evt);
            }
        });

        jbt_tue12to1.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue12to1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue12to1.setText("Empty");
        jbt_tue12to1.setToolTipText("Click to create record");
        jbt_tue12to1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue12to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue12to1ActionPerformed(evt);
            }
        });

        jbt_tue1to2.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue1to2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue1to2.setText("Empty");
        jbt_tue1to2.setToolTipText("Click to create record");
        jbt_tue1to2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue1to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue1to2ActionPerformed(evt);
            }
        });

        jbt_tue2to3.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue2to3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue2to3.setText("Empty");
        jbt_tue2to3.setToolTipText("Click to create record");
        jbt_tue2to3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue2to3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue2to3ActionPerformed(evt);
            }
        });

        jbt_tue3to4.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue3to4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue3to4.setText("Empty");
        jbt_tue3to4.setToolTipText("Click to create record");
        jbt_tue3to4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue3to4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue3to4ActionPerformed(evt);
            }
        });

        jbt_tue4to5.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue4to5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue4to5.setText("Empty");
        jbt_tue4to5.setToolTipText("Click to create record");
        jbt_tue4to5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue4to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue4to5ActionPerformed(evt);
            }
        });

        jbt_tue5to6.setBackground(new java.awt.Color(204, 204, 255));
        jbt_tue5to6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_tue5to6.setText("Empty");
        jbt_tue5to6.setToolTipText("Click to create record");
        jbt_tue5to6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_tue5to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tue5to6ActionPerformed(evt);
            }
        });

        editTimeTablePane_day3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editTimeTablePane_day3.setText("WED");

        jbt_wed9to10.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed9to10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed9to10.setText("Empty");
        jbt_wed9to10.setToolTipText("Click to create record");
        jbt_wed9to10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed9to10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed9to10ActionPerformed(evt);
            }
        });

        jbt_wed10to11.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed10to11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed10to11.setText("Empty");
        jbt_wed10to11.setToolTipText("Click to create record");
        jbt_wed10to11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed10to11ActionPerformed(evt);
            }
        });

        jbt_wed11to12.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed11to12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed11to12.setText("Empty");
        jbt_wed11to12.setToolTipText("Click to create record");
        jbt_wed11to12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed11to12ActionPerformed(evt);
            }
        });

        jbt_wed12to1.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed12to1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed12to1.setText("Empty");
        jbt_wed12to1.setToolTipText("Click to create record");
        jbt_wed12to1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed12to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed12to1ActionPerformed(evt);
            }
        });

        jbt_wed1to2.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed1to2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed1to2.setText("Empty");
        jbt_wed1to2.setToolTipText("Click to create record");
        jbt_wed1to2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed1to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed1to2ActionPerformed(evt);
            }
        });

        jbt_wed2to3.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed2to3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed2to3.setText("Empty");
        jbt_wed2to3.setToolTipText("Click to create record");
        jbt_wed2to3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed2to3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed2to3ActionPerformed(evt);
            }
        });

        jbt_wed3to4.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed3to4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed3to4.setText("Empty");
        jbt_wed3to4.setToolTipText("Click to create record");
        jbt_wed3to4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed3to4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed3to4ActionPerformed(evt);
            }
        });

        jbt_wed4to5.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed4to5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed4to5.setText("Empty");
        jbt_wed4to5.setToolTipText("Click to create record");
        jbt_wed4to5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed4to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed4to5ActionPerformed(evt);
            }
        });

        jbt_wed5to6.setBackground(new java.awt.Color(204, 204, 255));
        jbt_wed5to6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_wed5to6.setText("Empty");
        jbt_wed5to6.setToolTipText("Click to create record");
        jbt_wed5to6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_wed5to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_wed5to6ActionPerformed(evt);
            }
        });

        editTimeTablePane_day4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editTimeTablePane_day4.setText("THU");

        jbt_thu10to11.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu10to11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu10to11.setText("Empty");
        jbt_thu10to11.setToolTipText("Click to create record");
        jbt_thu10to11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu10to11ActionPerformed(evt);
            }
        });

        jbt_thu9to10.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu9to10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu9to10.setText("Empty");
        jbt_thu9to10.setToolTipText("Click to create record");
        jbt_thu9to10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu9to10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu9to10ActionPerformed(evt);
            }
        });

        jbt_thu11to12.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu11to12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu11to12.setText("Empty");
        jbt_thu11to12.setToolTipText("Click to create record");
        jbt_thu11to12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu11to12ActionPerformed(evt);
            }
        });

        jbt_thu12to1.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu12to1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu12to1.setText("Empty");
        jbt_thu12to1.setToolTipText("Click to create record");
        jbt_thu12to1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu12to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu12to1ActionPerformed(evt);
            }
        });

        jbt_thu1to2.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu1to2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu1to2.setText("Empty");
        jbt_thu1to2.setToolTipText("Click to create record");
        jbt_thu1to2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu1to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu1to2ActionPerformed(evt);
            }
        });

        jbt_thu2to3.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu2to3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu2to3.setText("Empty");
        jbt_thu2to3.setToolTipText("Click to create record");
        jbt_thu2to3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu2to3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu2to3ActionPerformed(evt);
            }
        });

        jbt_thu3to4.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu3to4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu3to4.setText("Empty");
        jbt_thu3to4.setToolTipText("Click to create record");
        jbt_thu3to4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu3to4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu3to4ActionPerformed(evt);
            }
        });

        jbt_thu4to5.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu4to5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu4to5.setText("Empty");
        jbt_thu4to5.setToolTipText("Click to create record");
        jbt_thu4to5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu4to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu4to5ActionPerformed(evt);
            }
        });

        jbt_thu5to6.setBackground(new java.awt.Color(204, 204, 255));
        jbt_thu5to6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_thu5to6.setText("Empty");
        jbt_thu5to6.setToolTipText("Click to create record");
        jbt_thu5to6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_thu5to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thu5to6ActionPerformed(evt);
            }
        });

        editTimeTablePane_day5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editTimeTablePane_day5.setText("FRI");

        jbt_fri9to10.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri9to10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri9to10.setText("Empty");
        jbt_fri9to10.setToolTipText("Click to create record");
        jbt_fri9to10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri9to10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri9to10ActionPerformed(evt);
            }
        });

        jbt_fri10to11.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri10to11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri10to11.setText("Empty");
        jbt_fri10to11.setToolTipText("Click to create record");
        jbt_fri10to11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri10to11ActionPerformed(evt);
            }
        });

        jbt_fri11to12.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri11to12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri11to12.setText("Empty");
        jbt_fri11to12.setToolTipText("Click to create record");
        jbt_fri11to12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri11to12ActionPerformed(evt);
            }
        });

        jbt_fri12to1.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri12to1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri12to1.setText("Empty");
        jbt_fri12to1.setToolTipText("Click to create record");
        jbt_fri12to1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri12to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri12to1ActionPerformed(evt);
            }
        });

        jbt_fri1to2.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri1to2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri1to2.setText("Empty");
        jbt_fri1to2.setToolTipText("Click to create record");
        jbt_fri1to2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri1to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri1to2ActionPerformed(evt);
            }
        });

        jbt_fri2to3.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri2to3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri2to3.setText("Empty");
        jbt_fri2to3.setToolTipText("Click to create record");
        jbt_fri2to3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri2to3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri2to3ActionPerformed(evt);
            }
        });

        jbt_fri3to4.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri3to4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri3to4.setText("Empty");
        jbt_fri3to4.setToolTipText("Click to create record");
        jbt_fri3to4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri3to4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri3to4ActionPerformed(evt);
            }
        });

        jbt_fri4to5.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri4to5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri4to5.setText("Empty");
        jbt_fri4to5.setToolTipText("Click to create record");
        jbt_fri4to5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri4to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri4to5ActionPerformed(evt);
            }
        });

        jbt_fri5to6.setBackground(new java.awt.Color(204, 204, 255));
        jbt_fri5to6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_fri5to6.setText("Empty");
        jbt_fri5to6.setToolTipText("Click to create record");
        jbt_fri5to6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_fri5to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_fri5to6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editTimetablePanel_mainPanelLayout = new javax.swing.GroupLayout(editTimetablePanel_mainPanel);
        editTimetablePanel_mainPanel.setLayout(editTimetablePanel_mainPanelLayout);
        editTimetablePanel_mainPanelLayout.setHorizontalGroup(
            editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editTimeTablePane_day1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editTimeTablePane_day2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbt_mon9to10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editTimeTablePanel_time, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jbt_tue9to10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editTimeTablePane_day3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editTimeTablePane_day4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editTimeTablePane_day5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt_fri9to10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbt_thu9to10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbt_wed9to10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbt_mon10to11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editTimeTablePanel_time1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jbt_tue10to11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_wed10to11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_thu10to11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_fri10to11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbt_thu11to12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editTimeTablePanel_time3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_mon11to12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_tue11to12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_wed11to12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_fri11to12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbt_thu12to1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editTimeTablePanel_time10, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jbt_mon12to1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_tue12to1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_wed12to1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_fri12to1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editTimetablePanel_mainPanelLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbt_updateTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(editTimeTablePanel_time11, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(jbt_mon1to2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbt_tue1to2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbt_wed1to2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbt_thu1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editTimeTablePanel_time12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_mon2to3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_tue2to3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_wed2to3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_thu2to3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(editTimeTablePanel_time13, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(jbt_mon3to4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbt_tue3to4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbt_wed3to4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jbt_thu3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                                .addComponent(jbt_fri2to3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbt_fri3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbt_thu4to5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(editTimeTablePanel_time14, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(jbt_mon4to5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbt_tue4to5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbt_wed4to5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editTimeTablePanel_time15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_mon5to6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_tue5to6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_wed5to6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_thu5to6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                                .addComponent(jbt_fri4to5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbt_fri5to6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        editTimetablePanel_mainPanelLayout.setVerticalGroup(
            editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                        .addGap(0, 346, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jbt_updateTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editTimetablePanel_mainPanelLayout.createSequentialGroup()
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editTimeTablePanel_time1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editTimeTablePanel_time3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editTimeTablePanel_time, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editTimeTablePane_day1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon9to10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon10to11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon11to12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon12to1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon2to3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon4to5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_mon5to6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editTimeTablePanel_time10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editTimeTablePanel_time11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editTimeTablePanel_time12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editTimeTablePanel_time13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editTimeTablePanel_time14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editTimeTablePanel_time15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editTimeTablePane_day2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbt_tue9to10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue10to11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue11to12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue12to1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue2to3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue4to5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_tue5to6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editTimeTablePane_day3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed9to10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed10to11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed11to12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed12to1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed2to3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed4to5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_wed5to6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editTimeTablePane_day4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_thu10to11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_thu9to10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_thu11to12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_thu12to1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbt_thu1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_thu2to3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_thu3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_thu4to5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt_thu5to6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editTimetablePanel_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editTimeTablePane_day5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri9to10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri10to11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri11to12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri12to1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri1to2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri2to3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri3to4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri4to5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_fri5to6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editTimetablePanel_mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editTimetablePanel_mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_updateTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_updateTimetableActionPerformed
        // TODO add your handling code here:
        //create monday timetable
        maintainExamSys.updateTimetable(MondayTimetable);
        
        //create tuesday timetable
        maintainExamSys.updateTimetable(TuesdayTimetable);
        
        //create wednesday
        maintainExamSys.updateTimetable(WednesdayTimetable);
        
        //create thursday
        maintainExamSys.updateTimetable(ThursdayTimetable);
        
        //create friday
        maintainExamSys.updateTimetable(FridayTimetable);
        
        JOptionPane.showMessageDialog(null,"Update success","UPDATE RECORD SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        searchTimetable sTimetable = new searchTimetable();
        sTimetable.closeFrame(frm);
    }//GEN-LAST:event_jbt_updateTimetableActionPerformed

    private void jbt_mon9to10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon9to10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setNineAM_TenAM(detail);
        if(subjectID.isEmpty())
            jbt_mon9to10.setText("Empty");
        else
            jbt_mon9to10.setText(subjectID);
    }//GEN-LAST:event_jbt_mon9to10ActionPerformed

    private void jbt_mon10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon10to11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setTenAM_ElevenAM(detail);
        if(subjectID.isEmpty())
            jbt_mon10to11.setText("Empty");
        else
            jbt_mon10to11.setText(subjectID);
    }//GEN-LAST:event_jbt_mon10to11ActionPerformed

    private void jbt_mon11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon11to12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setElevenAM_TwelvePM(detail);
        if(subjectID.isEmpty())
            jbt_mon11to12.setText("Empty");
        else
            jbt_mon11to12.setText(subjectID);
    }//GEN-LAST:event_jbt_mon11to12ActionPerformed

    private void jbt_mon12to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon12to1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setTwelvePM_OnePM(detail);
        if(subjectID.isEmpty())
            jbt_mon12to1.setText("Empty");
        else
            jbt_mon12to1.setText(subjectID);
    }//GEN-LAST:event_jbt_mon12to1ActionPerformed

    private void jbt_mon1to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon1to2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setOnePM_TwoPM(detail);
        if(subjectID.isEmpty())
            jbt_mon1to2.setText("Empty");
        else
            jbt_mon1to2.setText(subjectID);
    }//GEN-LAST:event_jbt_mon1to2ActionPerformed

    private void jbt_mon2to3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon2to3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setTwoPM_ThreePM(detail);
        if(subjectID.isEmpty())
            jbt_mon2to3.setText("Empty");
        else
            jbt_mon2to3.setText(subjectID);
    }//GEN-LAST:event_jbt_mon2to3ActionPerformed

    private void jbt_mon3to4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon3to4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setThreePM_FourPM(detail);
        if(subjectID.isEmpty())
            jbt_mon3to4.setText("Empty");
        else
            jbt_mon3to4.setText(subjectID);
    }//GEN-LAST:event_jbt_mon3to4ActionPerformed

    private void jbt_mon4to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon4to5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setFourPM_FivePM(detail);
        if(subjectID.isEmpty())
            jbt_mon4to5.setText("Empty");
        else
            jbt_mon4to5.setText(subjectID);
    }//GEN-LAST:event_jbt_mon4to5ActionPerformed

    private void jbt_mon5to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mon5to6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        MondayTimetable.setFivePM_SixPM(detail);
        if(subjectID.isEmpty())
            jbt_mon5to6.setText("Empty");
        else
            jbt_mon5to6.setText(subjectID);
    }//GEN-LAST:event_jbt_mon5to6ActionPerformed

    private void jbt_tue9to10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue9to10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setNineAM_TenAM(detail);
        if(subjectID.isEmpty())
            jbt_tue9to10.setText("Empty");
        else
            jbt_tue9to10.setText(subjectID);
    }//GEN-LAST:event_jbt_tue9to10ActionPerformed

    private void jbt_tue10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue10to11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setTenAM_ElevenAM(detail);
        if(subjectID.isEmpty())
            jbt_tue10to11.setText("Empty");
        else
            jbt_tue10to11.setText(subjectID);
    }//GEN-LAST:event_jbt_tue10to11ActionPerformed

    private void jbt_tue11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue11to12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setElevenAM_TwelvePM(detail);
        if(subjectID.isEmpty())
            jbt_tue11to12.setText("Empty");
        else
            jbt_tue11to12.setText(subjectID);
    }//GEN-LAST:event_jbt_tue11to12ActionPerformed

    private void jbt_tue12to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue12to1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setTwelvePM_OnePM(detail);
        if(subjectID.isEmpty())
            jbt_tue12to1.setText("Empty");
        else
            jbt_tue12to1.setText(subjectID);
    }//GEN-LAST:event_jbt_tue12to1ActionPerformed

    private void jbt_tue1to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue1to2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setOnePM_TwoPM(detail);
        if(subjectID.isEmpty())
            jbt_tue1to2.setText("Empty");
        else
            jbt_tue1to2.setText(subjectID);
    }//GEN-LAST:event_jbt_tue1to2ActionPerformed

    private void jbt_tue2to3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue2to3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setTwoPM_ThreePM(detail);
        if(subjectID.isEmpty())
            jbt_tue2to3.setText("Empty");
        else
            jbt_tue2to3.setText(subjectID);
    }//GEN-LAST:event_jbt_tue2to3ActionPerformed

    private void jbt_tue3to4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue3to4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setThreePM_FourPM(detail);
        if(subjectID.isEmpty())
            jbt_tue3to4.setText("Empty");
        else
            jbt_tue3to4.setText(subjectID);
    }//GEN-LAST:event_jbt_tue3to4ActionPerformed

    private void jbt_tue4to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue4to5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setFourPM_FivePM(detail);
        if(subjectID.isEmpty())
            jbt_tue4to5.setText("Empty");
        else
            jbt_tue4to5.setText(subjectID);
    }//GEN-LAST:event_jbt_tue4to5ActionPerformed

    private void jbt_tue5to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tue5to6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        TuesdayTimetable.setFivePM_SixPM(detail);
        if(subjectID.isEmpty())
            jbt_tue5to6.setText("Empty");
        else
            jbt_tue5to6.setText(subjectID);
    }//GEN-LAST:event_jbt_tue5to6ActionPerformed

    private void jbt_wed9to10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed9to10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setNineAM_TenAM(detail);
        if(subjectID.isEmpty())
            jbt_wed9to10.setText("Empty");
        else
            jbt_wed9to10.setText(subjectID);
    }//GEN-LAST:event_jbt_wed9to10ActionPerformed

    private void jbt_wed10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed10to11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setTenAM_ElevenAM(detail);
        if(subjectID.isEmpty())
            jbt_wed10to11.setText("Empty");
        else
            jbt_wed10to11.setText(subjectID);
    }//GEN-LAST:event_jbt_wed10to11ActionPerformed

    private void jbt_wed11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed11to12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setElevenAM_TwelvePM(detail);
        if(subjectID.isEmpty())
            jbt_wed11to12.setText("Empty");
        else
            jbt_wed11to12.setText(subjectID);
    }//GEN-LAST:event_jbt_wed11to12ActionPerformed

    private void jbt_wed12to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed12to1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setTwelvePM_OnePM(detail);
        if(subjectID.isEmpty())
            jbt_wed12to1.setText("Empty");
        else
            jbt_wed12to1.setText(subjectID);
    }//GEN-LAST:event_jbt_wed12to1ActionPerformed

    private void jbt_wed1to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed1to2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setOnePM_TwoPM(detail);
        if(subjectID.isEmpty())
            jbt_wed1to2.setText("Empty");
        else
            jbt_wed1to2.setText(subjectID);
    }//GEN-LAST:event_jbt_wed1to2ActionPerformed

    private void jbt_wed2to3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed2to3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setTwoPM_ThreePM(detail);
        if(subjectID.isEmpty())
            jbt_wed2to3.setText("Empty");
        else
            jbt_wed2to3.setText(subjectID);
    }//GEN-LAST:event_jbt_wed2to3ActionPerformed

    private void jbt_wed3to4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed3to4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setThreePM_FourPM(detail);
        if(subjectID.isEmpty())
            jbt_wed3to4.setText("Empty");
        else
            jbt_wed3to4.setText(subjectID);
    }//GEN-LAST:event_jbt_wed3to4ActionPerformed

    private void jbt_wed4to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed4to5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setFourPM_FivePM(detail);
        if(subjectID.isEmpty())
            jbt_wed4to5.setText("Empty");
        else
            jbt_wed4to5.setText(subjectID);
    }//GEN-LAST:event_jbt_wed4to5ActionPerformed

    private void jbt_wed5to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_wed5to6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        WednesdayTimetable.setFivePM_SixPM(detail);
        if(subjectID.isEmpty())
            jbt_wed5to6.setText("Empty");
        else
            jbt_wed5to6.setText(subjectID);
    }//GEN-LAST:event_jbt_wed5to6ActionPerformed

    private void jbt_thu10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu10to11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setTenAM_ElevenAM(detail);
        if(subjectID.isEmpty())
            jbt_thu10to11.setText("Empty");
        else
            jbt_thu10to11.setText(subjectID);
    }//GEN-LAST:event_jbt_thu10to11ActionPerformed

    private void jbt_thu9to10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu9to10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setNineAM_TenAM(detail);
        if(subjectID.isEmpty())
            jbt_thu9to10.setText("Empty");
        else
            jbt_thu9to10.setText(subjectID);
    }//GEN-LAST:event_jbt_thu9to10ActionPerformed

    private void jbt_thu11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu11to12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setElevenAM_TwelvePM(detail);
        if(subjectID.isEmpty())
            jbt_thu11to12.setText("Empty");
        else
            jbt_thu11to12.setText(subjectID);
    }//GEN-LAST:event_jbt_thu11to12ActionPerformed

    private void jbt_thu12to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu12to1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setTwelvePM_OnePM(detail);
        if(subjectID.isEmpty())
            jbt_thu12to1.setText("Empty");
        else
            jbt_thu12to1.setText(subjectID);
    }//GEN-LAST:event_jbt_thu12to1ActionPerformed

    private void jbt_thu1to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu1to2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setOnePM_TwoPM(detail);
        if(subjectID.isEmpty())
            jbt_thu1to2.setText("Empty");
        else
            jbt_thu1to2.setText(subjectID);
    }//GEN-LAST:event_jbt_thu1to2ActionPerformed

    private void jbt_thu2to3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu2to3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setTwoPM_ThreePM(detail);
        if(subjectID.isEmpty())
            jbt_thu2to3.setText("Empty");
        else
            jbt_thu2to3.setText(subjectID);
    }//GEN-LAST:event_jbt_thu2to3ActionPerformed

    private void jbt_thu3to4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu3to4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setThreePM_FourPM(detail);
        if(subjectID.isEmpty())
            jbt_thu3to4.setText("Empty");
        else
            jbt_thu3to4.setText(subjectID);
    }//GEN-LAST:event_jbt_thu3to4ActionPerformed

    private void jbt_thu4to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu4to5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setFourPM_FivePM(detail);
        if(subjectID.isEmpty())
            jbt_thu4to5.setText("Empty");
        else
            jbt_thu4to5.setText(subjectID);
    }//GEN-LAST:event_jbt_thu4to5ActionPerformed

    private void jbt_thu5to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thu5to6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        ThursdayTimetable.setFivePM_SixPM(detail);
        if(subjectID.isEmpty())
            jbt_thu5to6.setText("Empty");
        else
            jbt_thu5to6.setText(subjectID);
    }//GEN-LAST:event_jbt_thu5to6ActionPerformed

    private void jbt_fri9to10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri9to10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setNineAM_TenAM(detail);
        if(subjectID.isEmpty())
            jbt_fri9to10.setText("Empty");
        else
            jbt_fri9to10.setText(subjectID);
    }//GEN-LAST:event_jbt_fri9to10ActionPerformed

    private void jbt_fri10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri10to11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setTenAM_ElevenAM(detail);
        if(subjectID.isEmpty())
            jbt_fri10to11.setText("Empty");
        else
            jbt_fri10to11.setText(subjectID);
    }//GEN-LAST:event_jbt_fri10to11ActionPerformed

    private void jbt_fri11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri11to12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setElevenAM_TwelvePM(detail);
        if(subjectID.isEmpty())
            jbt_fri11to12.setText("Empty");
        else
            jbt_fri11to12.setText(subjectID);
    }//GEN-LAST:event_jbt_fri11to12ActionPerformed

    private void jbt_fri12to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri12to1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setTwelvePM_OnePM(detail);
        if(subjectID.isEmpty())
            jbt_fri12to1.setText("Empty");
        else
            jbt_fri12to1.setText(subjectID);
    }//GEN-LAST:event_jbt_fri12to1ActionPerformed

    private void jbt_fri1to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri1to2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setOnePM_TwoPM(detail);
        if(subjectID.isEmpty())
            jbt_fri1to2.setText("Empty");
        else
            jbt_fri1to2.setText(subjectID);
    }//GEN-LAST:event_jbt_fri1to2ActionPerformed

    private void jbt_fri2to3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri2to3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setTwoPM_ThreePM(detail);
        if(subjectID.isEmpty())
            jbt_fri2to3.setText("Empty");
        else
            jbt_fri2to3.setText(subjectID);
    }//GEN-LAST:event_jbt_fri2to3ActionPerformed

    private void jbt_fri3to4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri3to4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setThreePM_FourPM(detail);
        if(subjectID.isEmpty())
            jbt_fri3to4.setText("Empty");
        else
            jbt_fri3to4.setText(subjectID);
    }//GEN-LAST:event_jbt_fri3to4ActionPerformed

    private void jbt_fri4to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri4to5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setFourPM_FivePM(detail);
        if(subjectID.isEmpty())
            jbt_fri4to5.setText("Empty");
        else
            jbt_fri4to5.setText(subjectID);
    }//GEN-LAST:event_jbt_fri4to5ActionPerformed

    private void jbt_fri5to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_fri5to6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, chooseSubject, "Choose Subject", JOptionPane.QUESTION_MESSAGE);
        String subjectID = maintainExamSys.getSubjectIDBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String lecturer = maintainExamSys.getLecturerBySubjectName(String.valueOf(chooseSubject.getSelectedItem()));
        String detail = subjectID.toUpperCase();
        FridayTimetable.setFivePM_SixPM(detail);
        if(subjectID.isEmpty())
            jbt_fri5to6.setText("Empty");
        else
            jbt_fri5to6.setText(subjectID);
    }//GEN-LAST:event_jbt_fri5to6ActionPerformed



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel editTimeTablePane_day1;
    private javax.swing.JLabel editTimeTablePane_day2;
    private javax.swing.JLabel editTimeTablePane_day3;
    private javax.swing.JLabel editTimeTablePane_day4;
    private javax.swing.JLabel editTimeTablePane_day5;
    private javax.swing.JLabel editTimeTablePanel_time;
    private javax.swing.JLabel editTimeTablePanel_time1;
    private javax.swing.JLabel editTimeTablePanel_time10;
    private javax.swing.JLabel editTimeTablePanel_time11;
    private javax.swing.JLabel editTimeTablePanel_time12;
    private javax.swing.JLabel editTimeTablePanel_time13;
    private javax.swing.JLabel editTimeTablePanel_time14;
    private javax.swing.JLabel editTimeTablePanel_time15;
    private javax.swing.JLabel editTimeTablePanel_time3;
    private javax.swing.JPanel editTimetablePanel_mainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbt_fri10to11;
    private javax.swing.JButton jbt_fri11to12;
    private javax.swing.JButton jbt_fri12to1;
    private javax.swing.JButton jbt_fri1to2;
    private javax.swing.JButton jbt_fri2to3;
    private javax.swing.JButton jbt_fri3to4;
    private javax.swing.JButton jbt_fri4to5;
    private javax.swing.JButton jbt_fri5to6;
    private javax.swing.JButton jbt_fri9to10;
    private javax.swing.JButton jbt_mon10to11;
    private javax.swing.JButton jbt_mon11to12;
    private javax.swing.JButton jbt_mon12to1;
    private javax.swing.JButton jbt_mon1to2;
    private javax.swing.JButton jbt_mon2to3;
    private javax.swing.JButton jbt_mon3to4;
    private javax.swing.JButton jbt_mon4to5;
    private javax.swing.JButton jbt_mon5to6;
    private javax.swing.JButton jbt_mon9to10;
    private javax.swing.JButton jbt_thu10to11;
    private javax.swing.JButton jbt_thu11to12;
    private javax.swing.JButton jbt_thu12to1;
    private javax.swing.JButton jbt_thu1to2;
    private javax.swing.JButton jbt_thu2to3;
    private javax.swing.JButton jbt_thu3to4;
    private javax.swing.JButton jbt_thu4to5;
    private javax.swing.JButton jbt_thu5to6;
    private javax.swing.JButton jbt_thu9to10;
    private javax.swing.JButton jbt_tue10to11;
    private javax.swing.JButton jbt_tue11to12;
    private javax.swing.JButton jbt_tue12to1;
    private javax.swing.JButton jbt_tue1to2;
    private javax.swing.JButton jbt_tue2to3;
    private javax.swing.JButton jbt_tue3to4;
    private javax.swing.JButton jbt_tue4to5;
    private javax.swing.JButton jbt_tue5to6;
    private javax.swing.JButton jbt_tue9to10;
    private javax.swing.JButton jbt_updateTimetable;
    private javax.swing.JButton jbt_wed10to11;
    private javax.swing.JButton jbt_wed11to12;
    private javax.swing.JButton jbt_wed12to1;
    private javax.swing.JButton jbt_wed1to2;
    private javax.swing.JButton jbt_wed2to3;
    private javax.swing.JButton jbt_wed3to4;
    private javax.swing.JButton jbt_wed4to5;
    private javax.swing.JButton jbt_wed5to6;
    private javax.swing.JButton jbt_wed9to10;
    // End of variables declaration//GEN-END:variables

    MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
}
