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

    void All_Lirik() {
        int LAGU_RANDOM = (int) (Math.random() * 3);
        String[] LIRIK_LAGU = {};

        String[] MANUSIAKUAT_TULUS = {"Kau bisa patahkan kakiku, "
                + "Tapi tidak mimpi-mimpiku, "
                + "Kau bisa lumpuhkan tanganku, "
                + "Tapi tidak mimpi-mimpiku, "
                + "Kau bisa merebut senyumku, "
                + "Tapi sungguh tak akan lama, "
                + "Kau bisa merobek hatiku, "
                + "Tapi aku tahu obatnya."};
        String[] TAKINGINUSAI_KEISYA = {"Berdiri ku memutar waktu, "
                + "Teringat kamu yang dulu, "
                + "Ada disampingku setiap hari, "
                + "Jadi sandaran ternyaman, "
                + "Saat ku lemah saat ku lelah, "
                + "\n"
                + "Tersadar kutinggal sendiri, "
                + "Merenungi semua yang tak mungkin, "
                + "Bisa kuputarkan kembali seperti dulu, "
                + "Kubahagia tapi semuanya hilang, tanpa sebab, "
                + "Kau hentikan semuanya"};

        switch (LAGU_RANDOM) {
            case 0:
                LIRIK_LAGU = MANUSIAKUAT_TULUS;
                break;
            case 1:
                LIRIK_LAGU = TAKINGINUSAI_KEISYA;
                break;
            case 2:
                LIRIK_LAGU = ;
                break;
            default:
                break;
        }

        
    }

    public static void main(String[] args) {
        // Lagu random
    }
}
