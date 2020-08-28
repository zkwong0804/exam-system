package ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tommy
 */

import ui.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import domain.examiner;
import domain.registeredSubject;
import control.MaintainExaminationSystem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class examinerInterface extends JFrame{

    /**
     * @param args the command line arguments
     */
    //define system variable
        
    private String userName = "";
    
    //define gui component
    private JPanel       motherPanel                 = new JPanel();
    private JPanel       blankPanel                  = new JPanel();
    private JMenuBar     examinerMenuBar                = new JMenuBar();
    private JMenu        examiner_menu               = new JMenu("Examiner");
    private JMenu        payment_menu                  = new JMenu("Payment");
    private JMenu        exam_menu                  = new JMenu("Examination");
    private JMenu        help_menu                   = new JMenu("Help");
    private JMenu        timetable_menu              = new JMenu("Timetable");
    
    //examiner_menu
    private JMenuItem    v_examiner_menuItm          = new JMenuItem("View yourself");
    
    private JMenuItem    v_Payment_menuItm          = new JMenuItem("View your payment");
    
    //course_menu
    private JMenuItem    c_exam_menuItm     = new JMenuItem("Register exam");
    private JMenuItem    v_result_menuItm     = new JMenuItem("View result");
   
    //help_menu
    private JMenuItem    starter_guide_menuItm       = new JMenuItem("Starter guide");
    private JMenuItem    current_version_menuItm     = new JMenuItem("Current version");
    
    private JMenuItem    v_timetable_menuItm          = new JMenuItem("View timetable");
    
    private CardLayout cl = new CardLayout();
    private String currentVersion = "";
    private String userPosition   = "";
    
    
    //define card layout
    private JPanel v_examiner_cPanel;
    private JPanel v_Payement_cPanel;
    private JPanel c_exam_cPanel;
    private JPanel v_result_cPanel;
    private JPanel v_timetable_cPanel;
    private JPanel starterGuidecPanel = new JPanel();
    private examiner examiner = new examiner();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();
     private String currentDate = dateFormat.format(date);
    
    MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    
    String registerDate = "";
    int registerMonth = 0;
    int registerNumber = 0;
    int currentMonth = Integer.parseInt(String.valueOf(currentDate.charAt(5))+String.valueOf(currentDate.charAt(6)));
    ArrayList<registeredSubject> sem1Subject = new ArrayList<registeredSubject>();
    ArrayList<registeredSubject> sem2Subject = new ArrayList<registeredSubject>();
    ArrayList<registeredSubject> sem3Subject = new ArrayList<registeredSubject>();
    
    public examinerInterface(String version, String userPosition, examiner currentExaminer){
        this.userPosition = userPosition;
        examiner = currentExaminer;
        currentVersion = version;
        userName = currentExaminer.getexaminerName();
        v_result_cPanel = new displayResult("EXAMINER", currentExaminer);
        
        
        v_examiner_cPanel = new displayExaminerOwnDetail(currentExaminer);
        v_timetable_cPanel = new viewTimetable(maintainExamSys.getCourseIDByCourseName(currentExaminer.getexaminerCourse()));
        v_Payement_cPanel = new searchPayment(currentExaminer.getexaminerID(), currentExaminer);
        
            registerDate = "";
            registerMonth = 0;
            System.out.println("maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()): "+maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()));
            for(int i=0;i<maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()).size();i++){
                registerDate = maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()).get(i).getRegisterDate();
                registerMonth = Integer.parseInt(String.valueOf(registerDate.charAt(5))+String.valueOf(registerDate.charAt(6)));
                if(registerMonth>=1&&registerMonth<=4)
                    sem1Subject.add(maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()).get(i));
                else if(registerMonth>=5&&registerMonth<=8)
                    sem2Subject.add(maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()).get(i));
                else if(registerMonth>=9&&registerMonth<=12)
                    sem3Subject.add(maintainExamSys.getRegisteredSubjectListByExaminerID(examiner.getexaminerID()).get(i));
                    
            }
            registerNumber = 0;
            currentMonth = Integer.parseInt(String.valueOf(currentDate.charAt(5))+String.valueOf(currentDate.charAt(6)));
            if(currentMonth>=1&&currentMonth<=4){
                if(sem1Subject.size()<5){
               registerNumber = sem1Subject.size();
                }
            }
                else if(currentMonth>=5&&currentMonth<=8){
                    if(sem2Subject.size()<5){
                registerNumber = sem2Subject.size();
                    }
                }
                else if(currentMonth>=9&&currentMonth<=12){
                    if(sem3Subject.size()<5){
                registerNumber = sem3Subject.size();
                    }
                }
            
            c_exam_cPanel = new registerExam(currentExaminer, registerNumber);
       
            
            
        //system setting
        setTitle("TARUC Student Examination System");
        setSize(1366, 730);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //add stuff to interface
        add(motherPanel);
        setJMenuBar(examinerMenuBar);
        
        //adminMenuBar setting
        examinerMenuBar.add(examiner_menu);
        examinerMenuBar.add(timetable_menu);
        examinerMenuBar.add(exam_menu);
        examinerMenuBar.add(payment_menu);
        examinerMenuBar.add(help_menu);
    
        //examiner_menu setting
        examiner_menu.add(v_examiner_menuItm);
        v_examiner_menuItm.addActionListener(new v_examiner_Listener());
        
        payment_menu.add(v_Payment_menuItm);
        v_Payment_menuItm.addActionListener(new v_payment_Listener());
        
        exam_menu.add(c_exam_menuItm);
        c_exam_menuItm.addActionListener(new c_examListener());
        
        exam_menu.add(v_result_menuItm);
        v_result_menuItm.addActionListener(new v_result_Listener());
        
        timetable_menu.add(v_timetable_menuItm);
        v_timetable_menuItm.addActionListener(new v_timetable_Listener());
        
        //help_menu setting
        help_menu.add(starter_guide_menuItm);
        starter_guide_menuItm.addActionListener(new starter_guide_Listener());
        
        help_menu.add(current_version_menuItm);
        current_version_menuItm.addActionListener(new current_version_staff_Listener());
        
        //system design
        blankPanel.setBackground(Color.decode("#ffff99"));
        motherPanel.setLayout(cl);
        motherPanel.add(blankPanel,"0");
        motherPanel.add(v_examiner_cPanel,"1");
        motherPanel.add(v_Payement_cPanel,"2");
        motherPanel.add(c_exam_cPanel,"3");
        motherPanel.add(v_result_cPanel,"4");
        motherPanel.add(v_timetable_cPanel,"5");
        motherPanel.add(starterGuidecPanel,"6");
        
        
        //design blankPanel
        blankPanel.setLayout(new FlowLayout());
        blankPanel.add(new JLabel("Welcome, "+userName)).setFont(new Font("Cambria", Font.BOLD, 40));
    }
    
    //c_examiner_menuItm action setting
    private class v_examiner_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cl.show(motherPanel,"1");
        }
 
    }
    
    private class v_payment_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cl.show(motherPanel,"2");
        }
 
    }
    
    private class c_examListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(currentMonth>=1&&currentMonth<=4){
                if(sem1Subject.size()<5){
                cl.show(motherPanel,"3");
                }
                else
                    JOptionPane.showMessageDialog(null, "You have registered 5 subject in this semester already.", "ACCESS DENIED", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(currentMonth>=5&&currentMonth<=8){
                if(sem2Subject.size()<5){
                    cl.show(motherPanel,"3");
                }
                else
                    JOptionPane.showMessageDialog(null, "You have registered 5 subject in this semester already.", "ACCESS DENIED", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(currentMonth>=9&&currentMonth<=12){
                if(sem3Subject.size()<5){
                    cl.show(motherPanel,"3");
                }
                else
                    JOptionPane.showMessageDialog(null, "You have registered 5 subject in this semester already.", "ACCESS DENIED", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
 
    }
    
    private class v_result_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_examiner"); 
            cl.show(motherPanel,"4");
        }
 
    }
    
    private class v_timetable_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_staff");  
            cl.show(motherPanel,"5");
        }
 
    }
    
    
    
    private class starter_guide_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { 
           JFrame frame = new JFrame("Starter Guide");
            frame.add(new starterGuide_examiner());
            frame.setSize(900, 570);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
 
    }
    
    private class current_version_staff_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            currentVersion cv = new currentVersion(currentVersion);
        }
 
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
