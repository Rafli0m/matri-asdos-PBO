import java.util.Scanner;

/**
 * Program Sistem Informasi Karyawan (CRUD Berbasis Konsol)
 * Materi: PBO - Pengelolaan Data dengan Array Paralel, Perulangan, dan Percabangan
 * 
 * Konsep Utama yang Dipelajari Mahasiswa:
 * 1. CRUD (Create, Read, Update, Delete) sederhana berbasis CLI.
 * 2. Array Paralel: Menggunakan beberapa array berbeda (nama, tgl lahir, pendidikan, jenis kelamin)
 *    yang saling terhubung satu sama lain melalui nomor indeks yang sama.
 * 3. Array Shifting (Pergeseran Elemen): Cara menghapus elemen pada array statis dengan memindahkan
 *    elemen setelahnya satu langkah ke kiri.
 * 4. Pembersihan Buffer Scanner (scanner.nextLine()) setelah membaca tipe numerik (scanner.nextInt()).
 * 5. Formatting Output menggunakan printf untuk membuat tampilan tabel rapi.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Batas maksimal data yang dapat ditampung oleh array (kapasitas statis)
        int kapasitas = 50;

        /*
         * ARRAY PARALEL:
         * Keempat array berikut memiliki ukuran yang sama (50 elemen).
         * Indeks ke-0 pada semua array mewakili data milik karyawan pertama,
         * Indeks ke-1 mewakili karyawan kedua, dan seterusnya.
         */
        String[] namaKaryawan = new String[kapasitas];
        String[] tglLahir = new String[kapasitas];
        String[] pendidikan = new String[kapasitas];
        String[] jenisKelamin = new String[kapasitas];

        // Variabel penanda jumlah data aktual yang sudah tersimpan saat ini
        int jumlahData = 0;

        // Flag boolean untuk mengontrol kelangsungan menu utama program
        boolean berjalan = true;

        // Perulangan utama program (berjalan terus sampai user memilih menu Keluar)
        while (berjalan) {
            System.out.println("\n=== SISTEM INFORMASI PERKANTORAN ===");
            System.out.println("1. Tambah data karyawan");
            System.out.println("2. Lihat data karyawan");
            System.out.println("3. Edit data karyawan");
            System.out.println("4. Hapus data karyawan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");

            int pilihan = scanner.nextInt();

            /*
             * TIPS PENTING UNTUK MAHASISWA (Buffer Scanner):
             * Perintah scanner.nextInt() hanya membaca angka, tetapi TIDAK membaca tombol 'Enter' (\n).
             * Oleh karena itu, kita wajib memanggil scanner.nextLine() kosong ini untuk membuang karakter 'Enter',
             * agar input teks berikutnya (nama, dll) tidak terlewatkan (skip) otomatis.
             */
            scanner.nextLine();

            switch (pilihan) {
                // ==========================================
                // 1. TAMBAH DATA KARYAWAN (CREATE)
                // ==========================================
                case 1:
                    // Pengecekan apakah array masih memiliki ruang kosong
                    if (jumlahData < kapasitas) {
                        System.out.print("Nama Lengkap        : ");
                        namaKaryawan[jumlahData] = scanner.nextLine();

                        // Membaca tanggal, bulan, dan tahun lalu menggabungkannya (string concatenation)
                        System.out.print("Tanggal Lahir (DD)  : ");
                        String tgl = scanner.nextLine();
                        System.out.print("Bulan Lahir (MM)    : ");
                        String bln = scanner.nextLine();
                        System.out.print("Tahun Lahir (YYYY)  : ");
                        String thn = scanner.nextLine();
                        tglLahir[jumlahData] = tgl + "-" + bln + "-" + thn;

                        System.out.print("Pendidikan Terakhir : ");
                        pendidikan[jumlahData] = scanner.nextLine();

                        System.out.print("Jenis Kelamin       : ");
                        jenisKelamin[jumlahData] = scanner.nextLine();

                        // Setelah data tersimpan pada indeks aktif, naikkan penghitung jumlah data
                        jumlahData++;
                        System.out.println("Data karyawan berhasil ditambahkan!");
                    } else {
                        System.out.println("Kapasitas penyimpanan penuh!");
                    }
                    break;

                // ==========================================
                // 2. LIHAT DATA KARYAWAN (READ)
                // ==========================================
                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data karyawan.");
                    } else {
                        System.out.println();
                        /*
                         * Menggunakan System.out.printf untuk membuat tabel rapi:
                         * %-4s  : string rata kiri, lebar 4 kolom
                         * %-16s : string rata kiri, lebar 16 kolom
                         * %-4d  : integer rata kiri, lebar 4 kolom
                         * \n    : baris baru (newline)
                         */
                        System.out.printf("%-4s | %-16s | %-12s | %-15s | %-13s\n", 
                                          "No", "Nama Karyawan", "Tgl Lahir", "Pendidikan", "Jenis Kelamin");
                        System.out.println("------------------------------------------------------------------");

                        // Looping untuk mencetak data dari indeks 0 hingga jumlahData - 1
                        for (int i = 0; i < jumlahData; i++) {
                            // (i + 1) ditampilkan sebagai nomor urut agar ramah bagi manusia (mulai dari 1)
                            System.out.printf("%-4d | %-16s | %-12s | %-15s | %-13s\n", 
                                              (i + 1), namaKaryawan[i], tglLahir[i], pendidikan[i], jenisKelamin[i]);
                        }
                    }
                    break;

                // ==========================================
                // 3. EDIT DATA KARYAWAN (UPDATE)
                // ==========================================
                case 3:
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data untuk diedit.");
                        break;
                    }
                    System.out.print("Masukkan nomor urut karyawan yang diedit: ");
                    int noEdit = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan sisa tombol Enter

                    // Validasi: pastikan nomor yang dimasukkan berada dalam rentang data yang ada
                    if (noEdit >= 1 && noEdit <= jumlahData) {
                        // Mengonversi nomor urut manusia (1, 2, 3...) menjadi indeks array komputer (0, 1, 2...)
                        int idx = noEdit - 1;

                        System.out.print("Nama Lengkap Baru        : ");
                        namaKaryawan[idx] = scanner.nextLine();

                        System.out.print("Tanggal Lahir Baru (DD)  : ");
                        String tgl = scanner.nextLine();
                        System.out.print("Bulan Lahir Baru (MM)    : ");
                        String bln = scanner.nextLine();
                        System.out.print("Tahun Lahir Baru (YYYY)  : ");
                        String thn = scanner.nextLine();
                        tglLahir[idx] = tgl + "-" + bln + "-" + thn;

                        System.out.print("Pendidikan Terakhir Baru : ");
                        pendidikan[idx] = scanner.nextLine();

                        System.out.print("Jenis Kelamin Baru       : ");
                        jenisKelamin[idx] = scanner.nextLine();

                        System.out.println("Data karyawan berhasil diubah!");
                    } else {
                        System.out.println("Nomor urut tidak ditemukan!");
                    }
                    break;

                // ==========================================
                // 4. HAPUS DATA KARYAWAN (DELETE)
                // ==========================================
                case 4:
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data untuk dihapus.");
                        break;
                    }
                    System.out.print("Masukkan nomor urut karyawan yang dihapus: ");
                    int noHapus = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan sisa tombol Enter

                    if (noHapus >= 1 && noHapus <= jumlahData) {
                        int idx = noHapus - 1;

                        /*
                         * ALGORITMA PERGESERAN ARRAY (ARRAY SHIFTING):
                         * Karena ukuran array di Java bersifat tetap, cara "menghapus" elemen di tengah 
                         * adalah dengan menimpa data yang dihapus menggunakan data di sebelah kanannya (i + 1),
                         * lalu menggeser seluruh data setelahnya satu per satu ke arah kiri.
                         */
                        for (int i = idx; i < jumlahData - 1; i++) {
                            namaKaryawan[i] = namaKaryawan[i + 1];
                            tglLahir[i] = tglLahir[i + 1];
                            pendidikan[i] = pendidikan[i + 1];
                            jenisKelamin[i] = jenisKelamin[i + 1];
                        }

                        // Mengurangi jumlah data aktif karena 1 data sudah dihapus/tergeser
                        jumlahData--;
                        System.out.println("Data karyawan berhasil dihapus!");
                    } else {
                        System.out.println("Nomor urut tidak ditemukan!");
                    }
                    break;

                // ==========================================
                // 5. KELUAR PROGRAM
                // ==========================================
                case 5:
                    System.out.println("Program selesai. Sampai jumpa!");
                    berjalan = false; // Menghentikan perulangan while utama
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        // Menutup objek scanner
        scanner.close();
    }
}
