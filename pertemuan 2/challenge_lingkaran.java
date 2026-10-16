/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 2: Challenge - Menghitung Luas & Keliling Lingkaran
 * File       : challenge_lingkaran.java
 * ============================================================================
 * Rumus Matematika:
 * - Luas Lingkaran     = phi * r * r   (atau phi * r^2)
 * - Keliling Lingkaran = 2 * phi * r
 * 
 * Konsep Penting:
 * - Penggunaan tipe data desimal (double) untuk perhitungan geometri.
 * - Penggunaan nilai konstanta (pi / Math.PI).
 * - Format penamaan file dan class di Java.
 * ============================================================================
 */

// Catatan Asdos Mengenai Konvensi Java:
// Sesuai Java Naming Conventions, nama class biasanya menggunakan format PascalCase (contoh: ChallengeLingkaran).
// Namun nama class di sini disesuaikan sama persis dengan nama file: challenge_lingkaran.
public class challenge_lingkaran {

    public static void main(String[] args) {
        // ==========================================
        // 1. DEKLARASI VARIABEL
        // ==========================================
        // Menggunakan double agar dapat menampung angka pecahan
        double pi;
        double jariJari; // Menggunakan camelCase
        double luas;
        double keliling;

        // ==========================================
        // 2. INISIALISASI NILAI (INPUT DATA)
        // ==========================================
        pi = 3.14;       // Nilai pi (Anda juga bisa menggunakan Math.PI untuk nilai lebih presisi)
        jariJari = 6;    // Nilai jari-jari lingkaran (r)

        // ==========================================
        // 3. PROSES PERHITUNGAN
        // ==========================================
        // Menghitung Luas: pi * r * r
        luas = pi * jariJari * jariJari;

        // Menghitung Keliling: 2 * pi * r
        keliling = 2 * pi * jariJari;

        // ==========================================
        // 4. MENAMPILKAN HASIL
        // ==========================================
        System.out.println("==========================================");
        System.out.println("     HASIL PERHITUNGAN LINGKARAN          ");
        System.out.println("==========================================");
        System.out.println("Jari-jari (r)      = " + jariJari);
        System.out.println("Konstanta Pi       = " + pi);
        System.out.println("------------------------------------------");
        System.out.println("Luas Lingkaran     = " + luas);
        System.out.println("Keliling Lingkaran = " + keliling);
        System.out.println("==========================================");
    }
}
