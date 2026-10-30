class Angka{
    private int angka1; // Atribut private 'angka1' hanya bisa diakses dari dalam class Angka
    private int angka2; // Atribut private 'angka2' hanya bisa diakses dari dalam class Angka

    public Angka() { // Constructor: method khusus yang otomatis dipanggil saat objek Angka pertama kali dibuat
        this.angka1 = 0; // Mengisi nilai awal atribut angka1 milik objek ini dengan nilai 0
        this.angka2 = 0; // Mengisi nilai awal atribut angka2 milik objek ini dengan nilai 0
    } 
    public void setAngka1(int angka1) { // Method public untuk mengatur nilai atribut angka1
        this.angka1 = angka1;
    }
    public void setAngka2(int angka2) { // Method public untuk mengatur nilai atribut angka2
        this.angka2 = angka2;
    }
    public int getAngka1() { // Method public untuk mendapatkan nilai atribut angka1
        return this.angka1;
    }
    public int getAngka2() { // Method public untuk mendapatkan nilai atribut angka2
        return this.angka2;
    }
    // Akhir dari blok constructor Angka
}
public class Main { // Mendeklarasikan class utama bernama Main (sesuai nama file Main.java)
    public static void main(String[] args) { // Method main: titik awal eksekusi program Java
        Angka angka = new Angka(); // Instansiasi objek: membuat objek baru bernama 'angka' dari class Angka (memanggil constructor)
        System.out.println("Nilai angka1: " + angka.getAngka1()); // Menampilkan nilai atribut angka1 milik objek 'angka' ke konsol
        angka.setAngka1(10); // Mengatur nilai atribut angka1 milik objek 'angka' menjadi 10
        angka.setAngka2(20); // Mengatur nilai atribut angka2 milik objek 'angka' menjadi 20
        System.out.println("Nilai angka1: " + angka.getAngka1()); // Menampilkan nilai atribut angka1 milik objek 'angka' ke konsol
        System.out.println("Nilai angka2: " + angka.getAngka2()); // Menampilkan nilai atribut angka2 milik objek 'angka' ke konsol
        int jumlah = angka.getAngka1() + angka.getAngka2(); // Menghitung jumlah dari atribut angka1 dan angka2 milik objek 'angka'
        System.out.println("Jumlah: " + jumlah); // Menampilkan hasil penjumlahan
    } // Akhir dari method main
} // Akhir dari class Main