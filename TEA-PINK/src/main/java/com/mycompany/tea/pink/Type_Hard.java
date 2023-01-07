/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Type_Hard extends javax.swing.JFrame implements Runnable {

    // TIME
    Thread TIME;
    int Milisecond = 50;
    int Second = 20;
    boolean state = false;
    // ARRAYLIST FOR EASY MEDIUM AND HARD DATA (USERNAME, AVERAGE)
    ArrayList<String> EASY_ = new ArrayList<>(); // USERNAME, AVERAGE
    ArrayList<String> MEDIUM_ = new ArrayList<>();
    ArrayList<String> HARD_ = new ArrayList<>();
    // TYPE CHECKER
    int CORRECT_WORD = 0, UNCORRECT_WORD = 0; // SALAH/BENAR KATA
    int CORRECT_LETTER, UNCORRECT_LETTER; // SALAH/BENAR HURUF
//    String WORD = null; // GLOBAL VARIABEL WORD 
    int MUSIC_ON_OFF = 1; // STATUS MUSIC ON/OF
    // MENGHITUNG AVERAGE DAN ACCURACY
    double AVERAGE = 0;
    double ACCURACY = 0;
    // ARRAY LAGU
    String[] LAGU_ARR = new String[5];
    int LAGU_INDEX = 0;
    // LAGU ARR RANDOM
    String WORD_RANDOM;
    int RANDOM;

    /**
     * Creates new form Type_Hard
     */
    public Type_Hard() {
        initComponents();
        WOOORD();
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

    public void WOOORD() {
        String A = "Kau bisa patahkan kakiku Tapi tidak mimpi-mimpiku Kau bisa lumpuhkan tanganku Tapi tidak mimpi-mimpiku Kau bisa merebut senyumku Tapi sungguh tak akan lama Kau bisa merobek hatiku Tapi aku tahu obatnya";
        String[] A_SPLIT = A.split(" ");
        int i = 0;
        int RANDOM_WORD;
        do {
            RANDOM_WORD = (int) (Math.random() * A_SPLIT.length);
            LAGU_ARR[i] = A_SPLIT[RANDOM_WORD];
            System.out.println(LAGU_ARR[i]);
            i++;
        } while (i < 5);
        TEXT_LBL1.setText(LAGU_ARR[0]);
        TEXT_LBL2.setText(LAGU_ARR[1]);
        TEXT_LBL3.setText(LAGU_ARR[2]);
        TEXT_LBL4.setText(LAGU_ARR[3]);
        TEXT_LBL5.setText(LAGU_ARR[4]);

    }

    public void USER(String USERNAME, ArrayList<String> EASY, ArrayList<String> MEDIUM, ArrayList<String> HARD) {
        // ASIDE USER INFORMATION
        USERNAME_LBL.setText("" + USERNAME);
        // INIZIALIZATION ARRAYLIST
        EASY_ = EASY;
        MEDIUM_ = MEDIUM;
        HARD_ = HARD;

        int USER_SAMA = MEDIUM_.indexOf(USERNAME);
        if (USER_SAMA == -1) {
            CURRENTUSER_LBL.setText("USER : " + USERNAME_LBL.getText());
        } else {
            double HIGHSCOREEE = Double.parseDouble(MEDIUM_.get(USER_SAMA + 1));
            CURRENTUSER_LBL.setText("USER : " + MEDIUM_.get(USER_SAMA));
            HIGHAVERAGE_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
        }
        // IMAGE
        USER_IMG_LBL.setText("" + USERNAME);
        WPM_LBL.setText(EASY_ + " ");
    }

    void START(String TYPE) {
        if (TYPE.startsWith(WORD_RANDOM.substring(0, 1)) && state == false) {
            TIME = new Thread(this);
            TIME.start();
            state = true;
            REPLAY_BTN.setVisible(false);
        }
    }

    void END() {
        REPLAY_BTN.setVisible(true);
        TYPE_TEXT.setText("");
        TYPE_TEXT.setEditable(false);
        state = false;
        USER_DATA(Second, CORRECT_WORD, CORRECT_LETTER, UNCORRECT_LETTER);

        int USER_SAMA = MEDIUM_.indexOf(USERNAME_LBL.getText());
        double HIGHSCOREEE = Double.parseDouble(MEDIUM_.get(USER_SAMA + 1));
        HIGHAVERAGE_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
    }

    void USER_DATA(double SECOND, double CORRECT_WORD, int BENAR, int SALAH) {
        //AVG
        AVERAGE = ((CORRECT_WORD / 100) * 60);
        AVERAGE_LBL.setText("AVG                                : " + (int) AVERAGE + " wpm");
        AVG_LBL.setText((int) AVERAGE + "");

        // ACCURACY
        ACCURACY = (((double) BENAR - (double) SALAH) / ((double) BENAR / 100.0));
        ACCURACY_LBL.setText("ACCURACY                : " + (int) ACCURACY + "%");
        // KEYSTOKES
        KEYSTROKES_LBL.setText("KeyStrokes                : " + (BENAR + SALAH) + " ( " + BENAR + " | " + SALAH + " )");
        // ADD USERNAME AND SCORE TO MEDIUM_
        HARD_.add(USERNAME_LBL.getText());
        HARD_.add(Double.toString(AVERAGE));

        HIGHSCORE();
    }

    void HIGHSCORE() {
        // HIGHSCORE
        int HARD_SIZE = HARD_.size();
        ArrayList<String> HIGHSCORE_Arr = new ArrayList<>();

        for (int j = 0; j < HARD_SIZE; j++) {
            double HIGHSCORE = 0;
            if (j % 2 != 0) {
                for (int i = 0; i < HARD_SIZE; i++) {
                    if (i % 2 != 0) {
                        double HIGHSCORE_1 = Double.parseDouble(HARD_.get(i));
                        HIGHSCORE = (HIGHSCORE_1 >= HIGHSCORE) ? HIGHSCORE_1 : HIGHSCORE;
                    } else {
                        continue;
                    }
                }
                int HIGHSCORE_RANKING = HARD_.indexOf(Double.toString(HIGHSCORE));

                HIGHSCORE_Arr.add(HARD_.get(HIGHSCORE_RANKING - 1));
                HIGHSCORE_Arr.add(HARD_.get(HIGHSCORE_RANKING));
                HARD_.set(HIGHSCORE_RANKING, "0");
            }
        }
        MEDIUM_ = HIGHSCORE_Arr;
    }

    void TYPE_CHECKER(String TYPE) {
        try {
            if (TYPE.equals(WORD_RANDOM.substring(0, TYPE.length()))) {
                CORRECT();
                CORRECT_LETTER++;
                if (TYPE.equals(WORD_RANDOM)) {
                    CORRECT_WORD++;
                    TYPE_TEXT.setText("");
                    TEXT_LBL1.setForeground(Color.WHITE);
                    TEXT_LBL2.setForeground(Color.WHITE);
                    TEXT_LBL3.setForeground(Color.WHITE);
                    TEXT_LBL4.setForeground(Color.WHITE);
                    TEXT_LBL5.setForeground(Color.WHITE);
                    LAGU_ARR_RANDOM();
                }
            } else {
                UNCORRECT_LETTER++;
                UNCORRECT();
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    void LAGU_ARR_RANDOM() {
        RANDOM = (int) (Math.random() * 4);
        WORD_RANDOM = LAGU_ARR[RANDOM];
        System.out.println(RANDOM);
        System.out.println(WORD_RANDOM);
        switch (RANDOM) {
            case 0:
                TEXT_LBL1.setForeground(Color.black);
                break;
            case 1:
                TEXT_LBL2.setForeground(Color.black);
                break;
            case 2:
                TEXT_LBL3.setForeground(Color.black);
                break;
            case 3:
                TEXT_LBL4.setForeground(Color.black);
                break;
            case 4:
                TEXT_LBL5.setForeground(Color.black);
                break;
            default:
                break;

        }

    }

    void CORRECT() {
        TYPE_TEXT.setBackground(Color.WHITE);
        switch (RANDOM) {
            case 0:
                TEXT_LBL1.setForeground(Color.black);
                break;
            case 1:
                TEXT_LBL2.setForeground(Color.black);
                break;
            case 2:
                TEXT_LBL3.setForeground(Color.black);
                break;
            case 3:
                TEXT_LBL4.setForeground(Color.black);
                break;
            case 4:
                TEXT_LBL5.setForeground(Color.black);
                break;
            default:
                break;

        }
//        TEXT_LBL.setForeground(Color.BLACK);
    }

    void UNCORRECT() {
        TYPE_TEXT.setBackground(Color.RED);

        switch (RANDOM) {
            case 0:
                TEXT_LBL1.setForeground(Color.red);
                break;
            case 1:
                TEXT_LBL2.setForeground(Color.red);
                break;
            case 2:
                TEXT_LBL3.setForeground(Color.red);
                break;
            case 3:
                TEXT_LBL4.setForeground(Color.red);
                break;
            case 4:
                TEXT_LBL5.setForeground(Color.red);
                break;
            default:
                break;
        }
//        TEXT_LBL.setForeground(Color.RED);
    }

    void REPLAY() {
        Milisecond = 50;
        Second = 60;
        CORRECT_WORD = 0;
        UNCORRECT_WORD = 0;
        AVERAGE = 0;
        ACCURACY = 0;
        CORRECT_LETTER = 0;
        UNCORRECT_LETTER = 0;
        TIME_LBL.setText("100");
        TYPE_TEXT.setEditable(true);
        TYPE_TEXT.setBackground(new java.awt.Color(255, 153, 204));
        TEXT_LBL1.setForeground(Color.WHITE);
        TEXT_LBL2.setForeground(Color.WHITE);
        TEXT_LBL3.setForeground(Color.WHITE);
        TEXT_LBL4.setForeground(Color.WHITE);
        TEXT_LBL5.setForeground(Color.WHITE);
        CORRECT();
        WOOORD();
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
        TIME_LBL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AVG_LBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AVERAGE_LBL = new javax.swing.JLabel();
        ACCURACY_LBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WPM_LBL = new javax.swing.JLabel();
        KEYSTROKES_LBL = new javax.swing.JLabel();
        UNCORRECT_LBL = new javax.swing.JLabel();
        TEXT_PANEL = new javax.swing.JPanel();
        TEXT_LBL1 = new javax.swing.JLabel();
        TEXT_LBL2 = new javax.swing.JLabel();
        TEXT_LBL3 = new javax.swing.JLabel();
        TEXT_LBL4 = new javax.swing.JLabel();
        TEXT_LBL5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LEADERBOARD_BTN = new javax.swing.JButton();
        USERNAME_BTN = new javax.swing.JButton();
        USERNAME_LBL = new javax.swing.JLabel();
        USER_IMG_LBL = new javax.swing.JLabel();
        MUSIC_TGGLE = new javax.swing.JToggleButton();
        EXIT_TYPEE = new javax.swing.JButton();
        CURRENTUSER_LBL = new javax.swing.JLabel();
        HIGHAVERAGE_LBL = new javax.swing.JLabel();
        REPLAY_BTN = new javax.swing.JButton();
        EASY_BTN = new javax.swing.JToggleButton();
        HARD_BTN = new javax.swing.JToggleButton();
        MEDIUM_BTN = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 1100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TYPE_TEXT.setBackground(new java.awt.Color(255, 153, 204));
        TYPE_TEXT.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        TYPE_TEXT.setForeground(java.awt.Color.black);
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        jPanel1.add(TYPE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 810, 60));

        jPanel2.setBackground(java.awt.Color.yellow);
        jPanel2.setForeground(java.awt.Color.black);

        TIME_LBL.setBackground(new java.awt.Color(51, 237, 142));
        TIME_LBL.setFont(new java.awt.Font("Poppins ExtraBold", 1, 70)); // NOI18N
        TIME_LBL.setForeground(java.awt.Color.black);
        TIME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIME_LBL.setText("100");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 180, 180));

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AVG_LBL.setFont(new java.awt.Font("Poppins", 1, 60)); // NOI18N
        AVG_LBL.setForeground(java.awt.Color.black);
        AVG_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AVG_LBL.setText("0");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("wpm");

        AVERAGE_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        AVERAGE_LBL.setForeground(java.awt.Color.black);
        AVERAGE_LBL.setText("Average                       : 0 wpm");

        ACCURACY_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ACCURACY_LBL.setForeground(java.awt.Color.black);
        ACCURACY_LBL.setText("Accuracy                    : 0%");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);

        WPM_LBL.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        WPM_LBL.setForeground(java.awt.Color.black);
        WPM_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WPM_LBL.setText("Words per Minute");

        KEYSTROKES_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        KEYSTROKES_LBL.setForeground(java.awt.Color.black);
        KEYSTROKES_LBL.setText("KeyStrokes                : 0 ( 0 | 0 )");

        UNCORRECT_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        UNCORRECT_LBL.setForeground(java.awt.Color.black);
        UNCORRECT_LBL.setText("Uncorrect                   : 0 words");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(AVG_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WPM_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACCURACY_LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AVERAGE_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KEYSTROKES_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNCORRECT_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AVG_LBL)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(AVERAGE_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACCURACY_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KEYSTROKES_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UNCORRECT_LBL)
                            .addComponent(WPM_LBL))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 810, 180));

        TEXT_PANEL.setBackground(new java.awt.Color(255, 153, 204));
        TEXT_PANEL.setMaximumSize(new java.awt.Dimension(32767000, 32767));
        TEXT_PANEL.setMinimumSize(new java.awt.Dimension(900, 900));

        TEXT_LBL1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        TEXT_LBL1.setForeground(java.awt.Color.white);
        TEXT_LBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL1.setText("jLabel1");

        TEXT_LBL2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        TEXT_LBL2.setForeground(java.awt.Color.white);
        TEXT_LBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL2.setText("jLabel1");

        TEXT_LBL3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        TEXT_LBL3.setForeground(java.awt.Color.white);
        TEXT_LBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL3.setText("jLabel1");

        TEXT_LBL4.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        TEXT_LBL4.setForeground(java.awt.Color.white);
        TEXT_LBL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL4.setText("jLabel1");

        TEXT_LBL5.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        TEXT_LBL5.setForeground(java.awt.Color.white);
        TEXT_LBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL5.setText("jLabel1");

        javax.swing.GroupLayout TEXT_PANELLayout = new javax.swing.GroupLayout(TEXT_PANEL);
        TEXT_PANEL.setLayout(TEXT_PANELLayout);
        TEXT_PANELLayout.setHorizontalGroup(
            TEXT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANELLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(TEXT_LBL1)
                .addGap(9, 9, 9)
                .addComponent(TEXT_LBL2)
                .addGap(9, 9, 9)
                .addComponent(TEXT_LBL3)
                .addGap(9, 9, 9)
                .addComponent(TEXT_LBL4)
                .addGap(9, 9, 9)
                .addComponent(TEXT_LBL5)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        TEXT_PANELLayout.setVerticalGroup(
            TEXT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANELLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(TEXT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT_LBL1)
                    .addComponent(TEXT_LBL2)
                    .addComponent(TEXT_LBL3)
                    .addComponent(TEXT_LBL4)
                    .addComponent(TEXT_LBL5))
                .addContainerGap(727, Short.MAX_VALUE))
        );

        jPanel1.add(TEXT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 810, 300));

        jPanel5.setBackground(new java.awt.Color(255, 153, 204));

        LEADERBOARD_BTN.setBackground(new java.awt.Color(102, 0, 0));
        LEADERBOARD_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        LEADERBOARD_BTN.setText("LEADERBOARD");
        LEADERBOARD_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LEADERBOARD_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LEADERBOARD_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEADERBOARD_BTNActionPerformed(evt);
            }
        });

        USERNAME_BTN.setBackground(new java.awt.Color(51, 85, 140));
        USERNAME_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        USERNAME_BTN.setText("CHANGE USER");
        USERNAME_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        USERNAME_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        USERNAME_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAME_BTNActionPerformed(evt);
            }
        });

        USERNAME_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        USERNAME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USERNAME_LBL.setText("ADMIN");

        USER_IMG_LBL.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        USER_IMG_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USER_IMG_LBL.setText("NO IMAGE");

        MUSIC_TGGLE.setBackground(new java.awt.Color(102, 0, 0));
        MUSIC_TGGLE.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        MUSIC_TGGLE.setText("MUSIC ON");
        MUSIC_TGGLE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MUSIC_TGGLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MUSIC_TGGLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUSIC_TGGLEActionPerformed(evt);
            }
        });

        EXIT_TYPEE.setBackground(new java.awt.Color(153, 153, 0));
        EXIT_TYPEE.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        EXIT_TYPEE.setText("EXIT");
        EXIT_TYPEE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EXIT_TYPEE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT_TYPEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_TYPEEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(USER_IMG_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAME_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LEADERBOARD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUSIC_TGGLE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAME_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXIT_TYPEE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(USER_IMG_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USERNAME_LBL)
                .addGap(43, 43, 43)
                .addComponent(USERNAME_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LEADERBOARD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(MUSIC_TGGLE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(EXIT_TYPEE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 260, 710));

        CURRENTUSER_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        CURRENTUSER_LBL.setForeground(java.awt.Color.black);
        CURRENTUSER_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CURRENTUSER_LBL.setText("USER : Muhammad Idris");
        jPanel1.add(CURRENTUSER_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        HIGHAVERAGE_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        HIGHAVERAGE_LBL.setForeground(java.awt.Color.black);
        HIGHAVERAGE_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HIGHAVERAGE_LBL.setText("HIGH AVERAGE : 0wpm");
        jPanel1.add(HIGHAVERAGE_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 300, 30));

        REPLAY_BTN.setBackground(new java.awt.Color(51, 255, 153));
        REPLAY_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        REPLAY_BTN.setForeground(java.awt.Color.black);
        REPLAY_BTN.setText("REPLAY");
        REPLAY_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REPLAY_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REPLAY_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPLAY_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(REPLAY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 180, 60));

        EASY_BTN.setBackground(new java.awt.Color(0, 0, 205));
        EASY_BTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        EASY_BTN.setText("EASY");
        EASY_BTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EASY_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EASY_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EASY_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(EASY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 180, 60));

        HARD_BTN.setBackground(new java.awt.Color(0, 0, 120));
        HARD_BTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        HARD_BTN.setText("HARD");
        HARD_BTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HARD_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(HARD_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 180, 60));

        MEDIUM_BTN.setBackground(new java.awt.Color(0, 0, 153));
        MEDIUM_BTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        MEDIUM_BTN.setText("MEDIUM");
        MEDIUM_BTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MEDIUM_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MEDIUM_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDIUM_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(MEDIUM_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 180, 60));

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

    private void TYPE_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TYPE_TEXTFocusGained
        // TODO add your handling code here:
        LAGU_ARR_RANDOM();
        TYPE_TEXT.setBackground(Color.white);
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
    }//GEN-LAST:event_TYPE_TEXTFocusGained

    private void TYPE_TEXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TYPE_TEXTKeyReleased
        // TODO add your handling code here:
        String TYPE = TYPE_TEXT.getText();
