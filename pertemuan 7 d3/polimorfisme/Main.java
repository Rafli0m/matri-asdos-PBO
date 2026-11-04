// ============================================================================
// CONTOH 1: POLIMORFISME DINAMIS (METHOD OVERRIDING)
// Konsep: Satu nama method yang SAMA ('bersuara()'), tetapi menghasilkan
//         perilaku/bentuk yang BERBEDA-BEDA tergantung objek anaknya.
// ============================================================================

// 1. SUPERCLASS (Class Induk)
class Hewan {
    // Method umum di class induk
    void bersuara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

// 2. SUBCLASS 1 (Class Anak - Kucing)
class Kucing extends Hewan {
    // @Override menandakan bahwa kita MENIMPA / MENGUBAH isi method 'bersuara()'
    // milik class Induk (Hewan) dengan versi khusus milik Kucing
    @Override
    void bersuara() {
        System.out.println("Kucing : Meong... Meong!");
    }
}

// 3. SUBCLASS 2 (Class Anak - Anjing)
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing : Guk... Guk!");
    }
}

// 4. SUBCLASS 3 (Class Anak - Sapi)
class Sapi extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Sapi   : Moooo...!");
    }
}

// 5. CLASS UTAMA (MAIN)
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO POLIMORFISME (BANYAK BENTUK) ===");

        // Perhatikan: Tipe datanya semua menggunakan Class Induk ('Hewan'),
        // namun isi objeknya berbeda-beda (Kucing, Anjing, Sapi)
        Hewan hewanUmum = new Hewan();
        Hewan hewan1    = new Kucing(); // Wujud 1: Hewan berbentuk Kucing
        Hewan hewan2    = new Anjing(); // Wujud 2: Hewan berbentuk Anjing
        Hewan hewan3    = new Sapi();   // Wujud 3: Hewan berbentuk Sapi

        // Kita memanggil nama method yang SAMA PERSIS yaitu .bersuara()
        // Tapi hasilnya otomatis menyesuaikan bentuk objek masing-masing!
        hewanUmum.bersuara();
        hewan1.bersuara();
        hewan2.bersuara();
        hewan3.bersuara();
    }
}
