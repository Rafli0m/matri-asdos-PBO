# PANDUAN PRAKTIKUM PBO - PERTEMUAN 5
## Topik: Class, Object, Constructor, dan Method

---

### 1. Peta Konsep & Analogi Dunia Nyata

Banyak mahasiswa bingung membedakan **Class** dan **Object**. Gunakan analogi berikut:

| Konsep PBO | Analogi Dunia Nyata | Definisi di Pemrograman |
| :--- | :--- | :--- |
| **Class** | **Cetakan Kue** / **Blueprint Rumah** | Wadah rancangan yang menentukan atribut (data) dan method (kemampuan) apa saja yang akan dimiliki objek. |
| **Object** | **Kue Fisik** / **Rumah Nyata** | Bentuk riil hasil cetakan class yang sudah menempati memori komputer dan memiliki nilai spesifik. |
| **Atribut** | Ciri-ciri kue (Rasa, Topping, Ukuran) | Variabel di dalam class yang menyimpan data/karakteristik objek. |
| **Constructor**| Proses pemanggangan saat kue pertama dibuat | Blok kode khusus yang **otomatis jalan pertama kali** saat objek dicetak (`new`) untuk inisialisasi awal. |
| **Method** | Aksi (Kue dipotong, Rumah dicat ulang) | Fungsi/perilaku yang bisa dijalankan oleh objek. |

---

### 2. Mengapa Butuh Constructor?

Perhatikan perbedaan cara pembuatan objek:

#### Cara Kuno (Tanpa Constructor):
```java
Mahasiswa mhs1 = new Mahasiswa();
mhs1.nama = "Rafli";
mhs1.nim = "5230411091";
mhs1.ipk = 3.75;
// Bayangkan jika ada 10 atribut dan 50 mahasiswa, kodenya sangat panjang dan rawan lupa diisi!
```

#### Cara Modern (Dengan Constructor):
```java
// Langsung diisi saat objek lahir! Lebih ringkas, aman, dan konsisten.
Mahasiswa mhs1 = new Mahasiswa("Rafli", "5230411091", 3.75);
```

#### 3 Syarat Wajib Constructor:
1. **Nama harus persis sama** dengan nama Class (perhatikan huruf besar/kecil).
2. **Tidak memiliki tipe return** (JANGAN tulis `void`, `int`, atau tipe apa pun).
3. **Dipanggil otomatis** hanya satu kali saat kata kunci `new` dieksekusi.

---

### 3. Memahami Keyword `this` (Variable Shadowing)

```java
class Mahasiswa {
    String nama; // Atribut milik Class

    Mahasiswa(String nama) { // Parameter milik Constructor
        this.nama = nama;
        // 'this.nama' = Atribut milik Class
        // 'nama'      = Parameter input dari constructor
    }
}
```
> **Kenapa harus pakai `this`?**
> Jika ditulis `nama = nama;`, Java akan bingung karena nama variabelnya sama persis (Shadowing). Keyword `this` menegaskan: *"Masukkan nilai parameter 'nama' ke atribut 'nama' milik objek ini"*.

---

### 4. Jenis-Jenis Method

1. **Method Void (`void`)**: Menjalankan instruksi/aksi (seperti cetak data), **tanpa** menghasilkan nilai balik.
2. **Method Return (`non-void`)**: Menghasilkan suatu nilai kembali (misal hitung total, cek status). Wajib ada kata kunci `return`.
3. **Method Berparameter**: Method yang membutuhkan masukan data dari luar saat dipanggil.

---

### 5. Contoh Kasus Baru: Simulasi Hero Game & Dompet Digital

File lengkap dapat dijalankan pada file [ContohPBO.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%205%20d3/ContohPBO.java).
