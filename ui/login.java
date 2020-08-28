package ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author tommy
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import control.MaintainExaminationSystem;
import da.ExaminerTableModel;
import domain.admin;
import domain.staff;
import domain.examiner;

import java.util.ArrayList;

public class login extends JFrame {
    /**
     * @param args the command line arguments
     */
    //gui component
    private JTextField loginID = new JTextField(10);
    private JPasswordField loginPass = new JPasswordField();
    private JButton loginBtn = new JButton("Login");
    private JLabel loginIDText = new JLabel("Login ID");
    private JLabel loginPassText = new JLabel("Password");
    private JLabel titleText = new JLabel("Student Examination System");
    private JLabel pass_recovery_helpText = new JLabel("Awwww... I forgot my password...");
    private JLabel first_time_login_helpText = new JLabel("How to perform first time login?");
    private JLabel logoLabel;

    //system variable
    private String loginID_recovery = "";
    private String loginName_recovery = "";
    private String answerFromUser = "";
    private String answerFromDB = "";
    private String question_recovery = "What is your favorite animal?";
    private String userCurrentPassword_recovery = "";
    private String currentVersion = "Beta 1.0";
    private String userPosition = "";
    private boolean isPasswordMatched = false;
    private boolean isFirstTimesLogin = false;

    //set variable
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    private ArrayList<admin> adminList = maintainExamSys.getAdminList();
    private ArrayList<staff> staffList = maintainExamSys.getStaffList();
    private ArrayList<examiner> examinerList = maintainExamSys.getExaminerList();
    private admin currentAdmin;
    private staff currentStaff;
    private examiner currentExaminer;


