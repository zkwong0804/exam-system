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
public class viewTimetable extends javax.swing.JPanel {

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
    private String courseID = "";
    
    public viewTimetable(String courseID) {
        initComponents();
        this.courseID = courseID;
        drawTable();
        
    }
    
    public void drawTable(){
        try {
            String query  = "SELECT \"day\", \"9.00am_10.00am\", \"10.00am_11.00am\", \"11.00am_12.00pm\", \"12.00pm_1.00pm\", \"1.00pm_2.00pm\", \"2.00pm_3.00pm\", \"3.00pm_4.00pm\", \"4.00pm_5.00pm\", \"5.00pm_6.00pm\" FROM TIMETABLE WHERE \"courseID\"='"+courseID+"'";
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

        javax.swing.GroupLayout searchTimetablePanel_rightPanelLayout = new javax.swing.GroupLayout(searchTimetablePanel_rightPanel);
        searchTimetablePanel_rightPanel.setLayout(searchTimetablePanel_rightPanelLayout);
        searchTimetablePanel_rightPanelLayout.setHorizontalGroup(
            searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                .addGap(952, 952, 952)
                .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 173, Short.MAX_VALUE))
            .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );
        searchTimetablePanel_rightPanelLayout.setVerticalGroup(
            searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(searchTimetablePanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchTimetablePanel_rightPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable displayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel searchTimetablePanel_leftPanel;
    private javax.swing.JPanel searchTimetablePanel_rightPanel;
    private java.awt.Label searchTimetablePanel_text_Search;
    private java.awt.Label searchTimetablePanel_text_Timetable;
    // End of variables declaration//GEN-END:variables
    private int switch_advanceSearch = 0;
    private JScrollPane jpane = new JScrollPane(displayTable);
}
