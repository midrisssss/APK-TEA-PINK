/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author MUHAMMAD IDRIS
 * @author IVANKA AUDY IKHWAN
 * @author TARA ALMANDA
 */
public class Type_Medium extends javax.swing.JFrame implements Runnable {

    // TIME
    Thread TIME;
    int Milisecond = 50;
    int Second = 60;
    boolean state = false;
    // ARRAYLIST FOR EASY MEDIUM AND HARD DATA (USERNAME, AVERAGE)
    ArrayList<String> EASY_ = new ArrayList<>(); // USERNAME, AVERAGE
    ArrayList<String> MEDIUM_ = new ArrayList<>();
    ArrayList<String> HARD_ = new ArrayList<>();
    // TYPE CHECKER
    int CORRECT_WORD = 0, UNCORRECT_WORD = 0; // SALAH/BENAR KATA
    int CORRECT_LETTER, UNCORRECT_LETTER; // SALAH/BENAR HURUF
    String WORD = null; // GLOBAL VARIABEL WORD 
    int MUSIC_ON_OFF = 1; // STATUS MUSIC ON/OF
    // MENGHITUNG AVERAGE DAN ACCURACY
    int AVERAGE = 0;
    double ACCURACY = 0;
    // salah huruf 

    /**
     * Creates new form Type_Medium
     */
    public Type_Medium() {
        initComponents();
        WORDS();
    }

    public void USER(String USERNAME, ArrayList<String> EASY, ArrayList<String> MEDIUM, ArrayList<String> HARD) {
        // ASIDE USER INFORMATION
        USERNAME_LBL.setText("" + USERNAME);
        // INIZIALIZATION ARRAYLIST
        EASY_ = EASY;
        MEDIUM_ = MEDIUM;
        HARD_ = HARD;
        try {
            int USER_SAMA = MEDIUM_.indexOf(USERNAME);
            if (USER_SAMA == -1) {
                CURRENTUSER_LBL.setText("USER : " + USERNAME_LBL.getText());
            } else {
                double HIGHSCOREEE = Double.parseDouble(MEDIUM_.get(USER_SAMA + 1));
                CURRENTUSER_LBL.setText("USER : " + MEDIUM_.get(USER_SAMA));
                USERNAME_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
            }
        } catch (Exception e) {

        }
        // IMAGE
    }

    public void WORDS() {

        String A = "Kau bisa patahkan kakiku Tapi tidak mimpi-mimpiku Kau bisa lumpuhkan tanganku Tapi tidak mimpi-mimpiku Kau bisa merebut senyumku Tapi sungguh tak akan lama Kau bisa merobek hatiku Tapi aku tahu obatnya";
        String[] A_SPLIT = A.split(" ");
        int WORD_RANDOM = (int) (Math.random() * A_SPLIT.length);

        WORD = A_SPLIT[WORD_RANDOM];
        TEXT_LBL.setText(WORD);
    }

    public void run() {
        try {
            while (state == true) {
                Milisecond--;
                TIME.sleep(19);
                if (Milisecond < 0) {
                    Milisecond = 50;
                    Second--;
                }
                String TIME_STR = "" + Second;
                TIME_LBL.setText(TIME_STR);
                if (Second == 0) {
                    END();
                }
            }
        } catch (Exception e) {
        }
    }

    void USER_DATA() {
        //AVG
        AVG_LBL.setText(CORRECT_WORD + "");
        AVERAGE = CORRECT_WORD;
        // ACCURACY
        ACCURACY = (((double) CORRECT_LETTER - (double) UNCORRECT_LETTER) / ((double) CORRECT_LETTER / 100.0));
        ACCURACY_LBL.setText("ACCURACY                : " + (int) ACCURACY + "%");
        // KEYSTOKES
        ACCURACY_LBL.setText("KeyStrokes                : " + (CORRECT_LETTER + UNCORRECT_LETTER) + " ( " + CORRECT_LETTER + " | " + UNCORRECT_LETTER + " )");
        // ADD USERNAME AND SCORE TO MEDIUM_
        MEDIUM_.add(USERNAME_LBL.getText());
        MEDIUM_.add(Double.toString(AVERAGE));

        HIGHSCORE();
    }

