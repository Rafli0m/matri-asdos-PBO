/**
 * Program Contoh Perulangan WHILE
 * Materi: PBO - Struktur Kontrol Perulangan (Looping)
 * 
 * Konsep Dasar:
 * Perulangan 'while' adalah perulangan berbasis kondisi (Conditional Loop).
 * Sifatnya adalah "Entry-Controlled Loop", yang artinya kondisi dicek TERLEBIH DAHULU 
 * di pintu masuk sebelum blok kode di dalamnya diizinkan untuk dieksekusi.
 */
public class Perulangan_While {

    public static void main(String[] args) {
        // 1. Inisialisasi: Dibuat di luar struktur while
        // Variabel 'angka' menjadi penampung nilai hitungan awal.
        int angka = 0;

        /*
         * 2. Kondisi while (angka <= 5):
         * Komputer mengecek: "Apakah nilai angka saat ini <= 5?"
         * - Jika YA (true), maka kode di dalam kurung kurawal dijalankan.
         * - Jika TIDAK (false), maka perulangan selesai dan kode dilewati.
         */
        while (angka <= 5) {
            System.out.println("ini perulangan ke- " + angka);

            /*
             * 3. Pengubah Kondisi (Increment):
             * Perintah 'angka++;' menambahkan nilai variabel angka sebesar 1 (angka = angka + 1).
             * 
             * CATATAN PENTING UNTUK MAHASISWA:
             * Baris 'angka++;' ini WAJIB ada!
             * Jika baris ini dihilangkan/lupa ditulis, nilai angka akan selamanya bernilai 0,
             * kondisi (angka <= 5) akan selamanya bernilai true, dan program akan mengalami
             * "Infinite Loop" (perulangan tanpa henti hingga program freeze/crash).
             */
            angka++;
        }
    }
}
