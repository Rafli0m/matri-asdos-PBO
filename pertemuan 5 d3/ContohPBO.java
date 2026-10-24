// ============================================================================
// CONTOH 1: Karakter Game (Mudah dipahami, seru, dan relatable)
// ============================================================================

class KarakterGame {
    // 1. ATRIBUT (Ciri-ciri / Data yang dimiliki karakter)
    String nama;
    int healthPoint;
    int attackPower;

    // 2. CONSTRUCTOR (Dijalankan otomatis saat karakter dibuat dengan 'new')
    KarakterGame(String nama, int healthPoint, int attackPower) {
        // Keyword 'this' merujuk ke atribut milik class ini,
        // membedakannya dari parameter yang ada di dalam tanda kurung ()
        this.nama = nama;
        this.healthPoint = healthPoint;
        this.attackPower = attackPower;
    }

    // 3. METHOD VOID (Hanya menjalankan aksi cetak, tidak mengembalikan nilai)
    void serang(KarakterGame musuh) {
        System.out.println(this.nama + " menebas " + musuh.nama + " dengan kekuatan " + this.attackPower + " DMG!");
        musuh.terimaDamage(this.attackPower);
    }

    void terimaDamage(int damage) {
        this.healthPoint -= damage;
        if (this.healthPoint < 0) {
            this.healthPoint = 0;
        }
        System.out.println(this.nama + " menerima " + damage + " DMG. Sisa HP: " + this.healthPoint);
    }

    // 4. METHOD RETURN (Mengembalikan nilai boolean untuk dicek)
    boolean isAlive() {
        return this.healthPoint > 0;
    }

    void infoStatus() {
        System.out.println("---------------------------------");
        System.out.println("Nama Karakter : " + this.nama);
        System.out.println("HP             : " + this.healthPoint);
        System.out.println("Status         : " + (isAlive() ? "Masih Hidup" : "KO / Kalah"));
        System.out.println("---------------------------------");
    }
}

// ============================================================================
// CONTOH 2: Dompet Digital / E-Wallet (Studi Kasus Keuangan Sehari-hari)
// ============================================================================

class EWallet {
    String pemilik;
    String nomorHp;
    double saldo;

    // Constructor 1: Pengguna baru dengan saldo awal 0 (Default)
    EWallet(String pemilik, String nomorHp) {
        this.pemilik = pemilik;
        this.nomorHp = nomorHp;
        this.saldo = 0.0;
    }

    // Constructor 2 (Overloading): Pengguna yang langsung top-up saldo awal
    EWallet(String pemilik, String nomorHp, double saldoAwal) {
        this.pemilik = pemilik;
        this.nomorHp = nomorHp;
        this.saldo = saldoAwal;
    }

    // Method Void: Top-up saldo
    void topUp(double nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            System.out.println("[+] Berhasil top-up Rp" + (int)nominal + " ke akun " + this.pemilik);
        } else {
            System.out.println("[!] Nominal top-up tidak valid!");
        }
    }

    // Method Boolean/Return: Bayar belanjaan
    boolean bayar(double nominal) {
        if (nominal <= this.saldo) {
            this.saldo -= nominal;
            System.out.println("[V] Pembayaran Rp" + (int)nominal + " BERHASIL.");
            return true;
        } else {
            System.out.println("[X] Saldo TIDAK CUKUP untuk transaksi Rp" + (int)nominal + " (Sisa: Rp" + (int)this.saldo + ")");
            return false;
        }
    }

    // Method Return: Mengambil data saldo
    double getSaldo() {
        return this.saldo;
    }

    void cetakBukti() {
        System.out.println("========== E-WALLET ==========");
        System.out.println("Pemilik  : " + this.pemilik);
        System.out.println("Nomor HP : " + this.nomorHp);
        System.out.println("Saldo    : Rp" + (int)this.saldo);
        System.out.println("==============================");
    }
}

// ============================================================================
// MAIN CLASS (Tempat Program Dijalankan)
// ============================================================================

public class ContohPBO {
    public static void main(String[] args) {
        System.out.println("=== DEMO 1: SIMULASI GAME ===");
        KarakterGame hero1 = new KarakterGame("Arthur (Warrior)", 100, 25);
        KarakterGame hero2 = new KarakterGame("Shadow (Assassin)", 80, 40);

        hero1.infoStatus();
        hero2.infoStatus();

        System.out.println("\n-- Pertarungan Dimulai! --");
        hero1.serang(hero2);
        hero2.serang(hero1);
        hero2.serang(hero1);

        System.out.println("\n-- Status Akhir --");
        hero1.infoStatus();
        hero2.infoStatus();

        System.out.println("\n============================================\n");

        System.out.println("=== DEMO 2: SIMULASI DOMPET DIGITAL ===");
        // Menggunakan Constructor 1
        EWallet akunBudi = new EWallet("Budi Santoso", "08123456789");
        // Menggunakan Constructor 2 (Overloading)
        EWallet akunSiti = new EWallet("Siti Rahma", "08987654321", 100000);

        akunBudi.cetakBukti();
        akunBudi.topUp(50000);
        akunBudi.bayar(35000);
        akunBudi.bayar(25000); // Gagal karena saldo sisa 15000

        System.out.println();
        akunSiti.cetakBukti();
        akunSiti.bayar(75000);
        System.out.println("Sisa saldo Siti via getSaldo(): Rp" + (int)akunSiti.getSaldo());
    }
}