//        LAGU_ARR_RANDOM();
        START(TYPE);
        TYPE_CHECKER(TYPE);
    }//GEN-LAST:event_TYPE_TEXTKeyReleased

    private void LEADERBOARD_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEADERBOARD_BTNActionPerformed
        // TODO add your handling code here:
        LeaderBoard LEADERBOARD = new LeaderBoard(EASY_, MEDIUM_, HARD_);
        //        LEADERBOARD.USER();
        //        LEADERBOARD.LEADERBOARD_EASY(EASY);
        LEADERBOARD.setLocationRelativeTo(null);
        LEADERBOARD.setVisible(true);
    }//GEN-LAST:event_LEADERBOARD_BTNActionPerformed

    private void USERNAME_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAME_BTNActionPerformed
        // TODO add your handling code here:
        Login CHANGE_USER = new Login();
        CHANGE_USER.USER(EASY_, MEDIUM_, HARD_);
        CHANGE_USER.setLocationRelativeTo(null);
        CHANGE_USER.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_USERNAME_BTNActionPerformed

    private void MUSIC_TGGLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_TGGLEActionPerformed
        // TODO add your handling code here:
        MUSIC_ON_OFF++;
        if (MUSIC_ON_OFF % 2 == 0) {
            MUSIC_TGGLE.setText("MUSIC OFF");
        } else {
            MUSIC_TGGLE.setText("MUSIC ON");
        }
    }//GEN-LAST:event_MUSIC_TGGLEActionPerformed

    private void EXIT_TYPEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT_TYPEEActionPerformed
        // TODO add your handling code here:
        int EXIT_OR_NO = JOptionPane.showConfirmDialog(null, "ANDA INGIN KELUAR ?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (EXIT_OR_NO == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_EXIT_TYPEEActionPerformed

    private void REPLAY_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPLAY_BTNActionPerformed
        // TODO add your handling code here:
        REPLAY();
    }//GEN-LAST:event_REPLAY_BTNActionPerformed

    private void EASY_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EASY_BTNActionPerformed
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Medium HARD = new Type_Medium();
        EASY.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        MEDIUM.setLocationRelativeTo(null);
        MEDIUM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EASY_BTNActionPerformed

    private void MEDIUM_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIUM_BTNActionPerformed
        // TODO add your handling code here:
        HARD_BTN.setSelected(true);

        String USERNAME = USERNAME_LBL.getText();
        Type_Medium MEDIUM = new Type_Medium();
        MEDIUM.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        MEDIUM.setLocationRelativeTo(null);
        MEDIUM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MEDIUM_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Type_Hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Type_Hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Type_Hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Type_Hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Type_Hard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACCURACY_LBL;
    private javax.swing.JLabel AVERAGE_LBL;
    private javax.swing.JLabel AVG_LBL;
    private javax.swing.JLabel CURRENTUSER_LBL;
    private javax.swing.JToggleButton EASY_BTN;
    private javax.swing.JButton EXIT_TYPEE;
    private javax.swing.JToggleButton HARD_BTN;
    private javax.swing.JLabel HIGHAVERAGE_LBL;
    private javax.swing.JLabel KEYSTROKES_LBL;
    private javax.swing.JButton LEADERBOARD_BTN;
    private javax.swing.JToggleButton MEDIUM_BTN;
    private javax.swing.JToggleButton MUSIC_TGGLE;
    private javax.swing.JButton REPLAY_BTN;
    private javax.swing.JLabel TEXT_LBL1;
    private javax.swing.JLabel TEXT_LBL2;
    private javax.swing.JLabel TEXT_LBL3;
    private javax.swing.JLabel TEXT_LBL4;
    private javax.swing.JLabel TEXT_LBL5;
    private javax.swing.JPanel TEXT_PANEL;
    private javax.swing.JLabel TIME_LBL;
    private javax.swing.JTextField TYPE_TEXT;
    private javax.swing.JLabel UNCORRECT_LBL;
    private javax.swing.JButton USERNAME_BTN;
    private javax.swing.JLabel USERNAME_LBL;
    private javax.swing.JLabel USER_IMG_LBL;
    private javax.swing.JLabel WPM_LBL;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
