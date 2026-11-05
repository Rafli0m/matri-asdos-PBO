// ============================================================================
// CONTOH POLIMORFISME (METHOD OVERRIDING) - RUMUS BANGUN DATAR
// Konsep: Semua bangun datar memiliki method bernama sama yaitu 'hitungLuas()',
//         tetapi isi rumusnya BERBEDA-BEDA di setiap class anak.
// ============================================================================

// 1. SUPERCLASS (Class Induk)
class BangunDatar {
    void hitungLuas() {
        System.out.println("Menghitung luas bangun datar...");
    }
}

// 2. SUBCLASS 1 (Class Anak - Persegi)
class Persegi extends BangunDatar {
    int sisi;

    // Menimpa method hitungLuas() dengan rumus Persegi (sisi x sisi)
    @Override
    void hitungLuas() {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi (sisi " + sisi + ")                 = " + luas);
    }
}

// 3. SUBCLASS 2 (Class Anak - Persegi Panjang)
class PersegiPanjang extends BangunDatar {
    int panjang;
    int lebar;

    // Menimpa method hitungLuas() dengan rumus Persegi Panjang (panjang x lebar)
    @Override
    void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang (" + panjang + " x " + lebar + ")          = " + luas);
    }
}

// 4. SUBCLASS 3 (Class Anak - Segitiga)
class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    // Menimpa method hitungLuas() dengan rumus Segitiga (0.5 x alas x tinggi)
    @Override
    void hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga (0.5 x " + alas + " x " + tinggi + ")   = " + luas);
    }
}

// 5. CLASS UTAMA (MAIN)
public class ContohBangunDatar {
    public static void main(String[] args) {
        System.out.println("=== DEMO POLIMORFISME: HITUNG LUAS BANGUN DATAR ===");

        // 1. Objek Persegi
        Persegi p = new Persegi();
        p.sisi = 5;

        // 2. Objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 8;
        pp.lebar = 4;

        // 3. Objek Segitiga
        Segitiga s = new Segitiga();
        s.alas = 10;
        s.tinggi = 6;

        // Memanggil nama method yang SAMA PERSIS (.hitungLuas()),
        // tapi rumus yang dijalankan berbeda-beda sesuai bentuk objeknya!
        p.hitungLuas();
        pp.hitungLuas();
        s.hitungLuas();
    }
}
