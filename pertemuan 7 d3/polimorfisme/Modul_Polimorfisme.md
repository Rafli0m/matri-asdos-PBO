# PANDUAN PRAKTIKUM PBO - POLIMORFISME (POLYMORPHISM)
## Topik: Konsep "Banyak Bentuk" (Method Overriding & Method Overloading)

---

### 1. Apa itu Polimorfisme?

Secara bahasa, **Polimorfisme** berasal dari kata *Poly* (Banyak) dan *Morph* (Bentuk), yang artinya **"Banyak Bentuk"**.

Dalam PBO Java, Polimorfisme adalah kemampuan sebuah **method yang memiliki nama sama persis**, namun dapat **bekerja atau menghasilkan perilaku yang berbeda-beda** tergantung siapa yang memanggilnya atau parameter apa yang diberikan.

**Analogi Dunia Nyata:**
Bayangkan Anda memberikan satu perintah yang sama: ***"Bersuara!"*** kepada beberapa hewan:
- Jika perintah itu diterima **Kucing**, bentuk suaranya adalah *"Meong!"*.
- Jika perintah itu diterima **Anjing**, bentuk suaranya adalah *"Guk Guk!"*.
- Jika perintah itu diterima **Sapi**, bentuk suaranya adalah *"Moooo!"*.
Perintahnya **satu nama yang sama** (`bersuara()`), tetapi **bentuk tindakannya berbeda-beda**!

---

### 2. Dua Jenis Polimorfisme di Java

Mahasiswa sering tertukar antara **Overriding** dan **Overloading**. Gunakan tabel perbandingan ini:

| Perbedaan | 1. Method Overriding (Dinamis) | 2. Method Overloading (Statis) |
| :--- | :--- | :--- |
| **Lokasi Method** | Berada di **antar Class** (Class Induk vs Class Anak dengan `extends`). | Berada di dalam **1 Class yang sama**. |
| **Nama Method** | **Harus sama persis.** | **Harus sama persis.** |
| **Parameter** | **Harus sama persis** dengan method di Class Induk. | **Wajib berbeda** (jumlah parameternya beda, atau tipe datanya beda). |
| **Tujuan Utama** | Mengubah/menimpa perilaku warisan Induk agar sesuai dengan ciri khas Anak. | Memudahkan pemanggilan fungsi yang sejenis dengan berbagai variasi input. |
| **Ciri Khas Kode** | Menggunakan anotasi `@Override`. | Banyak method bernama sama di satu class dengan isi kurung `(...)` berbeda. |

---

### 3. Penjelasan Kode 1: Method Overriding ([Main.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/polimorfisme/Main.java))

```java
class Hewan {
    void bersuara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class Kucing extends Hewan {
    @Override // Menimpa method bersuara() milik Hewan
    void bersuara() {
        System.out.println("Kucing : Meong... Meong!");
    }
}
```
> **Kenapa pakai `@Override`?**
> Anotasi `@Override` memberi tahu Java bahwa method tersebut sengaja menimpa method milik Class Induk. Jika kita salah ketik nama method (misal `bersuaraa()`), Java akan langsung memberi peringatan error sehingga kita tidak salah ketik.

---

### 4. Penjelasan Kode 2: Method Overloading ([ContohOverloading.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/polimorfisme/ContohOverloading.java))

```java
class Kalkulator {
    int tambah(int a, int b) { return a + b; }          // 2 parameter int
    int tambah(int a, int b, int c) { return a + b + c; } // 3 parameter int
    double tambah(double a, double b) { return a + b; } // 2 parameter double
}
```
> **Kenapa tidak buat nama `tambah2Angka()`, `tambah3Angka()`, `tambahDesimal()` saja?**
> Dengan Overloading, programmer yang memakai class `Kalkulator` tidak perlu menghafal banyak nama method. Cukup ingat satu nama: `tambah(...)`, dan Java yang akan memilihkan method yang tepat secara otomatis!

---

### 5. Daftar File di Folder `polimorfisme`

1. [Main.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/polimorfisme/Main.java) — Contoh Polimorfisme **Method Overriding** (`Hewan` -> `Kucing`, `Anjing`, `Sapi`).
2. [ContohOverloading.java](file:///C:/Users/Asus/Documents/Rafli%20Maulana/ASDOS/PBO/pertemuan%207%20d3/polimorfisme/ContohOverloading.java) — Contoh Polimorfisme **Method Overloading** (`Kalkulator`).
