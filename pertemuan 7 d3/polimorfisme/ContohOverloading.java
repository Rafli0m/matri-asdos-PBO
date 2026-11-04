// ============================================================================
// CONTOH 2: POLIMORFISME STATIS (METHOD OVERLOADING)
// Konsep: Di dalam 1 Class yang sama, kita boleh membuat beberapa method
//         dengan NAMA YANG SAMA PERSIS, asalkan JUMLAH atau TIPE PARAMETERNYA BERBEDA.
// ============================================================================

class Kalkulator {

    // Bentuk 1: Menjumlahkan 2 angka bulat (int)
    int tambah(int a, int b) {
        return a + b;
    }

    // Bentuk 2: Nama method tetap 'tambah', tapi menerima 3 angka bulat (int)
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Bentuk 3: Nama method tetap 'tambah', tapi menerima angka desimal (double)
    double tambah(double a, double b) {
        return a + b;
    }
}

public class ContohOverloading {
    public static void main(String[] args) {
        System.out.println("=== DEMO METHOD OVERLOADING ===");
        Kalkulator calc = new Kalkulator();

        // Java otomatis pintar memilih method 'tambah' mana yang cocok
        // berdasarkan parameter yang kita masukkan!
        System.out.println("Tambah 2 angka int    : " + calc.tambah(10, 20));
        System.out.println("Tambah 3 angka int    : " + calc.tambah(10, 20, 30));
        System.out.println("Tambah 2 angka double : " + calc.tambah(5.5, 2.3));
    }
}
