/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3 (D3): Latihan Kalkulator Aritmatika (if - else if - else)
 * File       : Kalkulator.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Menyusun alur percabangan lengkap untuk 4 operasi aritmatika dasar:
 *    - 1: Penjumlahan (+)
 *    - 2: Pengurangan (-)
 *    - 3: Perkalian (*)
 *    - 4: Pembagian (/)
 * 2. Memperbaiki kesalahan logika umum (duplikasi prompt, salah teks operasi).
 * 3. Menangani penanganan error saat pembagian dengan angka 0.
 * ============================================================================
 */

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan Menu Kalkulator
        System.out.println("==========================================");
        System.out.println("            KALKULATOR ARITMATIKA         ");
        System.out.println("==========================================");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("==========================================");
        System.out.print("Silakan pilih operator pada menu (1-4): ");
        int menu = input.nextInt();

        // Variabel penampung nilai dan hasil
        double angka1, angka2, hasil;

        if (menu == 1) {
            // OPERASI 1: PENJUMLAHAN
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua  : ");
            angka2 = input.nextDouble();
            hasil = angka1 + angka2;
            System.out.println("Hasil Penjumlahan: " + angka1 + " + " + angka2 + " = " + hasil);

        } else if (menu == 2) {
            // OPERASI 2: PENGURANGAN
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua  : ");
            angka2 = input.nextDouble();
            hasil = angka1 - angka2;
            System.out.println("Hasil Pengurangan: " + angka1 + " - " + angka2 + " = " + hasil);

        } else if (menu == 3) {
            // OPERASI 3: PERKALIAN
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua  : ");
            angka2 = input.nextDouble();
            hasil = angka1 * angka2;
            System.out.println("Hasil Perkalian  : " + angka1 + " * " + angka2 + " = " + hasil);

        } else if (menu == 4) {
            // OPERASI 4: PEMBAGIAN
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua  : ");
            angka2 = input.nextDouble();

            // Pengecekan pembagian dengan nol
            if (angka2 == 0) {
                System.out.println("Error: Pembagian dengan angka 0 tidak dapat dilakukan!");
            } else {
                hasil = angka1 / angka2;
                System.out.println("Hasil Pembagian  : " + angka1 + " / " + angka2 + " = " + hasil);
            }

        } else {
            // Inputan di luar nomor menu yang valid
            System.out.println("Peringatan: Pilihan tidak valid! Silakan masukkan angka menu antara 1 sampai 4.");
        }

        // Menutup resource scanner
        input.close();
    }
}