    public login() {


        for (int i = 0; i < adminList.size(); i++) {
            admin a = adminList.get(i);
            System.out.println("admin: " + a.getAdminID() + "[" + a.getAdminAnswer() + "]");
        }

        for (int i = 0; i < staffList.size(); i++) {
            staff a = staffList.get(i);
            System.out.println("staff: " + a.getStaffID() + "[" + a.getStaffAnswer() + "]");
        }

        for (int i = 0; i < examinerList.size(); i++) {
            examiner a = examinerList.get(i);
            System.out.println("examiner: " + a.getexaminerID() + "[" + a.getexaminerPassword() + "]");
        }

        //maintainExamSys.setPassrate();
        maintainExamSys.setPaymentReport();
        //insert logo
        ImageIcon taruc_logo = new ImageIcon(getClass().getResource("/images/logo.png"));
        logoLabel = new JLabel(taruc_logo);

        //system design
        JPanel motherPanel = new JPanel();
        motherPanel.setBackground(Color.decode("#ffff99"));
        motherPanel.setLayout(null);
        titleText.setFont(new Font("arial", Font.BOLD, 16));
        titleText.setSize(500, 50);
        titleText.setLocation(85, 240);
        motherPanel.add(titleText);


        //set tooltips
        loginID.setToolTipText("It will be your staff ID/Student ID/Admin ID.");
        loginPass.setToolTipText("Key in your password.");
        loginBtn.setToolTipText("Click to login system.");
        pass_recovery_helpText.setToolTipText("The path to the password recovery.");
        first_time_login_helpText.setToolTipText("<html>" + "Login ID > Your student/staff/admin ID." + "<br/>Password > The first 6-digit of your identity  card number.</html>");

        //design loginIDText
        loginIDText.setSize(100, 30);
        loginIDText.setLocation(30, 300);
        motherPanel.add(loginIDText);
        //design loginID
        loginID.setSize(250, 30);
        loginID.setLocation(95, 300);
        motherPanel.add(loginID);

        //design loginPassText
        loginPassText.setSize(100, 30);
        loginPassText.setLocation(30, 335);
        motherPanel.add(loginPassText);

        //design loginPass
        loginPass.setSize(250, 30);
        loginPass.setLocation(95, 335);
        motherPanel.add(loginPass);

        //design loginBtn
        loginBtn.setSize(100, 30);
        loginBtn.setLocation(150, 400);
        loginBtn.addActionListener(new loginBtn_Listener());
        motherPanel.add(loginBtn);

        //design pass_recovery_helpText
        pass_recovery_helpText.setFont(new Font("arial", Font.BOLD, 10));
        pass_recovery_helpText.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pass_recovery_helpText.setSize(500, 50);
        pass_recovery_helpText.setLocation(210, 528);
        pass_recovery_helpText.addMouseListener(new pass_recovery_listener());
        motherPanel.add(pass_recovery_helpText);

        //design first_time_login_helpText
        first_time_login_helpText.setFont(new Font("arial", Font.BOLD, 10));
        first_time_login_helpText.setCursor(new Cursor(Cursor.HAND_CURSOR));
        first_time_login_helpText.setSize(500, 50);
        first_time_login_helpText.setLocation(222, 507);
        motherPanel.add(first_time_login_helpText);

        //design logoLabel
        logoLabel.setSize(500, 100);
        logoLabel.setLocation(-50, 100);
        motherPanel.add(logoLabel);

        add(motherPanel);

        //system setting
        setTitle("TARUC Student Examination System");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    //loginBtn action setting
    private class loginBtn_Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"This is loginBtn");
            close();
            loginProcess();
        }

    }

    public void loginProcess() {
        //prompt error message if login id is less than or more than 10 characters
        if (loginID.getText().length() != 10) {
            JOptionPane.showMessageDialog(rootPane, "Your login ID should have 10 characters. Please make sure you have entered your ID correctly", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
            loginID.setText("");
            loginPass.setText("");
        } else {
            //second if else
            //check login id and password
            System.out.println("Login success");
            for (int i = 0; i < adminList.size() && userPosition.isEmpty() == true; i++) {
                if (loginID.getText().equalsIgnoreCase(adminList.get(i).getAdminID())) {
                    userPosition = "admin";
                    if (loginPass.getText().equalsIgnoreCase(adminList.get(i).getAdminPassword())) {
                        isPasswordMatched = true;
                    }
                    currentAdmin = adminList.get(i);
                    if (currentAdmin.getLoginTimes() == 0 && isPasswordMatched == true) {
                        loginName_recovery = currentAdmin.getAdminName();
                        isFirstTimesLogin = true;
                        currentAdmin.setLoginTimes(1);
                    }
                }

            }
            for (int i = 0; i < staffList.size() && userPosition.isEmpty() == true; i++) {
                if (loginID.getText().equalsIgnoreCase(staffList.get(i).getStaffID())) {
                    userPosition = "staff";
                    //system report end
                    if (loginPass.getText().equalsIgnoreCase(staffList.get(i).getStaffPassword()))
                        isPasswordMatched = true;
                    currentStaff = staffList.get(i);
                    if (currentStaff.getLoginTimes() == 0 && isPasswordMatched == true) {
                        loginName_recovery = currentStaff.getSatffName();
                        isFirstTimesLogin = true;
                    }
                }
            }

            for (int i = 0; i < examinerList.size() && userPosition.isEmpty() == true; i++) {
                if (loginID.getText().equalsIgnoreCase(examinerList.get(i).getexaminerID())) {
                    userPosition = "examiner";
                    //system report end
                    if (loginPass.getText().equalsIgnoreCase(examinerList.get(i).getexaminerPassword()))
                        isPasswordMatched = true;
                    currentExaminer = examinerList.get(i);
                    if (currentExaminer.getloginTimes() == 0 && isPasswordMatched == true) {
                        loginName_recovery = currentExaminer.getexaminerName();
                        isFirstTimesLogin = true;
                    }
                }
            }
            //prompt error message if id wrong
            if (userPosition.isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Your ID is not found in the database, please make sure you have entered the correct ID or you may contact our system admin for help:\n" + adminList.get(0).getAdminName() + "  " + adminList.get(0).getAdminContactNumber() + "\n" + adminList.get(1).getAdminName() + "  " + adminList.get(1).getAdminContactNumber() + "\n", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                loginID.setText("");
            }

            //prompt error message if password wrong
            if (isPasswordMatched == false) {
                JOptionPane.showMessageDialog(rootPane, "Incorrect password!! Please make sure you have entered the correct password or you may required to perfom the password recovery to recover your password back.\n(Tips: Please kindly refer how to perform 1st time login if this is the first time you use this system)", "INCORRECT PASSWORD", JOptionPane.ERROR_MESSAGE);
                loginPass.setText("");
                userPosition = "";
            }

            //System.out.println("Current Positon: "+userPosition); //system report

            //login system if both password and id is correct
            if (isFirstTimesLogin == true && isPasswordMatched == true) {
                answerFromUser = JOptionPane.showInputDialog(rootPane, "Hi, " + loginName_recovery + ". \nWelcome to TAR UC Examination System! You are only required to finish one more step and you will be allowed to use this system.\nPlease answer the question below:\n" + question_recovery + ":", "First time login", JOptionPane.DEFAULT_OPTION);
                try {
                    if (userPosition.equalsIgnoreCase("ADMIN") && isPasswordMatched == true && answerFromUser.isEmpty() == false) {
                        currentAdmin.setAdminAnswer(answerFromUser);
                        maintainExamSys.updateAdmin(currentAdmin);
                        System.out.println("Login as admin for the first time");
                        new adminInterface(currentVersion, userPosition, currentAdmin);
                    } else if (userPosition.equalsIgnoreCase("STAFF") && isPasswordMatched == true && answerFromUser.isEmpty() == false) {
                        currentStaff.setStaffAnswer(answerFromUser);
                        maintainExamSys.updateStaff(currentStaff);
                        new staffInterface(currentVersion, userPosition, currentStaff);
                    } else if (userPosition.equalsIgnoreCase("EXAMINER") && isPasswordMatched == true && answerFromUser.isEmpty() == false) {
                        currentExaminer.setexaminerAnswer(answerFromUser);
                        maintainExamSys.updateExaminer(currentExaminer);
                        new examinerInterface(currentVersion, userPosition, currentExaminer);
                    }
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "1st time login prcess interrupted!! The 1st times login process must be done before you start using this system!!", "PROCESS INTERRUPT", JOptionPane.ERROR_MESSAGE);
                }
                userPosition = "";
                isPasswordMatched = false;
                isFirstTimesLogin = false;
            } else {
                if (userPosition.equalsIgnoreCase("ADMIN") && isPasswordMatched == true) {
                    System.out.println("Not login as admin for the first time");
                    new adminInterface(currentVersion, userPosition, currentAdmin);
                } else if (userPosition.equalsIgnoreCase("STAFF") && isPasswordMatched == true) {
                    new staffInterface(currentVersion, userPosition, currentStaff);
                } else if (userPosition.equalsIgnoreCase("EXAMINER") && isPasswordMatched == true) {
                    new examinerInterface(currentVersion, userPosition, currentExaminer);
                }
            }

            //end second if else
        }
        //end of if else
    }

    //pass_recovery_helpText action setting 
    private class pass_recovery_listener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            int idIndex = 0;
            loginID_recovery = JOptionPane.showInputDialog(rootPane, "Please enter your login ID for proceed to the next step.", "Password Recovery", JOptionPane.INFORMATION_MESSAGE);
            //check login id and password
            for (int i = 0; i < adminList.size() && userPosition.isEmpty() == true; i++) {
                if (loginID_recovery.equalsIgnoreCase(adminList.get(i).getAdminID())) {
                    userPosition = "admin";
                    loginName_recovery = adminList.get(i).getAdminName();
                    idIndex = i;
                }

            }
            for (int i = 0; i < staffList.size() && userPosition.isEmpty() == true; i++) {
                if (loginID_recovery.equalsIgnoreCase(staffList.get(i).getStaffID())) {
                    userPosition = "staff";
                    loginName_recovery = staffList.get(i).getSatffName();
                    idIndex = i;
                }
            }
            for (int i = 0; i < examinerList.size() && userPosition.isEmpty() == true; i++) {
                if (loginID_recovery.equalsIgnoreCase(examinerList.get(i).getexaminerID())) {
                    userPosition = "examiner";
                    loginName_recovery = examinerList.get(i).getexaminerName();
                    idIndex = i;
                }
            }
            //prompt error message if id is not found
            if (userPosition.isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Sorry!! ID not found!!\n(Tips: The login ID should be your student/staff/admin ID)", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                userPosition = "";
            }//start password recovery
            else {
                answerFromUser = JOptionPane.showInputDialog(rootPane, "Hi, " + loginName_recovery + ". \nPlease answer the question below:\n" + question_recovery + "(Answer should be same as the answer that you have entered into 1st time login):", "Password Recovery", JOptionPane.WARNING_MESSAGE);
                if (userPosition.equalsIgnoreCase("ADMIN")) {
                    answerFromDB = adminList.get(idIndex).getAdminAnswer();
                    userCurrentPassword_recovery = adminList.get(idIndex).getAdminPassword();
                } else if (userPosition.equalsIgnoreCase("STAFF")) {
                    answerFromDB = staffList.get(idIndex).getStaffAnswer();
                    userCurrentPassword_recovery = staffList.get(idIndex).getStaffPassword();
                } else if (userPosition.equalsIgnoreCase("EXAMINER")) {
                    answerFromDB = examinerList.get(idIndex).getexaminerAnswer();
                    userCurrentPassword_recovery = examinerList.get(idIndex).getexaminerPassword();
                }

                if (answerFromDB.equalsIgnoreCase(answerFromUser) == false) {
                    JOptionPane.showMessageDialog(rootPane, "Sorry!! The answer you have entered are not matched with the answer that you entered in the 1st time login. Please kindly look for admin for help to recover your password", "INCORRECT ANSWER", JOptionPane.ERROR_MESSAGE);
                } else
                    JOptionPane.showMessageDialog(rootPane, "Password recover success!! You are able to login the system with the password below and change your password in system if you wish!\n\nCurrent password:   " + userCurrentPassword_recovery, "Password recover success!", JOptionPane.INFORMATION_MESSAGE);
            }
            userPosition = "";
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        login frame = new login();
    }

}