    void HIGHSCORE() {
        // HIGHSCORE
        int MEDIUM_SIZE = MEDIUM_.size();
        ArrayList<String> HIGHSCORE_Arr = new ArrayList<>();

        for (int j = 0; j < MEDIUM_SIZE; j++) {
            double HIGHSCORE = 0;
            if (j % 2 != 0) {
                for (int i = 0; i < MEDIUM_.size(); i++) {
                    if (i % 2 != 0) {
                        double HIGHSCORE_1 = Double.parseDouble(MEDIUM_.get(i));
                        HIGHSCORE = (HIGHSCORE_1 >= HIGHSCORE) ? HIGHSCORE_1 : HIGHSCORE;
                    } else {
                        continue;
                    }
                }
                int HIGHSCORE_RANKING = MEDIUM_.indexOf(Double.toString(HIGHSCORE));

                HIGHSCORE_Arr.add(MEDIUM_.get(HIGHSCORE_RANKING - 1));
                HIGHSCORE_Arr.add(MEDIUM_.get(HIGHSCORE_RANKING));
                MEDIUM_.set(HIGHSCORE_RANKING, "0");
            }
        }
        MEDIUM_ = HIGHSCORE_Arr;
    }

    void START(String TYPE) {
        if (TYPE.startsWith(WORD.substring(0, 1)) && state == false) {
            TIME = new Thread(this);
            TIME.start();
            state = true;
            REPLAY_BTN.setVisible(false);
        }
    }

    void END() {
        state = false;
        USER_DATA();
        // BTN REPLAY VISIBLE
        REPLAY_BTN.setVisible(true);
        TYPE_TEXT.setText("");
        TYPE_TEXT.setEditable(false);

        int USER_SAMA = MEDIUM_.indexOf(USERNAME_LBL.getText());
        double HIGHSCOREEE = Double.parseDouble(MEDIUM_.get(USER_SAMA + 1));
        USERNAME_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
    }

    void TYPE_CHECKER(String TYPE) {
        try {
            int TYPE_LENGTH = TYPE.length();
//            int WORD_LENGTH = WORD.length() + 1;
            if (TYPE.equals(WORD.substring(0, TYPE_LENGTH))) {
                CORRECT();
                CORRECT_LETTER++;

            } else {
                UNCORRECT();
                UNCORRECT_LETTER++;
            }
            int SPACE = TYPE.indexOf(" ");
            if (SPACE != -1) {
                String TYPE_SPACE = TYPE.substring(0, SPACE - 1);
                if (TYPE_SPACE.equals(WORD)) {
                    ++CORRECT_WORD;
                } else {
                    ++UNCORRECT_WORD;
                }
                WORDS();
                TYPE_TEXT.setText("");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("SALAH");
            int SPACE = TYPE.indexOf(" ");
            if (SPACE != -1) {
                System.out.println("AAAAAAAA");
                String TYPE_SPACE = TYPE.substring(0, SPACE);
                if (TYPE_SPACE.equals(WORD)) {
                    ++CORRECT_WORD;
                } else {
                    ++UNCORRECT_WORD;
                }
                WORDS();
                TYPE_TEXT.setText("");
            } else {
                UNCORRECT();
                System.out.println("BBBB");
            }
        }

    }

    void CORRECT() {
        TYPE_TEXT.setBackground(Color.WHITE);
        TEXT_LBL.setForeground(Color.BLACK);
    }

    void UNCORRECT() {
        TYPE_TEXT.setBackground(Color.RED);
        TEXT_LBL.setForeground(Color.RED);
    }

    void REPLAY() {
        Milisecond = 50;
        Second = 60;
        CORRECT_WORD = 0;
        UNCORRECT_WORD = 0;
        CORRECT_LETTER = 0;
        UNCORRECT_LETTER = 0;
        AVERAGE = 0;
        ACCURACY = 0;
        TIME_LBL.setText("60");
        TYPE_TEXT.setEditable(true);
        TYPE_TEXT.setBackground(new java.awt.Color(255, 153, 204));
        CORRECT();
        WORDS();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AVG_LBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KEYSTROKES_LBL = new javax.swing.JLabel();
        ACCURACY_LBL = new javax.swing.JLabel();
        TEXT_PANEL = new javax.swing.JPanel();
        TEXT_LBL = new javax.swing.JLabel();
        CURRENTUSER_LBL = new javax.swing.JLabel();
        EXIT_LBL = new javax.swing.JLabel();
        ACCOUNT_LBL = new javax.swing.JLabel();
        HARD_LBL = new javax.swing.JLabel();
        HIGHAVERAGE_LBL1 = new javax.swing.JLabel();
        MEDIUM_LBL = new javax.swing.JLabel();
        EASY_LBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TYPE_TEXT = new javax.swing.JTextField();
        REPLAY_BTN = new javax.swing.JButton();
        TIME_LBL = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        USERNAME_LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 1100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(241, 234, 223));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);

