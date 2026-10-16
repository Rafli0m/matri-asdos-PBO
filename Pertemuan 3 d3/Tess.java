/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3 (D3): Contoh Praktik Kalkulator Sederhana (Clean & Corrected)
 * File       : Tess.java
 * ============================================================================
 * Catatan Asdos:
 * File ini merupakan contoh implementasi kalkulator sederhana menggunakan
 * percabangan if - else if - else dengan struktur variabel yang rapi dan
 * penanganan kesalahan input yang tepat.
 * ============================================================================
 */

import java.util.Scanner;

public class Tess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan Menu Pilihan Operasi
        System.out.println("==========================================");
        System.out.println("             MENU KALKULATOR              ");
        System.out.println("==========================================");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("==========================================");
        System.out.print("Silakan pilih operator pada menu (1-4): ");
        int menu = input.nextInt();

        // Variabel untuk menampung kedua bilangan dan hasil akhir
        double angka1, angka2, hasil;

        if (menu == 1) {
            // Operasi Penjumlahan
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua   : ");
            angka2 = input.nextDouble();
            hasil = angka1 + angka2;
            System.out.println("Hasil Penjumlahan: " + angka1 + " + " + angka2 + " = " + hasil);

        } else if (menu == 2) {
            // Operasi Pengurangan
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua   : ");
            angka2 = input.nextDouble();
            hasil = angka1 - angka2;
            System.out.println("Hasil Pengurangan: " + angka1 + " - " + angka2 + " = " + hasil);

        } else if (menu == 3) {
            // Operasi Perkalian
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua   : ");
            angka2 = input.nextDouble();
            hasil = angka1 * angka2;
            System.out.println("Hasil Perkalian  : " + angka1 + " * " + angka2 + " = " + hasil);

        } else if (menu == 4) {
            // Operasi Pembagian
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua   : ");
            angka2 = input.nextDouble();

            // Pengecekan agar tidak terjadi pembagian dengan angka nol (0)
            if (angka2 == 0) {
                System.out.println("Peringatan: Tidak dapat membagi bilangan dengan angka nol (0)!");
            } else {
                hasil = angka1 / angka2;
                System.out.println("Hasil Pembagian  : " + angka1 + " / " + angka2 + " = " + hasil);
            }

        } else {
            // Pesan jika nomor menu tidak valid
            System.out.println("Input tidak valid! Silakan masukkan pilihan nomor 1 sampai 4.");
        }

        // Menutup Scanner
        input.close();
    }
}