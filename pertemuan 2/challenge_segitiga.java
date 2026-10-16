/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 2: Challenge - Menghitung Luas & Keliling Segitiga
 * File       : challenge_segitiga.java
 * ============================================================================
 * Rumus Matematika:
 * - Luas Segitiga     = 0.5 * alas * tinggi  (atau (alas * tinggi) / 2)
 * - Keliling Segitiga = 3 * sisi             (untuk segitiga sama sisi)
 * 
 * Konsep Penting & Tips Asdos:
 * - Hati-hati saat menulis pecahan di Java!
 *   Jika menulis "1 / 2 * alas * tinggi", Java akan mengevaluasi (1 / 2)
 *   sebagai integer division yang bernilai 0, sehingga hasil luas menjadi 0!
 *   Selalu gunakan "0.5" atau "1.0 / 2.0" atau "(alas * tinggi) / 2.0".
 * ============================================================================
 */

public class challenge_segitiga {

    public static void main(String[] args) {
        // ==========================================
        // 1. DEKLARASI VARIABEL
        // ==========================================
        double alas;
        double tinggi;
        double sisi;
        double luas;
        double keliling;

        // ==========================================
        // 2. INISIALISASI NILAI (INPUT DATA)
        // ==========================================
        alas = 10.0;
        tinggi = 5.0;
        sisi = 7.0; // Asumsi segitiga sama sisi (ketiga sisi sama panjang)

        // ==========================================
        // 3. PROSES PERHITUNGAN
        // ==========================================
        // Menggunakan 0.5 untuk menghindari integer division bug
        luas = 0.5 * alas * tinggi;

        // Keliling segitiga sama sisi: sisi + sisi + sisi (atau 3 * sisi)
        keliling = 3 * sisi;

        // ==========================================
        // 4. MENAMPILKAN HASIL
        // ==========================================
        System.out.println("==========================================");
        System.out.println("      HASIL PERHITUNGAN SEGITIGA          ");
        System.out.println("==========================================");
        System.out.println("Alas               = " + alas);
        System.out.println("Tinggi             = " + tinggi);
        System.out.println("Panjang Sisi       = " + sisi);
        System.out.println("------------------------------------------");
        System.out.println("Luas Segitiga      = " + luas);
        System.out.println("Keliling Segitiga  = " + keliling);
        System.out.println("==========================================");
    }
}
