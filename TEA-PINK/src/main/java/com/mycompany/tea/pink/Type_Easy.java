/*
 * Click nbfs://nbhost/System    
 * @Override
 * FileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author MUHAMMAD IDRIS
 * @author IVANKA AUDY IKHWAN
 * @author TARA ALMANDA
 */
public class Type_Easy extends javax.swing.JFrame implements Runnable {

    //TIME
    Thread TIME;
    int Milisecond = 0;
    int Second = 0;
    boolean state = false; // STATUS TIMER BERJALAN ATAU TIDAKNYA
    // ARRAY LIST FOR EASY MEDIUM AND HARD DATA(USERNAME, AVERAGE)
    ArrayList<String> EASY_ = new ArrayList<>(); // USERNAME, AVERAGE
    ArrayList<String> MEDIUM_ = new ArrayList<>();
    ArrayList<String> HARD_ = new ArrayList<>();
    // TYPE CHECKER
    String[] LAGU = null; // LIRIK LAGU AFTER SPLIT
    String LAGU_ROW7 = ""; // LAGU BARIS KE 7
    int CORRECT = 0, LAGU_INDEX = 0, UNCORRECT = 0; // JUMLAH KATA BENAR , INDEX LAGU SAAT DIKOREKSI, DAN KATA SALAH
    int COLOR_WORD1 = 0, COLOR_WORD2 = 0, COLOR_WORD3 = 0, COLOR_WORD4 = 0, COLOR_WORD5 = 0, COLOR_WORD6 = 0, COLOR_WORD7 = 0;
    int TOTAL_WORDS = 0; // TOTAL KATA dlm ARRAY
    double ACCURACY = 0, AVERAGE = 0;

    /**
     *
     * Creates new form TYPEE
     *
     */
    public Type_Easy() {
        initComponents();
        setExtendedState(Home.MAXIMIZED_BOTH);
        LAGU();
    }

