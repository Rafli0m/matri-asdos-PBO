class Data { // Mendeklarasikan class bernama Data sebagai blueprint/cetakan objek
    public int angkapublic; // Atribut dengan access modifier 'public' (bisa diakses langsung dari luar class)
    private int angkaprivate; // Atribut dengan access modifier 'private' (hanya bisa diakses dari dalam class Data ini saja / Enkapsulasi)

    public Data() { // Constructor: method khusus yang otomatis dipanggil saat objek Data pertama kali dibuat
        this.angkapublic = 10; // Mengisi nilai awal atribut angkapublic milik objek ini dengan nilai 10
        this.angkaprivate = 0; // Mengisi nilai awal atribut angkaprivate milik objek ini dengan nilai 0
    } // Akhir dari blok constructor Data

    // Getter and Setter for angkaprivate
    public int getAngkaprivate() { // Method Getter (bertipe int): digunakan untuk membaca/mengambil nilai atribut private 'angkaprivate'
        return angkaprivate; // Mengembalikan nilai dari variabel 'angkaprivate' ke pemanggil method
    } // Akhir dari method getAngkaprivate

    // Setter for angkaprivate
    public void setAngkaprivate(int angkaprivate) { // Method Setter (void/tanpa nilai balik): digunakan untuk mengubah/mengisi nilai atribut private 'angkaprivate'
        this.angkaprivate = angkaprivate; // 'this.angkaprivate' merujuk pada atribut class, diisi dengan nilai parameter 'angkaprivate' yang baru
    } // Akhir dari method setAngkaprivate
} // Akhir dari class Data

public class Latihan { // Mendeklarasikan class utama bernama Main (nama class public harus sama dengan nama file Main.java)
    public static void main(String[] args) { // Method main: titik awal (entry point) eksekusi program Java
        Data data = new Data(); // Instansiasi objek: membuat objek baru bernama 'data' dari class Data (memanggil constructor)
        System.out.println("Angka Public: " + data.angkapublic); // Menampilkan nilai awal 'angkapublic' (10) secara langsung karena bersifat public
        data.angkapublic = 20; // Mengubah nilai 'angkapublic' secara langsung menjadi 20 (bisa dilakukan karena public)
        System.out.println("Angka Public: " + data.angkapublic); // Menampilkan nilai 'angkapublic' setelah diubah (20)
        System.out.println("Angka Private: " + data.getAngkaprivate()); // Menampilkan nilai awal 'angkaprivate' (0) menggunakan method Getter (tidak bisa data.angkaprivate langsung)

        data.setAngkaprivate(30); // Mengubah nilai 'angkaprivate' menjadi 30 menggunakan method Setter
        System.out.println("Angka Private Set: " + data.getAngkaprivate()); // Menampilkan nilai 'angkaprivate' yang sudah diubah (30) menggunakan method Getter
    } // Akhir dari method main
} // Akhir dari class Main
