// ============================================================================
// 1. MEMBUAT CLASS (Cetak Biru)
// ============================================================================
class Mahasiswa {
    // ATRIBUT (Data yang dimiliki setiap mahasiswa)
    String nama;
    String nim;
    double nilaiUts;
    double nilaiUas;

    // 2. CONSTRUCTOR (Otomatis jalan saat objek dibuat dengan kata kunci 'new')
    // Gunakan 'this.' untuk membedakan variabel milik class dengan parameter
    Mahasiswa(String nama, String nim, double nilaiUts, double nilaiUas) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    // 3. METHOD RETURN (Menghitung nilai rata-rata akhir dan mengembalikan nilainya)
    double hitungNilaiAkhir() {
        return (this.nilaiUts + this.nilaiUas) / 2;
    }

    // 4. METHOD VOID (Hanya bertugas menampilkan informasi ke layar)
    void info() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("NIM         : " + this.nim);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("---------------------------------");
    }
}

// ============================================================================
// CLASS UTAMA (Tempat Program Dijalankan)
// ============================================================================
public class Main {
    public static void main(String[] args) {
        // MEMBUAT OBJEK DARI CLASS MAHASISWA (Instansiasi)
        Mahasiswa mhs1 = new Mahasiswa("Rafli", "5230411091", 85, 90);
        Mahasiswa mhs2 = new Mahasiswa("Dika", "5230411095", 75, 80);
        Mahasiswa mhs3 = new Mahasiswa("Putra", "5230411104", 90, 95);

        // MEMANGGIL METHOD DARI MASING-MASING OBJEK
        System.out.println("=== DATA MAHASISWA ===");
        mhs1.info();
        mhs2.info();
        mhs3.info();

        // Contoh mengambil nilai dari method return secara langsung:
        System.out.println("Nilai akhir khusus Rafli: " + mhs1.hitungNilaiAkhir());
    }
}