    public void LAGU() {

        Lirik_Lagu LIRIKLAGU = new Lirik_Lagu();
        String LAGUUUUU = LIRIKLAGU.LIRIK_LAGU;
//        String LAGUUUUU = LIRIKLAGU.LIRIK_LAGU;
        LAGU = LAGUUUUU.split("\\.");
        TOTAL_WORDS = LAGU.length;

        String LAGU_ROW1 = "", LAGU_ROW2 = "", LAGU_ROW3 = "", LAGU_ROW4 = "", LAGU_ROW5 = "", LAGU_ROW6 = ""; //LAGU BARIS KE 1-7
        int DISPLAY_WORD1 = 0, DISPLAY_WORD2 = 0, DISPLAY_WORD3 = 0, DISPLAY_WORD4 = 0, DISPLAY_WORD5 = 0, DISPLAY_WORD6 = 0, DISPLAY_WORD7 = 0;

        int DISPLAY_INDEX1 = 0, DISPLAY_INDEX2 = 0, DISPLAY_INDEX3 = 0, DISPLAY_INDEX4 = 0, DISPLAY_INDEX5 = 0, DISPLAY_INDEX6 = 0, DISPLAY_INDEX7 = 0;

        for (int row = 0; row < LAGU.length; row++) {
            if (((DISPLAY_INDEX1 + LAGU[row].length()) <= 46) && LAGU_ROW2.equals("")) {
                ++DISPLAY_WORD1;
                DISPLAY_INDEX1 += LAGU[row].length();
                LAGU_ROW1 += LAGU[row];
            } else if (((DISPLAY_INDEX2 + LAGU[row].length()) <= 46) && LAGU_ROW3.equals("")) {
                ++DISPLAY_WORD2;
                DISPLAY_INDEX2 += LAGU[row].length();
                LAGU_ROW2 += LAGU[row];
            } else if (((DISPLAY_INDEX3 + LAGU[row].length()) <= 46) && LAGU_ROW4.equals("")) {
                ++DISPLAY_WORD3;
                DISPLAY_INDEX3 += LAGU[row].length();
                LAGU_ROW3 += LAGU[row];
            } else if (((DISPLAY_INDEX4 + LAGU[row].length()) <= 46) && LAGU_ROW5.equals("")) {
                ++DISPLAY_WORD4;
                DISPLAY_INDEX4 += LAGU[row].length();
                LAGU_ROW4 += LAGU[row];
            } else if (((DISPLAY_INDEX5 + LAGU[row].length()) <= 46) && LAGU_ROW6.equals("")) {
                ++DISPLAY_WORD5;
                DISPLAY_INDEX5 += LAGU[row].length();
                LAGU_ROW5 += LAGU[row];
            } else if (((DISPLAY_INDEX6 + LAGU[row].length()) <= 46) && LAGU_ROW7.equals("")) {
                ++DISPLAY_WORD6;
                DISPLAY_INDEX6 += LAGU[row].length();
                LAGU_ROW6 += LAGU[row];
            } else {
                ++DISPLAY_WORD7;
                DISPLAY_INDEX7 += LAGU[row].length();
                LAGU_ROW7 += LAGU[row];
            }
        }
        // PENENTUAN TEMPAT(BARIS) SETIAP KATA
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

    public void run() {
        try {
            while (state == true) {
                Milisecond++;
                TIME.sleep(19);
                if (Milisecond > 50) {
                    Milisecond = 0;
                    Second++;
                }
                String TIME_STR = "" + Second;
                TIME_LBL.setText(TIME_STR);
            }
        } catch (Exception e) {
        }
    }

    public void USER(String USERNAME, ArrayList<String> EASY, ArrayList<String> MEDIUM, ArrayList<String> HARD) {
        // ASIDE USER INFORMATION
        USERNAME_LBL.setText("" + USERNAME);
        // ADD USER INFORMATION TO ARRAYLIST
        EASY_ = EASY;
        MEDIUM_ = MEDIUM;
        HARD_ = HARD;
        try {
            int USER_SAMA = EASY_.indexOf(USERNAME);
            if (USER_SAMA == -1) {
                CURRENTUSER_LBL.setText("USER : " + USERNAME_LBL.getText());
            } else {
                double HIGHSCOREEE = Double.parseDouble(EASY_.get(USER_SAMA + 1));
                CURRENTUSER_LBL.setText("USER : " + EASY_.get(USER_SAMA));
                HIGHAVERAGE_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
            }
        } catch (Exception e) {

        }
    }

    public void HIGHSCORE() {
        // HIGHSCORE
        int z = EASY_.size();
        ArrayList<String> HIGHSCORE_Arr = new ArrayList<>();

        for (int j = 0; j < z; j++) {
            double HIGHSCORE = 0;
            if (j % 2 != 0) {

                for (int i = 0; i < EASY_.size(); i++) {
                    if (i % 2 != 0) {
                        double HIGHSCORE_1 = Double.parseDouble(EASY_.get(i));
                        HIGHSCORE = (HIGHSCORE_1 >= HIGHSCORE) ? HIGHSCORE_1 : HIGHSCORE;
                    } else {
                        continue;
                    }
                }
                int HIGHSCORE_RANKING = EASY_.indexOf(Double.toString(HIGHSCORE));

                HIGHSCORE_Arr.add(EASY_.get(HIGHSCORE_RANKING - 1));
                HIGHSCORE_Arr.add(EASY_.get(HIGHSCORE_RANKING));
                EASY_.set(HIGHSCORE_RANKING, "0");
            }
        }
        EASY_ = HIGHSCORE_Arr;
    }

    void USER_DATA(double Second, double Total_Kata, int Benar, int Salah) {
        // AVERAGE
        AVERAGE = 60.0 / (Second / Total_Kata);
        AVERAGE_LBL.setText("AVG                                : " + (int) AVERAGE + " wpm");
        AVG_LBL.setText("" + (int) AVERAGE);
        // ACCURACY
        ACCURACY = (((double) Benar - (double) Salah) / ((double) Benar / 100.0));
        ACCURACY_LBL.setText("ACCURACY                : " + (int) ACCURACY + "%");
        // KEYSTROKES
        KEYSTROKES_LBL.setText("KeyStrokes                : " + (Benar + Salah) + " ( " + Benar + " | " + Salah + " ) ");
        // TIME
        TIME_SECOND_LBL.setText("Time                               : " + (int) Second + " Second");
        // ADD USERNAME & AVG TO USER_INFO(ArrayList)
        EASY_.add(USERNAME_LBL.getText());
        EASY_.add(Double.toString(AVERAGE));
        HIGHSCORE();
    }

    void REPLAY() {
        Second = 0;
        Milisecond = 0;
        TIME_LBL.setText("0");
        TYPE_TEXT.setEditable(true);
        LAGU = null;
        TOTAL_WORDS = 0;
        LAGU_ROW7 = "";
        CORRECT = 0;
        UNCORRECT = 0;
        LAGU_INDEX = 0;
        TYPE_TEXT.setBackground(new java.awt.Color(255, 153, 204));
        // KOSONGIN
        LAGU();
    }

    void Correct_Word() {
        TYPE_TEXT.setBackground(Color.white);

        if (LAGU_INDEX < COLOR_WORD2) {
            TEXT_LABEL1.setForeground(Color.white);
        } else if (LAGU_INDEX < COLOR_WORD3) {
            TEXT_LABEL2.setForeground(Color.white);
        } else if (LAGU_INDEX < COLOR_WORD4) {
            TEXT_LABEL3.setForeground(Color.white);
        } else if (LAGU_INDEX < COLOR_WORD5) {
            TEXT_LABEL4.setForeground(Color.white);
        } else if (LAGU_INDEX < COLOR_WORD6) {
            TEXT_LABEL5.setForeground(Color.white);
        } else if (LAGU_INDEX < COLOR_WORD7) {
            TEXT_LABEL6.setForeground(Color.white);
        }
        if (LAGU_INDEX < COLOR_WORD1) {
            TEXT_LABEL1.setForeground(Color.black);
        } else if (LAGU_INDEX < COLOR_WORD2) {
            TEXT_LABEL2.setForeground(Color.black);
        } else if (LAGU_INDEX < COLOR_WORD3) {
            TEXT_LABEL3.setForeground(Color.black);
        } else if (LAGU_INDEX < COLOR_WORD4) {
            TEXT_LABEL4.setForeground(Color.black);
        } else if (LAGU_INDEX < COLOR_WORD5) {
            TEXT_LABEL5.setForeground(Color.black);
        } else if (LAGU_INDEX < COLOR_WORD6) {
            TEXT_LABEL6.setForeground(Color.black);
        } else {
            TEXT_LABEL7.setForeground(Color.black);
        }
    }

    void UnCorrect_Word() {
        TYPE_TEXT.setBackground(Color.red);
        if (LAGU_INDEX < COLOR_WORD1) {
            TEXT_LABEL1.setForeground(Color.RED);
        } else if (LAGU_INDEX < COLOR_WORD2) {
            TEXT_LABEL2.setForeground(Color.RED);
        } else if (LAGU_INDEX < COLOR_WORD3) {
            TEXT_LABEL3.setForeground(Color.RED);
        } else if (LAGU_INDEX < COLOR_WORD4) {
            TEXT_LABEL4.setForeground(Color.RED);
        } else if (LAGU_INDEX < COLOR_WORD5) {
            TEXT_LABEL5.setForeground(Color.RED);
        } else if (LAGU_INDEX < COLOR_WORD6) {
            TEXT_LABEL6.setForeground(Color.RED);
        } else {
            TEXT_LABEL7.setForeground(Color.RED);
        }
    }

    void START(String TYPE) {
        if (TYPE.startsWith(LAGU[0].substring(0, 1)) && state == false) {
            TIME = new Thread(this);
            TIME.start();
            state = true;
            REPLAY_BTN.setVisible(false);
        }
    }

    void END(String TYPE) {
        state = false;
        USER_DATA(Second, TOTAL_WORDS, CORRECT, UNCORRECT);
        // BTN REPLAY VISIBLE
        REPLAY_BTN.setVisible(true);
        TYPE_TEXT.setEditable(false);
        TEXT_LABEL7.setForeground(Color.WHITE);
        if (LAGU_ROW7.equals("")) {
            TEXT_LABEL6.setForeground(Color.WHITE);
        }
        int USER_SAMA = EASY_.indexOf(USERNAME_LBL.getText());
        double HIGHSCOREEE = Double.parseDouble(EASY_.get(USER_SAMA + 1));
        HIGHAVERAGE_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
    }

    void TYPE_CHECKER(String TYPE) {
        try {
            String a = LAGU[LAGU_INDEX];
            String b = a.substring(0, TYPE.length());

            if (TYPE.equals(b)) {
                Correct_Word();
                CORRECT++;
            } else {
                UnCorrect_Word();
                UNCORRECT++;
            }
            if (TYPE.equals(LAGU[LAGU_INDEX])) {
                LAGU_INDEX++;
                TYPE_TEXT.setText("");
            }
        } catch (Exception e) {

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

        Type_Easy_PNL = new javax.swing.JPanel();
        ACCURACY_LBL = new javax.swing.JLabel();
        TYPE_TEXT = new javax.swing.JTextField();
        TIME_PNL = new javax.swing.JPanel();
        TIME_LBL = new javax.swing.JLabel();
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
        CURRENTUSER_LBL = new javax.swing.JLabel();
        HIGHAVERAGE_LBL = new javax.swing.JLabel();
        REPLAY_BTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        HARD_LBL = new javax.swing.JLabel();
        ACCOUNT_LBL = new javax.swing.JLabel();
        EXIT_LBL = new javax.swing.JLabel();
        MEDIUM_LBL = new javax.swing.JLabel();
        EASY_LBL = new javax.swing.JLabel();
        KEYSTROKES_LBL = new javax.swing.JLabel();
        TIME_SECOND_LBL = new javax.swing.JLabel();
        AVG_LBL = new javax.swing.JLabel();
        AVERAGE_LBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        USERNAME_LBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEA-PINK");
        setUndecorated(true);

        Type_Easy_PNL.setBackground(new java.awt.Color(204, 255, 204));
        Type_Easy_PNL.setForeground(java.awt.Color.white);
        Type_Easy_PNL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Type_Easy_PNL.setMinimumSize(new java.awt.Dimension(1350, 900));
        Type_Easy_PNL.setPreferredSize(new java.awt.Dimension(1350, 900));
        Type_Easy_PNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ACCURACY_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ACCURACY_LBL.setForeground(new java.awt.Color(93, 120, 58));
        ACCURACY_LBL.setText("Accuracy       : 0%");
        Type_Easy_PNL.add(ACCURACY_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 240, -1));

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
        Type_Easy_PNL.add(TYPE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 850, 70));

        TIME_PNL.setBackground(new java.awt.Color(101, 131, 62));

        TIME_LBL.setBackground(new java.awt.Color(51, 237, 142));
        TIME_LBL.setFont(new java.awt.Font("Poppins ExtraBold", 1, 60)); // NOI18N
        TIME_LBL.setForeground(new java.awt.Color(102, 0, 0));
        TIME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIME_LBL.setText("0");

        javax.swing.GroupLayout TIME_PNLLayout = new javax.swing.GroupLayout(TIME_PNL);
        TIME_PNL.setLayout(TIME_PNLLayout);
        TIME_PNLLayout.setHorizontalGroup(
            TIME_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TIME_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TIME_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );
        TIME_PNLLayout.setVerticalGroup(
            TIME_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
        );

        Type_Easy_PNL.add(TIME_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 190, 60));

