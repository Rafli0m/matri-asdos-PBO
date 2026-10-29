class persegi_panjang { // Mendeklarasikan class persegi_panjang untuk merepresentasikan objek bangun datar persegi panjang
    private double panjang; // Atribut panjang bertipe double (bilangan desimal) dengan akses private (enkapsulasi)
    private double lebar; // Atribut lebar bertipe double (bilangan desimal) dengan akses private (enkapsulasi)

    public persegi_panjang() { // Constructor: dieksekusi otomatis saat objek persegi_panjang dibuat
        this.panjang = 0; // Menginisialisasi nilai awal atribut panjang menjadi 0
        this.lebar = 0; // Menginisialisasi nilai awal atribut lebar menjadi 0
    } // Akhir dari constructor persegi_panjang

    // Getter and Setter for panjang
    public double getPanjang() { // Method Getter untuk mengambil/membaca nilai atribut private 'panjang'
        return panjang; // Mengembalikan nilai atribut 'panjang' yang bertipe double
    } // Akhir dari method getPanjang

    public void setPanjang(double panjang) { // Method Setter untuk mengubah/mengatur nilai atribut private 'panjang'
        this.panjang = panjang; // Menyimpan nilai parameter 'panjang' ke dalam atribut class 'this.panjang'
    } // Akhir dari method setPanjang

    // Getter and Setter for lebar
    public double getLebar() { // Method Getter untuk mengambil/membaca nilai atribut private 'lebar'
        return lebar; // Mengembalikan nilai atribut 'lebar' yang bertipe double
    } // Akhir dari method getLebar

    public void setLebar(double lebar) { // Method Setter untuk mengubah/mengatur nilai atribut private 'lebar'
        this.lebar = lebar; // Menyimpan nilai parameter 'lebar' ke dalam atribut class 'this.lebar'
    } // Akhir dari method setLebar
} // Akhir dari class persegi_panjang

public class Contoh { // Mendeklarasikan class utama bernama Contoh (sesuai dengan nama file Contoh.java)
    public static void main(String[] args) { // Method main: fungsi utama yang pertama kali dijalankan oleh Java
        persegi_panjang persegi = new persegi_panjang(); // Membuat objek bernama 'persegi' dari class persegi_panjang
        System.out.println("Panjang: " + persegi.getPanjang()); // Mencetak nilai awal panjang (0.0) dengan memanggil method getPanjang()
        System.out.println("Lebar: " + persegi.getLebar()); // Mencetak nilai awal lebar (0.0) dengan memanggil method getLebar()

        persegi.setPanjang(10); // Mengubah nilai atribut panjang menjadi 10 melalui method setPanjang()
        persegi.setLebar(5); // Mengubah nilai atribut lebar menjadi 5 melalui method setLebar()
        System.out.println("Panjang Set: " + persegi.getPanjang()); // Mencetak nilai panjang terbaru (10.0) setelah di-set
        System.out.println("Lebar Set: " + persegi.getLebar()); // Mencetak nilai lebar terbaru (5.0) setelah di-set

        double luas = persegi.getPanjang() * persegi.getLebar(); // Menghitung luas persegi panjang (panjang * lebar) dengan mengambil nilai lewat Getter
        System.out.println("Luas Persegi Panjang: " + luas); // Menampilkan hasil perhitungan luas persegi panjang (50.0) ke layar
    } // Akhir dari method main
} // Akhir dari class Contoh
