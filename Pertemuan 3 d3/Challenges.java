/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 3 (D3): Challenge - Menu Perhitungan Bangun Datar (switch - case)
 * File       : Challenges.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Memahami penggunaan struktur kontrol 'switch - case' sebagai alternatif if - else.
 * 2. Memahami fungsi kata kunci 'break' untuk menghentikan loncatan eksekusi (fall-through).
 * 3. Memahami fungsi 'default' sebagai penanganan ketika tidak ada case yang cocok.
 * 4. Menghitung rumus bangun datar:
 *    - Keliling Lingkaran     = 2 * pi * r
 *    - Luas Lingkaran         = pi * r * r
 *    - Luas Persegi Panjang   = panjang * lebar
 *    - Luas Segitiga          = 0.5 * alas * tinggi
 *    - Luas Trapesium         = 0.5 * (sisiAtas + sisiBawah) * tinggi
 * ============================================================================
 */

import java.util.Scanner;

public class Challenges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan daftar menu pilihan
        System.out.println("==========================================");
        System.out.println("   PROGRAM MENGHITUNG KELILING DAN LUAS   ");
        System.out.println("==========================================");
        System.out.println("1. Keliling Lingkaran");
        System.out.println("2. Luas Lingkaran");
        System.out.println("3. Luas Persegi Panjang");
        System.out.println("4. Luas Segitiga");
        System.out.println("5. Luas Trapesium");
        System.out.println("==========================================");
        System.out.print("Silakan pilih menu (1-5): ");
        int menu = input.nextInt();

        System.out.println("------------------------------------------");

        // CATATAN ASDOS TENTANG SWITCH-CASE:
        // Gunakan kurung kurawal { } di setiap case jika ingin membuat scope variabel lokal
        // agar tidak terjadi konflik nama variabel antar case.
        switch (menu) {
            case 1: {
                System.out.println("[MENU 1: Keliling Lingkaran]");
                System.out.print("Masukkan jari-jari lingkaran: ");
                double radius = input.nextDouble();
                double kelilingLingkaran = 2 * Math.PI * radius;
                System.out.println("Hasil: Keliling Lingkaran = " + kelilingLingkaran);
                break; // 'break' wajib digunakan agar tidak mengeksekusi case berikutnya
            }

            case 2: {
                System.out.println("[MENU 2: Luas Lingkaran]");
                System.out.print("Masukkan jari-jari lingkaran: ");
                double radius = input.nextDouble();
                double luasLingkaran = Math.PI * radius * radius;
                System.out.println("Hasil: Luas Lingkaran = " + luasLingkaran);
                break;
            }

            case 3: {
                System.out.println("[MENU 3: Luas Persegi Panjang]");
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang  : ");
                double lebar = input.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Hasil: Luas Persegi Panjang = " + luasPersegiPanjang);
                break;
            }

            case 4: {
                System.out.println("[MENU 4: Luas Segitiga]");
                System.out.print("Masukkan alas segitiga  : ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Hasil: Luas Segitiga = " + luasSegitiga);
                break;
            }

            case 5: {
                System.out.println("[MENU 5: Luas Trapesium]");
                System.out.print("Masukkan sisi sejajar atas trapesium : ");
                double sisiAtas = input.nextDouble();
                System.out.print("Masukkan sisi sejajar bawah trapesium: ");
                double sisiBawah = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium            : ");
                double tinggi = input.nextDouble();
                double luasTrapesium = 0.5 * (sisiAtas + sisiBawah) * tinggi;
                System.out.println("Hasil: Luas Trapesium = " + luasTrapesium);
                break;
            }

            default:
                // Dijalankan jika nilai menu tidak ada yang cocok dengan case 1-5
                System.out.println("Pilihan tidak valid! Silakan jalankan ulang dan pilih nomor 1 - 5.");
                break;
        }

        System.out.println("------------------------------------------");
        
        // PENTING: input.close() diletakkan di luar blok switch
        // agar selalu terpanggil apapun menu yang dipilih pengguna!
        input.close();
    }
}
