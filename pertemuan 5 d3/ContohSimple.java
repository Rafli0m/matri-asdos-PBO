// ============================================================================
// CONTOH 1: Sepeda Motor (Aksi Nyata: Gas dan Rem)
// Sangat mudah dibayangkan: objek punya kecepatan yang bisa bertambah / berkurang
// ============================================================================
class Motor {
    // 1. ATRIBUT
    String merk;
    int kecepatan;

    // 2. CONSTRUCTOR
    Motor(String merk) {
        this.merk = merk;
        this.kecepatan = 0; // Kecepatan awal motor selalu 0 saat baru dinyalakan
    }

    // 3. METHOD VOID (Aksi: Menambah kecepatan)
    void gas(int tambah) {
        this.kecepatan += tambah;
        System.out.println(this.merk + " digas! Kecepatan sekarang: " + this.kecepatan + " km/jam");
    }

    // METHOD VOID (Aksi: Mengurangi kecepatan)
    void rem() {
        this.kecepatan = 0;
        System.out.println(this.merk + " direm sampai berhenti!");
    }
}

// ============================================================================
// CONTOH 2: Persegi Panjang (Sangat Jelas Membedakan 'void' dan 'return')
// ============================================================================
class PersegiPanjang {
    // 1. ATRIBUT
    int panjang;
    int lebar;

    // 2. CONSTRUCTOR
    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // 3. METHOD RETURN (Menghasilkan angka hasil hitungan)
    int hitungLuas() {
        return this.panjang * this.lebar;
    }

    // METHOD VOID (Hanya mencetak ke layar, tidak ada rumus/hasil balik)
    void info() {
        System.out.println("Panjang: " + this.panjang + " cm, Lebar: " + this.lebar + " cm");
        System.out.println("Luas   : " + hitungLuas() + " cm2");
    }
}

// ============================================================================
// CLASS UTAMA (MAIN)
// ============================================================================
public class ContohSimple {
    public static void main(String[] args) {
        System.out.println("=== 1. DEMO MOTOR ===");
        // Buat objek motor baru lewat constructor
        Motor motorRafli = new Motor("Honda Beat");
        
        motorRafli.gas(20); // gas bertambah 20
        motorRafli.gas(30); // gas bertambah lagi 30 (jadi 50)
        motorRafli.rem();    // berhenti (jadi 0)

        System.out.println("\n=== 2. DEMO PERSEGI PANJANG ===");
        // Buat objek persegi panjang (panjang = 10, lebar = 5)
        PersegiPanjang kotak = new PersegiPanjang(10, 5);

        // Panggil method void
        kotak.info();

        // Panggil method return, hasilnya bisa kita simpan ke variabel
        int luasKotak = kotak.hitungLuas();
        System.out.println("Hasil luas diambil ke variabel: " + luasKotak);
    }
}
