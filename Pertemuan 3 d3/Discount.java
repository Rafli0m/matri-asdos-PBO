/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3 (D3): Perhitungan Diskon Belanja Bertingkat
 * File       : Discount.java
 * ============================================================================
 * Aturan Diskon:
 * - Total Belanja >= Rp 100.000 : Diskon 20% (0.20)
 * - Total Belanja >= Rp 50.000  : Diskon 10% (0.10)
 * - Total Belanja <  Rp 50.000  : Tidak ada diskon (0%)
 * 
 * Rumus Perhitungan:
 * - Nominal Potongan = hargaBarang * diskon
 * - Total Bayar      = hargaBarang - Nominal Potongan
 * ============================================================================
 */

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        SISTEM PERHITUNGAN DISKON         ");
        System.out.println("==========================================");

        // 1. INPUT HARGA BARANG / TOTAL BELANJA
        System.out.print("Masukkan total harga belanja (Rp): ");
        double hargaBarang = input.nextDouble();

        // 2. PENENTUAN PERSENTASE DISKON
        double diskon;
        if (hargaBarang >= 100000) {
            diskon = 0.20; // Diskon 20%
            System.out.println("\n[INFO] Selamat! Anda mendapatkan diskon 20%.");
        } else if (hargaBarang >= 50000) {
            diskon = 0.10; // Diskon 10%
            System.out.println("\n[INFO] Selamat! Anda mendapatkan diskon 10%.");
        } else {
            diskon = 0.0;  // Tidak ada diskon
            System.out.println("\n[INFO] Maaf, belanja di bawah Rp 50.000 belum mendapat diskon.");
        }

        // 3. PROSES PERHITUNGAN NOMINAL DAN TOTAL AKHIR
        double nominalDiskon = hargaBarang * diskon;
        double hargaSetelahDiskon = hargaBarang - nominalDiskon;

        // 4. MENAMPILKAN STRUK / RINCIAN
        System.out.println("==========================================");
        System.out.println("          RINCIAN PEMBAYARAN              ");
        System.out.println("==========================================");
        System.out.println("Total Belanja Awal   : Rp " + hargaBarang);
        System.out.println("Persentase Diskon    : " + (diskon * 100) + "%");
        System.out.println("Potongan Diskon (Rp) : Rp " + nominalDiskon);
        System.out.println("------------------------------------------");
        System.out.println("Total Bayar Akhir    : Rp " + hargaSetelahDiskon);
        System.out.println("==========================================");

        // Menutup scanner
        input.close();
    }
}
