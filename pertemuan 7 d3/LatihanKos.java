/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 7 (D3): Latihan Pewarisan (Inheritance) - Tagihan Kamar Kos
 * File       : LatihanKos.java 
 * ============================================================================
 * KETENTUAN SOAL:
 * 1. Buat Superclass 'KamarKos':
 *    - Atribut : namaPenghuni (String), nomorKamar (int), hargaSewa (int)
 *    - Method  : infoKamar() -> menampilkan Nama Penghuni, Nomor Kamar,
 *                               dan Harga Sewa Pokok
 *
 * 2. Buat Subclass 1 'KamarAC' yang mewarisi 'KamarKos' (extends):
 *    - Atribut tambahan : biayaListrikAC (int)
 *    - Method tambahan  : totalKamarAC() -> menampilkan Biaya Listrik AC dan
 *                         Total Tagihan (hargaSewa + biayaListrikAC)
 *
 * 3. Buat Subclass 2 'KamarSubsidi' yang mewarisi 'KamarKos' (extends):
 *    - Atribut tambahan : potonganBeasiswa (int)
 *    - Method tambahan  : totalKamarSubsidi() -> menampilkan Potongan dan
 *                         Total Tagihan (hargaSewa - potonganBeasiswa)
 * ============================================================================
 */

// 1. SUPERCLASS (CLASS INDUK)
class KamarKos {
    String namaPenghuni; // Atribut 1: Nama mahasiswa penghuni kos
    int nomorKamar;      // Atribut 2: Nomor kamar kos
    int hargaSewa;       // Atribut 3: Harga sewa kamar per bulan

    // Method umum milik Class Induk (otomatis diwariskan ke semua class anak)
    void infoKamar() {
        System.out.println("Nama Penghuni : " + namaPenghuni);
        System.out.println("Nomor Kamar   : Kamar " + nomorKamar);
        System.out.println("Harga Pokok   : Rp " + hargaSewa);
    }
}

// 2. SUBCLASS 1 (CLASS ANAK PERTAMA - KAMAR AC)
class KamarAC extends KamarKos {
    int biayaListrikAC; // Atribut khusus KamarAC: tambahan biaya listrik AC

    void totalKamarAC() {
        // 'hargaSewa' langsung bisa dipakai karena diwarisi dari class KamarKos
        int totalBayar = hargaSewa + biayaListrikAC;
        System.out.println("Biaya AC      : Rp " + biayaListrikAC);
        System.out.println("Total Tagihan : Rp " + totalBayar);
    }
}

// 3. SUBCLASS 2 (CLASS ANAK KEDUA - KAMAR SUBSIDI / DISKON)
class KamarSubsidi extends KamarKos {
    int potonganBeasiswa; // Atribut khusus KamarSubsidi: potongan harga kos

    void totalKamarSubsidi() {
        // 'hargaSewa' langsung bisa dipakai karena diwarisi dari class KamarKos
        int totalBayar = hargaSewa - potonganBeasiswa;
        System.out.println("Potongan Kos  : Rp " + potonganBeasiswa);
        System.out.println("Total Tagihan : Rp " + totalBayar);
    }
}

// 4. CLASS UTAMA (MAIN)
public class LatihanKos {
    public static void main(String[] args) {
        System.out.println("=== TAGIHAN 1: KAMAR KOS AC ===");
        KamarAC kos1 = new KamarAC();
        kos1.namaPenghuni = "Rizky Pratama"; // Warisan dari KamarKos
        kos1.nomorKamar = 101;               // Warisan dari KamarKos
        kos1.hargaSewa = 800000;             // Warisan dari KamarKos
        kos1.biayaListrikAC = 200000;        // Atribut khusus KamarAC

        kos1.infoKamar();                    // Method warisan KamarKos
        kos1.totalKamarAC();                 // Method khusus KamarAC

        System.out.println("\n=== TAGIHAN 2: KAMAR KOS SUBSIDI ===");
        KamarSubsidi kos2 = new KamarSubsidi();
        kos2.namaPenghuni = "Dimas Anggara"; // Warisan dari KamarKos
        kos2.nomorKamar = 204;               // Warisan dari KamarKos
        kos2.hargaSewa = 600000;             // Warisan dari KamarKos
        kos2.potonganBeasiswa = 150000;      // Atribut khusus KamarSubsidi

        kos2.infoKamar();                    // Method warisan KamarKos
        kos2.totalKamarSubsidi();            // Method khusus KamarSubsidi
    }
}