        TEXT_PANEL.setBackground(new java.awt.Color(241, 234, 223));
        TEXT_PANEL.setMaximumSize(new java.awt.Dimension(32767000, 32767));
        TEXT_PANEL.setMinimumSize(new java.awt.Dimension(900, 900));
        TEXT_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_PANEL1.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL1.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL1.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL1.setText("a");
        TEXT_LABEL1.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL1Layout = new javax.swing.GroupLayout(TEXT_PANEL1);
        TEXT_PANEL1.setLayout(TEXT_PANEL1Layout);
        TEXT_PANEL1Layout.setHorizontalGroup(
            TEXT_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL1Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL1Layout.setVerticalGroup(
            TEXT_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 770, -1));

        TEXT_PANEL2.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL2.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL2.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL2.setText("a");
        TEXT_LABEL2.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL2Layout = new javax.swing.GroupLayout(TEXT_PANEL2);
        TEXT_PANEL2.setLayout(TEXT_PANEL2Layout);
        TEXT_PANEL2Layout.setHorizontalGroup(
            TEXT_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL2Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL2Layout.setVerticalGroup(
            TEXT_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 770, -1));

        TEXT_PANEL3.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL3.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL3.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL3.setText("a");
        TEXT_LABEL3.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL3Layout = new javax.swing.GroupLayout(TEXT_PANEL3);
        TEXT_PANEL3.setLayout(TEXT_PANEL3Layout);
        TEXT_PANEL3Layout.setHorizontalGroup(
            TEXT_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL3Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL3Layout.setVerticalGroup(
            TEXT_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 770, -1));

