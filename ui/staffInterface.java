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
import java.awt.Event.*;
import java.io.File;
import static java.lang.System.exit;
import java.sql.*;
import javax.swing.*;
import domain.staff;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;



public class staffInterface extends JFrame{

    /**
     * @param args the command line arguments
     */
    //define system variable
    private staff staff = new staff();
    public staffInterface(String version, String userPosition, staff currentStaff){
        this.userPosition = userPosition;
        staff = currentStaff;
        currentVersion = version;
        userName = currentStaff.getSatffName();
        
        s_examiner_cPanel = new searchExaminer(userPosition);
        v_staff_cPanel = new displayStaffOwnDetail(staff);

        //system setting
        setTitle("TARUC Student Examination System");
        setSize(1366, 730);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setResizable(false);
        
        //system design
        blankPanel.setBackground(Color.decode("#ffff99"));
        motherPanel.setLayout(cl);
        motherPanel.add(blankPanel,"0");
        motherPanel.add(c_examiner_cPanel,"1");
        motherPanel.add(s_examiner_cPanel,"2");
        motherPanel.add(v_staff_cPanel,"3");
        motherPanel.add(c_course_cPanel,"4");
        motherPanel.add(v_course_cPanel,"5");
        motherPanel.add(c_subject_cPanel,"6");
        motherPanel.add(s_subject_cPanel,"7");
        motherPanel.add(c_result_cPanel,"8");
        motherPanel.add(c_timetable_cPanel,"9");
        motherPanel.add(s_timetable_cPanel,"10");
        
        
        //design blankPanel
        blankPanel.setLayout(new FlowLayout());
        blankPanel.add(new JLabel("Welcome, "+userName)).setFont(new Font("Cambria", Font.BOLD, 40));
        
        //adminMenuBar setting
        
        adminMenuBar.add(examiner_menu);
        adminMenuBar.add(staff_menu);
        adminMenuBar.add(course_menu);
        adminMenuBar.add(timetable_menu);
        adminMenuBar.add(Report_menu);
        adminMenuBar.add(help_menu);
        
        //examiner_menu setting
        examiner_menu.add(c_examiner_menuItm);
        c_examiner_menuItm.addActionListener(new c_examiner_Listener());
        
        examiner_menu.add(s_examiner_menuItm);
        s_examiner_menuItm.addActionListener(new s_examiner_Listener());
        
        examiner_menu.add(c_result_menuItm);
        c_result_menuItm.addActionListener(new c_result_Listener());
        
        //staff_menu setting
        staff_menu.add(v_staff_menuItm);
        v_staff_menuItm.addActionListener(new s_staff_Listener());
        
        //course_menu setting
        course_menu.add(c_course_menuItm);
        c_course_menuItm.addActionListener(new c_course_Listener());
        
        course_menu.add(s_course_menuItm);
        s_course_menuItm.addActionListener(new s_course_Listener());
        
        course_menu.add(c_subject_menuItm);
        c_subject_menuItm.addActionListener(new c_subject_Listener());
        
        course_menu.add(s_subject_menuItm);
        s_subject_menuItm.addActionListener(new s_subject_Listener());
        
        //help_menu setting
        help_menu.add(starter_guide_menuItm);
        starter_guide_menuItm.addActionListener(new starter_guide_Listener());
        
        help_menu.add(current_version_menuItm);
        current_version_menuItm.addActionListener(new current_version_staff_Listener());
        
        timetable_menu.add(c_timetable_menuItm);
        c_timetable_menuItm.addActionListener(new c_timetable_Listener());
        
        timetable_menu.add(s_timetable_menuItm);
        s_timetable_menuItm.addActionListener(new s_timetable_Listener());
        
        //report 
        Report_menu.add(examiner_report_menuItm);
        examiner_report_menuItm.addActionListener(new examiner_report_Listener());
        
        Report_menu.add(course_report_menuItm);
        course_report_menuItm.addActionListener(new registeredSubject_report_Listener());
        
        Report_menu.add(payment_report_menuItm);
        payment_report_menuItm.addActionListener(new payment_report_Listener());

        //add stuff to interface
        add(motherPanel);
        setJMenuBar(adminMenuBar);
    }
    
