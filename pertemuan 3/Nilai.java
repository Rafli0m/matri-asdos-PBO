/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3: Input Pengguna (Scanner) & Percabangan Kondisi (if - else if - else)
 * File       : Nilai.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Menggunakan class Scanner dari java.util untuk mengambil input dari keyboard.
 * 2. Memahami alur logika percabangan bertingkat (if - else if - else).
 * 3. Mengetahui pentingnya menutup resource Scanner dengan method close().
 * ============================================================================
 */

import java.util.Scanner; // Import class Scanner agar bisa digunakan

public class Nilai {

    public static void main(String[] args) {
        // 1. DEKLARASI VARIABEL
        int nilai;

        // 2. INISIALISASI SCANNER
        // System.in merepresentasikan input stream standar (keyboard).
        Scanner input = new Scanner(System.in);

        // 3. MENGAMBIL INPUT DARI PENGGUNA
        // Menggunakan print() (bukan println) agar kursor input berada di samping teks.
        System.out.print("Masukkan Nilai Anda (0 - 100): ");
        nilai = input.nextInt(); // Membaca data bertipe integer dari input user

        System.out.println("\n---------------- HASIL EVALUASI ----------------");

        // 4. PERCABANGAN KONDISI (LOGIKA KELULUSAN)
        // Komputer akan mengevaluasi kondisi dari urutan PALING ATAS ke BAWAH:
        // - Jika kondisi pertama bernilai TRUE, blok tersebut dieksekusi dan blok lain diabaikan.
        // - Jika kondisi FALSE, barulah komputer mengecek blok 'else if' berikutnya.
        if (nilai >= 81) {
            System.out.println("Grade: A");
            System.out.println("Keterangan: Selamat, Anda Mendapat nilai A!");
        } else if (nilai >= 61) {
            System.out.println("Grade: B");
            System.out.println("Keterangan: Selamat, Anda Mendapat nilai B!");
        } else if (nilai >= 41) {
            System.out.println("Grade: C");
            System.out.println("Keterangan: Anda Mendapat nilai C.");
        } else {
            // Blok 'else' dijalankan jika SEMUA kondisi di atas bernilai FALSE (nilai < 41)
            System.out.println("Grade: D / E");
            System.out.println("Keterangan: Nilai Anda tidak mencukupi. Harap mengulang kelas.");
        }

        System.out.println("------------------------------------------------");

        // 5. MENUTUP SCANNER
        // Sangat disarankan menutup Scanner setelah selesai digunakan
        // untuk mencegah kebocoran memori / resource leak.
        input.close();
    }
}