        AVG_LBL.setFont(new java.awt.Font("Poppins", 1, 60)); // NOI18N
        AVG_LBL.setForeground(new java.awt.Color(150, 182, 109));
        AVG_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AVG_LBL.setText("0");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(150, 182, 109));
        jLabel4.setText("wpm");

        KEYSTROKES_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        KEYSTROKES_LBL.setForeground(new java.awt.Color(93, 120, 58));
        KEYSTROKES_LBL.setText("KeyStrokes   : 0 ( 0 | 0 )");

        ACCURACY_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ACCURACY_LBL.setForeground(new java.awt.Color(93, 120, 58));
        ACCURACY_LBL.setText("Accuracy       : 0%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addContainerGap(734, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AVG_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jLabel4)
                    .addGap(107, 107, 107)
                    .addComponent(ACCURACY_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(KEYSTROKES_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AVG_LBL)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ACCURACY_LBL)
                                .addComponent(KEYSTROKES_LBL))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 910, 180));

        TEXT_PANEL.setBackground(new java.awt.Color(241, 234, 223));
        TEXT_PANEL.setMaximumSize(new java.awt.Dimension(32767000, 32767));
        TEXT_PANEL.setMinimumSize(new java.awt.Dimension(900, 900));
        TEXT_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_LBL.setBackground(new java.awt.Color(241, 234, 223));
        TEXT_LBL.setFont(new java.awt.Font("Poppins", 1, 80)); // NOI18N
        TEXT_LBL.setForeground(java.awt.Color.black);
        TEXT_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL.setText("A");
        TEXT_LBL.setMaximumSize(new java.awt.Dimension(90, 43));
        TEXT_PANEL.add(TEXT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 730, 300));

        jPanel1.add(TEXT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 810, 300));

        CURRENTUSER_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        CURRENTUSER_LBL.setForeground(java.awt.Color.black);
        CURRENTUSER_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CURRENTUSER_LBL.setText("USER : Muhammad Idris");
        jPanel1.add(CURRENTUSER_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        EXIT_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/image 4-1.png"))); // NOI18N
        EXIT_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXIT_LBLMouseClicked(evt);
            }
        });
        jPanel1.add(EXIT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 650, -1, -1));

        ACCOUNT_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/image 4.png"))); // NOI18N
        ACCOUNT_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNT_LBLMouseClicked(evt);
            }
        });
        jPanel1.add(ACCOUNT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, -1, -1));

        HARD_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Hard Button.png"))); // NOI18N
        HARD_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HARD_LBLMouseClicked(evt);
            }
        });
        jPanel1.add(HARD_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 120, -1, -1));

        HIGHAVERAGE_LBL1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        HIGHAVERAGE_LBL1.setForeground(java.awt.Color.black);
        HIGHAVERAGE_LBL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HIGHAVERAGE_LBL1.setText("HIGH AVERAGE : 0wpm");
        jPanel1.add(HIGHAVERAGE_LBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 300, 30));

        MEDIUM_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Medium Button.png"))); // NOI18N
        MEDIUM_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDIUM_LBLMouseClicked(evt);
            }
        });
        jPanel1.add(MEDIUM_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 230, -1, -1));

        EASY_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Easy Button.png"))); // NOI18N
        EASY_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EASY_LBLMouseClicked(evt);
            }
        });
        jPanel1.add(EASY_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Rectangle 9.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, -1, -1));

        TYPE_TEXT.setBackground(new java.awt.Color(241, 234, 223));
        TYPE_TEXT.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(150, 182, 109), new java.awt.Color(150, 182, 109)));
        TYPE_TEXT.setSelectionEnd(2);
        TYPE_TEXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TYPE_TEXTFocusGained(evt);
            }
        });
        TYPE_TEXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TYPE_TEXTKeyReleased(evt);
            }
        });
        jPanel1.add(TYPE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 850, 70));

        REPLAY_BTN.setBackground(new java.awt.Color(51, 255, 153));
        REPLAY_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        REPLAY_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/image 5.png"))); // NOI18N
        REPLAY_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REPLAY_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REPLAY_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPLAY_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(REPLAY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, 90, 70));

        TIME_LBL.setBackground(new java.awt.Color(51, 237, 142));
        TIME_LBL.setFont(new java.awt.Font("Poppins ExtraBold", 1, 48)); // NOI18N
        TIME_LBL.setForeground(java.awt.Color.black);
        TIME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIME_LBL.setText("60");
        jPanel1.add(TIME_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 103, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Group 1.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 760));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Backgorund1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        USERNAME_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        USERNAME_LBL.setForeground(java.awt.Color.black);
        USERNAME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        USERNAME_LBL.setText("HIGH AVERAGE : 0wpm");
        jPanel1.add(USERNAME_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXIT_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT_LBLMouseClicked
        // TODO add your handling code here:
        int EXIT_OR_NO = JOptionPane.showConfirmDialog(null, "ANDA INGIN KELUAR ?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (EXIT_OR_NO == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_EXIT_LBLMouseClicked

    private void ACCOUNT_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNT_LBLMouseClicked
        // TODO add your handling code here:
        Login LOGIN = new Login();
        LOGIN.USER(EASY_, MEDIUM_, HARD_);
        LOGIN.setLocationRelativeTo(null);
        LOGIN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ACCOUNT_LBLMouseClicked

    private void HARD_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HARD_LBLMouseClicked
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Hard HARD = new Type_Hard();
        HARD.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        HARD.setLocationRelativeTo(null);
        HARD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HARD_LBLMouseClicked

    private void MEDIUM_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDIUM_LBLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MEDIUM_LBLMouseClicked

    private void EASY_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EASY_LBLMouseClicked
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Easy EASY = new Type_Easy();
        EASY.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        EASY.setLocationRelativeTo(null);
        EASY.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EASY_LBLMouseClicked

    private void TYPE_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TYPE_TEXTFocusGained
        // TODO add your handling code here:
        TYPE_TEXT.setBackground(Color.white);
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
    }//GEN-LAST:event_TYPE_TEXTFocusGained

    private void TYPE_TEXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TYPE_TEXTKeyReleased
        // TODO add your handling code here:
        String TYPE = TYPE_TEXT.getText();
        START(TYPE);
        TYPE_CHECKER(TYPE);
        END();
    }//GEN-LAST:event_TYPE_TEXTKeyReleased

    private void REPLAY_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPLAY_BTNActionPerformed
        // TODO add your handling code here:
        REPLAY();
    }//GEN-LAST:event_REPLAY_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Type_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Type_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Type_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Type_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Type_Medium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACCOUNT_LBL;
    private javax.swing.JLabel ACCURACY_LBL;
    private javax.swing.JLabel AVG_LBL;
    private javax.swing.JLabel BG;
    private javax.swing.JLabel CURRENTUSER_LBL;
    private javax.swing.JLabel EASY_LBL;
    private javax.swing.JLabel EXIT_LBL;
    private javax.swing.JLabel HARD_LBL;
    private javax.swing.JLabel HIGHAVERAGE_LBL1;
    private javax.swing.JLabel KEYSTROKES_LBL;
    private javax.swing.JLabel MEDIUM_LBL;
    private javax.swing.JButton REPLAY_BTN;
    private javax.swing.JLabel TEXT_LBL;
    private javax.swing.JPanel TEXT_PANEL;
    private javax.swing.JLabel TIME_LBL;
    private javax.swing.JTextField TYPE_TEXT;
    private javax.swing.JLabel USERNAME_LBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
