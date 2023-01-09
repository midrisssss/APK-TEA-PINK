/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class LeaderBoard extends javax.swing.JFrame {

    ArrayList<String> EASY_ = new ArrayList<>();
    ArrayList<String> MEDIUM_ = new ArrayList<>();
    ArrayList<String> HARD_ = new ArrayList<>();

    /**
     * Creates new form LeaderBoardd
     */
    public LeaderBoard(ArrayList<String> EASY, ArrayList<String> MEDIUM, ArrayList<String> HARD) {
        initComponents();
        EASY_ = EASY;
        MEDIUM_ = MEDIUM;
        HARD_ = HARD;
//        LEADERBOARD_MEDIUM(MEDIUM_);
        LEADERBOARD_EASY();
    }
//
//    public void USER(ArrayList<String> EASY, ArrayList<String> MEDIUM, ArrayList<String> HARD) {
//
//    }

    void LEADERBOARD_EASY() {
        EASY_PNL.setBackground(new java.awt.Color(255, 153, 0));
        MEDIUM_PNL.setBackground(new java.awt.Color(51, 51, 51));
        HARD_PNL.setBackground(new java.awt.Color(51, 51, 51));

        for (int i = 0; i < EASY_.size(); i++) {
            double A;
            if (i % 2 == 0) {
                switch (i) {
                    case 0:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL0.setText("" + EASY_.get(i));
                        AVG_LBL0.setText("" + (int) A + "wpm");
                        break;
                    case 2:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL1.setText("" + EASY_.get(i));
                        AVG_LBL1.setText("" + (int) A + "wpm");
                        break;
                    case 4:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL2.setText("" + EASY_.get(i));
                        AVG_LBL2.setText("" + (int) A + "wpm");
                        break;
                    case 6:
                        A = Double.parseDouble(EASY_.get(1 + i));

                        NAME_LBL3.setText("" + EASY_.get(i));
                        AVG_LBL3.setText("" + (int) A + "wpm");
                        break;
                    case 8:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL4.setText("" + EASY_.get(i));
                        AVG_LBL4.setText("" + (int) A + "wpm");
                        break;
                    case 10:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL5.setText("" + EASY_.get(i));
                        AVG_LBL5.setText("" + (int) A + "wpm");
                        break;
                    case 12:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL6.setText("" + EASY_.get(i));
                        AVG_LBL6.setText("" + (int) A + "wpm");
                        break;
                    case 14:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL7.setText("" + EASY_.get(i));
                        AVG_LBL7.setText("" + (int) A + "wpm");
                        break;
                    case 16:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL8.setText("" + EASY_.get(i));
                        AVG_LBL8.setText("" + (int) A + "wpm");
                        break;
                    case 18:
                        A = Double.parseDouble(EASY_.get(1 + i));
                        NAME_LBL9.setText("" + EASY_.get(i));
                        AVG_LBL9.setText("" + (int) A + "wpm");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void LEADERBOARD_MEDIUM() {
        EASY_PNL.setBackground(new java.awt.Color(51, 51, 51));
        MEDIUM_PNL.setBackground(new java.awt.Color(255, 153, 0));
        HARD_PNL.setBackground(new java.awt.Color(51, 51, 51));

        for (int i = 0; i < MEDIUM_.size(); i++) {
            double A;
            if (i % 2 == 0) {
                switch (i) {
                    case 0:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL0.setText("" + MEDIUM_.get(i));
                        AVG_LBL0.setText("" + (int) A + "wpm");
                        break;
                    case 2:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL1.setText("" + MEDIUM_.get(i));
                        AVG_LBL1.setText("" + (int) A + "wpm");
                        break;
                    case 4:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL2.setText("" + MEDIUM_.get(i));
                        AVG_LBL2.setText("" + (int) A + "wpm");
                        break;
                    case 6:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL3.setText("" + MEDIUM_.get(i));
                        AVG_LBL3.setText("" + (int) A + "wpm");
                        break;
                    case 8:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL4.setText("" + MEDIUM_.get(i));
                        AVG_LBL4.setText("" + (int) A + "wpm");
                        break;
                    case 10:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL5.setText("" + MEDIUM_.get(i));
                        AVG_LBL5.setText("" + (int) A + "wpm");
                        break;
                    case 12:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL6.setText("" + MEDIUM_.get(i));
                        AVG_LBL6.setText("" + (int) A + "wpm");
                        break;
                    case 14:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL7.setText("" + MEDIUM_.get(i));
                        AVG_LBL7.setText("" + (int) A + "wpm");
                        break;
                    case 16:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL8.setText("" + MEDIUM_.get(i));
                        AVG_LBL8.setText("" + (int) A + "wpm");
                        break;
                    case 18:
                        A = Double.parseDouble(MEDIUM_.get(1 + i));
                        NAME_LBL9.setText("" + MEDIUM_.get(i));
                        AVG_LBL9.setText("" + (int) A + "wpm");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void LEADERBOARD_HARD() {
        EASY_PNL.setBackground(new java.awt.Color(51, 51, 51));
        MEDIUM_PNL.setBackground(new java.awt.Color(51, 51, 51));
        HARD_PNL.setBackground(new java.awt.Color(255, 153, 0));

        for (int i = 0; i < HARD_.size(); i++) {
            double A;
            if (i % 2 == 0) {
                switch (i) {
                    case 0:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL0.setText("" + HARD_.get(i));
                        AVG_LBL0.setText("" + (int) A + "wpm");
                        break;
                    case 2:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL1.setText("" + HARD_.get(i));
                        AVG_LBL1.setText("" + (int) A + "wpm");
                        break;
                    case 4:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL2.setText("" + HARD_.get(i));
                        AVG_LBL2.setText("" + (int) A + "wpm");
                        break;
                    case 6:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL3.setText("" + HARD_.get(i));
                        AVG_LBL3.setText("" + (int) A + "wpm");
                        break;
                    case 8:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL4.setText("" + HARD_.get(i));
                        AVG_LBL4.setText("" + (int) A + "wpm");
                        break;
                    case 10:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL5.setText("" + HARD_.get(i));
                        AVG_LBL5.setText("" + (int) A + "wpm");
                        break;
                    case 12:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL6.setText("" + HARD_.get(i));
                        AVG_LBL6.setText("" + (int) A + "wpm");
                        break;
                    case 14:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL7.setText("" + HARD_.get(i));
                        AVG_LBL7.setText("" + (int) A + "wpm");
                        break;
                    case 16:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL8.setText("" + HARD_.get(i));
                        AVG_LBL8.setText("" + (int) A + "wpm");
                        break;
                    case 18:
                        A = Double.parseDouble(HARD_.get(1 + i));
                        NAME_LBL9.setText("" + HARD_.get(i));
                        AVG_LBL9.setText("" + (int) A + "wpm");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void RESET() {
        NAME_LBL0.setText("");
        NAME_LBL1.setText("");
        NAME_LBL2.setText("");
        NAME_LBL3.setText("");
        NAME_LBL4.setText("");
        NAME_LBL5.setText("");
        NAME_LBL6.setText("");
        NAME_LBL7.setText("");
        NAME_LBL8.setText("");
        NAME_LBL9.setText("");
        AVG_LBL0.setText("");
        AVG_LBL1.setText("");
        AVG_LBL2.setText("");
        AVG_LBL3.setText("");
        AVG_LBL4.setText("");
        AVG_LBL5.setText("");
        AVG_LBL6.setText("");
        AVG_LBL7.setText("");
        AVG_LBL8.setText("");
        AVG_LBL9.setText("");
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
        LEADERBOARD_LBL = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        HEADER_MUSIC_PNL = new javax.swing.JPanel();
        USERNAME_MUSIC_LBL = new javax.swing.JLabel();
        AVG_MUSIC_LBL = new javax.swing.JLabel();
        NO_MUSIC_LBL = new javax.swing.JLabel();
        NO_1_PNL = new javax.swing.JPanel();
        NAME_LBL0 = new javax.swing.JLabel();
        AVG_LBL0 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NO_1_PNL1 = new javax.swing.JPanel();
        NAME_LBL1 = new javax.swing.JLabel();
        AVG_LBL1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NO_1_PNL2 = new javax.swing.JPanel();
        NAME_LBL2 = new javax.swing.JLabel();
        AVG_LBL2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NO_1_PNL3 = new javax.swing.JPanel();
        NAME_LBL3 = new javax.swing.JLabel();
        AVG_LBL3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        NO_1_PNL4 = new javax.swing.JPanel();
        NAME_LBL4 = new javax.swing.JLabel();
        AVG_LBL4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        NO_1_PNL5 = new javax.swing.JPanel();
        NAME_LBL5 = new javax.swing.JLabel();
        AVG_LBL5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        NO_1_PNL6 = new javax.swing.JPanel();
        NAME_LBL6 = new javax.swing.JLabel();
        AVG_LBL6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        NO_1_PNL7 = new javax.swing.JPanel();
        NAME_LBL7 = new javax.swing.JLabel();
        AVG_LBL7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        NO_1_PNL8 = new javax.swing.JPanel();
        NAME_LBL8 = new javax.swing.JLabel();
        AVG_LBL8 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        NO_1_PNL9 = new javax.swing.JPanel();
        NAME_LBL9 = new javax.swing.JLabel();
        AVG_LBL9 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        EASY_PNL = new javax.swing.JPanel();
        EASY_LBTN = new javax.swing.JLabel();
        MEDIUM_PNL = new javax.swing.JPanel();
        MEDIUM_LBTN = new javax.swing.JLabel();
        HARD_PNL = new javax.swing.JPanel();
        HARD_LBTN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LEADERBOARD-TEA-PINK");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(970, 700));
        setPreferredSize(new java.awt.Dimension(930, 700));
        setSize(new java.awt.Dimension(930, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setMinimumSize(new java.awt.Dimension(930, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEADERBOARD_LBL.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        LEADERBOARD_LBL.setForeground(java.awt.Color.white);
        LEADERBOARD_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEADERBOARD_LBL.setText("LEADERBOARD");
        jPanel1.add(LEADERBOARD_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 350, 100));

        jPanel8.setPreferredSize(new java.awt.Dimension(400, 500));

        HEADER_MUSIC_PNL.setBackground(new java.awt.Color(255, 153, 0));

        USERNAME_MUSIC_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        USERNAME_MUSIC_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USERNAME_MUSIC_LBL.setText("Name");
        USERNAME_MUSIC_LBL.setMaximumSize(new java.awt.Dimension(159, 28));
        USERNAME_MUSIC_LBL.setMinimumSize(new java.awt.Dimension(159, 28));
        USERNAME_MUSIC_LBL.setPreferredSize(new java.awt.Dimension(159, 28));

        AVG_MUSIC_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_MUSIC_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AVG_MUSIC_LBL.setText("AVG");

        NO_MUSIC_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NO_MUSIC_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NO_MUSIC_LBL.setText("NO");

        javax.swing.GroupLayout HEADER_MUSIC_PNLLayout = new javax.swing.GroupLayout(HEADER_MUSIC_PNL);
        HEADER_MUSIC_PNL.setLayout(HEADER_MUSIC_PNLLayout);
        HEADER_MUSIC_PNLLayout.setHorizontalGroup(
            HEADER_MUSIC_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADER_MUSIC_PNLLayout.createSequentialGroup()
                .addComponent(NO_MUSIC_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USERNAME_MUSIC_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_MUSIC_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
        );
        HEADER_MUSIC_PNLLayout.setVerticalGroup(
            HEADER_MUSIC_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADER_MUSIC_PNLLayout.createSequentialGroup()
                .addGroup(HEADER_MUSIC_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NO_MUSIC_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(AVG_MUSIC_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(USERNAME_MUSIC_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        NO_1_PNL.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL0.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL0.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1");
        jLabel9.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel9.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel9.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNLLayout = new javax.swing.GroupLayout(NO_1_PNL);
        NO_1_PNL.setLayout(NO_1_PNLLayout);
        NO_1_PNLLayout.setHorizontalGroup(
            NO_1_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNLLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL0, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL0, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
        );
        NO_1_PNLLayout.setVerticalGroup(
            NO_1_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL1.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2");
        jLabel12.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel12.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel12.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL1Layout = new javax.swing.GroupLayout(NO_1_PNL1);
        NO_1_PNL1.setLayout(NO_1_PNL1Layout);
        NO_1_PNL1Layout.setHorizontalGroup(
            NO_1_PNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL1Layout.setVerticalGroup(
            NO_1_PNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL2.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("3");
        jLabel15.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel15.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel15.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL2Layout = new javax.swing.GroupLayout(NO_1_PNL2);
        NO_1_PNL2.setLayout(NO_1_PNL2Layout);
        NO_1_PNL2Layout.setHorizontalGroup(
            NO_1_PNL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL2Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL2Layout.setVerticalGroup(
            NO_1_PNL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL3.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel18.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("4");
        jLabel18.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel18.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel18.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL3Layout = new javax.swing.GroupLayout(NO_1_PNL3);
        NO_1_PNL3.setLayout(NO_1_PNL3Layout);
        NO_1_PNL3Layout.setHorizontalGroup(
            NO_1_PNL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL3Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL3Layout.setVerticalGroup(
            NO_1_PNL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL4.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel21.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("5");
        jLabel21.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel21.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel21.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL4Layout = new javax.swing.GroupLayout(NO_1_PNL4);
        NO_1_PNL4.setLayout(NO_1_PNL4Layout);
        NO_1_PNL4Layout.setHorizontalGroup(
            NO_1_PNL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL4Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL4Layout.setVerticalGroup(
            NO_1_PNL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL5.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL5.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel24.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("6");
        jLabel24.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel24.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel24.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL5Layout = new javax.swing.GroupLayout(NO_1_PNL5);
        NO_1_PNL5.setLayout(NO_1_PNL5Layout);
        NO_1_PNL5Layout.setHorizontalGroup(
            NO_1_PNL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL5Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL5Layout.setVerticalGroup(
            NO_1_PNL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL6.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL6.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("7");
        jLabel27.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel27.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel27.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL6Layout = new javax.swing.GroupLayout(NO_1_PNL6);
        NO_1_PNL6.setLayout(NO_1_PNL6Layout);
        NO_1_PNL6Layout.setHorizontalGroup(
            NO_1_PNL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL6Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL6Layout.setVerticalGroup(
            NO_1_PNL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL7.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL7.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel30.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("8");
        jLabel30.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel30.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel30.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL7Layout = new javax.swing.GroupLayout(NO_1_PNL7);
        NO_1_PNL7.setLayout(NO_1_PNL7Layout);
        NO_1_PNL7Layout.setHorizontalGroup(
            NO_1_PNL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL7Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL7Layout.setVerticalGroup(
            NO_1_PNL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL8.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL8.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel33.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("9");
        jLabel33.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel33.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel33.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL8Layout = new javax.swing.GroupLayout(NO_1_PNL8);
        NO_1_PNL8.setLayout(NO_1_PNL8Layout);
        NO_1_PNL8Layout.setHorizontalGroup(
            NO_1_PNL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL8Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL8Layout.setVerticalGroup(
            NO_1_PNL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NO_1_PNL9.setBackground(new java.awt.Color(51, 51, 51));
        NO_1_PNL9.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        NAME_LBL9.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NAME_LBL9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AVG_LBL9.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVG_LBL9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel36.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("10");
        jLabel36.setMaximumSize(new java.awt.Dimension(28, 28));
        jLabel36.setMinimumSize(new java.awt.Dimension(28, 28));
        jLabel36.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout NO_1_PNL9Layout = new javax.swing.GroupLayout(NO_1_PNL9);
        NO_1_PNL9.setLayout(NO_1_PNL9Layout);
        NO_1_PNL9Layout.setHorizontalGroup(
            NO_1_PNL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NO_1_PNL9Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_LBL9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVG_LBL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NO_1_PNL9Layout.setVerticalGroup(
            NO_1_PNL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(AVG_LBL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NAME_LBL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HEADER_MUSIC_PNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NO_1_PNL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(HEADER_MUSIC_PNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NO_1_PNL9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 800, 570));

        EASY_PNL.setBackground(new java.awt.Color(255, 153, 0));
        EASY_PNL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        EASY_LBTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        EASY_LBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EASY_LBTN.setText("EASY");
        EASY_LBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EASY_LBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EASY_LBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EASY_PNLLayout = new javax.swing.GroupLayout(EASY_PNL);
        EASY_PNL.setLayout(EASY_PNLLayout);
        EASY_PNLLayout.setHorizontalGroup(
            EASY_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EASY_LBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        EASY_PNLLayout.setVerticalGroup(
            EASY_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EASY_LBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(EASY_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 150, 50));

        MEDIUM_PNL.setBackground(new java.awt.Color(255, 153, 0));
        MEDIUM_PNL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MEDIUM_PNL.setPreferredSize(new java.awt.Dimension(150, 50));

        MEDIUM_LBTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        MEDIUM_LBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEDIUM_LBTN.setText("MEDIUM");
        MEDIUM_LBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MEDIUM_LBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDIUM_LBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MEDIUM_PNLLayout = new javax.swing.GroupLayout(MEDIUM_PNL);
        MEDIUM_PNL.setLayout(MEDIUM_PNLLayout);
        MEDIUM_PNLLayout.setHorizontalGroup(
            MEDIUM_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MEDIUM_LBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        MEDIUM_PNLLayout.setVerticalGroup(
            MEDIUM_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MEDIUM_LBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(MEDIUM_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        HARD_PNL.setBackground(new java.awt.Color(255, 153, 0));
        HARD_PNL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HARD_PNL.setPreferredSize(new java.awt.Dimension(150, 50));

        HARD_LBTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        HARD_LBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HARD_LBTN.setText("HARD");
        HARD_LBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HARD_LBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HARD_LBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HARD_PNLLayout = new javax.swing.GroupLayout(HARD_PNL);
        HARD_PNL.setLayout(HARD_PNLLayout);
        HARD_PNLLayout.setHorizontalGroup(
            HARD_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HARD_LBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        HARD_PNLLayout.setVerticalGroup(
            HARD_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HARD_LBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(HARD_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EASY_LBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EASY_LBTNMouseClicked
        // TODO add your handling code here:
        RESET();
        LEADERBOARD_EASY();
    }//GEN-LAST:event_EASY_LBTNMouseClicked

    private void MEDIUM_LBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDIUM_LBTNMouseClicked
        // TODO add your handling code here:
        RESET();
        LEADERBOARD_MEDIUM();
    }//GEN-LAST:event_MEDIUM_LBTNMouseClicked

    private void HARD_LBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HARD_LBTNMouseClicked
        // TODO add your handling code here:
        RESET();
        LEADERBOARD_HARD();
    }//GEN-LAST:event_HARD_LBTNMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LeaderBoard(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AVG_LBL0;
    private javax.swing.JLabel AVG_LBL1;
    private javax.swing.JLabel AVG_LBL2;
    private javax.swing.JLabel AVG_LBL3;
    private javax.swing.JLabel AVG_LBL4;
    private javax.swing.JLabel AVG_LBL5;
    private javax.swing.JLabel AVG_LBL6;
    private javax.swing.JLabel AVG_LBL7;
    private javax.swing.JLabel AVG_LBL8;
    private javax.swing.JLabel AVG_LBL9;
    private javax.swing.JLabel AVG_MUSIC_LBL;
    private javax.swing.JLabel EASY_LBTN;
    private javax.swing.JPanel EASY_PNL;
    private javax.swing.JLabel HARD_LBTN;
    private javax.swing.JPanel HARD_PNL;
    private javax.swing.JPanel HEADER_MUSIC_PNL;
    private javax.swing.JLabel LEADERBOARD_LBL;
    private javax.swing.JLabel MEDIUM_LBTN;
    private javax.swing.JPanel MEDIUM_PNL;
    private javax.swing.JLabel NAME_LBL0;
    private javax.swing.JLabel NAME_LBL1;
    private javax.swing.JLabel NAME_LBL2;
    private javax.swing.JLabel NAME_LBL3;
    private javax.swing.JLabel NAME_LBL4;
    private javax.swing.JLabel NAME_LBL5;
    private javax.swing.JLabel NAME_LBL6;
    private javax.swing.JLabel NAME_LBL7;
    private javax.swing.JLabel NAME_LBL8;
    private javax.swing.JLabel NAME_LBL9;
    private javax.swing.JPanel NO_1_PNL;
    private javax.swing.JPanel NO_1_PNL1;
    private javax.swing.JPanel NO_1_PNL2;
    private javax.swing.JPanel NO_1_PNL3;
    private javax.swing.JPanel NO_1_PNL4;
    private javax.swing.JPanel NO_1_PNL5;
    private javax.swing.JPanel NO_1_PNL6;
    private javax.swing.JPanel NO_1_PNL7;
    private javax.swing.JPanel NO_1_PNL8;
    private javax.swing.JPanel NO_1_PNL9;
    private javax.swing.JLabel NO_MUSIC_LBL;
    private javax.swing.JLabel USERNAME_MUSIC_LBL;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
