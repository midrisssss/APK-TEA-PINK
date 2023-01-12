/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author MUHAMMAD IDRIS
 * @author TARA ALMANDA
 * @author IVANKA AUDY IKHWAN
 */
public class Login extends javax.swing.JFrame {

    ArrayList<String> EASY_ = new ArrayList<>();
    ArrayList<String> MEDIUM_ = new ArrayList<>();
    ArrayList<String> HARD_ = new ArrayList<>();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
    }

    public void USER(ArrayList<String> EASY, ArrayList<String> MEDIUM, ArrayList<String> HARD) {
        try {
            EASY_ = EASY;
            MEDIUM_ = MEDIUM;
            HARD_ = HARD;
//            ALERT_LBL.setText("" + EASY_);
        } catch (IndexOutOfBoundsException e) {

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

        jPanel1 = new javax.swing.JPanel();
        TP_LBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LOGIN_BTN = new javax.swing.JButton();
        USERNAME_TEXT = new javax.swing.JTextField();
        ALERT_LBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEA-PINK");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TP_LBL.setFont(new java.awt.Font("Lemon Days", 1, 40)); // NOI18N
        TP_LBL.setForeground(new java.awt.Color(102, 0, 0));
        TP_LBL.setText("TEA-PINK");
        jPanel1.add(TP_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 12, -1, 60));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 181, -1, -1));

        LOGIN_BTN.setBackground(new java.awt.Color(0, 153, 153));
        LOGIN_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        LOGIN_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Videos\\idris\\@MATKUL\\dashpro\\APK-TEA-PINK\\APK-TEA-PINK\\TEA-PINK\\src\\main\\java\\com\\mycompany\\tea\\pink\\icon\\photo.png")); // NOI18N
        LOGIN_BTN.setText("Log In");
        LOGIN_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LOGIN_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGIN_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 421, 130, 37));

        USERNAME_TEXT.setBackground(java.awt.Color.white);
        USERNAME_TEXT.setColumns(15);
        USERNAME_TEXT.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        USERNAME_TEXT.setForeground(java.awt.Color.gray);
        USERNAME_TEXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        USERNAME_TEXT.setText("USERNAME");
        USERNAME_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        USERNAME_TEXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                USERNAME_TEXTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                USERNAME_TEXTFocusLost(evt);
            }
        });
        USERNAME_TEXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                USERNAME_TEXTKeyReleased(evt);
            }
        });
        jPanel1.add(USERNAME_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 217, 46));

        ALERT_LBL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ALERT_LBL.setForeground(java.awt.Color.black);
        ALERT_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ALERT_LBL.setText("* Maximum 15 Character");
        jPanel1.add(ALERT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Videos\\idris\\@MATKUL\\dashpro\\APK-TEA-PINK\\APK-TEA-PINK\\TEA-PINK\\src\\main\\java\\com\\mycompany\\tea\\pink\\icon\\photo.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGIN_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BTNActionPerformed
        // TODO add your handling code here:
        String USERNAME = USERNAME_TEXT.getText();

        if (USERNAME.equals("") || USERNAME.equals("USERNAME")) {
            JOptionPane.showMessageDialog(null, "Username still Blank, PLease input username!", "A message", JOptionPane.OK_OPTION);
        } else {
            int input = JOptionPane.showConfirmDialog(null, ("Your Username is " + USERNAME + " ? "), "Message", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (input == 0) {
                // to TYPEE page
                Type_Easy Type = new Type_Easy();
                Type.USER(USERNAME, EASY_, MEDIUM_, HARD_);
                Type.setLocationRelativeTo(null);
                Type.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_LOGIN_BTNActionPerformed

    private void USERNAME_TEXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_USERNAME_TEXTKeyReleased
        // TODO add your handling code here:
        int a = evt.getKeyCode();
        if (a == 10) {
            String USERNAME = USERNAME_TEXT.getText();

            if (USERNAME.equals("") || USERNAME.equals("USERNAME")) {
                JOptionPane.showMessageDialog(null, "Username still Blank, PLease input username!", "A message", JOptionPane.OK_OPTION);
            } else {
                int input = JOptionPane.showConfirmDialog(null, ("Your Username is " + USERNAME + " ? "), "Message", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (input == 0) {
                    // to TYPEE page
                    Type_Easy Type = new Type_Easy();
                    Type.USER(USERNAME, EASY_, MEDIUM_, HARD_);
                    Type.setLocationRelativeTo(null);
                    Type.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
        try {
            String USERNAME = USERNAME_TEXT.getText();
            String USERNAME_15 = USERNAME.substring(0, 14);
            if (USERNAME.length() >= 15) {
                USERNAME_TEXT.setText(USERNAME_15);
            } else {
                USERNAME_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));
                ALERT_LBL.setForeground(Color.black);
            }
        } catch (IndexOutOfBoundsException e) {
            ALERT_LBL.setForeground(Color.RED);
            USERNAME_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.red));
        }
    }//GEN-LAST:event_USERNAME_TEXTKeyReleased

    private void USERNAME_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_USERNAME_TEXTFocusGained
        // TODO add your handling code here:
        USERNAME_TEXT.setText("");
        ALERT_LBL.setForeground(Color.black);
        USERNAME_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));
    }//GEN-LAST:event_USERNAME_TEXTFocusGained

    private void USERNAME_TEXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_USERNAME_TEXTFocusLost
        // TODO add your handling code here:
        String USERNAME = USERNAME_TEXT.getText();
        if (USERNAME.equals("")) {
            USERNAME_TEXT.setText("USERNAME");
        }
        USERNAME_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, null));
        ALERT_LBL.setForeground(Color.black);
    }//GEN-LAST:event_USERNAME_TEXTFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALERT_LBL;
    private javax.swing.JButton LOGIN_BTN;
    private javax.swing.JLabel TP_LBL;
    private javax.swing.JTextField USERNAME_TEXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
