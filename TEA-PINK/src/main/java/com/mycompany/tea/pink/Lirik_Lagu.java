/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tea.pink;

/**
 *
 * @author USER
 */
public class Lirik_Lagu {

    int c = 111;
    String[][] a = {{"Kau bisa patahkan kakiku, "
        + "Tapi tidak mimp^i-mimpiku, "
        + "Kau bisa lumpuhkan tanganku, "
        + "Tapi tidak mimpi-mimpiku, "
        + "Kau bisa merebut senyumku, "
        + "Tapi sungguh tak akan lama, "
        + "Kau bisa merobek hatiku, "
        + "Tapi aku tahu obatnya."},
    {"Kau ", "bisa ", "patahkan ", "kakiku, ",
        "Tapi ", "tidak ", "mimpi-mimpiku, ",
        "Kau ", "bisa ", "lumpuhkan ", "tanganku, ",
        "Tapi ", "tidak ", "mimpi-mimpiku, ",
        "Kau ", "bisa ", "merebut ", "senyumku, ",
        "Tapi ", "sungguh ", "tak ", "akan ", "lama, ",
        "Kau ", "bisa ", "merobek ", "hatiku, ",
        "Tapi ", "aku ", "tahu ", "obatnya."}};

    String[][] b = {{"Berdiri ku memutar waktu, "
        + "Teringat kamu yang dulu, "
        + "Ada disampingku setiap hari, "
        + "Jadi sandaran ternyaman, "
        + "Saat ku lemah saat ku lelah, "
        + "\n"
        + "Tersadar kutinggal sendiri, "
        + "Merenungi semua yang tak mungkin, "
        + "Bisa kuputarkan kembali seperti dulu, "
        + "Kubahagia tapi semuanya hilang, tanpa sebab, "
        + "Kau hentikan semuanya"}, {"Berdiri ", "ku ", "memutar ", "waktu, ",
        "Teringat ", "kamu ", "yang ", "dulu, ",
        "Ada ", "disampingku ", "setiap ", "hari, ",
        "Jadi ", "sandaran ", "ternyaman, ",
        "Saat ", "ku ", "lemah ", "saat ", "ku ", "lelah, ",
        "Tersadar ", "kutinggal ", "sendiri, ",
        "Merenungi ", "semua ", "yang ", "tak ", "mungkin, ",
        "Bisa ", "kuputarkan ", "kembali ", "seperti ", "dulu, ",
        "Kubahagia ", "tapi ", "semuanya ", "hilang, ", "tanpa ", "sebab, ",
        "Kau ", "hentikan ", "semuanya"}};

    switch (LAGU_RANDOM) {
        case 0, 2, 4 ->
            String[][] LIRIK_LAGU = a;
        case 1, 3, 5 ->
            String[][] LIRIK_LAGU = b;
        default -> {
                }
    } 
    System.out.println(LIRIK_LAGU[0][0]);


    public static void main(String[] args) {
        // Lagu random
        //        String TYPING_TEXT = TYPE_TEXT.getText();
//        int TYPING_LENGTH = TYPING_TEXT.length();
//        // int LastOf_TYPING_TEXT = TYPING_TEXT.lastIndexOf(TYPING_TEXT);
//        int a = 0;
//        int c = TYPING_LENGTH;
//        boolean b;
//        
//        TYPEE_TEXTAREA.select(0, 2);
//
//        if (TYPING_TEXT.equals(MANUSIAKUAT_TULUS1[0].substring(0, TYPING_LENGTH))) {
//            TYPE_TEXT.setBackground(Color.white);
//            USERNAME_BTN.setText(TYPING_TEXT);
//            b = true;
//            a++;
//            TYPEE_TEXTAREA.setSelectionColor(new java.awt.Color(8, 148, 159));
//        } else {
//            TYPE_TEXT.setBackground(Color.RED);
//            b = false;
//            TYPEE_TEXTAREA.setSelectionColor(Color.red);
//        }
//
//        System.out.println("nilai a " + a);

        // EVENT START
    }
}
