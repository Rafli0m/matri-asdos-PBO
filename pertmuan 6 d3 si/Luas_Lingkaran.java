class lingkarang { // Mendeklarasikan class 'lingkarang' sebagai blueprint objek lingkaran
    private double phi; // Atribut phi bertipe double dengan akses private (hanya bisa diakses di dalam class ini)
    private double r; // Atribut r (jari-jari) bertipe double dengan akses private (enkapsulasi data)

    public lingkarang() { // Constructor: otomatis dipanggil saat objek lingkarang dibuat untuk memberi nilai awal
        this.phi = 3.14; // Mengatur nilai default/awal atribut phi sebesar 3.14
        this.r = 0; // Mengatur nilai default/awal atribut jari-jari (r) sebesar 0
    } // Akhir dari constructor lingkarang

    // Getter and Setter for phi
    public double getPhi() { // Method Getter untuk mengambil/membaca nilai atribut private 'phi'
        return phi; // Mengembalikan nilai dari atribut 'phi'
    } // Akhir dari method getPhi

    public void setPhi(double phi) { // Method Setter untuk mengubah/mengatur nilai atribut private 'phi'
        this.phi = phi; // Mengisi atribut class 'this.phi' dengan nilai parameter 'phi' yang dikirimkan
    } // Akhir dari method setPhi

    // Getter and Setter for r
    public double getR() { // Method Getter untuk mengambil/membaca nilai atribut private jari-jari ('r')
        return r; // Mengembalikan nilai dari atribut 'r'
    } // Akhir dari method getR

    public void setR(double r) { // Method Setter untuk mengubah/mengatur nilai atribut private jari-jari ('r')
        this.r = r; // Mengisi atribut class 'this.r' dengan nilai parameter 'r' yang dikirimkan
    } // Akhir dari method setR
} // Akhir dari class lingkarang

public class Luas_Lingkaran { // Mendeklarasikan class utama Luas_Lingkaran (sesuai nama file Luas_Lingkaran.java)
    public static void main(String[] args) { // Method main: titik awal program dijalankan
        lingkarang lingkaran = new lingkarang(); // Membuat objek baru bernama 'lingkaran' dari class 'lingkarang'
        System.out.println("Phi: " + lingkaran.getPhi()); // Menampilkan nilai awal phi (3.14) menggunakan method Getter getPhi()
        lingkaran.setPhi(3.14); // Mengatur ulang nilai phi menjadi 3.14 menggunakan method Setter setPhi()
        System.out.println("Phi Set: " + lingkaran.getPhi()); // Menampilkan nilai phi setelah di-set (3.14)

        System.out.println("Jari-jari: " + lingkaran.getR()); // Menampilkan nilai awal jari-jari (0.0) menggunakan method Getter getR()
        lingkaran.setR(5); // Mengubah nilai jari-jari (r) menjadi 5 menggunakan method Setter setR()
        System.out.println("Jari-jari Set: " + lingkaran.getR()); // Menampilkan nilai jari-jari terbaru (5.0) setelah di-set

        double luas = lingkaran.getPhi() * lingkaran.getR() * lingkaran.getR(); // Menghitung luas lingkaran (phi * r^2)
        System.out.println("Luas Lingkaran: " + luas); // Menampilkan hasil perhitungan luas lingkaran (78.5) ke layar
    } // Akhir dari method main
} // Akhir dari class Luas_Lingkaran
