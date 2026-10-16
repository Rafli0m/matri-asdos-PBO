/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 4 (D3): Kuis - Sistem Hitung Diskon Kasir (Compound Condition '&&')
 * File       : Kuis.java
 * ============================================================================
 * ATURAN KUIS:
 * 1. Tipe Member:
 *    - 1: VIP
 *    - 2: Reguler
 *    - 3: Non-Member
 * 2. Tabel Ketentuan Diskon:
 *    ----------------------------------------------------------
 *    | Tipe Member | Total Belanja > 1 Juta | Belanja <= 1 Juta |
 *    ----------------------------------------------------------
 *    | VIP         | 20% (0.20)             | 15% (0.15)        |
 *    | Reguler     | 10% (0.10)             | 5%  (0.05)        |
 *    | Non-Member  | 2%  (0.02)             | 0%  (0.00)        |
 *    ----------------------------------------------------------
 * 
 * Metode Penyelesaian:
 * File ini menggunakan operator logika AND (&&) untuk menggabungkan dua kondisi:
 * (tipeMember == X && totalBelanja > Y)
 * ============================================================================
 */

import java.util.Scanner;

public class Kuis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header Menu Tipe Member
        System.out.println("==========================================");
        System.out.println("      SISTEM HITUNG DISKON KASIR          ");
        System.out.println("==========================================");
        System.out.println("Pilihan Tipe Keanggotaan (Member):");
        System.out.println("  1. VIP");
        System.out.println("  2. Reguler");
        System.out.println("  3. Non-Member");
        System.out.println("==========================================");

        // 1. INPUT TIPE MEMBER
        System.out.print("Pilih tipe member (1/2/3): ");
        int tipeMember = input.nextInt();

        // 2. INPUT TOTAL BELANJA
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        // Inisialisasi variabel diskon dan nama member
        double diskon = 0.0;
        String namaTipeMember = "";

        // 3. EVALUASI KONDISI DENGAN OPERATOR LOGIKA '&&'
        if (tipeMember == 1 && totalBelanja > 1000000) {
            namaTipeMember = "VIP";
            diskon = 0.20; // Diskon 20%
        } else if (tipeMember == 1 && totalBelanja <= 1000000) {
            namaTipeMember = "VIP";
            diskon = 0.15; // Diskon 15%
        } else if (tipeMember == 2 && totalBelanja > 1000000) {
            namaTipeMember = "Reguler";
            diskon = 0.10; // Diskon 10%
        } else if (tipeMember == 2 && totalBelanja <= 1000000) {
            namaTipeMember = "Reguler";
            diskon = 0.05; // Diskon 5%
        } else if (tipeMember == 3 && totalBelanja > 1000000) {
            namaTipeMember = "Non-Member";
            diskon = 0.02; // Diskon 2%
        } else if (tipeMember == 3 && totalBelanja <= 1000000) {
            namaTipeMember = "Non-Member";
            diskon = 0.00; // Diskon 0%
        } else {
            // Penanganan jika input tipe member di luar 1, 2, atau 3
            System.out.println("\n[PERINGATAN] Tipe member tidak valid! Dianggap Non-Member tanpa diskon.");
            namaTipeMember = "Tidak Dikenal (Non-Member)";
            diskon = 0.00;
        }

        // 4. PERHITUNGAN TRANSAKSI
        double nominalDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - nominalDiskon;

        // 5. MENAMPILKAN STRUK PEMBAYARAN KASIR
        System.out.println("\n==========================================");
        System.out.println("            STRUK PEMBAYARAN              ");
        System.out.println("==========================================");
        System.out.println("Tipe Keanggotaan   : " + namaTipeMember);
        System.out.println("Total Belanja Awal : Rp " + totalBelanja);
        System.out.println("Diskon Didapat     : " + (diskon * 100) + "% (Rp " + nominalDiskon + ")");
        System.out.println("------------------------------------------");
        System.out.println("Total Bayar Akhir  : Rp " + totalBayar);
        System.out.println("==========================================");
        System.out.println("    Terima Kasih Atas Kunjungan Anda!     ");
        System.out.println("==========================================");

        // Menutup scanner
        input.close();
    }
}