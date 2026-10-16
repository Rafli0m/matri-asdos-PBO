/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 1: Pengenalan Dasar Java
 * File       : HalloWorld.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Memahami struktur paling dasar dari program Java.
 * 2. Memahami fungsi class dan method utama (main method).
 * 3. Mengetahui cara menampilkan output ke layar console menggunakan System.out.println.
 * ============================================================================
 */

// 1. DEFINISI KELAS (CLASS)
// Aturan Java: Nama public class HARUS SAMA PERSIS dengan nama file (HalloWorld.java).
// Kata kunci 'public' berarti class ini dapat diakses dari mana saja.
// Kata kunci 'class' digunakan untuk membuat sebuah kelas.
public class HalloWorld {

    /**
     * 2. MAIN METHOD (Fungsi Utama)
     * Ini adalah titik awal (entry point) eksekusi setiap program aplikasi Java.
     * Tanpa method ini, program Java tidak bisa dijalankan secara langsung.
     * 
     * Penjelasan kata kunci:
     * - public : Method dapat diakses oleh JVM (Java Virtual Machine) dari luar class.
     * - static : Method dapat dipanggil tanpa harus membuat objek (instansiasi) terlebih dahulu.
     * - void   : Method ini tidak mengembalikan nilai apapun (no return value).
     * - main   : Nama method standar yang dicari pertama kali oleh JVM.
     * - String[] args : Parameter berupa array string untuk menampung argumen baris perintah (command line arguments).
     */
    public static void main(String[] args) {
        
        // 3. MENAMPILKAN OUTPUT
        // System.out.println digunakan untuk mencetak teks ke layar console.
        // Setelah teks dicetak, kursor akan otomatis berpindah ke baris baru (newline / enter).
        // Setiap baris perintah di Java WAJIB diakhiri dengan tanda titik-koma (;).
        System.out.println("Hallo, World!!!");
        
    } // Akhir dari method main
    
} // Akhir dari class HalloWorld
