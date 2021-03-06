package ui;


import control.MaintainExaminationSystem;
import da.ExaminerTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.*;
import static ui.searchExaminer.DATABASE_URL;
import domain.payment;
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
import domain.examiner;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class searchPayment extends javax.swing.JPanel {

    /**
     * Creates new form createExaminer
     */
    private payment payment;
    private MaintainExaminationSystem maintainExamSys = new MaintainExaminationSystem();
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/f:/examinationSystemDB;create=true";
    static final String USERNAME = "taruc";
    static final String PASSWORD = "taruc";
    
    private ExaminerTableModel tableModel;
    private JTable resultTable;
    private TableRowSorter<TableModel> sorter;
    private JTextField filterText = new JTextField();
    private String userOptions = "staffID";
    private examiner examiner = new examiner();
    
    public searchPayment(String examinerID, examiner examiner) {
        initComponents();
        this.examiner = examiner;
        drawTable(examinerID);
        
    }
    
    public void drawTable(String examinerID){
        String query  = "SELECT \"paymentID\", \"paymentName\", \"paymentCost\", \"paymentDescription\" FROM PAYMENT WHERE \"examinerID\"='"+examinerID+"'";
        try {
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
        searchPaymentPanel_leftPanel = new javax.swing.JPanel();
        searchPaymentPanel_text_Search = new java.awt.Label();
        searchPaymentPanel_text_Record = new java.awt.Label();
        searchPaymentPanel_text_Payment = new java.awt.Label();
        searchPaymentPanel_rightPanel = new javax.swing.JPanel();
        jbt_Enter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jbt_refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        searchPaymentPanel_leftPanel.setBackground(new java.awt.Color(204, 204, 255));
        searchPaymentPanel_leftPanel.setToolTipText("");

        searchPaymentPanel_text_Search.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        searchPaymentPanel_text_Search.setText("Search");

        searchPaymentPanel_text_Record.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        searchPaymentPanel_text_Record.setText("Record");

        searchPaymentPanel_text_Payment.setFont(new java.awt.Font("FangSong", 3, 48)); // NOI18N
        searchPaymentPanel_text_Payment.setText("Payment");

        javax.swing.GroupLayout searchPaymentPanel_leftPanelLayout = new javax.swing.GroupLayout(searchPaymentPanel_leftPanel);
        searchPaymentPanel_leftPanel.setLayout(searchPaymentPanel_leftPanelLayout);
        searchPaymentPanel_leftPanelLayout.setHorizontalGroup(
            searchPaymentPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaymentPanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(searchPaymentPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPaymentPanel_text_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPaymentPanel_text_Payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPaymentPanel_text_Record, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        searchPaymentPanel_leftPanelLayout.setVerticalGroup(
            searchPaymentPanel_leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaymentPanel_leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPaymentPanel_text_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPaymentPanel_text_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPaymentPanel_text_Record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchPaymentPanel_rightPanel.setBackground(new java.awt.Color(204, 255, 204));
        searchPaymentPanel_rightPanel.setToolTipText("");

        jbt_Enter.setBackground(new java.awt.Color(255, 204, 153));
        jbt_Enter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_Enter.setText("Make payment");
        jbt_Enter.setToolTipText("Click to enter record");
        jbt_Enter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbt_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_EnterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setToolTipText("Bonjour");

        jLabel2.setToolTipText("Ni hao");

        displayTable.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
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

        javax.swing.GroupLayout searchPaymentPanel_rightPanelLayout = new javax.swing.GroupLayout(searchPaymentPanel_rightPanel);
        searchPaymentPanel_rightPanel.setLayout(searchPaymentPanel_rightPanelLayout);
        searchPaymentPanel_rightPanelLayout.setHorizontalGroup(
            searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                .addGap(952, 952, 952)
                .addGroup(searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                .addGap(677, 677, 677)
                .addComponent(jbt_Enter)
                .addGap(18, 18, 18)
                .addComponent(jbt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );
        searchPaymentPanel_rightPanelLayout.setVerticalGroup(
            searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                        .addGroup(searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(searchPaymentPanel_rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchPaymentPanel_rightPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPaymentPanel_leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPaymentPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchPaymentPanel_leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchPaymentPanel_rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_EnterActionPerformed
        // TODO add your handling code here:
        
        double totalCost = 0;
        ArrayList<String> selectedPaymentID = new ArrayList<String>();
        
        payment selectedPayment = null;
        if(displayTable.getSelectedRows().length==0)
            JOptionPane.showMessageDialog(null, "No payment is selected! Select the payment that you want to pay!!", "SELECTED PAYMENT NOT FOUND", JOptionPane.ERROR_MESSAGE);
        else{
            for(int i= 0;i<displayTable.getSelectedRows().length;i++){
            selectedPayment = maintainExamSys.getSelectedPayment(String.valueOf(displayTable.getValueAt(displayTable.getSelectedRows()[i], 0)));
            if(selectedPayment!=null){
                totalCost += selectedPayment.getPaymentCost();
                selectedPaymentID.add(selectedPayment.getPaymentID());
            }
            else
                JOptionPane.showMessageDialog(null, "Record not found in database.","RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
        }
            if((JOptionPane.showConfirmDialog(null, "The total cost is: RM"+totalCost+".\nPlease confirm this message to proceed to next step."))==0){
                    if(examiner.getexaminerBalance()<totalCost){
                        JOptionPane.showMessageDialog(null, "Your balance is not enought to pay all the payment!! Please kindly look for staff for top up your balance!!","NOT ENOUGH BALANCE", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        for(int i=0;i<selectedPaymentID.size();i++){
                        maintainExamSys.removeRecord(selectedPaymentID.get(i), "PAYMENT");
                    }
                        examiner.setexaminerBalance(examiner.getexaminerBalance()-totalCost);
                        maintainExamSys.updateExaminer(examiner);
                    }
                }
        }
    }//GEN-LAST:event_jbt_EnterActionPerformed

    public void closeFrame(JFrame frame){
        frame.dispose();
    }
    private void jbt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_refreshActionPerformed
        // TODO add your handling code here:
        try {
            String a = "SELECT \"paymentID\", \"paymentName\", \"paymentCost\", \"paymentDescription\" FROM PAYMENT WHERE \"examinerID\"='"+examiner.getexaminerID()+"'";
            tableModel.setQuery(a);
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);

            }
    }//GEN-LAST:event_jbt_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable displayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_Enter;
    private javax.swing.JButton jbt_refresh;
    private javax.swing.JPanel searchPaymentPanel_leftPanel;
    private javax.swing.JPanel searchPaymentPanel_rightPanel;
    private java.awt.Label searchPaymentPanel_text_Payment;
    private java.awt.Label searchPaymentPanel_text_Record;
    private java.awt.Label searchPaymentPanel_text_Search;
    // End of variables declaration//GEN-END:variables
    private int switch_advanceSearch = 0;
    private JScrollPane jpane = new JScrollPane(displayTable);
}
