/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 4 (D3): Pengenalan Konsep Dasar OOP (Class, Object, Constructor, Method)
 * File       : Main.java
 * ============================================================================
 * Konsep Utama PBO yang Dipelajari:
 * 1. CLASS (Cetak Biru / Blueprint):
 *    Mendefinisikan atribut (ciri-ciri) dan method (perilaku) dari suatu entitas.
 * 2. OBJECT (Objek / Instance):
 *    Wujud nyata dari sebuah class di memori komputer, dibuat menggunakan keyword 'new'.
 * 3. ATRIBUT (Fields / Variabel Instance):
 *    Variabel yang melekat pada objek untuk menyimpan data (misal: merk, warna, tahunProduksi).
 * 4. CONSTRUCTOR (Konstruktor):
 *    Method khusus yang dipanggil otomatis saat objek pertama kali dibuat ('new'),
 *    berguna untuk mengisi nilai awal (inisialisasi) atribut.
 * 5. KEYWORD 'this':
 *    Merujuk ke atribut milik objek saat ini, digunakan untuk membedakan nama
 *    parameter constructor dengan nama atribut class.
 * 6. METHOD (Perilaku / Behavior):
 *    Fungsi di dalam class untuk melakukan tindakan tertentu (misal: tampilkanInfo()).
 * ============================================================================
 */

public class Main {

    /**
     * DEFINISI CLASS MOBIL (Blueprint Objek)
     * 
     * CATATAN ASDOS:
     * Mengapa menggunakan 'static class'?
     * Karena class Mobil berada DI DALAM class Main (Nested Class).
     * Dengan menjadikannya 'static', kita dapat langsung membuat objek dengan:
     *   Mobil mobil1 = new Mobil(...);
     * TANPA harus membuat objek Main terlebih dahulu (menghindari sintaks rumit: main.new Mobil(...)).
     */
    static class Mobil {
        // --- 1. ATRIBUT (State / Ciri-ciri Mobil) ---
        String merk;
        String warna;
        int tahunProduksi;

        /**
         * --- 2. CONSTRUCTOR (Konstruktor) ---
         * Ciri-ciri constructor:
         * - Namanya HARUS SAMA PERSIS dengan nama class (Mobil).
         * - TIDAK memiliki tipe return (tidak ada void, int, String, dll).
         * - Dipanggil otomatis saat keyword 'new' dieksekusi.
         * 
         * Parameter:
         * @param merk          Merk dari mobil (contoh: Toyota)
         * @param warna         Warna mobil (contoh: Merah)
         * @param tahunProduksi Tahun produksi mobil (contoh: 2020)
         */
        Mobil(String merk, String warna, int tahunProduksi) {
            // Penggunaan 'this.merk' merujuk ke atribut class Mobil di atas,
            // sedangkan 'merk' merujuk ke parameter yang dikirim melalui constructor.
            this.merk = merk;
            this.warna = warna;
            this.tahunProduksi = tahunProduksi;
        }

        /**
         * --- 3. METHOD (Behavior / Perilaku Objek) ---
         * Method ini bertugas mencetak spesifikasi informasi dari mobil ke layar console.
         */
        void tampilkanInfo() {
            System.out.println("Merk           : " + this.merk);
            System.out.println("Warna          : " + this.warna);
            System.out.println("Tahun Produksi : " + this.tahunProduksi);
        }
    }

    /**
     * MAIN METHOD: Tempat program mulai dijalankan
     */
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     DEMO PEMROGRAMAN BERORIENTASI OBJEK  ");
        System.out.println("         (CLASS DAN OBJECT MOBIL)         ");
        System.out.println("==========================================");

        // --- 4. INSTANSIASI OBJEK (Menciptakan Objek dari Class) ---
        // Format: NamaClass namaObjek = new NamaClass(argumen...);
        Mobil mobil1 = new Mobil("Toyota", "Merah", 2020);
        Mobil mobil2 = new Mobil("Honda", "Hitam", 2019);
        Mobil mobil3 = new Mobil("Suzuki", "Biru", 2021);

        // --- 5. MEMANGGIL METHOD OBJEK ---
        System.out.println("\n--- Informasi Mobil 1 ---");
        mobil1.tampilkanInfo();

        System.out.println("\n--- Informasi Mobil 2 ---");
        mobil2.tampilkanInfo();

        System.out.println("\n--- Informasi Mobil 3 ---");
        mobil3.tampilkanInfo();

        System.out.println("\n==========================================");
        System.out.println("Ketiga objek mobil berhasil dibuat dan ditampilkan!");
        System.out.println("==========================================");
    }
}