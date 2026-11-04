# PANDUAN PRAKTIKUM PBO - PERTEMUAN 7
## Topik: Pewarisan (Inheritance)

---

### 1. Apa itu Pewarisan (Inheritance)?

Dalam dunia nyata, seorang **anak** pasti mewarisi sifat atau ciri fisik dari **orang tuanya**, namun sang anak juga bisa memiliki keahlian uniknya sendiri.

Di Pemrograman Berorientasi Objek (PBO), **Inheritance (Pewarisan)** adalah konsep di mana sebuah class baru (**Class Anak / Subclass**) dapat mewarisi atribut dan method yang dimiliki oleh class lain (**Class Induk / Superclass**) menggunakan kata kunci **`extends`**.

| Istilah PBO | Sebutan Lain | Analogi Dunia Nyata | Peran di Program |
| :--- | :--- | :--- | :--- |
| **Superclass** | Class Induk / Parent Class | **Orang Tua** (`Kendaraan`) | Menyimpan atribut dan method **umum** yang dimiliki bersama. |
| **Subclass** | Class Anak / Child Class | **Anak** (`Mobil`, `Motor`) | Otomatis menerima warisan dari Induk, ditambah atribut/method **khusus** miliknya sendiri. |
| **`extends`** | Kata Kunci Pewarisan | Akta Kelahiran / Garis Keturunan | Penghubung yang menyatakan bahwa suatu class adalah anak dari class lain. |
| **`super`** | Referensi ke Induk | Memanggil Orang Tua | Digunakan oleh class anak untuk memanggil Constructor atau Method milik class induk. |

---

### 2. Mengapa Kita Butuh Inheritance? (Tujuan Utama)

Tanpa pewarisan, jika kita membuat class `Mobil`, `Motor`, `Truk`, dan `Bus`, kita harus mengetik ulang atribut `merk`, `kecepatan`, dan method `jalan()` di setiap class satu per satu.

**Keuntungan menggunakan Inheritance:**
1. **Reusability (Tidak perlu ketik ulang kode):** Tulis atribut/method umum cukup **1 kali** di Superclass, maka semua Subclass otomatis memilikinya (*Don't Repeat Yourself*).
2. **Mudah Dirawat (Maintainable):** Jika ada perubahan pada fungsi `jalan()`, kita cukup mengubahnya di class `Kendaraan`, tidak perlu mengedit puluhan class anak satu per satu.
3. **Struktur Kode Lebih Rapi:** Mengelompokkan objek berdasarkan hubungan **"IS-A" (Adalah Sebuah)** — contohnya: *Mobil **adalah sebuah** Kendaraan*, *Motor **adalah sebuah** Kendaraan*.

---

### 3. Rumus & Aturan Dasar Syntax `extends`

```java
// 1. Buat Class Induk (Superclass)
class NamaClassInduk {
    // Atribut & Method umum
}

// 2. Buat Class Anak (Subclass) dengan kata kunci 'extends'
class NamaClassAnak extends NamaClassInduk {
    // Otomatis punya semua isi Class Induk (kecuali yang private)
    // Tinggal tambahkan atribut/method khusus milik Anak di sini
}
```

> **Catatan Penting untuk Mahasiswa:**
> - **Sifat Warisan Satu Arah:** Class Anak mewarisi semua milik Class Induk, tetapi **Class Induk TIDAK BISA** memakai atribut/method khusus milik Class Anak (misal: `Motor` tidak punya `nyalakanAC()` milik `Mobil`).
> - **Akses `private` vs `protected`:** Atribut di Class Induk yang diberi akses `private` tidak bisa diakses langsung oleh Class Anak. Jika ingin atribut aman namun tetap bisa diturunkan ke anak, gunakan `protected` atau akses melalui Getter/Setter.

---

### 4. Memahami Kata Kunci `super` pada Constructor

Jika di **Class Induk** terdapat **Constructor berparameter**, maka **Class Anak WAJIB** memanggil constructor induk tersebut menggunakan `super(...)` di baris pertama constructor anak:

```java
class Manusia {
    String nama;
    Manusia(String nama) {
        this.nama = nama;
    }
}

class Mahasiswa extends Manusia {
    String nim;
    Mahasiswa(String nama, String nim) {
        super(nama);     // <-- WAJIB baris pertama! Mengirim 'nama' ke constructor Manusia
        this.nim = nim;  // <-- Mengisi atribut milik Mahasiswa sendiri
    }
}
```

---

### 5. Daftar File Praktikum di Folder Ini

1. [Main.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/Main.java) — Contoh paling dasar menggunakan `Kendaraan` (Induk) -> `Mobil` & `Motor` (Anak). Cocok untuk penjelasan konsep awal.
2. [ContohSuper.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/ContohSuper.java) — Contoh lanjutan menggabungkan materi Pertemuan 5 (**Constructor**) dengan **Pewarisan (`super`)** menggunakan kasus `Manusia` -> `Mahasiswa`.
3. [Latihan.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/Latihan.java) — Kunci jawaban untuk soal latihan mandiri mahasiswa (Sistem Gaji Pegawai).

---

### 6. Soal Latihan Mandiri Mahasiswa

**Studi Kasus: Sistem Gaji Pegawai Perusahaan**

Buatlah program Java menggunakan konsep **Pewarisan (`extends`)** dengan ketentuan berikut:

1. **Class Induk (`Pegawai`)**:
   - Memiliki atribut: `nama` (`String`) dan `gajiPokok` (`int`).
   - Memiliki method `infoPegawai()` untuk menampilkan Nama dan Gaji Pokok.
2. **Class Anak Pertama (`Manager` mewarisi `Pegawai`)**:
   - Memiliki atribut tambahan: `tunjangan` (`int`).
   - Memiliki method `totalGajiManager()` untuk menampilkan nominal tunjangan serta total gaji (`gajiPokok + tunjangan`).
3. **Class Anak Kedua (`Kasir` mewarisi `Pegawai`)**:
   - Memiliki atribut tambahan: `bonusLembur` (`int`).
   - Memiliki method `totalGajiKasir()` untuk menampilkan nominal bonus lembur serta total gaji (`gajiPokok + bonusLembur`).
4. **Class Utama (`Main` / `Latihan`)**:
   - Buat masing-masing **1 objek `Manager`** dan **1 objek `Kasir`**.
   - Isi datanya lalu panggil method untuk menampilkan output seperti contoh di bawah ini!

#### Contoh Output yang Diharapkan:
```text
=== DATA GAJI MANAGER ===
Nama Pegawai : Andi Wijaya
Gaji Pokok   : Rp 5000000
Tunjangan    : Rp 2000000
Total Gaji   : Rp 7000000

=== DATA GAJI KASIR ===
Nama Pegawai : Siti Aminah
Gaji Pokok   : Rp 3000000
Bonus Lembur : Rp 500000
Total Gaji   : Rp 3500000
```