    //c_examiner_menuItm action setting
    private class c_examiner_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is c_examiner");
            cl.show(motherPanel,"1");
        }
 
    }
    
    private class s_examiner_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_examiner"); 
            cl.show(motherPanel,"2");
        }
 
    }
    
    private class c_result_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is c_examiner");
            cl.show(motherPanel,"8");
        }
 
    }
    
    private class s_staff_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_staff");  
            cl.show(motherPanel,"3");
        }
 
    }
    
    
    
    private class starter_guide_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Starter guide");
            frame.add(new starterGuide_staff());
            frame.setSize(900, 570);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
 
    }
    
    private class c_course_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cl.show(motherPanel,"4");
        }
 
    }
    
    private class s_course_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { 
            cl.show(motherPanel,"5");
        }
 
    }
    
    private class c_subject_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { 
            cl.show(motherPanel,"6");
        }
 
    }
    
    private class s_subject_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { 
            cl.show(motherPanel,"7");
        }
 
    }
    
    //report
    private class examiner_report_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String host = "jdbc:derby://localhost:1527/examinationSystemDB";
            String user = "taruc";
            String password = "taruc";
            Connection conn = null;
            
            String reportSource = "C:\\Users\\tommy\\Documents\\NetBeansProjects\\login screen\\src\\reportTemplates\\examinerReport.jrxml"; 
            Map<String, Object> params = new HashMap<String, Object>(); 
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                conn = DriverManager.getConnection(host, user, password);
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);
                JasperViewer.viewReport(jasperPrint, false); 

            }catch (JRException jrex) {
            JOptionPane.showMessageDialog(null, "error in generating report");
  	      jrex.printStackTrace();
            }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Unble to generate report~!");
	      ex.printStackTrace();
      }
        }
    }
    private class payment_report_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { 
            String host = "jdbc:derby://localhost:1527/examinationSystemDB";
            String user = "taruc";
            String password = "taruc";
            Connection conn = null;
            
            String reportSource = "C:\\Users\\tommy\\Documents\\NetBeansProjects\\login screen\\src\\reportTemplates\\payment.jrxml"; 
            Map<String, Object> params = new HashMap<String, Object>(); 
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                conn = DriverManager.getConnection(host, user, password);
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);
                JasperViewer.viewReport(jasperPrint, false); 

            }catch (JRException jrex) {
            JOptionPane.showMessageDialog(null, "error in generating report");
  	      jrex.printStackTrace();
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Unble to generate report~!");
                ex.printStackTrace();
            }
        }
 
    }
    private class registeredSubject_report_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String host = "jdbc:derby://localhost:1527/examinationSystemDB";
            String user = "taruc";
            String password = "taruc";
            Connection conn = null;
            
            String reportSource = "C:\\Users\\tommy\\Documents\\NetBeansProjects\\login screen\\src\\reportTemplates\\subject.jrxml";
            Map<String, Object> params = new HashMap<String, Object>(); 
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                conn = DriverManager.getConnection(host, user, password);
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);
                JasperViewer.viewReport(jasperPrint, false); 

            }catch (JRException jrex) {
            JOptionPane.showMessageDialog(null, "error in generating report");
  	      jrex.printStackTrace();
      }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Unble to generate report~!");
	      ex.printStackTrace();
      }
        }
 
    }
    
    private class current_version_staff_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            currentVersion cv = new currentVersion(currentVersion);
        }
 
    }
    
     private class c_timetable_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is c_examiner");
            cl.show(motherPanel,"9");
        }
 
    }
    
    private class s_timetable_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_examiner"); 
            cl.show(motherPanel,"10");
        }
 
    }
    
    private String userName = "";
    
    //define gui component
    private JPanel       motherPanel                 = new JPanel();
    private JPanel       blankPanel                  = new JPanel();
    private JMenuBar     adminMenuBar                = new JMenuBar();
    private JMenu        examiner_menu               = new JMenu("Examiner");
    private JMenu        staff_menu                  = new JMenu("Staff");
    private JMenu        course_menu                  = new JMenu("Course");
    private JMenu        help_menu                   = new JMenu("Help");
    private JMenu        timetable_menu              = new JMenu("Timetable");
    private JMenu        Report_menu                 = new JMenu("Report");
    
    //examiner_menu
    private JMenuItem    c_examiner_menuItm          = new JMenuItem("Create record");
    private JMenuItem    s_examiner_menuItm          = new JMenuItem("Search record");
    private JMenuItem    c_result_menuItm          = new JMenuItem("Examiner result");
    
    //staff_menu
    private JMenuItem    v_staff_menuItm             = new JMenuItem("View yourself");
    
    //course_menu
    private JMenuItem    c_course_menuItm     = new JMenuItem("Create course");
    private JMenuItem    s_course_menuItm     = new JMenuItem("Search course");
    private JMenuItem    c_subject_menuItm     = new JMenuItem("Create subject");
    private JMenuItem    s_subject_menuItm     = new JMenuItem("Search subject");
   
    //help_menu
    private JMenuItem    starter_guide_menuItm       = new JMenuItem("Starter guide");
    private JMenuItem    current_version_menuItm     = new JMenuItem("Current version");
    
    private JMenuItem    c_timetable_menuItm          = new JMenuItem("Create timetable");
    private JMenuItem    s_timetable_menuItm          = new JMenuItem("Search timetable");
    
    private JMenuItem    examiner_report_menuItm     = new JMenuItem("Examiner Report");
    private JMenuItem    course_report_menuItm     = new JMenuItem("Subject Report");
    private JMenuItem    payment_report_menuItm     = new JMenuItem("Payment Report");
    
    private CardLayout cl = new CardLayout();
    private String currentVersion = "";
    private String userPosition   = "";
    
    
    //define card layout
    private JPanel c_examiner_cPanel = new createExaminer();
    private JPanel s_examiner_cPanel;
    private JPanel c_result_cPanel = new createExaminerResult();
 
    
    private JPanel v_staff_cPanel;
    
    private JPanel c_course_cPanel = new createCourse();
    private JPanel v_course_cPanel = new searchCourse();
    
    private JPanel c_subject_cPanel = new createSubject();
    private JPanel s_subject_cPanel = new searchSubject();
    
    private JPanel c_timetable_cPanel = new createTimetable();
    private JPanel s_timetable_cPanel = new searchTimetable();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
