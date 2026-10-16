/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3: Percabangan Rentang Nilai (Range Evaluation)
 * File       : Ipk.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Menentukan predikat akademik berdasarkan rentang nilai IPK (tipe double).
 * 2. Memahami efisiensi alur logika `if - else if - else`:
 *    Mengapa kita cukup menulis `ipk >= 3.0` dan TIDAK PERLU menulis
 *    `ipk >= 3.0 && ipk < 3.5`?
 *    Jawabannya: Karena jika nilai ipk >= 3.5, blok pertama sudah terpenuhi
 *    dan dieksekusi, sehingga blok `else if` di bawahnya hanya akan diproses
 *    jika nilai IPK bernilai di bawah 3.5.
 * ============================================================================
 */

public class Ipk {

    public static void main(String[] args) {
        // Inisialisasi nilai IPK mahasiswa (skala 0.00 - 4.00)
        double ipk = 3.5;

        System.out.println("==========================================");
        System.out.println("   PENENTUAN PREDIKAT KELULUSAN (IPK)     ");
        System.out.println("==========================================");
        System.out.println("IPK Mahasiswa: " + ipk);
        System.out.println("------------------------------------------");

        // Evaluasi logika bertingkat
        if (ipk > 4.0 || ipk < 0.0) {
            // Validasi: IPK di luar batas wajar
            System.out.println("Nilai IPK tidak valid! Skala IPK adalah 0.00 - 4.00.");
        } else if (ipk >= 3.5) {
            // Rentang: 3.50 s/d 4.00
            System.out.println("Predikat: Dengan Pujian (CumLaude)");
        } else if (ipk >= 3.0) {
            // Rentang: 3.00 s/d 3.49
            System.out.println("Predikat: Sangat Memuaskan");
        } else if (ipk >= 2.5) {
            // Rentang: 2.50 s/d 2.99
            System.out.println("Predikat: Memuaskan");
        } else if (ipk >= 2.0) {
            // Rentang: 2.00 s/d 2.49
            System.out.println("Predikat: Cukup");
        } else {
            // Rentang: 0.00 s/d 1.99
            System.out.println("Predikat: Kurang (Perlu Perbaikan Nilai)");
        }

        System.out.println("==========================================");
    }
}
