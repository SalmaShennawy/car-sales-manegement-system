/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalessystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.DbUtils;
 
import java.sql.*;
import javax.swing.*;

 
public class SearchCar extends javax.swing.JFrame {
    JLabel background = new JLabel();
    JButton back = new JButton("Back");
    public SearchCar() {
        setTitle("Cars Sales System");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(1300, 200);
        setVisible(true);
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\carphoto.jpg")); // NOI18N
        background.setBounds(0, 0, 500, 500);
        initComponents();
        jPanel1.setBackground(Color.black);
        jPanel1.add(back);
        jPanel1.add(background);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        back.setBounds(0, 440, 80, 23);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modelButton = new javax.swing.JRadioButton();
        colourButton = new javax.swing.JRadioButton();
        costButton = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        searchButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        
 
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Search by :");
 
        modelButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        modelButton.setText("Model");
        modelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelButtonActionPerformed(evt);
            }
        });
 
        colourButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colourButton.setText("Colour");
        colourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colourButtonActionPerformed(evt);
            }
        });
 
        costButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        costButton.setText("Cost");
        costButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costButtonActionPerformed(evt);
            }
        });
 
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
 
        jTable1.setModel(new javax.swing.table.DefaultTableModel());
        jScrollPane2.setViewportView(jTable1);
 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(modelButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(colourButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(costButton))
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modelButton)
                                        .addComponent(colourButton)
                                        .addComponent(costButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(135, Short.MAX_VALUE))
        );
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
 
        pack();
    }// </editor-fold>
 
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
 
 
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
 
        if (modelButton.isSelected()){
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
 
                Connection con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
                Statement stmt = con.createStatement();
 
                ResultSet rs = stmt.executeQuery("select * from cars where "
                        + "CAR_MODEL like '%" + txtSearch.getText() + "%'");
 
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (colourButton.isSelected()){
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
 
                Connection con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
                Statement stmt = con.createStatement();
 
 
                ResultSet rs = stmt.executeQuery("select * from cars where "
                        + "CAR_COLOUR like '" + txtSearch.getText() + "'");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
 
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (costButton.isSelected()){
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
 
                Connection con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
                Statement stmt = con.createStatement();
 
                String str = String.valueOf(txtSearch.getText());
                ResultSet rs = stmt.executeQuery("select * from cars where "
                        + "CAR_Price like '" + str + "'");
 
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
 
 
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if(evt.getSource() == back){
             UserPage userPage = new UserPage();
             setVisible(false);
        }
 
    }
 private void colourButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (colourButton.isSelected()){
            modelButton.setSelected(false);
            costButton.setSelected(false);
        }
    }

    private void modelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if (modelButton.isSelected()){
            costButton.setSelected(false);
            colourButton.setSelected(false);
        }
    }

    private void costButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(costButton.isSelected()){
            colourButton.setSelected(false);
            modelButton.setSelected(false);
        }
    }
 
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCar().setVisible(true);
            }
        });
    }
 
    
    
    // Variables declaration - do not modify
    private javax.swing.JRadioButton colourButton;
    private javax.swing.JRadioButton costButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton modelButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration
   
}
 
