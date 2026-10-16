/**
 * ============================================================================
 * PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK (PBO)
 * PERTEMUAN 2: Operator Aritmatika & Konsep Integer Division
 * File       : Oprator.java
 * ============================================================================
 * Tujuan Pembelajaran:
 * 1. Mengenal operator aritmatika dasar di Java (+, -, *, /, %).
 * 2. Memahami konsep penting "Integer Division" (Pembagian Bilangan Bulat) vs
 *    Type Casting ke double untuk mendapatkan hasil desimal akurat.
 * 3. Memahami operator modulus / sisa bagi (%).
 * ============================================================================
 */

public class Oprator {

    public static void main(String[] args) {
        // Deklarasi dua variabel integer
        int angka1 = 10;
        int angka2 = 3;
        double hasil;

        System.out.println("==========================================");
        System.out.println("   DEMO OPERATOR ARITMATIKA DI JAVA       ");
        System.out.println("   Nilai: angka1 = " + angka1 + ", angka2 = " + angka2);
        System.out.println("==========================================");

        // 1. Penjumlahan (+)
        hasil = angka1 + angka2;
        System.out.println("1. Penjumlahan (" + angka1 + " + " + angka2 + ") = " + hasil);

        // 2. Pengurangan (-)
        hasil = angka1 - angka2;
        System.out.println("2. Pengurangan (" + angka1 + " - " + angka2 + ") = " + hasil);

        // 3. Perkalian (*)
        hasil = angka1 * angka2;
        System.out.println("3. Perkalian   (" + angka1 + " * " + angka2 + ") = " + hasil);

        // 4. Pembagian (/)
        // PERHATIAN PENTING (Catatan Khusus untuk Praktikan):
        // Jika int dibagi int (10 / 3), Java melakukan "Integer Division",
        // sehingga desimalnya dibuang (10 / 3 = 3).
        // Ketika disimpan ke tipe double, hasilnya menjadi 3.0 (bukan 3.333...).
        hasil = angka1 / angka2;
        System.out.println("4. Pembagian int / int (" + angka1 + " / " + angka2 + ") = " + hasil + " (Desimal terpotong)");

        // CARA MENDAPATKAN HASIL DESIMAL AKURAT:
        // Lakukan Type Casting salah satu operand ke (double):
        double hasilAkurat = (double) angka1 / angka2;
        System.out.println("   -> Hasil akurat ((double) " + angka1 + " / " + angka2 + ") = " + hasilAkurat);

        // 5. Modulus / Sisa Bagi (%)
        // Menghitung sisa setelah angka1 dibagi angka2.
        // Contoh: 10 dibagi 3 adalah 3 dengan sisa 1 (karena 3 * 3 = 9, 10 - 9 = 1).
        hasil = angka1 % angka2;
        System.out.println("5. Modulus/Sisa Bagi (" + angka1 + " % " + angka2 + ") = " + hasil);
        System.out.println("==========================================");
    }
}
