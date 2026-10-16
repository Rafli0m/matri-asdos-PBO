/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3 (D3): Struktur Kontrol Percabangan (Grading Skala A - E)
 * File       : percabangan.java
 * ============================================================================
 * Skala Konversi Nilai:
 * - 90 s/d 100 : Nilai A (Sangat Baik)
 * - 80 s/d 89  : Nilai B (Baik)
 * - 70 s/d 79  : Nilai C (Cukup)
 * - 60 s/d 69  : Nilai D (Kurang)
 * - < 60       : Nilai E (Gagal)
 * ============================================================================
 */

import java.util.Scanner;

public class percabangan {

    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        SISTEM KONVERSI NILAI HURUF       ");
        System.out.println("==========================================");

        // Mengambil input nilai angka dari user
        System.out.print("Masukkan nilai mahasiswa (0 - 100): ");
        int nilai = input.nextInt();

        System.out.println("------------------------------------------");

        // Validasi dan penentuan grade huruf
        if (nilai < 0 || nilai > 100) {
            // Menolak input di luar skala yang masuk akal
            System.out.println("Error: Nilai harus berada dalam rentang 0 sampai 100!");
        } else if (nilai >= 90) {
            System.out.println("Hasil: Nilai A (Sangat Baik)");
        } else if (nilai >= 80) {
            System.out.println("Hasil: Nilai B (Baik)");
        } else if (nilai >= 70) {
            System.out.println("Hasil: Nilai C (Cukup)");
        } else if (nilai >= 60) {
            System.out.println("Hasil: Nilai D (Kurang)");
        } else {
            System.out.println("Hasil: Nilai E (Gagal / Tidak Lulus)");
        }

        System.out.println("==========================================");

        // Menutup resource scanner
        input.close();
    }
}
