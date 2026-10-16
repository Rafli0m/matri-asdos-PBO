/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3 (D3): Struktur Perulangan / Looping (for, while, do-while)
 * File       : Tess2.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Memahami 3 jenis perulangan utama di Java:
 *    a. For Loop: Cocok saat jumlah iterasi/putaran sudah diketahui pasti.
 *    b. While Loop: Mengecek kondisi di AWAL. Jika false, blok tidak dijalankan sama sekali.
 *    c. Do-While Loop: Menjalankan blok MINIMAL 1 KALI, baru mengecek kondisi di AKHIR.
 * 2. Memahami komponen perulangan:
 *    - Inisialisasi  : Nilai awal variabel counter (misal: int i = 1).
 *    - Kondisi       : Syarat loop terus berjalan (misal: i <= 5).
 *    - Iterasi/Step  : Pembaruan nilai counter (misal: i++ / increment).
 * ============================================================================
 */

public class Tess2 {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     DEMO STRUKTUR PERULANGAN DI JAVA     ");
        System.out.println("==========================================");

        // ====================================================================
        // 1. FOR LOOP (Perulangan Terhitung / Counted Loop)
        // Sintaks: for (inisialisasi; kondisi; step/increment)
        // ====================================================================
        System.out.println("\n--- [1] Perulangan Menggunakan FOR LOOP ---");
        System.out.println("Karakteristik: Inisialisasi, kondisi, dan increment ditulis dalam 1 baris.");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi for ke-" + i);
        }

        // ====================================================================
        // 2. WHILE LOOP (Entry-Controlled Loop)
        // Sintaks: while (kondisi) { ... step/increment ... }
        // ====================================================================
        System.out.println("\n--- [2] Perulangan Menggunakan WHILE LOOP ---");
        System.out.println("Karakteristik: Kondisi dicek TERLEBIH DAHULU sebelum blok dijalankan.");
        
        int j = 1; // Inisialisasi variabel counter di luar loop
        while (j <= 5) {
            System.out.println("Iterasi while ke-" + j);
            j++; // PERHATIAN: Wajib ada increment, jika tidak maka terjadi Infinite Loop (perulangan tak henti)!
        }

        // ====================================================================
        // 3. DO-WHILE LOOP (Exit-Controlled Loop)
        // Sintaks: do { ... step/increment ... } while (kondisi);
        // ====================================================================
        System.out.println("\n--- [3] Perulangan Menggunakan DO-WHILE LOOP ---");
        System.out.println("Karakteristik: Blok dieksekusi MINIMAL 1 KALI, baru kondisi dicek di akhir.");
        
        int k = 1;
        do {
            System.out.println("Iterasi do-while ke-" + k);
            k++;
        } while (k <= 5);

        System.out.println("\n==========================================");
        System.out.println("Semua perulangan telah selesai dijalankan.");
        System.out.println("==========================================");
    }
}