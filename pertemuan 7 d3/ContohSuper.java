// ============================================================================
// CONTOH PEWARISAN DENGAN CONSTRUCTOR (Keyword 'super')
// Studi Kasus: Sistem Kampus (Manusia -> Mahasiswa)
// ============================================================================

// 1. SUPERCLASS (Class Induk)
class Manusia {
    String nama;
    int umur;

    // Constructor milik Class Induk
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void perkenalan() {
        System.out.println("Halo, nama saya " + this.nama + ", umur " + this.umur + " tahun.");
    }
}

// 2. SUBCLASS (Class Anak)
class Mahasiswa extends Manusia {
    String nim;
    String prodi;

    // Constructor milik Class Anak
    public Mahasiswa(String nama, int umur, String nim, String prodi) {
        // Kata kunci 'super' digunakan untuk memanggil Constructor milik Class Induk (Manusia)
        // Wajib ditulis di baris paling pertama di dalam constructor anak!
        super(nama, umur);
        
        // Mengisi atribut khusus milik Mahasiswa sendiri
        this.nim = nim;
        this.prodi = prodi;
    }

    // Method khusus milik Mahasiswa
    public void infoAkademik() {
        System.out.println("NIM  : " + this.nim);
        System.out.println("Prodi: " + this.prodi);
    }
}

// 3. CLASS UTAMA
public class ContohSuper {
    public static void main(String[] args) {
        System.out.println("=== DEMO PEWARISAN + CONSTRUCTOR (SUPER) ===");
        
        // Membuat objek Mahasiswa sekaligus mengisi atribut Induk (nama, umur) dan Anak (nim, prodi)
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", 19, "5230311001", "D3 Sistem Informasi");

        // Memanggil method yang diwariskan dari class Manusia
        mhs1.perkenalan();

        // Memanggil method khusus milik class Mahasiswa
        mhs1.infoAkademik();
    }
}
