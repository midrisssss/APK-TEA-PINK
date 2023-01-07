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
        AVERAGE_LBL.setText("AVG                                : " + AVERAGE + " wpm");
        // ACCURACY
        ACCURACY = (((double) CORRECT_LETTER - (double) UNCORRECT_LETTER) / ((double) CORRECT_LETTER / 100.0));
        ACCURACY_LBL.setText("ACCURACY                : " + (int) ACCURACY + "%");
        // KEYSTOKES
        KEYSTROKES_LBL.setText("KeyStrokes                : " + (CORRECT_LETTER + UNCORRECT_LETTER) + " ( " + CORRECT_LETTER + " | " + UNCORRECT_LETTER + " )");
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
        HIGHAVERAGE_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
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
        TYPE_TEXT = new javax.swing.JTextField();
        TIME_PNL = new javax.swing.JPanel();
        TIME_LBL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AVG_LBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AVERAGE_LBL = new javax.swing.JLabel();
        ACCURACY_LBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WPM_LBL = new javax.swing.JLabel();
        KEYSTROKES_LBL = new javax.swing.JLabel();
        TEXT_PANEL = new javax.swing.JPanel();
        TEXT_LBL = new javax.swing.JLabel();
        ASIDE_PNL = new javax.swing.JPanel();
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

        TIME_PNL.setBackground(java.awt.Color.yellow);
        TIME_PNL.setForeground(java.awt.Color.black);

        TIME_LBL.setBackground(new java.awt.Color(51, 237, 142));
        TIME_LBL.setFont(new java.awt.Font("Poppins ExtraBold", 1, 70)); // NOI18N
        TIME_LBL.setForeground(java.awt.Color.black);
        TIME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIME_LBL.setText("60");

        javax.swing.GroupLayout TIME_PNLLayout = new javax.swing.GroupLayout(TIME_PNL);
        TIME_PNL.setLayout(TIME_PNLLayout);
        TIME_PNLLayout.setHorizontalGroup(
            TIME_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        TIME_PNLLayout.setVerticalGroup(
            TIME_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jPanel1.add(TIME_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 180, 180));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(AVG_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACCURACY_LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AVERAGE_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KEYSTROKES_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WPM_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AVG_LBL)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AVERAGE_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACCURACY_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KEYSTROKES_LBL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WPM_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 810, 180));

        TEXT_PANEL.setBackground(new java.awt.Color(255, 153, 204));
        TEXT_PANEL.setMaximumSize(new java.awt.Dimension(32767000, 32767));
        TEXT_PANEL.setMinimumSize(new java.awt.Dimension(900, 900));
        TEXT_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_LBL.setFont(new java.awt.Font("Poppins", 1, 80)); // NOI18N
        TEXT_LBL.setForeground(java.awt.Color.black);
        TEXT_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LBL.setText("A");
        TEXT_LBL.setMaximumSize(new java.awt.Dimension(90, 43));
        TEXT_PANEL.add(TEXT_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 810, 300));

        jPanel1.add(TEXT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 810, 300));

        ASIDE_PNL.setBackground(new java.awt.Color(255, 153, 204));

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

        javax.swing.GroupLayout ASIDE_PNLLayout = new javax.swing.GroupLayout(ASIDE_PNL);
        ASIDE_PNL.setLayout(ASIDE_PNLLayout);
        ASIDE_PNLLayout.setHorizontalGroup(
            ASIDE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ASIDE_PNLLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(ASIDE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(USER_IMG_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAME_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LEADERBOARD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUSIC_TGGLE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAME_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXIT_TYPEE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        ASIDE_PNLLayout.setVerticalGroup(
            ASIDE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ASIDE_PNLLayout.createSequentialGroup()
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

        jPanel1.add(ASIDE_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 260, 710));

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
        TYPE_TEXT.setBackground(Color.white);
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
    }//GEN-LAST:event_TYPE_TEXTFocusGained

    private void TYPE_TEXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TYPE_TEXTKeyReleased
        // TODO add your handling code here:
        String TYPE = TYPE_TEXT.getText();
        START(TYPE);
        TYPE_CHECKER(TYPE);
    }//GEN-LAST:event_TYPE_TEXTKeyReleased

    private void LEADERBOARD_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEADERBOARD_BTNActionPerformed
        // TODO add your handling code here:
        LeaderBoard LEADERBOARD = new LeaderBoard(EASY_, MEDIUM_, HARD_);
//                LEADERBOARD.USER();
//                LEADERBOARD.LEADERBOARD_EASY(EASY);
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
        MEDIUM_BTN.setSelected(true);
        Type_Easy EASY = new Type_Easy();
        EASY.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        EASY.setLocationRelativeTo(null);
        EASY.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EASY_BTNActionPerformed

    private void MEDIUM_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIUM_BTNActionPerformed
        // TODO add your handling code here:
        MEDIUM_BTN.setSelected(false);
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
    private javax.swing.JLabel ACCURACY_LBL;
    private javax.swing.JPanel ASIDE_PNL;
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
    private javax.swing.JLabel TEXT_LBL;
    private javax.swing.JPanel TEXT_PANEL;
    private javax.swing.JLabel TIME_LBL;
    private javax.swing.JPanel TIME_PNL;
    private javax.swing.JTextField TYPE_TEXT;
    private javax.swing.JButton USERNAME_BTN;
    private javax.swing.JLabel USERNAME_LBL;
    private javax.swing.JLabel USER_IMG_LBL;
    private javax.swing.JLabel WPM_LBL;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
