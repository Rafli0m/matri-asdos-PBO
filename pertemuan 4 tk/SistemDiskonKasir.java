/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 4 (D3): Sistem Diskon Kasir (Pendekatan Nested If / Percabangan Bersarang)
 * File       : SistemDiskonKasir.java
 * ============================================================================
 * Konsep Pembelajaran:
 * 1. Nested If (Percabangan Bersarang): Suatu struktur if-else berada di dalam
 *    blok if-else lainnya.
 * 2. Alur Logika:
 *    - Level Luar (Outer If): Memeriksa kategori keanggotaan (VIP, Reguler, Non-Member).
 *    - Level Dalam (Inner If): Memeriksa nominal belanja (> 1.000.000 atau <= 1.000.000).
 * 3. Keunggulan Nested If:
 *    Kode lebih terorganisir per kelompok member dibandingkan menuliskan kondisi
 *    panjang berulang-ulang dengan operator '&&'.
 * ============================================================================
 */

import java.util.Scanner;

public class SistemDiskonKasir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header Menu
        System.out.println("==========================================");
        System.out.println("   SISTEM DISKON KASIR (METODE NESTED IF) ");
        System.out.println("==========================================");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.println("3. Non-Member");
        System.out.println("==========================================");
        
        // 1. INPUT PILIHAN TIPE MEMBER
        System.out.print("Pilih tipe member (1/2/3): ");
        int tipeMemberInt = input.nextInt();

        // 2. INPUT TOTAL BELANJA
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        double diskon = 0.0;
        String namaMember = "";

        // 3. LOGIKA PERCABANGAN BERSARANG (NESTED IF)
        // Outer If: Mengecek tipe member
        if (tipeMemberInt == 1) { 
            namaMember = "VIP";
            // Inner If: Mengecek syarat belanja khusus member VIP
            if (totalBelanja > 1000000) {
                diskon = 0.20; // 20% jika belanja di atas 1 juta
            } else {
                diskon = 0.15; // 15% jika belanja 1 juta ke bawah
            }

        } else if (tipeMemberInt == 2) { 
            namaMember = "Reguler";
            // Inner If: Mengecek syarat belanja khusus member Reguler
            if (totalBelanja > 1000000) {
                diskon = 0.10; // 10% jika belanja di atas 1 juta
            } else {
                diskon = 0.05; // 5% jika belanja 1 juta ke bawah
            }

        } else if (tipeMemberInt == 3) { 
            namaMember = "Non-Member";
            // Inner If: Mengecek syarat belanja untuk Non-Member
            if (totalBelanja > 1000000) {
                diskon = 0.02; // 2% jika belanja di atas 1 juta
            } else {
                diskon = 0.00; // 0% jika belanja 1 juta ke bawah
            }

        } else {
            System.out.println("\n[PERINGATAN] Tipe member tidak valid! Dianggap Non-Member.");
            namaMember = "Non-Member (Default)";
            diskon = 0.00;
        }

        // 4. PERHITUNGAN DISKON DAN TOTAL AKHIR
        double nominalDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - nominalDiskon;

        // 5. CETAK STRUK PEMBAYARAN
        System.out.println("\n==========================================");
        System.out.println("            STRUK PEMBAYARAN              ");
        System.out.println("==========================================");
        System.out.println("Status Pelanggan   : " + namaMember);
        System.out.println("Total Belanja Awal : Rp " + totalBelanja);
        System.out.println("Diskon Didapat     : " + (diskon * 100) + "% (Rp " + nominalDiskon + ")");
        System.out.println("------------------------------------------");
        System.out.println("Total Bayar Akhir  : Rp " + totalBayar);
        System.out.println("==========================================");

        // Menutup Scanner
        input.close();
    }
}