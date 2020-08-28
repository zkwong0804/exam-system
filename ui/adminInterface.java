package ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
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

import domain.admin;

public class adminInterface extends JFrame {

    /**
     * @param args the command line arguments
     */
    //define system variable
    private String userName = "";

    //define gui component
    private JPanel motherPanel = new JPanel();
    private JPanel blankPanel = new JPanel();
    private JMenuBar adminMenuBar = new JMenuBar();
    private JMenu examiner_menu = new JMenu("Examiner");
    private JMenu staff_menu = new JMenu("Staff");
    private JMenu help_menu = new JMenu("Help");
    private JMenuItem c_examiner_menuItm = new JMenuItem("Create record");
    private JMenuItem s_examiner_menuItm = new JMenuItem("Search record");

    private JMenuItem c_staff_menuItm = new JMenuItem("Create record");
    private JMenuItem s_staff_menuItm = new JMenuItem("Search record");
    private JMenuItem starter_guide_menuItm = new JMenuItem("Starter guide");
    private JMenuItem current_version_menuItm = new JMenuItem("Current version");

    private CardLayout cl = new CardLayout();
    private String currentVersion = "";
    private String userPosition = "";

    //define card layout

    private JPanel c_examiner_cPanel = new createExaminer();
    private JPanel s_examiner_cPanel = new searchExaminer(userPosition);
    private JPanel c_staff_cPanel = new createStaff();
    private JPanel s_staff_cPanel = new searchStaff();

    public void redrawPanel() {
        c_examiner_cPanel = new createExaminer();
        s_examiner_cPanel = new searchExaminer(userPosition);
        c_staff_cPanel = new createStaff();
        s_staff_cPanel = new searchStaff();
    }

    public adminInterface(String version, String userPosition, admin currentAdmin) {
        System.out.println("Welcome to admin interface");
        redrawPanel();
        currentVersion = version;
        this.userPosition = userPosition;
        userName = currentAdmin.getAdminName();

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
        motherPanel.add(blankPanel, "0");
        motherPanel.add(c_examiner_cPanel, "1");
        motherPanel.add(s_examiner_cPanel, "2");
        motherPanel.add(c_staff_cPanel, "3");
        motherPanel.add(s_staff_cPanel, "4");

        //design blankPanel
        blankPanel.setLayout(new FlowLayout());
        blankPanel.add(new JLabel("Welcome, " + userName)).setFont(new Font("Cambria", Font.BOLD, 40));

        //adminMenuBar setting
        adminMenuBar.add(examiner_menu);
        adminMenuBar.add(staff_menu);
        adminMenuBar.add(help_menu);

        //examiner_menu setting
        examiner_menu.add(c_examiner_menuItm);
        c_examiner_menuItm.addActionListener(new c_examiner_Listener());

        examiner_menu.add(s_examiner_menuItm);
        s_examiner_menuItm.addActionListener(new s_examiner_Listener());

        //staff_menu setting
        staff_menu.add(c_staff_menuItm);
        c_staff_menuItm.addActionListener(new c_staff_Listener());

        staff_menu.add(s_staff_menuItm);
        s_staff_menuItm.addActionListener(new s_staff_Listener());

        //help_menu setting
        help_menu.add(starter_guide_menuItm);
        starter_guide_menuItm.addActionListener(new starter_guide_Listener());

        help_menu.add(current_version_menuItm);
        current_version_menuItm.addActionListener(new current_version_staff_Listener());

        //add stuff to interface
        add(motherPanel);
        setJMenuBar(adminMenuBar);
    }

    //c_examiner_menuItm action setting
    private class c_examiner_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is c_examiner");
            cl.show(motherPanel, "1");
        }

    }

    private class s_examiner_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_examiner"); 
            cl.show(motherPanel, "2");
        }

    }

    private class c_staff_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is c_staff");  
            cl.show(motherPanel, "3");
        }

    }

    private class s_staff_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is u_staff");  
            cl.show(motherPanel, "4");
        }

    }

    private class starter_guide_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Starter Guide");
            frame.add(new starterGuide_admin());
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
