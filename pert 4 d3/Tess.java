/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 4 (D3): Studi Kasus Diskon Kasir (Penerapan Prinsip Clean Code & DRY)
 * File       : Tess.java
 * ============================================================================
 * Pelajaran Penting untuk Praktikan:
 * 1. PRINSIP DRY (Don't Repeat Yourself):
 *    Jangan menduplikasi rumus perhitungan dan perintah mencetak (System.out.println)
 *    berulang-ulang di setiap blok 'if' dan 'else if'!
 * 2. CARA YANG BENAR & BERSIH:
 *    - Blok 'if - else' hanya bertugas MENENTUKAN NILAI (dalam kasus ini: persentase diskon & label member).
 *    - Rumus perhitungan matematika dan pencetakan struk pembayaran diletakkan
 *      CUKUP SATU KALI di akhir setelah percabangan selesai.
 * 3. MANFAAT CLEAN CODE:
 *    - Kode jauh lebih ringkas, mudah dibaca, dan tidak rawan typo/salah rumus.
 *    - Jika format struk ingin diubah, Anda cukup mengubah di 1 tempat, bukan di 7 tempat!
 * ============================================================================
 */

import java.util.Scanner;

public class Tess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header Menu
        System.out.println("==========================================");
        System.out.println("   SISTEM DISKON KASIR (CLEAN CODE DEMO)  ");
        System.out.println("==========================================");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.println("3. Non-Member");
        System.out.println("==========================================");

        // 1. INPUT PENGGUNA
        System.out.print("Pilih tipe member (1/2/3): ");
        int tipeMember = input.nextInt();

        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();

        // Variabel penampung hasil evaluasi
        double diskon;
        String kategoriMember;

        // 2. PERCABANGAN HANYA UNTUK MENENTUKAN KATEGORI & PERSENTASE DISKON
        if (tipeMember == 1 && totalBelanja > 1000000) {
            kategoriMember = "VIP (Promo Belanja > 1 Juta)";
            diskon = 0.20; // 20%
        } else if (tipeMember == 1 && totalBelanja <= 1000000) {
            kategoriMember = "VIP (Standar)";
            diskon = 0.15; // 15%
        } else if (tipeMember == 2 && totalBelanja > 1000000) {
            kategoriMember = "Reguler (Promo Belanja > 1 Juta)";
            diskon = 0.10; // 10%
        } else if (tipeMember == 2 && totalBelanja <= 1000000) {
            kategoriMember = "Reguler (Standar)";
            diskon = 0.05; // 5%
        } else if (tipeMember == 3 && totalBelanja > 1000000) {
            kategoriMember = "Non-Member (Promo Belanja > 1 Juta)";
            diskon = 0.02; // 2%
        } else if (tipeMember == 3 && totalBelanja <= 1000000) {
            kategoriMember = "Non-Member";
            diskon = 0.00; // 0%
        } else {
            System.out.println("\n[INFO] Tipe member tidak valid. Diatur sebagai Non-Member tanpa diskon.");
            kategoriMember = "Non-Member (Default)";
            diskon = 0.00;
        }

        // 3. PERHITUNGAN TRANSAKSI (CUKUP DITULIS 1 KALI)
        double nominalDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - nominalDiskon;

        // 4. MENCETAK STRUK PEMBAYARAN (CUKUP DITULIS 1 KALI)
        System.out.println("\n==========================================");
        System.out.println("             STRUK PEMBAYARAN             ");
        System.out.println("==========================================");
        System.out.println("Kategori Member    : " + kategoriMember);
        System.out.println("Total Belanja Awal : Rp " + totalBelanja);
        System.out.println("Diskon Didapat     : " + (diskon * 100) + "% (Rp " + nominalDiskon + ")");
        System.out.println("------------------------------------------");
        System.out.println("Total Bayar Akhir  : Rp " + totalBayar);
        System.out.println("==========================================");

        // Menutup scanner
        input.close();
    }
}