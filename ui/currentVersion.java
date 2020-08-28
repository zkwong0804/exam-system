/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author tommy
 */
public class currentVersion extends JFrame{
    private JLabel logoLabel;
    private JLabel titleText = new JLabel("TARUC Student Examination System");
    private JLabel verText;
    public currentVersion(String currentVersion){
        JPanel motherPanel = new JPanel();
        motherPanel.setLayout(null);
        ImageIcon taruc_logo = new ImageIcon(getClass().getResource("/images/logo.png"));
        logoLabel = new JLabel(taruc_logo);
        
        logoLabel.setSize(600, 200);
        logoLabel.setLocation(39,90);
        motherPanel.add(logoLabel);
        add(motherPanel);
        
        titleText.setFont(new Font("arial", Font.BOLD, 30));
        titleText.setSize(600, 50);
        titleText.setLocation(80, 280);
        motherPanel.add(titleText);
        
        verText = new JLabel(currentVersion);
        verText.setFont(new Font("arial", Font.BOLD, 30));
        verText.setSize(600, 50);
        verText.setLocation(280, 350);
        motherPanel.add(verText);
        
        //system setting
        setTitle("TARUC Student Examination System");
        setSize(690, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
