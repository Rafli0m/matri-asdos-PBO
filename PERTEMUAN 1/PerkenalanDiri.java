/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 1: Menampilkan Data Diri (Standard Output)
 * File       : PerkenalanDiri.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Mempelajari cara menampilkan teks multi-baris ke console.
 * 2. Memahami penggunaan System.out.println() untuk format output yang rapi.
 * 3. Memahami penggunaan karakter escape sequence seperti \n (baris baru) dan \t (tab).
 * ============================================================================
 */

public class PerkenalanDiri {

    public static void main(String[] args) {
        // Header Tampilan Program
        System.out.println("========================================");
        System.out.println("       PROGRAM PERKENALAN DIRI          ");
        System.out.println("========================================");

        // Menampilkan informasi perkenalan baris demi baris
        // System.out.println() akan otomatis menambahkan ganti baris (enter) di akhir kalimat.
        System.out.println("Halo, nama saya Rafli Maulana.");
        System.out.println("Saya seorang Mahasiswa Informatika Semester 7.");
        System.out.println("Saya berasal dari Kota Jambi.");
        System.out.println("Saya memiliki hobi bermain game dan membaca buku.");
        System.out.println("Umur saya 22 tahun.");
        System.out.println("Senang bertemu dengan Anda!");

        // Footer Tampilan Program
        System.out.println("========================================");
        
        /*
         * TIPS TAMBAHAN UNTUK PRAKTIKAN:
         * 1. System.out.print()   -> Mencetak teks TANPA berpindah ke baris baru.
         * 2. System.out.println() -> Mencetak teks DAN otomatis berpindah ke baris baru (newline).
         * 3. Anda juga dapat menggunakan karakter escape:
         *    - '\n' untuk membuat baris baru.
         *    - '\t' untuk memberi jarak tabulasi horizontal.
         */
    }
}