        TEXT_PANEL4.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL4.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL4.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL4.setText("a");
        TEXT_LABEL4.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL4Layout = new javax.swing.GroupLayout(TEXT_PANEL4);
        TEXT_PANEL4.setLayout(TEXT_PANEL4Layout);
        TEXT_PANEL4Layout.setHorizontalGroup(
            TEXT_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL4Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL4Layout.setVerticalGroup(
            TEXT_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 770, -1));

        TEXT_PANEL5.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL5.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL5.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL5.setText("a");
        TEXT_LABEL5.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL5Layout = new javax.swing.GroupLayout(TEXT_PANEL5);
        TEXT_PANEL5.setLayout(TEXT_PANEL5Layout);
        TEXT_PANEL5Layout.setHorizontalGroup(
            TEXT_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL5Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL5Layout.setVerticalGroup(
            TEXT_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 770, -1));

        TEXT_PANEL6.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL6.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL6.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL6.setText("a");
        TEXT_LABEL6.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL6Layout = new javax.swing.GroupLayout(TEXT_PANEL6);
        TEXT_PANEL6.setLayout(TEXT_PANEL6Layout);
        TEXT_PANEL6Layout.setHorizontalGroup(
            TEXT_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL6Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL6Layout.setVerticalGroup(
            TEXT_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 770, -1));

