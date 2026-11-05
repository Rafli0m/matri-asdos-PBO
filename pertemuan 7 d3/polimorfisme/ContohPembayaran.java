// ============================================================================
// CONTOH POLIMORFISME (METHOD OVERRIDING) - STUDI KASUS SISTEM PEMBAYARAN
// Konsep: Satu perintah method yang sama yaitu 'bayar()', tetapi cara kerja
//         dan outputnya berbeda-beda tergantung metode pembayarannya.
// ============================================================================

// 1. SUPERCLASS (Class Induk)
class Pembayaran {
    int nominal;

    void bayar() {
        System.out.println("Memproses pembayaran sebesar Rp " + nominal);
    }
}

// 2. SUBCLASS 1 (Class Anak - E-Wallet / Dana / GoPay)
class EWallet extends Pembayaran {
    @Override
    void bayar() {
        System.out.println("[E-Wallet] Berhasil potong saldo Rp " + nominal + " (Dapat Cashback Rp 2.000!)");
    }
}

// 3. SUBCLASS 2 (Class Anak - Transfer Bank)
class TransferBank extends Pembayaran {
    @Override
    void bayar() {
        int totalAdmin = nominal + 2500; // Tambah biaya admin bank Rp 2.500
        System.out.println("[Transfer Bank] Transfer Virtual Account Rp " + nominal + " + Admin Rp 2500 = Rp " + totalAdmin);
    }
}

// 4. SUBCLASS 3 (Class Anak - QRIS)
class Qris extends Pembayaran {
    @Override
    void bayar() {
        System.out.println("[QRIS] Scan QR Berhasil! Pembayaran Rp " + nominal + " lunas tanpa biaya admin.");
    }
}

// 5. CLASS UTAMA (MAIN)
public class ContohPembayaran {
    public static void main(String[] args) {
        System.out.println("=== DEMO POLIMORFISME: METODE PEMBAYARAN KASIR ===");

        // Objek 1: Pembayaran menggunakan E-Wallet
        EWallet transaksi1 = new EWallet();
        transaksi1.nominal = 50000;

        // Objek 2: Pembayaran menggunakan Transfer Bank
        TransferBank transaksi2 = new TransferBank();
        transaksi2.nominal = 100000;

        // Objek 3: Pembayaran menggunakan QRIS
        Qris transaksi3 = new Qris();
        transaksi3.nominal = 35000;

        // Perhatikan: Ketiga objek memanggil NAMA METHOD YANG SAMA PERSIS yaitu .bayar()
        // Namun hasilnya otomatis berbeda sesuai bentuk class masing-masing!
        transaksi1.bayar();
        transaksi2.bayar();
        transaksi3.bayar();
    }
}
