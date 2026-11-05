/**
 * ============================================================================
 * CHALLENGE PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 7 (D3): Pewarisan (Inheritance - Kata Kunci 'extends')
 * File       : Challenge.java (Kunci Jawaban & Referensi Asdos)
 * ============================================================================
 */

// 1. SUPERCLASS (CLASS INDUK)
class Produk {
    String namaProduk; // Atribut warisan: nama barang/produk
    int harga;         // Atribut warisan: harga awal produk

    // Method umum milik Class Induk yang otomatis diwariskan ke Class Anak
    void infoProduk() {
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Harga Awal      : Rp " + harga);
    }
}

// 2. SUBCLASS (CLASS ANAK)
// Menggunakan 'extends Produk' agar otomatis mewarisi 'namaProduk', 'harga', dan 'infoProduk()'
class ProdukDiskon extends Produk {
    int potongan; // Atribut tambahan khusus milik ProdukDiskon

    // Method khusus milik Class Anak untuk menghitung total bayar setelah diskon
    void hitungTotalBayar() {
        // Atribut 'harga' bisa langsung digunakan karena diwarisi dari class Produk
        int totalBayar = harga - potongan;
        System.out.println("Potongan Diskon : Rp " + potongan);
        System.out.println("Total Bayar     : Rp " + totalBayar);
    }
}

// 3. CLASS UTAMA (MAIN)
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== STRUK PEMBELIAN PRODUK ===");

        // Membuat objek dari Class Anak (ProdukDiskon)
        ProdukDiskon brg = new ProdukDiskon();

        // Mengisi atribut yang diwarisi dari Class Induk (Produk)
        brg.namaProduk = "Mouse Gaming";
        brg.harga = 150000;

        // Mengisi atribut khusus milik Class Anak (ProdukDiskon)
        brg.potongan = 30000;

        // Memanggil method warisan dari Class Induk (Produk)
        brg.infoProduk();

        // Memanggil method khusus milik Class Anak (ProdukDiskon)
        brg.hitungTotalBayar();
    }
}
