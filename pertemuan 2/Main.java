/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 2: Variabel, Tipe Data, dan Penggabungan String (Concatenation)
 * File       : Main.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Memahami konsep variabel sebagai tempat penyimpanan data di memori.
 * 2. Mengenal tipe data dasar di Java:
 *    - String : Menyimpan kumpulan teks/karakter (diapit tanda kutip dua "").
 *    - int    : Menyimpan bilangan bulat (tanpa pecahan/koma).
 *    - double : Menyimpan bilangan desimal / berkoma (menggunakan tanda titik .).
 * 3. Memahami cara penggabungan teks (String concatenation) dengan operator '+'.
 * ============================================================================
 */

public class Main {

    public static void main(String[] args) {
        // ==========================================
        // 1. DEKLARASI & INISIALISASI VARIABEL
        // ==========================================
        // Format: TipeData namaVariabel = nilaiAwal;

        // Tipe data teks (objek String)
        String nama = "Rafli Maulana";
        
        // CATATAN ASDOS:
        // Kenapa NPM menggunakan String bukan int?
        // 1. NPM tidak dipakai untuk perhitungan matematika (tambah/kurang/kali/bagi).
        // 2. Jika ada NPM yang diawali angka 0 (misal: 0812...), tipe int akan menghilangkan angka 0 di depan.
        // 3. Digit NPM bisa melebihi batas tampung tipe int (maksimal ~2 miliar).
        String npm = "5230411091";
        
        // Tipe data bilangan bulat (integer)
        int umur = 22;
        
        String jurusan = "Informatika";
        
        // Tipe data bilangan desimal (floating-point double precision)
        // Standar penamaan Java menggunakan camelCase (contoh: targetIpk)
        double targetIpk = 3.8; 

        // ==========================================
        // 2. MENAMPILKAN DATA DENGAN FORMAT RAPI
        // ==========================================
        // Menggunakan operator '+' untuk menggabungkan label keterangan dengan nilai variabel
        System.out.println("==========================================");
        System.out.println("          BIODATA MAHASISWA               ");
        System.out.println("==========================================");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("NPM          : " + npm);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Jurusan      : " + jurusan);
        System.out.println("Target IPK   : " + targetIpk);
        System.out.println("==========================================");
    }
}