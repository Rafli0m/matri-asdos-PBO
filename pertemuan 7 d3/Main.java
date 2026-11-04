// ============================================================================
// 1. SUPERCLASS (CLASS INDUK / ORANG TUA)
// Berisi atribut dan method umum yang dimiliki oleh SEMUA jenis kendaraan
// ============================================================================
class Kendaraan {
    String merk;        // Atribut umum yang akan diwariskan ke class anak
    int kecepatan;      // Atribut umum yang akan diwariskan ke class anak

    // Method umum yang otomatis dimiliki oleh semua class anak
    void jalan() {
        System.out.println(merk + " sedang berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    void klakson() {
        System.out.println(merk + " membunyikan klakson: Tiiin! Tiiin!");
    }
}

// ============================================================================
// 2. SUBCLASS 1 (CLASS ANAK PERTAMA)
// Kata kunci 'extends' artinya class Mobil MEWARISI semua isi dari Kendaraan
// ============================================================================
class Mobil extends Kendaraan {
    // Kita TIDAK PERLU menulis ulang atribut 'merk' dan 'kecepatan' karena sudah diwarisi!
    
    int jumlahPintu;    // Atribut khusus yang HANYA dimiliki oleh Mobil

    // Method khusus yang HANYA dimiliki oleh Mobil
    void nyalakanAC() {
        System.out.println("AC di mobil " + merk + " (" + jumlahPintu + " pintu) dinyalakan. Dingin!");
    }
}

// ============================================================================
// 3. SUBCLASS 2 (CLASS ANAK KEDUA)
// Class Motor juga mewarisi atribut dan method dari Kendaraan
// ============================================================================
class Motor extends Kendaraan {
    // Otomatis punya 'merk', 'kecepatan', 'jalan()', dan 'klakson()' dari Kendaraan

    // Method khusus yang HANYA dimiliki oleh Motor
    void standarTengah() {
        System.out.println("Motor " + merk + " dipasang standar tengah saat parkir.");
    }
}

// ============================================================================
// 4. CLASS UTAMA (MAIN) - TEMPAT MENJALANKAN PROGRAM
// ============================================================================
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. OBJEK MOBIL (Anak dari Kendaraan) ===");
        Mobil mobil1 = new Mobil();
        
        // Mengisi atribut warisan dari class Kendaraan
        mobil1.merk = "Toyota Avanza";
        mobil1.kecepatan = 80;
        // Mengisi atribut milik class Mobil sendiri
        mobil1.jumlahPintu = 4;

        // Memanggil method warisan dari class Kendaraan
        mobil1.jalan();
        mobil1.klakson();
        // Memanggil method khusus milik class Mobil sendiri
        mobil1.nyalakanAC();

        System.out.println("\n=== 2. OBJEK MOTOR (Anak dari Kendaraan) ===");
        Motor motor1 = new Motor();
        
        // Mengisi atribut warisan dari class Kendaraan
        motor1.merk = "Honda Vario";
        motor1.kecepatan = 60;

        // Memanggil method warisan dari class Kendaraan
        motor1.jalan();
        // Memanggil method khusus milik class Motor sendiri
        motor1.standarTengah();
    }
}
