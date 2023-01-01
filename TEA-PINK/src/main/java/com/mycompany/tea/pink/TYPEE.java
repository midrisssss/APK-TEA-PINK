/*
 * Click nbfs://nbhost/System    
 * @Override
 * FileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class TYPEE extends javax.swing.JFrame {

    String LIRIK_LAGU = null; // LIRIK LAGU FULL
    String[] LAGU = null; // LIRIK LAGU AFTER SPLIT
    String LAGU_ROW1 = "", LAGU_ROW2 = "", LAGU_ROW3 = "", LAGU_ROW4 = "", LAGU_ROW5 = "", LAGU_ROW6 = "", LAGU_ROW7 = ""; //LAGU BARIS KE 1-7
    int DISPLAY_WORD1 = 0, DISPLAY_WORD2 = 0, DISPLAY_WORD3 = 0, DISPLAY_WORD4 = 0, DISPLAY_WORD5 = 0, DISPLAY_WORD6 = 0, DISPLAY_WORD7 = 0;
    int TOTAL_WORDS = 0; // TOTAL KATA dlm ARRAY
    int TOTAL_LETTER = 0; // TOTAL HURUF dlm ARRAY
    int MUSIC_ON_OFF = 0; // MUSIC
    int COLOR_WORD1 = 0, COLOR_WORD2 = 0, COLOR_WORD3 = 0, COLOR_WORD4 = 0, COLOR_WORD5 = 0, COLOR_WORD6 = 0, COLOR_WORD7 = 0;

    int i = 0, j = 0, k = 0;

    /**
     *
     * Creates new form TYPEE
     */
    public TYPEE() {
        initComponents();
        LAGU();

    }

    public void LAGU() {

        int LAGU_RANDOM = (int) (Math.random() * 5);

        String a = "Kau .bisa .patahkan .kakiku, .Tapi .tidak .mimpi-mimpiku, .Kau .bisa .lumpuhkan .tanganku, .Tapi .tidak .mimpi-mimpiku, .Kau .bisa .merebut .senyumku, .Tapi .sungguh .tak .akan .lama, .Kau .bisa .merobek .hatiku, .Tapi .aku .tahu .obatnya";
        String b = "Berdiri .ku .memutar .waktu, .Teringat .kamu .yang .dulu, .Ada .di .sampingku .setiap .hari, .Jadi .sandaran .ternyaman, .Saat .ku .lemah .saat .ku .lelah, .Tersadar .kutinggal .sendiri, .Merenungi .semua .yang .tak .mungkin, .Bisa .kuputarkan .kembali .seperti .dulu, .Kubahagia";

        switch (LAGU_RANDOM) {
            case 0, 2, 4 ->
                LIRIK_LAGU = a;
            case 1, 3, 5 ->
                LIRIK_LAGU = b;
            default -> {
            }
        }

        LAGU = LIRIK_LAGU.split("\\.");
        TOTAL_WORDS = LAGU.length;
        TOTAL_LETTER = LIRIK_LAGU.length();

        int DISPLAY_INDEX1 = 0, DISPLAY_INDEX2 = 0, DISPLAY_INDEX3 = 0, DISPLAY_INDEX4 = 0, DISPLAY_INDEX5 = 0, DISPLAY_INDEX6 = 0, DISPLAY_INDEX7 = 0;

        for (int row = 0; row < LAGU.length; row++) {
            if (((DISPLAY_INDEX1 + LAGU[row].length()) <= 38) && LAGU_ROW2.equals("")) {
                ++DISPLAY_WORD1;
                DISPLAY_INDEX1 += LAGU[row].length();
                LAGU_ROW1 += LAGU[row];
            } else if (((DISPLAY_INDEX2 + LAGU[row].length()) <= 38) && LAGU_ROW3.equals("")) {
                ++DISPLAY_WORD2;
                DISPLAY_INDEX2 += LAGU[row].length();
                LAGU_ROW2 += LAGU[row];
            } else if (((DISPLAY_INDEX3 + LAGU[row].length()) <= 38) && LAGU_ROW4.equals("")) {
                ++DISPLAY_WORD3;
                DISPLAY_INDEX3 += LAGU[row].length();
                LAGU_ROW3 += LAGU[row];
            } else if (((DISPLAY_INDEX4 + LAGU[row].length()) <= 38) && LAGU_ROW5.equals("")) {
                ++DISPLAY_WORD4;
                DISPLAY_INDEX4 += LAGU[row].length();
                LAGU_ROW4 += LAGU[row];
            } else if (((DISPLAY_INDEX5 + LAGU[row].length()) <= 38) && LAGU_ROW6.equals("")) {
                ++DISPLAY_WORD5;
                DISPLAY_INDEX5 += LAGU[row].length();
                LAGU_ROW5 += LAGU[row];
            } else if (((DISPLAY_INDEX6 + LAGU[row].length()) <= 38) && LAGU_ROW7.equals("")) {
                ++DISPLAY_WORD6;
                DISPLAY_INDEX6 += LAGU[row].length();
                LAGU_ROW6 += LAGU[row];
            } else {
                ++DISPLAY_WORD7;
                DISPLAY_INDEX7 += LAGU[row].length();
                LAGU_ROW7 += LAGU[row];
            }
        }

        COLOR_WORD1 = DISPLAY_WORD1;
        COLOR_WORD2 = COLOR_WORD1 + DISPLAY_WORD2;
        COLOR_WORD3 = COLOR_WORD2 + DISPLAY_WORD3;
        COLOR_WORD4 = COLOR_WORD3 + DISPLAY_WORD4;
        COLOR_WORD5 = COLOR_WORD4 + DISPLAY_WORD5;
        COLOR_WORD6 = COLOR_WORD5 + DISPLAY_WORD6;
        COLOR_WORD7 = COLOR_WORD6 + DISPLAY_WORD7;
        TEXT_LABEL1.setText(LAGU_ROW1);
        TEXT_LABEL2.setText(LAGU_ROW2);
        TEXT_LABEL3.setText(LAGU_ROW3);
        TEXT_LABEL4.setText(LAGU_ROW4);
        TEXT_LABEL5.setText(LAGU_ROW5);
        TEXT_LABEL6.setText(LAGU_ROW6);
        TEXT_LABEL7.setText(LAGU_ROW7);
    }

    void Stopwatch() {
        int elapsedTime = 0;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
    }

    void Correct_Word() {
        TYPE_TEXT.setBackground(Color.white);

        if (j < COLOR_WORD2) {
            TEXT_LABEL1.setForeground(Color.ORANGE);
        } else if (j < COLOR_WORD3) {
            TEXT_LABEL2.setForeground(Color.ORANGE);
        } else if (j < COLOR_WORD4) {
            TEXT_LABEL3.setForeground(Color.ORANGE);
        } else if (j < COLOR_WORD5) {
            TEXT_LABEL4.setForeground(Color.ORANGE);
        } else if (j < COLOR_WORD6) {
            TEXT_LABEL5.setForeground(Color.ORANGE);
        } else if (j < COLOR_WORD7) {
            TEXT_LABEL6.setForeground(Color.ORANGE);
        }
        if (j < COLOR_WORD1) {
            TEXT_LABEL1.setForeground(Color.BLACK);
        } else if (j < COLOR_WORD2) {
            TEXT_LABEL2.setForeground(Color.BLACK);
        } else if (j < COLOR_WORD3) {
            TEXT_LABEL3.setForeground(Color.BLACK);
        } else if (j < COLOR_WORD4) {
            TEXT_LABEL4.setForeground(Color.BLACK);
        } else if (j < COLOR_WORD5) {
            TEXT_LABEL5.setForeground(Color.BLACK);
        } else if (j < COLOR_WORD6) {
            TEXT_LABEL6.setForeground(Color.BLACK);
        } else {
            TEXT_LABEL7.setForeground(Color.BLACK);
        }

    }

    void UnCorrect_Word() {
        TYPE_TEXT.setBackground(Color.red);
        if (j < COLOR_WORD1) {
            TEXT_LABEL1.setForeground(Color.RED);
        } else if (j < COLOR_WORD2) {
            TEXT_LABEL2.setForeground(Color.RED);
        } else if (j < COLOR_WORD3) {
            TEXT_LABEL3.setForeground(Color.RED);
        } else if (j < COLOR_WORD4) {
            TEXT_LABEL4.setForeground(Color.RED);
        } else if (j < COLOR_WORD5) {
            TEXT_LABEL5.setForeground(Color.RED);
        } else if (j < COLOR_WORD6) {
            TEXT_LABEL6.setForeground(Color.RED);
        } else { //if (j < (DISPLAY_WORD6 + DISPLAY_WORD7)) 
            TEXT_LABEL7.setForeground(Color.RED);
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
        TYPE_TEXT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        REPLAY_BTN = new javax.swing.JButton();
        TEXT_PANEL = new javax.swing.JPanel();
        TEXT_PANEL1 = new javax.swing.JPanel();
        TEXT_LABEL1 = new javax.swing.JLabel();
        TEXT_PANEL2 = new javax.swing.JPanel();
        TEXT_LABEL2 = new javax.swing.JLabel();
        TEXT_PANEL3 = new javax.swing.JPanel();
        TEXT_LABEL3 = new javax.swing.JLabel();
        TEXT_PANEL4 = new javax.swing.JPanel();
        TEXT_LABEL4 = new javax.swing.JLabel();
        TEXT_PANEL5 = new javax.swing.JPanel();
        TEXT_LABEL5 = new javax.swing.JLabel();
        TEXT_PANEL6 = new javax.swing.JPanel();
        TEXT_LABEL6 = new javax.swing.JLabel();
        TEXT_PANEL7 = new javax.swing.JPanel();
        TEXT_LABEL7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        TYPE_BTN = new javax.swing.JButton();
        LEADERBOARD_BTN = new javax.swing.JButton();
        USERNAME_BTN = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MUSIC_TGGLE = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 54, 108));
        jPanel1.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TYPE_TEXT.setBackground(new java.awt.Color(90, 190, 175));
        TYPE_TEXT.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        TYPE_TEXT.setForeground(java.awt.Color.black);
        TYPE_TEXT.setSelectionEnd(2);
        TYPE_TEXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TYPE_TEXTKeyReleased(evt);
            }
        });
        jPanel1.add(TYPE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 670, 60));

        jPanel2.setBackground(java.awt.Color.yellow);
        jPanel2.setForeground(java.awt.Color.black);

        jLabel1.setBackground(new java.awt.Color(51, 237, 142));
        jLabel1.setFont(new java.awt.Font("Lemon Days", 1, 60)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("59");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 160, 180));

        jPanel3.setBackground(new java.awt.Color(7, 112, 134));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 60)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("wpm");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("AVG                                : 100 wpm");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("ACCURACY                : 92%");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Correct Words         : 3 words");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Words per Minute");

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Wrong Words           : 3 words");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 670, 180));

        REPLAY_BTN.setBackground(new java.awt.Color(204, 255, 255));
        REPLAY_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        REPLAY_BTN.setForeground(java.awt.Color.black);
        REPLAY_BTN.setText("REPLAY");
        REPLAY_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(REPLAY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 160, 60));

        TEXT_PANEL.setBackground(new java.awt.Color(8, 148, 159));
        TEXT_PANEL.setMaximumSize(new java.awt.Dimension(32767000, 32767));
        TEXT_PANEL.setMinimumSize(new java.awt.Dimension(900, 900));
        TEXT_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_PANEL1.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL1.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL1.setForeground(java.awt.Color.black);
        TEXT_LABEL1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL1.setText("a");
        TEXT_LABEL1.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL1Layout = new javax.swing.GroupLayout(TEXT_PANEL1);
        TEXT_PANEL1.setLayout(TEXT_PANEL1Layout);
        TEXT_PANEL1Layout.setHorizontalGroup(
            TEXT_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL1Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL1Layout.setVerticalGroup(
            TEXT_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 630, -1));

        TEXT_PANEL2.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL2.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL2.setForeground(java.awt.Color.black);
        TEXT_LABEL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL2.setText("a");
        TEXT_LABEL2.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL2Layout = new javax.swing.GroupLayout(TEXT_PANEL2);
        TEXT_PANEL2.setLayout(TEXT_PANEL2Layout);
        TEXT_PANEL2Layout.setHorizontalGroup(
            TEXT_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL2Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        TEXT_PANEL2Layout.setVerticalGroup(
            TEXT_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 630, -1));

        TEXT_PANEL3.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL3.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL3.setForeground(java.awt.Color.black);
        TEXT_LABEL3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL3.setText("a");
        TEXT_LABEL3.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL3Layout = new javax.swing.GroupLayout(TEXT_PANEL3);
        TEXT_PANEL3.setLayout(TEXT_PANEL3Layout);
        TEXT_PANEL3Layout.setHorizontalGroup(
            TEXT_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL3Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        TEXT_PANEL3Layout.setVerticalGroup(
            TEXT_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 630, -1));

        TEXT_PANEL4.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL4.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL4.setForeground(java.awt.Color.black);
        TEXT_LABEL4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL4.setText("a");
        TEXT_LABEL4.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL4Layout = new javax.swing.GroupLayout(TEXT_PANEL4);
        TEXT_PANEL4.setLayout(TEXT_PANEL4Layout);
        TEXT_PANEL4Layout.setHorizontalGroup(
            TEXT_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL4Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        TEXT_PANEL4Layout.setVerticalGroup(
            TEXT_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 630, -1));

        TEXT_PANEL5.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL5.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL5.setForeground(java.awt.Color.black);
        TEXT_LABEL5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL5.setText("a");
        TEXT_LABEL5.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL5Layout = new javax.swing.GroupLayout(TEXT_PANEL5);
        TEXT_PANEL5.setLayout(TEXT_PANEL5Layout);
        TEXT_PANEL5Layout.setHorizontalGroup(
            TEXT_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL5Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        TEXT_PANEL5Layout.setVerticalGroup(
            TEXT_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 630, -1));

        TEXT_PANEL6.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL6.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL6.setForeground(java.awt.Color.black);
        TEXT_LABEL6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL6.setText("a");
        TEXT_LABEL6.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL6Layout = new javax.swing.GroupLayout(TEXT_PANEL6);
        TEXT_PANEL6.setLayout(TEXT_PANEL6Layout);
        TEXT_PANEL6Layout.setHorizontalGroup(
            TEXT_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL6Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        TEXT_PANEL6Layout.setVerticalGroup(
            TEXT_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 630, -1));

        TEXT_PANEL7.setBackground(new java.awt.Color(8, 148, 159));

        TEXT_LABEL7.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL7.setForeground(java.awt.Color.black);
        TEXT_LABEL7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL7.setText("a");
        TEXT_LABEL7.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL7Layout = new javax.swing.GroupLayout(TEXT_PANEL7);
        TEXT_PANEL7.setLayout(TEXT_PANEL7Layout);
        TEXT_PANEL7Layout.setHorizontalGroup(
            TEXT_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL7Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        TEXT_PANEL7Layout.setVerticalGroup(
            TEXT_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 630, -1));

        jPanel1.add(TEXT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 670, 300));

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));

        TYPE_BTN.setBackground(new java.awt.Color(51, 179, 120));
        TYPE_BTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        TYPE_BTN.setText("TYPE");
        TYPE_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TYPE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYPE_BTNActionPerformed(evt);
            }
        });

        LEADERBOARD_BTN.setBackground(new java.awt.Color(51, 70, 44));
        LEADERBOARD_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        LEADERBOARD_BTN.setText("LEADERBOARD");
        LEADERBOARD_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LEADERBOARD_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEADERBOARD_BTNActionPerformed(evt);
            }
        });

        USERNAME_BTN.setBackground(new java.awt.Color(51, 85, 140));
        USERNAME_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        USERNAME_BTN.setText("CHANGE USER");
        USERNAME_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        USERNAME_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAME_BTNActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel10.setText("ADMIN");

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NO IMAGE");

        MUSIC_TGGLE.setBackground(new java.awt.Color(0, 0, 153));
        MUSIC_TGGLE.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        MUSIC_TGGLE.setText("MUSIC ON");
        MUSIC_TGGLE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MUSIC_TGGLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUSIC_TGGLEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(TYPE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LEADERBOARD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAME_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUSIC_TGGLE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(43, 43, 43)
                .addComponent(TYPE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LEADERBOARD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MUSIC_TGGLE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(USERNAME_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 240, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // [8,148,159]
    private void TYPE_TEXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TYPE_TEXTKeyReleased
        // TODO add your handling code here:

        //do {
        try {
            String TYPE = TYPE_TEXT.getText();
            if (TYPE.equals(LAGU[j].substring(0, TYPE.length()))) {
                Correct_Word();
                if (TYPE.equals(LAGU[j])) {
                    j++;
                    TYPE_TEXT.setText("");
                    if (TYPE.equals(LAGU[TOTAL_WORDS - 1])) {
                        TYPE_TEXT.setEditable(false);
                        TEXT_LABEL7.setForeground(Color.ORANGE);
                        if (LAGU_ROW7.equals("")) {
                            TEXT_LABEL6.setForeground(Color.ORANGE);
                        }
                    }
                }
            } else {
                UnCorrect_Word();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Over Typing....");
        }
    }//GEN-LAST:event_TYPE_TEXTKeyReleased

    private void TYPE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TYPE_BTNActionPerformed
        // TODO add your handling code here:
        TYPEE Type = new TYPEE();
        Type.setLocationRelativeTo(null);
        Type.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TYPE_BTNActionPerformed

    private void LEADERBOARD_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEADERBOARD_BTNActionPerformed
        // TODO add your handling code here:
        LeaderBoard LEADERBOARD = new LeaderBoard();
        LEADERBOARD.setLocationRelativeTo(null);
        LEADERBOARD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LEADERBOARD_BTNActionPerformed

    private void USERNAME_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAME_BTNActionPerformed
        // TODO add your handling code here:
        Username USERNAME = new Username();
        USERNAME.setLocationRelativeTo(null);
        USERNAME.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_USERNAME_BTNActionPerformed

    private void MUSIC_TGGLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_TGGLEActionPerformed
        // TODO add your handling code here:

        if (MUSIC_ON_OFF % 2 == 0) {
            MUSIC_TGGLE.setText("MUSIC OFF");
        } else {
            MUSIC_TGGLE.setText("MUSIC ON");
        }
        ++MUSIC_ON_OFF;
    }//GEN-LAST:event_MUSIC_TGGLEActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TYPEE.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TYPEE().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LEADERBOARD_BTN;
    private javax.swing.JToggleButton MUSIC_TGGLE;
    private javax.swing.JButton REPLAY_BTN;
    private javax.swing.JLabel TEXT_LABEL1;
    private javax.swing.JLabel TEXT_LABEL2;
    private javax.swing.JLabel TEXT_LABEL3;
    private javax.swing.JLabel TEXT_LABEL4;
    private javax.swing.JLabel TEXT_LABEL5;
    private javax.swing.JLabel TEXT_LABEL6;
    private javax.swing.JLabel TEXT_LABEL7;
    private javax.swing.JPanel TEXT_PANEL;
    private javax.swing.JPanel TEXT_PANEL1;
    private javax.swing.JPanel TEXT_PANEL2;
    private javax.swing.JPanel TEXT_PANEL3;
    private javax.swing.JPanel TEXT_PANEL4;
    private javax.swing.JPanel TEXT_PANEL5;
    private javax.swing.JPanel TEXT_PANEL6;
    private javax.swing.JPanel TEXT_PANEL7;
    private javax.swing.JButton TYPE_BTN;
    private javax.swing.JTextField TYPE_TEXT;
    private javax.swing.JButton USERNAME_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    static class ActionListenerImpl implements ActionListener {

        public ActionListenerImpl() {
        }
    }
}
