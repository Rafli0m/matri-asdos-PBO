import java.util.Scanner;

/**
 * Program Kalkulator Interaktif Berbasis Menu (CLI)
 * Materi: PBO - Perpaduan Loop (while), Percabangan (switch-case), dan Validasi Logika
 * 
 * Tujuan Pembelajaran:
 * 1. Memahami cara membuat aplikasi interaktif berbasis menu yang tidak langsung keluar setelah satu aksi.
 * 2. Menggunakan variabel penanda (flag boolean) untuk mengontrol jalannya perulangan.
 * 3. Memahami percabangan 'switch-case' untuk memproses banyak pilihan menu.
 * 4. Melakukan validasi input (penanganan pembagian dengan angka nol).
 */
public class Kalkulator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menangkap inputan dari keyboard melalui konsol
        Scanner input = new Scanner(System.in);

        /*
         * Variabel flag 'menu':
         * Berfungsi sebagai sakelar/penanda apakah program harus terus berjalan atau berhenti.
         * Bernilai true saat program dimulai, dan diubah menjadi false saat user memilih keluar.
         */
        boolean menu = true;

        /*
         * Perulangan WHILE:
         * Selama variabel 'menu' bernilai true, blok kode menu akan terus diulang 
         * setiap kali operasi perhitungan selesai dijalankan.
         */
        while (menu) {
            // Menampilkan daftar menu pilihan operasi kepada user
            System.out.println("\n===== MENU KALKULATOR =====");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");
            System.out.print("Silahkan Pilih Menu (1-5): ");

            // Mengambil angka menu yang dipilih oleh pengguna
            int pilihan = input.nextInt();

            /*
             * Deklarasi variabel angka1, angka2, dan hasil:
             * Menggunakan tipe data 'double' agar kalkulator dapat memproses bilangan desimal (berkoma),
             * bukan hanya bilangan bulat (integer).
             */
            double angka1, angka2, hasil;

            /*
             * Struktur SWITCH-CASE:
             * Membandingkan nilai 'pilihan' dengan nilai pada setiap 'case'.
             */
            switch (pilihan) {
                case 1:
                    // OPERASI PENJUMLAHAN
                    System.out.println("\n--- Operasi Penjumlahan ---");
                    System.out.print("Masukkan angka pertama : ");
                    angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    angka2 = input.nextDouble();

                    hasil = angka1 + angka2; // Operator penjumlahan '+'
                    System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                    break; // 'break' wajib ada agar kode tidak merembet (fall-through) ke case berikutnya

                case 2:
                    // OPERASI PENGURANGAN
                    System.out.println("\n--- Operasi Pengurangan ---");
                    System.out.print("Masukkan angka pertama : ");
                    angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    angka2 = input.nextDouble();

                    hasil = angka1 - angka2; // Operator pengurangan '-'
                    System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                    break;

                case 3:
                    // OPERASI PERKALIAN
                    System.out.println("\n--- Operasi Perkalian ---");
                    System.out.print("Masukkan angka pertama : ");
                    angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    angka2 = input.nextDouble();

                    hasil = angka1 * angka2; // Operator perkalian '*'
                    System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                    break;

                case 4:
                    // OPERASI PEMBAGIAN
                    System.out.println("\n--- Operasi Pembagian ---");
                    System.out.print("Masukkan angka pertama : ");
                    angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    angka2 = input.nextDouble();

                    /*
                     * VALIDASI PEMBAGIAN DENGAN NOL:
                     * Di dalam matematika dan komputer, suatu bilangan TIDAK BISA dibagi dengan 0.
                     * Pada tipe data double di Java, pembagian dengan 0 menghasilkan 'Infinity'.
                     * Oleh karena itu, kita berikan pengecekan (if-else) agar program lebih rapi dan aman.
                     */
                    if (angka2 == 0) {
                        System.out.println("Error: Pembagian dengan angka nol tidak diperbolehkan!");
                    } else {
                        hasil = angka1 / angka2; // Operator pembagian '/'
                        System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                    }
                    break;

                case 5:
                    // MENU KELUAR PROGRAM
                    System.out.println("\nTerimakasih telah menggunakan program ini.");
                    menu = false; // Mengubah sakelar menjadi false agar perulangan while berhenti
                    break;

                default:
                    /*
                     * Bagian DEFAULT:
                     * Berjalan otomatis jika user memasukkan angka di luar pilihan 1 sampai 5
                     * (misalnya user mengetik angka 7, 9, atau -1).
                     */
                    System.out.println("\nMenu yang Anda pilih tidak tersedia. Silakan pilih kembali!");
                    break;
            }
        }

        // Menutup objek scanner setelah selesai digunakan (mencegah memory leak)
        input.close();
    }
}