        TEXT_PANEL7.setBackground(new java.awt.Color(241, 234, 223));

        TEXT_LABEL7.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL7.setForeground(new java.awt.Color(93, 120, 58));
        TEXT_LABEL7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL7.setText("a");
        TEXT_LABEL7.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL7Layout = new javax.swing.GroupLayout(TEXT_PANEL7);
        TEXT_PANEL7.setLayout(TEXT_PANEL7Layout);
        TEXT_PANEL7Layout.setHorizontalGroup(
            TEXT_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL7Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEXT_PANEL7Layout.setVerticalGroup(
            TEXT_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 770, -1));

        Type_Easy_PNL.add(TEXT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 810, 300));

        CURRENTUSER_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        CURRENTUSER_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CURRENTUSER_LBL.setText("USER : Muhammad Idris");
        Type_Easy_PNL.add(CURRENTUSER_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 30));

        HIGHAVERAGE_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        HIGHAVERAGE_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HIGHAVERAGE_LBL.setText("HIGH AVERAGE : 0wpm");
        Type_Easy_PNL.add(HIGHAVERAGE_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 300, 30));

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
        Type_Easy_PNL.add(REPLAY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, 90, 70));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 182, 109));
        jLabel3.setText("wpm");
        Type_Easy_PNL.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, -1, 90));

        HARD_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Hard Button.png"))); // NOI18N
        HARD_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HARD_LBLMouseClicked(evt);
            }
        });
        Type_Easy_PNL.add(HARD_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 120, -1, -1));

        ACCOUNT_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/image 4.png"))); // NOI18N
        ACCOUNT_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNT_LBLMouseClicked(evt);
            }
        });
        Type_Easy_PNL.add(ACCOUNT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, -1, -1));

        EXIT_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/image 4-1.png"))); // NOI18N
        EXIT_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXIT_LBLMouseClicked(evt);
            }
        });
        Type_Easy_PNL.add(EXIT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 650, -1, -1));

        MEDIUM_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Medium Button.png"))); // NOI18N
        MEDIUM_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEDIUM_LBLMouseClicked(evt);
            }
        });
        Type_Easy_PNL.add(MEDIUM_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 230, -1, -1));

        EASY_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Easy Button.png"))); // NOI18N
        EASY_LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EASY_LBLMouseClicked(evt);
            }
        });
        Type_Easy_PNL.add(EASY_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 340, -1, -1));

        KEYSTROKES_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        KEYSTROKES_LBL.setForeground(new java.awt.Color(93, 120, 58));
        KEYSTROKES_LBL.setText("KeyStrokes   : 0 ( 0 | 0 )");
        Type_Easy_PNL.add(KEYSTROKES_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 270, -1));

        TIME_SECOND_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        TIME_SECOND_LBL.setForeground(new java.awt.Color(93, 120, 58));
        TIME_SECOND_LBL.setText("Time                  : 0 Second");
        Type_Easy_PNL.add(TIME_SECOND_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 240, -1));

        AVG_LBL.setFont(new java.awt.Font("Poppins", 1, 60)); // NOI18N
        AVG_LBL.setForeground(new java.awt.Color(150, 182, 109));
        AVG_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AVG_LBL.setText("0");
        Type_Easy_PNL.add(AVG_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 150, -1));

        AVERAGE_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVERAGE_LBL.setForeground(new java.awt.Color(93, 120, 58));
        AVERAGE_LBL.setText("Average          : 0 wpm");
        Type_Easy_PNL.add(AVERAGE_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 270, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Rectangle 9.png"))); // NOI18N
        Type_Easy_PNL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Group 1.png"))); // NOI18N
        Type_Easy_PNL.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 760));

        USERNAME_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        USERNAME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        USERNAME_LBL.setText("USER : Muhammad Idris");
        Type_Easy_PNL.add(USERNAME_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/tea/pink/iconImage/Easy.png"))); // NOI18N
        Type_Easy_PNL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Type_Easy_PNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Type_Easy_PNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // [8,148,159]
    private void TYPE_TEXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TYPE_TEXTKeyReleased
        // TODO add your handling code here:     
        String TYPE = TYPE_TEXT.getText();
        START(TYPE);
        TYPE_CHECKER(TYPE);
        if (TYPE.equals(LAGU[TOTAL_WORDS - 1])) {
            END(TYPE);
        }
    }//GEN-LAST:event_TYPE_TEXTKeyReleased

    private void TYPE_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TYPE_TEXTFocusGained
        // TODO add your handling code here:
        TYPE_TEXT.setBackground(Color.white);
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
    }//GEN-LAST:event_TYPE_TEXTFocusGained

    private void REPLAY_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPLAY_BTNActionPerformed
        // TODO add your handling code here:
        REPLAY();
    }//GEN-LAST:event_REPLAY_BTNActionPerformed

    private void ACCOUNT_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNT_LBLMouseClicked
        // TODO add your handling code here:
        Login LOGIN = new Login();
        LOGIN.USER(EASY_, MEDIUM_, HARD_);
        LOGIN.setLocationRelativeTo(null);
        LOGIN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ACCOUNT_LBLMouseClicked

    private void MEDIUM_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEDIUM_LBLMouseClicked
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Medium MEDIUM = new Type_Medium();
        MEDIUM.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        MEDIUM.setLocationRelativeTo(null);
        MEDIUM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MEDIUM_LBLMouseClicked

    private void EXIT_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT_LBLMouseClicked
        // TODO add your handling code here:
        int EXIT_OR_NO = JOptionPane.showConfirmDialog(null, "ANDA INGIN KELUAR ?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (EXIT_OR_NO == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_EXIT_LBLMouseClicked

    private void HARD_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HARD_LBLMouseClicked
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Hard HARD = new Type_Hard();
        HARD.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        HARD.setLocationRelativeTo(null);
        HARD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HARD_LBLMouseClicked

    private void EASY_LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EASY_LBLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EASY_LBLMouseClicked

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
            java.util.logging.Logger.getLogger(Type_Easy.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Type_Easy().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACCOUNT_LBL;
    private javax.swing.JLabel ACCURACY_LBL;
    private javax.swing.JLabel AVERAGE_LBL;
    private javax.swing.JLabel AVG_LBL;
    private javax.swing.JLabel BG;
    private javax.swing.JLabel CURRENTUSER_LBL;
    private javax.swing.JLabel EASY_LBL;
    private javax.swing.JLabel EXIT_LBL;
    private javax.swing.JLabel HARD_LBL;
    private javax.swing.JLabel HIGHAVERAGE_LBL;
    private javax.swing.JLabel KEYSTROKES_LBL;
    private javax.swing.JLabel MEDIUM_LBL;
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
    private javax.swing.JLabel TIME_LBL;
    private javax.swing.JPanel TIME_PNL;
    private javax.swing.JLabel TIME_SECOND_LBL;
    private javax.swing.JTextField TYPE_TEXT;
    private javax.swing.JPanel Type_Easy_PNL;
    private javax.swing.JLabel USERNAME_LBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
