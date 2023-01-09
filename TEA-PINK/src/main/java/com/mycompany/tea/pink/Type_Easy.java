/*
 * Click nbfs://nbhost/System    
 * @Override
 * FileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tea.pink;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    // FITUR
    int MUSIC_ON_OFF = 1; // MUSIC ON/OFF
    // AVERAGE AND ACCURACY PROCESS
    double ACCURACY = 0, AVERAGE = 0;

    /**
     *
     * Creates new form TYPEE
     *
     */
    public Type_Easy() {
        initComponents();
        LAGU();
    }

    public void LAGU() {

        Lirik_Lagu LIRIKLAGU = new Lirik_Lagu();
        LIRIKLAGU.Lirik_Lagu(19);
        String LAGUUUUU = LIRIKLAGU.LIRIK_LAGU;
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

        int USER_SAMA = EASY_.indexOf(USERNAME);
        if (USER_SAMA == -1) {
//            GUIDE();
            CURRENTUSER_LBL.setText("USER : " + USERNAME_LBL.getText());
        } else {
            double HIGHSCOREEE = Double.parseDouble(EASY_.get(USER_SAMA + 1));
            CURRENTUSER_LBL.setText("USER : " + EASY_.get(USER_SAMA));
            HIGHAVERAGE_LBL.setText("HIGH AVERAGE : " + (int) HIGHSCOREEE + "wpm");
        }
        // IMAGE
        USER_IMG_LBL.setText("" + USERNAME);
        WPM_LBL.setText(EASY_ + " " + MEDIUM_);
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
        if (TYPE.equals(LAGU[TOTAL_WORDS - 1]) || Second > (TOTAL_WORDS * 60)) {
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
    }

    void TYPE_CHECKER(String TYPE) {
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
    }

//    void GUIDE() {
//        TYPE_TEXT.setVisible(false);
//        TYPE_TEXT.setVisible(false);
//        SCORE_PNL.setVisible(false);
//        TIME_PNL.setVisible(false);
//        REPLAY_BTN.setVisible(false);
//
//        HARD_BTN.setVisible(false);
//        MEDIUM_BTN.setVisible(false);
//        EASY_BTN.setVisible(false);
//
//        ASIDE_PNL.setVisible(false);
//
//        GUIDE2_PNL.setVisible(false);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Type_Easy_PNL = new javax.swing.JPanel();
        GUIDE1_PNL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        NEXT1_BTN = new javax.swing.JButton();
        GUIDE2_PNL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        NEXT2_BTN = new javax.swing.JButton();
        TYPE_TEXT = new javax.swing.JTextField();
        TIME_PNL = new javax.swing.JPanel();
        TIME_LBL = new javax.swing.JLabel();
        SCORE_PNL = new javax.swing.JPanel();
        AVG_LBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AVERAGE_LBL = new javax.swing.JLabel();
        ACCURACY_LBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WPM_LBL = new javax.swing.JLabel();
        KEYSTROKES_LBL = new javax.swing.JLabel();
        TIME_SECOND_LBL = new javax.swing.JLabel();
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
        setTitle("TEA-PINK");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 800));

        Type_Easy_PNL.setBackground(new java.awt.Color(204, 255, 204));
        Type_Easy_PNL.setForeground(java.awt.Color.white);
        Type_Easy_PNL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Type_Easy_PNL.setMinimumSize(new java.awt.Dimension(2000, 1000));
        Type_Easy_PNL.setPreferredSize(new java.awt.Dimension(2000, 1100));
        Type_Easy_PNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GUIDE1_PNL.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setText("1 . Board ");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 51, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("ini adalah teks, ketiklah kata-kata \nyang ada di dalam papan teks ini\nke dalam papan ketik(Type Board), \nScore anda dihitung berdasarkan\nkecepatan anda mengetik teks ini.");
        jTextArea1.setBorder(null);

        NEXT1_BTN.setBackground(new java.awt.Color(51, 0, 153));
        NEXT1_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NEXT1_BTN.setText("Next");
        NEXT1_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NEXT1_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXT1_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GUIDE1_PNLLayout = new javax.swing.GroupLayout(GUIDE1_PNL);
        GUIDE1_PNL.setLayout(GUIDE1_PNLLayout);
        GUIDE1_PNLLayout.setHorizontalGroup(
            GUIDE1_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIDE1_PNLLayout.createSequentialGroup()
                .addGroup(GUIDE1_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GUIDE1_PNLLayout.createSequentialGroup()
                        .addContainerGap(195, Short.MAX_VALUE)
                        .addComponent(NEXT1_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GUIDE1_PNLLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(GUIDE1_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(GUIDE1_PNLLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        GUIDE1_PNLLayout.setVerticalGroup(
            GUIDE1_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIDE1_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NEXT1_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Type_Easy_PNL.add(GUIDE1_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 320, 220));

        GUIDE2_PNL.setBackground(new java.awt.Color(0, 51, 255));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setText("2 . TYPE BOARD");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("ini adalah papan ketik, ketiklah semua \nkata-kata di atas, anda akan melihat \nkecepatan/Average anda mengetik");
        jTextArea2.setBorder(null);

        NEXT2_BTN.setBackground(new java.awt.Color(51, 0, 153));
        NEXT2_BTN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        NEXT2_BTN.setText("Next");
        NEXT2_BTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NEXT2_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXT2_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GUIDE2_PNLLayout = new javax.swing.GroupLayout(GUIDE2_PNL);
        GUIDE2_PNL.setLayout(GUIDE2_PNLLayout);
        GUIDE2_PNLLayout.setHorizontalGroup(
            GUIDE2_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIDE2_PNLLayout.createSequentialGroup()
                .addGroup(GUIDE2_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GUIDE2_PNLLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NEXT2_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GUIDE2_PNLLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(GUIDE2_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addGroup(GUIDE2_PNLLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        GUIDE2_PNLLayout.setVerticalGroup(
            GUIDE2_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GUIDE2_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NEXT2_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Type_Easy_PNL.add(GUIDE2_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

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
        Type_Easy_PNL.add(TYPE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 810, 60));

        TIME_PNL.setBackground(java.awt.Color.yellow);
        TIME_PNL.setForeground(java.awt.Color.black);

        TIME_LBL.setBackground(new java.awt.Color(51, 237, 142));
        TIME_LBL.setFont(new java.awt.Font("Poppins ExtraBold", 1, 70)); // NOI18N
        TIME_LBL.setForeground(java.awt.Color.black);
        TIME_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIME_LBL.setText("0");

        javax.swing.GroupLayout TIME_PNLLayout = new javax.swing.GroupLayout(TIME_PNL);
        TIME_PNL.setLayout(TIME_PNLLayout);
        TIME_PNLLayout.setHorizontalGroup(
            TIME_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        TIME_PNLLayout.setVerticalGroup(
            TIME_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TIME_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        Type_Easy_PNL.add(TIME_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 180, 180));

        SCORE_PNL.setBackground(new java.awt.Color(255, 153, 204));
        SCORE_PNL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        TIME_SECOND_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        TIME_SECOND_LBL.setForeground(java.awt.Color.black);
        TIME_SECOND_LBL.setText("Time                               : 0 Second");

        javax.swing.GroupLayout SCORE_PNLLayout = new javax.swing.GroupLayout(SCORE_PNL);
        SCORE_PNL.setLayout(SCORE_PNLLayout);
        SCORE_PNLLayout.setHorizontalGroup(
            SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SCORE_PNLLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SCORE_PNLLayout.createSequentialGroup()
                .addGroup(SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SCORE_PNLLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(AVG_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91))
                    .addGroup(SCORE_PNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WPM_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACCURACY_LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AVERAGE_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KEYSTROKES_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIME_SECOND_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        SCORE_PNLLayout.setVerticalGroup(
            SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SCORE_PNLLayout.createSequentialGroup()
                .addGroup(SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SCORE_PNLLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AVG_LBL)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SCORE_PNLLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(AVERAGE_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACCURACY_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KEYSTROKES_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SCORE_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TIME_SECOND_LBL)
                            .addComponent(WPM_LBL))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Type_Easy_PNL.add(SCORE_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 810, 180));

        TEXT_PANEL.setBackground(new java.awt.Color(255, 153, 204));
        TEXT_PANEL.setMaximumSize(new java.awt.Dimension(32767000, 32767));
        TEXT_PANEL.setMinimumSize(new java.awt.Dimension(900, 900));
        TEXT_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXT_PANEL1.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL1.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL1.setForeground(java.awt.Color.white);
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

        TEXT_PANEL.add(TEXT_PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 770, -1));

        TEXT_PANEL2.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL2.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL2.setForeground(java.awt.Color.white);
        TEXT_LABEL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL2.setText("a");
        TEXT_LABEL2.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL2Layout = new javax.swing.GroupLayout(TEXT_PANEL2);
        TEXT_PANEL2.setLayout(TEXT_PANEL2Layout);
        TEXT_PANEL2Layout.setHorizontalGroup(
            TEXT_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL2Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL2Layout.setVerticalGroup(
            TEXT_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 770, -1));

        TEXT_PANEL3.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL3.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL3.setForeground(java.awt.Color.white);
        TEXT_LABEL3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL3.setText("a");
        TEXT_LABEL3.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL3Layout = new javax.swing.GroupLayout(TEXT_PANEL3);
        TEXT_PANEL3.setLayout(TEXT_PANEL3Layout);
        TEXT_PANEL3Layout.setHorizontalGroup(
            TEXT_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL3Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL3Layout.setVerticalGroup(
            TEXT_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 770, -1));

        TEXT_PANEL4.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL4.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL4.setForeground(java.awt.Color.white);
        TEXT_LABEL4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL4.setText("a");
        TEXT_LABEL4.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL4Layout = new javax.swing.GroupLayout(TEXT_PANEL4);
        TEXT_PANEL4.setLayout(TEXT_PANEL4Layout);
        TEXT_PANEL4Layout.setHorizontalGroup(
            TEXT_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL4Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL4Layout.setVerticalGroup(
            TEXT_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 770, -1));

        TEXT_PANEL5.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL5.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL5.setForeground(java.awt.Color.white);
        TEXT_LABEL5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL5.setText("a");
        TEXT_LABEL5.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL5Layout = new javax.swing.GroupLayout(TEXT_PANEL5);
        TEXT_PANEL5.setLayout(TEXT_PANEL5Layout);
        TEXT_PANEL5Layout.setHorizontalGroup(
            TEXT_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL5Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL5Layout.setVerticalGroup(
            TEXT_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 770, -1));

        TEXT_PANEL6.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL6.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL6.setForeground(java.awt.Color.white);
        TEXT_LABEL6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL6.setText("a");
        TEXT_LABEL6.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL6Layout = new javax.swing.GroupLayout(TEXT_PANEL6);
        TEXT_PANEL6.setLayout(TEXT_PANEL6Layout);
        TEXT_PANEL6Layout.setHorizontalGroup(
            TEXT_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL6Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL6Layout.setVerticalGroup(
            TEXT_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 770, -1));

        TEXT_PANEL7.setBackground(new java.awt.Color(255, 153, 204));

        TEXT_LABEL7.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        TEXT_LABEL7.setForeground(java.awt.Color.white);
        TEXT_LABEL7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXT_LABEL7.setText("a");
        TEXT_LABEL7.setMaximumSize(new java.awt.Dimension(90, 43));

        javax.swing.GroupLayout TEXT_PANEL7Layout = new javax.swing.GroupLayout(TEXT_PANEL7);
        TEXT_PANEL7.setLayout(TEXT_PANEL7Layout);
        TEXT_PANEL7Layout.setHorizontalGroup(
            TEXT_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEXT_PANEL7Layout.createSequentialGroup()
                .addComponent(TEXT_LABEL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(751, Short.MAX_VALUE))
        );
        TEXT_PANEL7Layout.setVerticalGroup(
            TEXT_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_LABEL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TEXT_PANEL.add(TEXT_PANEL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 770, -1));

        Type_Easy_PNL.add(TEXT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 810, 300));

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
                .addContainerGap(53, Short.MAX_VALUE)
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

        Type_Easy_PNL.add(ASIDE_PNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 260, 710));

        CURRENTUSER_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        CURRENTUSER_LBL.setForeground(java.awt.Color.black);
        CURRENTUSER_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CURRENTUSER_LBL.setText("USER : Muhammad Idris");
        Type_Easy_PNL.add(CURRENTUSER_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        HIGHAVERAGE_LBL.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        HIGHAVERAGE_LBL.setForeground(java.awt.Color.black);
        HIGHAVERAGE_LBL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HIGHAVERAGE_LBL.setText("HIGH AVERAGE : 0wpm");
        Type_Easy_PNL.add(HIGHAVERAGE_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 300, 30));

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
        Type_Easy_PNL.add(REPLAY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 180, 60));

        EASY_BTN.setBackground(new java.awt.Color(0, 0, 205));
        EASY_BTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        EASY_BTN.setSelected(true);
        EASY_BTN.setText("EASY");
        EASY_BTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EASY_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EASY_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EASY_BTNActionPerformed(evt);
            }
        });
        Type_Easy_PNL.add(EASY_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 180, 60));

        HARD_BTN.setBackground(new java.awt.Color(0, 0, 120));
        HARD_BTN.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        HARD_BTN.setText("HARD");
        HARD_BTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HARD_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HARD_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HARD_BTNActionPerformed(evt);
            }
        });
        Type_Easy_PNL.add(HARD_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 180, 60));

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
        Type_Easy_PNL.add(MEDIUM_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 180, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Type_Easy_PNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        END(TYPE);
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

    private void TYPE_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TYPE_TEXTFocusGained
        // TODO add your handling code here:
        TYPE_TEXT.setBackground(Color.white);
        TYPE_TEXT.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
    }//GEN-LAST:event_TYPE_TEXTFocusGained

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
        EASY_BTN.setSelected(true);
    }//GEN-LAST:event_EASY_BTNActionPerformed

    private void MEDIUM_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIUM_BTNActionPerformed
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Medium MEDIUM = new Type_Medium();
        MEDIUM.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        MEDIUM.setLocationRelativeTo(null);
        MEDIUM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MEDIUM_BTNActionPerformed

    private void HARD_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HARD_BTNActionPerformed
        // TODO add your handling code here:
        String USERNAME = USERNAME_LBL.getText();
        Type_Hard HARD = new Type_Hard();
        HARD.USER(USERNAME, EASY_, MEDIUM_, HARD_);
        HARD.setLocationRelativeTo(null);
        HARD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HARD_BTNActionPerformed

    private void NEXT1_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXT1_BTNActionPerformed
        // TODO add your handling code here:
        GUIDE1_PNL.setVisible(false);

        GUIDE2_PNL.setVisible(true);
        TYPE_TEXT.setVisible(true);

    }//GEN-LAST:event_NEXT1_BTNActionPerformed

    private void NEXT2_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXT2_BTNActionPerformed
        // TODO add your handling code here:
        GUIDE2_PNL.setVisible(false);

        SCORE_PNL.setVisible(true);
    }//GEN-LAST:event_NEXT2_BTNActionPerformed

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
    private javax.swing.JLabel ACCURACY_LBL;
    private javax.swing.JPanel ASIDE_PNL;
    private javax.swing.JLabel AVERAGE_LBL;
    private javax.swing.JLabel AVG_LBL;
    private javax.swing.JLabel CURRENTUSER_LBL;
    private javax.swing.JToggleButton EASY_BTN;
    private javax.swing.JButton EXIT_TYPEE;
    private javax.swing.JPanel GUIDE1_PNL;
    private javax.swing.JPanel GUIDE2_PNL;
    private javax.swing.JToggleButton HARD_BTN;
    private javax.swing.JLabel HIGHAVERAGE_LBL;
    private javax.swing.JLabel KEYSTROKES_LBL;
    private javax.swing.JButton LEADERBOARD_BTN;
    private javax.swing.JToggleButton MEDIUM_BTN;
    private javax.swing.JToggleButton MUSIC_TGGLE;
    private javax.swing.JButton NEXT1_BTN;
    private javax.swing.JButton NEXT2_BTN;
    private javax.swing.JButton REPLAY_BTN;
    private javax.swing.JPanel SCORE_PNL;
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
    private javax.swing.JButton USERNAME_BTN;
    private javax.swing.JLabel USERNAME_LBL;
    private javax.swing.JLabel USER_IMG_LBL;
    private javax.swing.JLabel WPM_LBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

}
