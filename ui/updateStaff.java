package ui;

import java.awt.event.*;
import control.MaintainExaminationSystem;
import domain.staff;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
public class updateStaff extends javax.swing.JPanel {

    /**
     * Creates new form createExaminer
     */
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    private staff staff;
    
    public updateStaff(staff staff) {
        initComponents();
        this.staff = staff;
        
        jtf_staff_name.setDocument(new updateStaff.JTextFieldLimit(30));
        jtf_staff_contactNum_back.setDocument(new updateStaff.JTextFieldLimit(7));
        jtf_staff_contactNum_front.setDocument(new updateStaff.JTextFieldLimit(3));
        
        jtf_staff_name.setText(staff.getSatffName());
        jtf_staff_contactNum_front.setText(String.valueOf(staff.getStaffContactNumber().charAt(0))+String.valueOf(staff.getStaffContactNumber().charAt(1))+String.valueOf(staff.getStaffContactNumber().charAt(2)));
        jtf_staff_contactNum_back.setText(String.valueOf(staff.getStaffContactNumber().charAt(4))+String.valueOf(staff.getStaffContactNumber().charAt(5))+String.valueOf(staff.getStaffContactNumber().charAt(6))+String.valueOf(staff.getStaffContactNumber().charAt(8))+String.valueOf(staff.getStaffContactNumber().charAt(9))+String.valueOf(staff.getStaffContactNumber().charAt(10))+String.valueOf(staff.getStaffContactNumber().charAt(11)));
        jta_staff_address.setText(staff.getStaffAddress());
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
        createExaminerPanel_leftPanel = new javax.swing.JPanel();
        updateStaffPanel_text_Create = new java.awt.Label();
        updateStaffPanel_text_Record = new java.awt.Label();
        updateStaffPanel_text_Examiner = new java.awt.Label();
        createExaminerPanel_rightPanel = new javax.swing.JPanel();
        updateStaffPanel_text_Name = new java.awt.Label();
        updateStaffPanel_text_Address = new java.awt.Label();
        jbt_resetField = new javax.swing.JButton();
        jbt_createStaff = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_staff_address = new javax.swing.JTextArea();
        jtf_staff_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateStaffPanel_text_Contact_number = new java.awt.Label();
        jtf_staff_contactNum_back = new javax.swing.JTextField();
        updateStaffPanel_text_Contact_number1 = new java.awt.Label();
        jtf_staff_contactNum_front = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        createExaminerPanel_leftPanel.setBackground(new java.awt.Color(204, 204, 255));
        createExaminerPanel_leftPanel.setToolTipText("");

        updateStaffPanel_text_Create.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateStaffPanel_text_Create.setText("Update");

        updateStaffPanel_text_Record.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateStaffPanel_text_Record.setText("Record");

        updateStaffPanel_text_Examiner.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateStaffPanel_text_Examiner.setText("Staff");

        javax.swing.GroupLayout createExaminerPanel_leftPanelLayout = new javax.swing.GroupLayout(createExaminerPanel_leftPanel);
        createExaminerPanel_leftPanel.setLayout(createExaminerPanel_leftPanelLayout);
        createExaminerPanel_leftPanelLayout.setHorizontalGroup(
            createExaminerPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createExaminerPanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(createExaminerPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateStaffPanel_text_Create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStaffPanel_text_Examiner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStaffPanel_text_Record, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        createExaminerPanel_leftPanelLayout.setVerticalGroup(
            createExaminerPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createExaminerPanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateStaffPanel_text_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateStaffPanel_text_Examiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateStaffPanel_text_Record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createExaminerPanel_rightPanel.setBackground(new java.awt.Color(204, 255, 204));
        createExaminerPanel_rightPanel.setToolTipText("");

        updateStaffPanel_text_Name.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateStaffPanel_text_Name.setText("Name");

        updateStaffPanel_text_Address.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateStaffPanel_text_Address.setText("Address");

        jbt_resetField.setBackground(new java.awt.Color(255, 204, 153));
        jbt_resetField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_resetField.setText("Reset");
        jbt_resetField.setToolTipText("Click to reset all fields");
        jbt_resetField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_resetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_resetFieldActionPerformed(evt);
            }
        });

        jbt_createStaff.setBackground(new java.awt.Color(255, 204, 153));
        jbt_createStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_createStaff.setText("Update");
        jbt_createStaff.setToolTipText("Click to create record");
        jbt_createStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_createStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_createStaffActionPerformed(evt);
            }
        });

        jta_staff_address.setBackground(new java.awt.Color(204, 204, 255));
        jta_staff_address.setColumns(20);
        jta_staff_address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jta_staff_address.setRows(5);
        jta_staff_address.setToolTipText("Enter examiner's home address");
        jScrollPane1.setViewportView(jta_staff_address);

        jtf_staff_name.setBackground(new java.awt.Color(204, 204, 255));
        jtf_staff_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_staff_name.setToolTipText("Enter examiner's name here");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setToolTipText("Bonjour");

        jLabel2.setToolTipText("Bonjour");

        updateStaffPanel_text_Contact_number.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateStaffPanel_text_Contact_number.setText("Contact number");

        jtf_staff_contactNum_back.setBackground(new java.awt.Color(204, 204, 255));
        jtf_staff_contactNum_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_staff_contactNum_back.setToolTipText("Enter examiner's programe");
        jtf_staff_contactNum_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_staff_contactNum_backActionPerformed(evt);
            }
        });
        jtf_staff_contactNum_back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_staff_contactNum_backKeyTyped(evt);
            }
        });

        updateStaffPanel_text_Contact_number1.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateStaffPanel_text_Contact_number1.setText("-");

        jtf_staff_contactNum_front.setBackground(new java.awt.Color(204, 204, 255));
        jtf_staff_contactNum_front.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_staff_contactNum_front.setToolTipText("Enter examiner's programe");
        jtf_staff_contactNum_front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_staff_contactNum_frontActionPerformed(evt);
            }
        });
        jtf_staff_contactNum_front.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_staff_contactNum_frontKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout createExaminerPanel_rightPanelLayout = new javax.swing.GroupLayout(createExaminerPanel_rightPanel);
        createExaminerPanel_rightPanel.setLayout(createExaminerPanel_rightPanelLayout);
        createExaminerPanel_rightPanelLayout.setHorizontalGroup(
            createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addGap(0, 1180, Short.MAX_VALUE)
                        .addComponent(jbt_createStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_resetField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                                .addComponent(updateStaffPanel_text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createExaminerPanel_rightPanelLayout.createSequentialGroup()
                                    .addComponent(updateStaffPanel_text_Contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_staff_contactNum_front, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(updateStaffPanel_text_Contact_number1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_staff_contactNum_back))
                                .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                                    .addComponent(updateStaffPanel_text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(140, 140, 140)
                                    .addComponent(jtf_staff_name, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        createExaminerPanel_rightPanelLayout.setVerticalGroup(
            createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateStaffPanel_text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_staff_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbt_resetField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_createStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(createExaminerPanel_rightPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateStaffPanel_text_Contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_staff_contactNum_back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateStaffPanel_text_Contact_number1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_staff_contactNum_front, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createExaminerPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateStaffPanel_text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        updateStaffPanel_text_Address.getAccessibleContext().setAccessibleName("Intake year: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createExaminerPanel_leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createExaminerPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createExaminerPanel_leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(createExaminerPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_resetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_resetFieldActionPerformed
        // TODO add your handling code here:
        int isConfirmed = 0;
        isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all fields?", "CLEAR FIELD CONFIRMATION", HEIGHT);
        if(isConfirmed==0){
            jtf_staff_name.setText("");
            jta_staff_address.setText("");
            jtf_staff_contactNum_front.setText("");
            jtf_staff_contactNum_back.setText("");
        }
        else{}
    }//GEN-LAST:event_jbt_resetFieldActionPerformed

    private void jbt_createStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_createStaffActionPerformed
        // TODO add your handling code here:
        if(jtf_staff_contactNum_back.getText().length()==7&&jtf_staff_name.getText().isEmpty()==false&&jtf_staff_contactNum_front.getText().length()==3&&jta_staff_address.getText().isEmpty()==false){
            int isConfirmed = 0;
            staff.setStafName(jtf_staff_name.getText());
            staff.setStaffContactNumber_front(jtf_staff_contactNum_front.getText());
            staff.setStaffContactNumber_back(jtf_staff_contactNum_back.getText());
            staff.setStaffAddress(jta_staff_address.getText());
            staff.setStaffContactNumber();
            isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record with the following information:\nName: "+staff.getSatffName()+"\nAddress: "+staff.getStaffAddress()+"\nContact number: "+staff.getStaffContactNumber(), "UPDATE RECORD CONFIRMATION", HEIGHT);
            if(isConfirmed==0){
                if(staff.getStaffContactNumber_front().charAt(0)=='0'&&staff.getStaffContactNumber_front().charAt(1)=='1'){
                    maintainExamSys.updateStaff(staff);
            JOptionPane.showMessageDialog(null, "Update record success!", "UPDATE RECORD SUCCESS", HEIGHT);
                }
                else
                    JOptionPane.showMessageDialog(null, "Your phone number format is incorrect! (Tips: Phone number format: 01x-xxxxxxx)!", "CREATE RECORD FAIL", HEIGHT);
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Update record fail!", "UPDATE RECORD FAIL", HEIGHT);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Update record fail! Please fill in all form before you decide to update record.", "UPDATE RECORD FAIL", HEIGHT);
    }//GEN-LAST:event_jbt_createStaffActionPerformed

    private void jtf_staff_contactNum_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_staff_contactNum_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_staff_contactNum_backActionPerformed

    private void jtf_staff_contactNum_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_staff_contactNum_frontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_staff_contactNum_frontActionPerformed

    private void jtf_staff_contactNum_frontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_staff_contactNum_frontKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
       if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
           evt.consume();
           java.awt.Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_jtf_staff_contactNum_frontKeyTyped

    private void jtf_staff_contactNum_backKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_staff_contactNum_backKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
       if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
           evt.consume();
           java.awt.Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_jtf_staff_contactNum_backKeyTyped

    public class JTextFieldLimit extends PlainDocument {
        private int limit;
        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }
        public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
            if (str == null) return;
            
            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel createExaminerPanel_leftPanel;
    private javax.swing.JPanel createExaminerPanel_rightPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_createStaff;
    private javax.swing.JButton jbt_resetField;
    private javax.swing.JTextArea jta_staff_address;
    private javax.swing.JTextField jtf_staff_contactNum_back;
    private javax.swing.JTextField jtf_staff_contactNum_front;
    private javax.swing.JTextField jtf_staff_name;
    private java.awt.Label updateStaffPanel_text_Address;
    private java.awt.Label updateStaffPanel_text_Contact_number;
    private java.awt.Label updateStaffPanel_text_Contact_number1;
    private java.awt.Label updateStaffPanel_text_Create;
    private java.awt.Label updateStaffPanel_text_Examiner;
    private java.awt.Label updateStaffPanel_text_Name;
    private java.awt.Label updateStaffPanel_text_Record;
    // End of variables declaration//GEN-END:variables
}
