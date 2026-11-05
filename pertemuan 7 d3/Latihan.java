/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 7 (D3): Latihan Mandiri - Sistem Gaji Pegawai (Inheritance)
 * File       : Latihan.java (Kunci Jawaban
 * ============================================================================
 * SOAL LATIHAN MAHASISWA:
 * Buatlah program Java menggunakan konsep Pewarisan (Inheritance) untuk
 * menghitung total gaji pegawai di sebuah perusahaan dengan ketentuan:
 *
 * 1. Buat Superclass (Class Induk) bernama 'Pegawai':
 *    - Atribut : nama (String), gajiPokok (int)
 *    - Method  : infoPegawai() -> mencetak Nama dan Gaji Pokok
 *
 * 2. Buat Subclass 1 (Class Anak) bernama 'Manager' yang mewarisi 'Pegawai':
 *    - Atribut tambahan : tunjangan (int)
 *    - Method tambahan  : totalGajiManager() -> mencetak tunjangan dan
 *                         hasil penjumlahan (gajiPokok + tunjangan)
 *
 * 3. Buat Subclass 2 (Class Anak) bernama 'Kasir' yang mewarisi 'Pegawai':
 *    - Atribut tambahan : bonusLembur (int)
 *    - Method tambahan  : totalGajiKasir() -> mencetak bonus lembur dan
 *                         hasil penjumlahan (gajiPokok + bonusLembur)
 *
 * 4. Pada class utama (Main / Latihan):
 *    - Buat 1 objek Manager dan 1 objek Kasir, isi datanya, lalu tampilkan
 *      info pegawai beserta total gajinya ke layar!
 * ============================================================================
 */

// 1. SUPERCLASS (CLASS INDUK)
class Pegawai {
    String nama;
    int gajiPokok;

    void infoPegawai() {
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
    }
}

// 2. SUBCLASS 1 (CLASS ANAK - MANAGER)
class Manager extends Pegawai {
    int tunjangan; // Atribut khusus Manager

    void totalGajiManager() {
        // 'gajiPokok' bisa langsung dipakai di sini karena diwarisi dari class Pegawai
        int total = gajiPokok + tunjangan;
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Total Gaji   : Rp " + total);
    }
}

// 3. SUBCLASS 2 (CLASS ANAK - KASIR)
class Kasir extends Pegawai {
    int bonusLembur; // Atribut khusus Kasir

    void totalGajiKasir() {
        // 'gajiPokok' bisa langsung dipakai di sini karena diwarisi dari class Pegawai
        int total = gajiPokok + bonusLembur;
        System.out.println("Bonus Lembur : Rp " + bonusLembur);
        System.out.println("Total Gaji   : Rp " + total);
    }
}

// 4. CLASS UTAMA
public class Latihan {
    public static void main(String[] args) {
        System.out.println("=== DATA GAJI MANAGER ===");
        Manager mgr = new Manager();
        mgr.nama = "Andi Wijaya";       // Warisan dari Pegawai
        mgr.gajiPokok = 5000000;        // Warisan dari Pegawai
        mgr.tunjangan = 2000000;        // Milik Manager sendiri

        mgr.infoPegawai();              // Memanggil method warisan Pegawai
        mgr.totalGajiManager();         // Memanggil method milik Manager

        System.out.println("\n=== DATA GAJI KASIR ===");
        Kasir ksr = new Kasir();
        ksr.nama = "Siti Aminah";       // Warisan dari Pegawai
        ksr.gajiPokok = 3000000;        // Warisan dari Pegawai
        ksr.bonusLembur = 500000;       // Milik Kasir sendiri

        ksr.infoPegawai();              // Memanggil method warisan Pegawai
        ksr.totalGajiKasir();           // Memanggil method milik Kasir
    }
}
