package ui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import domain.examiner;
import control.MaintainExaminationSystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tommy
 */
public class displayExaminerOwnDetail extends javax.swing.JPanel {

    /**
     * Creates new form createExaminer
     */
    private examiner currentExaminer = new examiner();
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    
    public displayExaminerOwnDetail(examiner examiner) {
        initComponents();
        currentExaminer = examiner;
        updateField(examiner.getexaminerID());
    }
    
    public void updateField(String examinerID){
        currentExaminer = maintainExamSys.getSelectedExaminer(examinerID);
        jtf_displayName.setText(currentExaminer.getexaminerName());
        jtf_display_myKadNumber.setText(currentExaminer.getexaminerIC());
        jtf_displayStudent_ID.setText(currentExaminer.getexaminerID());
        jtf_displayAge.setText(String.valueOf(currentExaminer.getexaminerAge()));
        jtf_displayContactNum.setText(currentExaminer.getexaminerContactNumber());
        jtf_displayIntakeYear.setText(String.valueOf(currentExaminer.getexaminerIntakeYear()));
        jtf_displayCourse.setText(currentExaminer.getexaminerCourse());
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
        updateExaminerPanel_rightPanel = new javax.swing.JPanel();
        updateExaminerPanel_text_Name = new java.awt.Label();
        jbt_updateStaff = new javax.swing.JButton();
        updateExaminerPanel_text_Age = new java.awt.Label();
        updateExaminerPanel_text_Student_ID = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_displayStudent_ID = new javax.swing.JTextField();
        jtf_displayName = new javax.swing.JTextField();
        jtf_displayAge = new javax.swing.JTextField();
        updateExaminerPanel_text_myKad_number = new java.awt.Label();
        jtf_display_myKadNumber = new javax.swing.JTextField();
        updateExaminerPanel_text_Contact_number = new java.awt.Label();
        jtf_displayContactNum = new javax.swing.JTextField();
        jbt_refresh = new javax.swing.JButton();
        jbt_changePassword = new javax.swing.JButton();
        updateExaminerPanel_text_Intake_year = new java.awt.Label();
        updateExaminerPanel_text_Course = new java.awt.Label();
        jtf_displayCourse = new javax.swing.JTextField();
        jtf_displayIntakeYear = new javax.swing.JTextField();
        updateExaminerPanel_leftPanel1 = new javax.swing.JPanel();
        updateExaminerPanel_text_Record = new java.awt.Label();
        updateExaminerPanel_text_Staff = new java.awt.Label();

        setBackground(new java.awt.Color(0, 0, 0));

        updateExaminerPanel_rightPanel.setBackground(new java.awt.Color(204, 255, 204));
        updateExaminerPanel_rightPanel.setToolTipText("");

        updateExaminerPanel_text_Name.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_Name.setText("Name");

        jbt_updateStaff.setBackground(new java.awt.Color(255, 204, 153));
        jbt_updateStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_updateStaff.setText("Update");
        jbt_updateStaff.setToolTipText("Click to update record");
        jbt_updateStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_updateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_updateStaffActionPerformed(evt);
            }
        });

        updateExaminerPanel_text_Age.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_Age.setText("Age");

        updateExaminerPanel_text_Student_ID.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_Student_ID.setText("Student ID");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setToolTipText("Bonjour");

        jLabel2.setToolTipText("Bonjour");

        jtf_displayStudent_ID.setEditable(false);
        jtf_displayStudent_ID.setBackground(new java.awt.Color(204, 204, 255));
        jtf_displayStudent_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_displayStudent_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_displayStudent_IDActionPerformed(evt);
            }
        });

        jtf_displayName.setEditable(false);
        jtf_displayName.setBackground(new java.awt.Color(204, 204, 255));
        jtf_displayName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_displayName.setToolTipText("");
        jtf_displayName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_displayNameActionPerformed(evt);
            }
        });

        jtf_displayAge.setEditable(false);
        jtf_displayAge.setBackground(new java.awt.Color(204, 204, 255));
        jtf_displayAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_displayAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_displayAgeActionPerformed(evt);
            }
        });

        updateExaminerPanel_text_myKad_number.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_myKad_number.setText("myKad number");

        jtf_display_myKadNumber.setEditable(false);
        jtf_display_myKadNumber.setBackground(new java.awt.Color(204, 204, 255));
        jtf_display_myKadNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_display_myKadNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_display_myKadNumberActionPerformed(evt);
            }
        });

        updateExaminerPanel_text_Contact_number.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_Contact_number.setText("Contact number");

        jtf_displayContactNum.setEditable(false);
        jtf_displayContactNum.setBackground(new java.awt.Color(204, 204, 255));
        jtf_displayContactNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_displayContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_displayContactNumActionPerformed(evt);
            }
        });

        jbt_refresh.setBackground(new java.awt.Color(255, 204, 153));
        jbt_refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_refresh.setText("Refresh");
        jbt_refresh.setToolTipText("Click to update record");
        jbt_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_refreshActionPerformed(evt);
            }
        });

        jbt_changePassword.setBackground(new java.awt.Color(255, 204, 153));
        jbt_changePassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_changePassword.setText("Change password");
        jbt_changePassword.setToolTipText("Click to update record");
        jbt_changePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_changePasswordActionPerformed(evt);
            }
        });

        updateExaminerPanel_text_Intake_year.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_Intake_year.setText("Intake year");

        updateExaminerPanel_text_Course.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateExaminerPanel_text_Course.setText("Course");

        jtf_displayCourse.setEditable(false);
        jtf_displayCourse.setBackground(new java.awt.Color(204, 204, 255));
        jtf_displayCourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_displayCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_displayCourseActionPerformed(evt);
            }
        });

        jtf_displayIntakeYear.setEditable(false);
        jtf_displayIntakeYear.setBackground(new java.awt.Color(204, 204, 255));
        jtf_displayIntakeYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_displayIntakeYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_displayIntakeYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateExaminerPanel_rightPanelLayout = new javax.swing.GroupLayout(updateExaminerPanel_rightPanel);
        updateExaminerPanel_rightPanel.setLayout(updateExaminerPanel_rightPanelLayout);
        updateExaminerPanel_rightPanelLayout.setHorizontalGroup(
            updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1))
                            .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                                .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateExaminerPanel_text_Course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateExaminerPanel_text_Contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateExaminerPanel_text_Intake_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateExaminerPanel_text_myKad_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateExaminerPanel_text_Student_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateExaminerPanel_text_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_displayCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                                            .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtf_displayIntakeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtf_displayContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(143, 143, 143)
                                            .addComponent(jbt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                                            .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jtf_displayStudent_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                    .addComponent(jtf_display_myKadNumber, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(jtf_displayAge, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtf_displayName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(123, 123, 123)
                                            .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jbt_changePassword)
                                                .addComponent(jbt_updateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(277, 277, 277)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updateExaminerPanel_text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateExaminerPanel_rightPanelLayout.setVerticalGroup(
            updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addComponent(jbt_changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_updateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(updateExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateExaminerPanel_text_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_displayName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_display_myKadNumber)
                            .addComponent(updateExaminerPanel_text_myKad_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_displayStudent_ID)
                            .addComponent(updateExaminerPanel_text_Student_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_displayAge)
                            .addComponent(updateExaminerPanel_text_Age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateExaminerPanel_text_Contact_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_displayContactNum))
                        .addGap(14, 14, 14)
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_displayIntakeYear)
                            .addComponent(updateExaminerPanel_text_Intake_year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(updateExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_displayCourse)
                            .addComponent(updateExaminerPanel_text_Course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );

        updateExaminerPanel_leftPanel1.setBackground(new java.awt.Color(204, 204, 255));
        updateExaminerPanel_leftPanel1.setToolTipText("");

        updateExaminerPanel_text_Record.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateExaminerPanel_text_Record.setText("Record");

        updateExaminerPanel_text_Staff.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateExaminerPanel_text_Staff.setText("My");

        javax.swing.GroupLayout updateExaminerPanel_leftPanel1Layout = new javax.swing.GroupLayout(updateExaminerPanel_leftPanel1);
        updateExaminerPanel_leftPanel1.setLayout(updateExaminerPanel_leftPanel1Layout);
        updateExaminerPanel_leftPanel1Layout.setHorizontalGroup(
            updateExaminerPanel_leftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateExaminerPanel_leftPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(updateExaminerPanel_leftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateExaminerPanel_text_Staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateExaminerPanel_text_Record, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        updateExaminerPanel_leftPanel1Layout.setVerticalGroup(
            updateExaminerPanel_leftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateExaminerPanel_leftPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateExaminerPanel_text_Staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateExaminerPanel_text_Record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(updateExaminerPanel_leftPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateExaminerPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateExaminerPanel_leftPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateExaminerPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_updateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_updateStaffActionPerformed
        // TODO add your handling code here:
        JFrame frm = new JFrame();
        frm.add(new updateExaminer(currentExaminer));
        frm.setTitle("EXAMINER RECORD");
        frm.setSize(1366, 730);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setVisible(true);
        frm.setResizable(false);
        
    }//GEN-LAST:event_jbt_updateStaffActionPerformed

    
    private void jtf_displayStudent_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_displayStudent_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_displayStudent_IDActionPerformed

    private void jtf_displayNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_displayNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_displayNameActionPerformed

    private void jtf_displayAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_displayAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_displayAgeActionPerformed

    private void jtf_display_myKadNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_display_myKadNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_display_myKadNumberActionPerformed

    private void jtf_displayContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_displayContactNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_displayContactNumActionPerformed

    private void jbt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_refreshActionPerformed
        // TODO add your handling code here:
        updateField(currentExaminer.getexaminerID());
    }//GEN-LAST:event_jbt_refreshActionPerformed

    private void jbt_changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_changePasswordActionPerformed
        // TODO add your handling code here:
        if((JOptionPane.showConfirmDialog(null, "Are you sure you want to change your password?","PASSWORD CHANGE CONFIRMATION",JOptionPane.INFORMATION_MESSAGE)==0)){
            String oldPassword = "", newPassword = "";
            oldPassword = JOptionPane.showInputDialog(null,"Please enter your previous password:","USER VERTIFICATION",JOptionPane.INFORMATION_MESSAGE);
            if(oldPassword.isEmpty()==false){
                if(oldPassword.equalsIgnoreCase(currentExaminer.getexaminerPassword())){
                newPassword = JOptionPane.showInputDialog(null, "Please enter the new password here, the new password should not be same as the previous password.", "PASSWORD CHANGE PROCESS", JOptionPane.INFORMATION_MESSAGE);
                if(newPassword.equalsIgnoreCase(currentExaminer.getexaminerPassword())){
                    JOptionPane.showMessageDialog(null, "The password is same as the previous password!! Operation interrupted!!", "PASSWORD CHANGE FAIL", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    currentExaminer.setexaminerPassword(newPassword);
                    maintainExamSys.updateExaminer(currentExaminer);
                }
                    
                
            }
                else
                    JOptionPane.showMessageDialog(null,"Password wrong, please make sure you have entered the correct password ","PASSWORD CHANGE INTERRUPTED", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null,"Password field is empty, please type in your old password before we get into the next step", "PASSWORD CHANGE INTERRUPTED", JOptionPane.ERROR_MESSAGE);
    }
        else
            JOptionPane.showMessageDialog(null,"Password change canceled by user", "PASSWORD CHANGE CANCELED", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbt_changePasswordActionPerformed

    private void jtf_displayCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_displayCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_displayCourseActionPerformed

    private void jtf_displayIntakeYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_displayIntakeYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_displayIntakeYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbt_changePassword;
    private javax.swing.JButton jbt_refresh;
    private javax.swing.JButton jbt_updateStaff;
    private javax.swing.JTextField jtf_displayAge;
    private javax.swing.JTextField jtf_displayContactNum;
    private javax.swing.JTextField jtf_displayCourse;
    private javax.swing.JTextField jtf_displayIntakeYear;
    private javax.swing.JTextField jtf_displayName;
    private javax.swing.JTextField jtf_displayStudent_ID;
    private javax.swing.JTextField jtf_display_myKadNumber;
    private javax.swing.JPanel updateExaminerPanel_leftPanel1;
    private javax.swing.JPanel updateExaminerPanel_rightPanel;
    private java.awt.Label updateExaminerPanel_text_Age;
    private java.awt.Label updateExaminerPanel_text_Contact_number;
    private java.awt.Label updateExaminerPanel_text_Course;
    private java.awt.Label updateExaminerPanel_text_Intake_year;
    private java.awt.Label updateExaminerPanel_text_Name;
    private java.awt.Label updateExaminerPanel_text_Record;
    private java.awt.Label updateExaminerPanel_text_Staff;
    private java.awt.Label updateExaminerPanel_text_Student_ID;
    private java.awt.Label updateExaminerPanel_text_myKad_number;
    // End of variables declaration//GEN-END:variables
}
