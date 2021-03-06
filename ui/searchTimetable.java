package ui;


import control.MaintainExaminationSystem;
import da.ExaminerTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.*;
import static ui.searchExaminer.DATABASE_URL;
import domain.course;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tommy
 */
import da.ExaminerTableModel;
import domain.timetable;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class searchTimetable extends javax.swing.JPanel {

    /**
     * Creates new form createExaminer
     */
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/f:/examinationSystemDB;create=true";
    static final String USERNAME = "taruc";
    static final String PASSWORD = "taruc";
    static final String DEFAULT_QUERY = "SELECT \"day\", \"timetableName\" FROM TIMETABLE";
    
    private ExaminerTableModel tableModel;
    private JTable resultTable;
    private TableRowSorter<TableModel> sorter;
    private JTextField filterText = new JTextField();
    private String userOptions = "courseID";
    
    public searchTimetable() {
        initComponents();
        drawTable();
        ArrayList<String> courseList = new ArrayList<String>();
        for(int i=0;i<maintainExamSys.getCourseList().size();i++){
            courseList.add(maintainExamSys.getCourseList().get(i).getcourseID());
        }
        String[] courseArr = new String[courseList.size()];
        courseArr = courseList.toArray(courseArr);
        jcb_examiner_course.setModel(new javax.swing.DefaultComboBoxModel(courseArr));
        
    }
    
    public void drawTable(){
        try {
            String query  = "SELECT \"day\", \"9.00am_10.00am\", \"10.00am_11.00am\", \"11.00am_12.00pm\", \"12.00pm_1.00pm\", \"1.00pm_2.00pm\", \"2.00pm_3.00pm\", \"3.00pm_4.00pm\", \"4.00pm_5.00pm\", \"5.00pm_6.00pm\" FROM TIMETABLE WHERE \"courseID\"='DIA'";
            tableModel = new ExaminerTableModel(DATABASE_URL, USERNAME, PASSWORD, query);
            displayTable.setModel(tableModel);
            sorter = new TableRowSorter<TableModel>(tableModel);
            displayTable.setRowSorter(sorter);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            tableModel.disconnectFromDatabase();
            System.exit(1);
        }
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
        searchTimetablePanel_leftPanel = new javax.swing.JPanel();
        searchTimetablePanel_text_Search = new java.awt.Label();
        searchTimetablePanel_text_Timetable = new java.awt.Label();
        searchTimetablePanel_rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jbt_refresh = new javax.swing.JButton();
        jcb_examiner_course = new javax.swing.JComboBox<>();
        jbt_remove = new javax.swing.JButton();
        jbt_update = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        searchTimetablePanel_leftPanel.setBackground(new java.awt.Color(204, 204, 255));
        searchTimetablePanel_leftPanel.setToolTipText("");

        searchTimetablePanel_text_Search.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        searchTimetablePanel_text_Search.setText("Search");

        searchTimetablePanel_text_Timetable.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        searchTimetablePanel_text_Timetable.setText("Timetable");

        javax.swing.GroupLayout searchTimetablePanel_leftPanelLayout = new javax.swing.GroupLayout(searchTimetablePanel_leftPanel);
        searchTimetablePanel_leftPanel.setLayout(searchTimetablePanel_leftPanelLayout);
        searchTimetablePanel_leftPanelLayout.setHorizontalGroup(
            searchTimetablePanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTimetablePanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(searchTimetablePanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTimetablePanel_text_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTimetablePanel_text_Timetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        searchTimetablePanel_leftPanelLayout.setVerticalGroup(
            searchTimetablePanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTimetablePanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTimetablePanel_text_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTimetablePanel_text_Timetable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchTimetablePanel_rightPanel.setBackground(new java.awt.Color(204, 255, 204));
        searchTimetablePanel_rightPanel.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setToolTipText("Bonjour");

        jLabel2.setToolTipText("Ni hao");

        displayTable.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Staff ID", "Gender", "MyKad", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayTable.setToolTipText("Here is it");
        jScrollPane1.setViewportView(displayTable);

        jbt_refresh.setBackground(new java.awt.Color(255, 204, 153));
        jbt_refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_refresh.setText("Refresh");
        jbt_refresh.setToolTipText("Click to enter record");
        jbt_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_refreshActionPerformed(evt);
            }
        });

        jcb_examiner_course.setBackground(new java.awt.Color(204, 255, 204));
        jcb_examiner_course.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcb_examiner_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_examiner_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_examiner_courseActionPerformed(evt);
            }
        });

        jbt_remove.setBackground(new java.awt.Color(255, 204, 153));
        jbt_remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_remove.setText("Remove");
        jbt_remove.setToolTipText("Click to enter record");
        jbt_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_removeActionPerformed(evt);
            }
        });

        jbt_update.setBackground(new java.awt.Color(255, 204, 153));
        jbt_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_update.setText("Update");
        jbt_update.setToolTipText("Click to enter record");
        jbt_update.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchTimetablePanel_rightPanelLayout = new javax.swing.GroupLayout(searchTimetablePanel_rightPanel);
        searchTimetablePanel_rightPanel.setLayout(searchTimetablePanel_rightPanelLayout);
        searchTimetablePanel_rightPanelLayout.setHorizontalGroup(
            searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                .addGap(952, 952, 952)
                .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addGap(127, 173, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jcb_examiner_course, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );
        searchTimetablePanel_rightPanelLayout.setVerticalGroup(
            searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcb_examiner_course, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                    .addContainerGap(119, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchTimetablePanel_leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTimetablePanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchTimetablePanel_leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchTimetablePanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void closeFrame(JFrame frame){
        frame.dispose();
    }
    private void jbt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_refreshActionPerformed
        // TODO add your handling code here:
        try {
            String a = "SELECT \"day\", \"9.00am_10.00am\", \"10.00am_11.00am\", \"11.00am_12.00pm\", \"12.00pm_1.00pm\", \"1.00pm_2.00pm\", \"2.00pm_3.00pm\", \"3.00pm_4.00pm\", \"4.00pm_5.00pm\", \"5.00pm_6.00pm\" FROM TIMETABLE WHERE \"courseID\"='"+jcb_examiner_course.getSelectedItem()+"'";
            tableModel.setQuery(a);
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);

            }
    }//GEN-LAST:event_jbt_refreshActionPerformed

    private void jcb_examiner_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_examiner_courseActionPerformed
        // TODO add your handling code here:
        String a = "SELECT \"day\", \"9.00am_10.00am\", \"10.00am_11.00am\", \"11.00am_12.00pm\", \"12.00pm_1.00pm\", \"1.00pm_2.00pm\", \"2.00pm_3.00pm\", \"3.00pm_4.00pm\", \"4.00pm_5.00pm\", \"5.00pm_6.00pm\" FROM TIMETABLE WHERE \"courseID\"='"+jcb_examiner_course.getSelectedItem()+"'";
        try {
            tableModel.setQuery(a);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jcb_examiner_courseActionPerformed

    private void jbt_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_removeActionPerformed
        // TODO add your handling code here:
        maintainExamSys.removeRecord(String.valueOf(jcb_examiner_course.getSelectedItem()).toUpperCase()+"MON", "TIMETABLE");
        maintainExamSys.removeRecord(String.valueOf(jcb_examiner_course.getSelectedItem()).toUpperCase()+"TUE", "TIMETABLE");
        maintainExamSys.removeRecord(String.valueOf(jcb_examiner_course.getSelectedItem()).toUpperCase()+"WED", "TIMETABLE");
        maintainExamSys.removeRecord(String.valueOf(jcb_examiner_course.getSelectedItem()).toUpperCase()+"THU", "TIMETABLE");
        maintainExamSys.removeRecord(String.valueOf(jcb_examiner_course.getSelectedItem()).toUpperCase()+"FRI", "TIMETABLE");
    }//GEN-LAST:event_jbt_removeActionPerformed

    private void jbt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_updateActionPerformed
        // TODO add your handling code here:
        JFrame frm = new JFrame();
        frm.add(new updateTimetable(String.valueOf(jcb_examiner_course.getSelectedItem()), frm));
        frm.setTitle("UPDATE TIMETABLE");
        frm.setSize(900, 600);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setVisible(true);
    }//GEN-LAST:event_jbt_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable displayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_refresh;
    private javax.swing.JButton jbt_remove;
    private javax.swing.JButton jbt_update;
    private javax.swing.JComboBox<String> jcb_examiner_course;
    private javax.swing.JPanel searchTimetablePanel_leftPanel;
    private javax.swing.JPanel searchTimetablePanel_rightPanel;
    private java.awt.Label searchTimetablePanel_text_Search;
    private java.awt.Label searchTimetablePanel_text_Timetable;
    // End of variables declaration//GEN-END:variables
    private int switch_advanceSearch = 0;
    private JScrollPane jpane = new JScrollPane(displayTable);
}
