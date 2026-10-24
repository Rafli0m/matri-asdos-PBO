/**
 * Program Contoh Perulangan FOR
 * Materi: PBO - Struktur Kontrol Perulangan (Looping)
 * 
 * Konsep Dasar:
 * Perulangan 'for' umumnya disebut sebagai "Counted Loop" (perulangan terhitung),
 * yaitu bentuk perulangan yang digunakan ketika jumlah putaran/iterasinya 
 * sudah diketahui secara pasti sejak awal.
 */
public class Perulangan_for {

    public static void main(String[] args) {
        /*
         * Struktur for loop memiliki 3 komponen utama dalam tanda kurung:
         * 
         * 1. Inisialisasi: (int i = 0)
         *    Dijalankan SEKALI di awal untuk mendeklarasikan dan memberi nilai awal 
         *    pada variabel penghitung (counter). Di sini dimulai dari 0.
         * 
         * 2. Kondisi: (i <= 10)
         *    Dicek SEBELUM setiap putaran dijalankan.
         *    Selama kondisi bernilai true, blok kode akan terus dijalankan.
         *    Jika bernilai false, perulangan akan langsung berhenti.
         * 
         * 3. Iterasi/Step: (i++)
         *    Dijalankan SETELAH setiap putaran selesai dieksekusi.
         *    i++ berarti i = i + 1 (menambahkan nilai i sebanyak 1 setiap putaran).
         */
        for (int i = 0; i <= 10; i++) {
            // Baris ini akan dijalankan sebanyak 11 kali (mulai dari i = 0 sampai i = 10)
            System.out.println("ini pertulang for ke-" + i);
        }
    }
}
