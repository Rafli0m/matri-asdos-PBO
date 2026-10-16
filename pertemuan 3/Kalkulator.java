/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3: Program Menu Kalkulator Sederhana (Percabangan if - else if - else)
 * File       : Kalkulator.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Membuat program interaktif berbasis menu pilihan menggunakan Scanner.
 * 2. Mengarahkan alur eksekusi berdasarkan nomor menu yang dipilih pengguna.
 * 3. Menangani operasi aritmatika (tambah, kurang, kali, bagi).
 * 4. Menangani kasus khusus (edge case): Pembagian dengan angka 0 (division by zero).
 * ============================================================================
 */

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        // Deklarasi objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // Menampilkan daftar menu operasi kalkulator
        System.out.println("==========================================");
        System.out.println("           KALKULATOR SEDERHANA           ");
        System.out.println("==========================================");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("==========================================");
        System.out.print("Silakan Pilih Menu Kalkulator (1-4): ");
        int menu = input.nextInt();

        // Variabel untuk menampung angka dan hasil perhitungan
        double angka1, angka2, hasil;

        // Validasi menu: jika menu 1 - 4, minta input angka dari user
        if (menu >= 1 && menu <= 4) {
            System.out.print("Masukkan Angka Pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan Angka Kedua   : ");
            angka2 = input.nextDouble();

            System.out.println("------------------------------------------");

            // Memproses operasi sesuai menu yang dipilih
            if (menu == 1) {
                // Operasi Penjumlahan
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan (" + angka1 + " + " + angka2 + ") = " + hasil);
            } else if (menu == 2) {
                // Operasi Pengurangan
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan (" + angka1 + " - " + angka2 + ") = " + hasil);
            } else if (menu == 3) {
                // Operasi Perkalian
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian   (" + angka1 + " * " + angka2 + ") = " + hasil);
            } else if (menu == 4) {
                // Operasi Pembagian
                // CATATAN ASDOS:
                // Selalu cek apakah angka pembagi adalah 0 untuk mencegah hasil tak hingga (Infinity)
                if (angka2 == 0) {
                    System.out.println("Error: Pembagian dengan angka nol (0) tidak terdefinisi!");
                } else {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian   (" + angka1 + " / " + angka2 + ") = " + hasil);
                }
            }
            System.out.println("------------------------------------------");
        } else {
            // Jika user menginput angka selain 1, 2, 3, atau 4
            System.out.println("Peringatan: Menu nomor " + menu + " tidak tersedia! Silakan pilih angka 1 - 4.");
        }

        // Selalu tutup Scanner setelah selesai
        input.close();
    }
}
