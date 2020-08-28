package ui;

import java.awt.event.*;
import javax.swing.JOptionPane;
import domain.subject;
import java.util.ArrayList;
import control.MaintainExaminationSystem;
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
public class updateSubject extends javax.swing.JPanel {

    /**
     * Creates new form createExaminer
     */
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    private subject subject = new subject();
    public updateSubject(subject subject) {
        initComponents();
        this.subject = subject;
        ArrayList<String> courseList = new ArrayList<String>();
        for(int i=0;i<maintainExamSys.getCourseList().size();i++){
            courseList.add(maintainExamSys.getCourseList().get(i).getcourseID());
        }
        String[] courseArr = new String[courseList.size()];
        courseArr = courseList.toArray(courseArr);
        jcb_subject_courseID.setModel(new javax.swing.DefaultComboBoxModel(courseArr));
        
        jtf_subject_name.setDocument(new updateSubject.JTextFieldLimit(30));
        jtf_subject_Lecturer.setDocument(new updateSubject.JTextFieldLimit(30));
        
        jtf_subject_name.setText(subject.getSubjectName());
        jtf_subject_Lecturer.setText(subject.getLecturer());
        jcb_subject_courseID.setSelectedItem(subject.getCourseID());
        jta_subject_description.setText(subject.getSubjectDescription());
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
        updateSubjectPanel_leftPanel = new javax.swing.JPanel();
        updateSubjectPanel_text_Create = new java.awt.Label();
        updateSubjectPanel_text_Record = new java.awt.Label();
        updateSubjectPanel_text_Subject = new java.awt.Label();
        updateSubjectPanel_rightPanel = new javax.swing.JPanel();
        updateSubjectPanel_text_Subject_Name = new java.awt.Label();
        jbt_resetField = new javax.swing.JButton();
        jbt_updateSubject = new javax.swing.JButton();
        jtf_subject_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateSubjectPanel_text_Description = new java.awt.Label();
        jtf_subject_Lecturer = new javax.swing.JTextField();
        jcb_subject_courseID = new javax.swing.JComboBox<>();
        updateSubjectPanel_text_Lecturer = new java.awt.Label();
        updateSubjectPanel_text_Course_ID = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_subject_description = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));

        updateSubjectPanel_leftPanel.setBackground(new java.awt.Color(204, 204, 255));
        updateSubjectPanel_leftPanel.setToolTipText("");

        updateSubjectPanel_text_Create.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateSubjectPanel_text_Create.setText("Update");

        updateSubjectPanel_text_Record.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateSubjectPanel_text_Record.setText("Record");

        updateSubjectPanel_text_Subject.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        updateSubjectPanel_text_Subject.setText("Subject");

        javax.swing.GroupLayout updateSubjectPanel_leftPanelLayout = new javax.swing.GroupLayout(updateSubjectPanel_leftPanel);
        updateSubjectPanel_leftPanel.setLayout(updateSubjectPanel_leftPanelLayout);
        updateSubjectPanel_leftPanelLayout.setHorizontalGroup(
            updateSubjectPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSubjectPanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(updateSubjectPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSubjectPanel_text_Create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSubjectPanel_text_Subject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSubjectPanel_text_Record, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        updateSubjectPanel_leftPanelLayout.setVerticalGroup(
            updateSubjectPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSubjectPanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateSubjectPanel_text_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateSubjectPanel_text_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateSubjectPanel_text_Record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateSubjectPanel_rightPanel.setBackground(new java.awt.Color(204, 255, 204));
        updateSubjectPanel_rightPanel.setToolTipText("");

        updateSubjectPanel_text_Subject_Name.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateSubjectPanel_text_Subject_Name.setText("Subject");

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

        jbt_updateSubject.setBackground(new java.awt.Color(255, 204, 153));
        jbt_updateSubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_updateSubject.setText("Update");
        jbt_updateSubject.setToolTipText("Click to create record");
        jbt_updateSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_updateSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_updateSubjectActionPerformed(evt);
            }
        });

        jtf_subject_name.setBackground(new java.awt.Color(204, 204, 255));
        jtf_subject_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_subject_name.setToolTipText("Enter examiner's name here");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setToolTipText("Bonjour");

        jLabel2.setToolTipText("Bonjour");

        updateSubjectPanel_text_Description.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateSubjectPanel_text_Description.setText("Description");

        jtf_subject_Lecturer.setBackground(new java.awt.Color(204, 204, 255));
        jtf_subject_Lecturer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf_subject_Lecturer.setToolTipText("Enter examiner's phone number");
        jtf_subject_Lecturer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_subject_LecturerKeyTyped(evt);
            }
        });

        jcb_subject_courseID.setBackground(new java.awt.Color(153, 255, 153));
        jcb_subject_courseID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcb_subject_courseID.setModel(jcb_subject_courseID.getModel());
        jcb_subject_courseID.setToolTipText("Choos examiner's course");

        updateSubjectPanel_text_Lecturer.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateSubjectPanel_text_Lecturer.setText("Lecturer");

        updateSubjectPanel_text_Course_ID.setFont(new java.awt.Font("FangSong", 1, 24)); // NOI18N
        updateSubjectPanel_text_Course_ID.setText("Course ID");

        jta_subject_description.setBackground(new java.awt.Color(204, 204, 255));
        jta_subject_description.setColumns(20);
        jta_subject_description.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jta_subject_description.setRows(5);
        jScrollPane1.setViewportView(jta_subject_description);

        javax.swing.GroupLayout updateSubjectPanel_rightPanelLayout = new javax.swing.GroupLayout(updateSubjectPanel_rightPanel);
        updateSubjectPanel_rightPanel.setLayout(updateSubjectPanel_rightPanelLayout);
        updateSubjectPanel_rightPanelLayout.setHorizontalGroup(
            updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                        .addComponent(updateSubjectPanel_text_Subject_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                        .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbt_updateSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_subject_name, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcb_subject_courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_subject_Lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 133, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbt_resetField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                        .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateSubjectPanel_text_Course_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSubjectPanel_text_Lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSubjectPanel_text_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        updateSubjectPanel_rightPanelLayout.setVerticalGroup(
            updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSubjectPanel_text_Subject_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_subject_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSubjectPanel_text_Course_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_subject_courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSubjectPanel_text_Lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_subject_Lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                        .addComponent(updateSubjectPanel_text_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateSubjectPanel_rightPanelLayout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(updateSubjectPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_resetField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_updateSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(updateSubjectPanel_leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateSubjectPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateSubjectPanel_leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateSubjectPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_resetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_resetFieldActionPerformed
        // TODO add your handling code here:
        int isConfirmed = 0;
        isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all fields?", "CLEAR FIELD CONFIRMATION", HEIGHT);
        if(isConfirmed==0){
            jtf_subject_name.setText("");
            jtf_subject_Lecturer.setText("");
            jcb_subject_courseID.setSelectedIndex(0);
            jta_subject_description.setText("");
        }
        else{}
    }//GEN-LAST:event_jbt_resetFieldActionPerformed

    private void jbt_updateSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_updateSubjectActionPerformed
        // TODO add your handling code here:
        if(jtf_subject_Lecturer.getText().isEmpty()==false&&jtf_subject_name.getText().isEmpty()==false&&jta_subject_description.getText().isEmpty()==false){

                int isConfirmed = 0;
            subject.setSubjectName(jtf_subject_name.getText());
            subject.setLecturer(jtf_subject_Lecturer.getText());
            subject.setCourseID(String.valueOf(jcb_subject_courseID.getSelectedItem()));
            subject.setSubjectDescription(jta_subject_description.getText());
            isConfirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record with the following information:\nSubject: "+subject.getSubjectName()+"\nSubject ID: "+subject.getSubjectID()+"\nCourse ID: "+subject.getCourseID()+"\nLecturer: "+subject.getLecturer()+"\nDescription: "+subject.getSubjectDescription(), "UPDATE RECORD CONFIRMATION", HEIGHT);
            if(isConfirmed==0){
            maintainExamSys.updateSubject(subject);
            }
            else{
                JOptionPane.showMessageDialog(null, "Update record fail!", "UPDATE RECORD FAIL", HEIGHT);
            }
            }
        else
            JOptionPane.showMessageDialog(null, "Update record fail! Please fill in all form before you decide to update record.", "UPDATE RECORD FAIL", HEIGHT);
    }//GEN-LAST:event_jbt_updateSubjectActionPerformed

    private void jtf_subject_LecturerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_subject_LecturerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_subject_LecturerKeyTyped

    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_resetField;
    private javax.swing.JButton jbt_updateSubject;
    private javax.swing.JComboBox<String> jcb_subject_courseID;
    private javax.swing.JTextArea jta_subject_description;
    private javax.swing.JTextField jtf_subject_Lecturer;
    private javax.swing.JTextField jtf_subject_name;
    private javax.swing.JPanel updateSubjectPanel_leftPanel;
    private javax.swing.JPanel updateSubjectPanel_rightPanel;
    private java.awt.Label updateSubjectPanel_text_Course_ID;
    private java.awt.Label updateSubjectPanel_text_Create;
    private java.awt.Label updateSubjectPanel_text_Description;
    private java.awt.Label updateSubjectPanel_text_Lecturer;
    private java.awt.Label updateSubjectPanel_text_Record;
    private java.awt.Label updateSubjectPanel_text_Subject;
    private java.awt.Label updateSubjectPanel_text_Subject_Name;
    // End of variables declaration//GEN-END:variables
}