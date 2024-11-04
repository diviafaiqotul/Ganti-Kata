/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 * NAMA  : DIVIA FAIQOTUL CAHYATI
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176021
 * Deskripsi Program : Program ini digunakan untuk mengganti kata dalam sebuah kalimat.
 */

import java.util.Scanner;

public class GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata: ");
        String kataAsli = input.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = input.nextLine();
  
        // Validasi input tidak kosong
        if (kalimat.isEmpty() || kataAsli.isEmpty() || kataBaru.isEmpty()) {
            System.out.println("Input tidak boleh kosong!");
        } else {
            // Mengganti kata yang berdiri sendiri
            String kalimatBaru = kalimat.replaceAll("\\b" + kataAsli + "\\b", kataBaru);
        }

        // Mengganti semua kemunculan kataAsli dengan kataBaru
        String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}

