import java.util.Scanner;

class Karyawan {
    String nama;
    String pendidikan;
    String status;
    int thnMasuk;

    public Karyawan(String nama, String pendidikan, String status, int thnMasuk) {
        this.nama = nama;
        this.pendidikan = pendidikan;
        this.status = status;
        this.thnMasuk = thnMasuk;
    }
    private int hitungMasaKerja(int thnMasuk) {
        return 2026- thnMasuk;
    }
    public double hitungGaji(String status) {
        double gajiPokok;
        if (status.equals("Tetap")) 
            gajiPokok = 3500000;
        else if (status.equals("Kontrak")) 
            gajiPokok = 5000000;
        else
            gajiPokok = 0;
        return gajiPokok;
    }
    public double hitungTunjangan(String pendidikan, int thnMasuk) {
        int masaKerja = hitungMasaKerja(thnMasuk);
        double tunjangan;
        if (pendidikan.equals("S1") && masaKerja >= 5)
            tunjangan = 1000000;
        else if (pendidikan.equals("S2") && masaKerja >= 3)
            tunjangan = 1500000;
        else
            tunjangan = 1000000;
        return tunjangan;
    }
}


public class Main {
    public static void main(String[] args) {
        Karyawan [] karyawan = new Karyawan[10];
        String nama, pendidikan, status;
        int thnMasuk;

        // Input data karyawan
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 1; i++) {
            System.out.println("Masukkan data karyawan ke-" + (i + 1));
            System.out.print("Nama Lengkap: ");
            nama = scanner.nextLine();
            System.out.print("Pendidikan (S1/S2): ");
            pendidikan = scanner.nextLine();
            System.out.print("Status (Tetap/Kontrak): ");
            status = scanner.nextLine();
            System.out.print("Tahun Masuk: ");
            thnMasuk = scanner.nextInt();
            scanner.nextLine();

            karyawan[i] = new Karyawan(nama, pendidikan, status, thnMasuk);
        }

        // Menampilkan data karyawan
        for(int i = 0; i < 1; i++) {
            System.out.println();
            System.out.println("Nama Lengkap: " + karyawan[i].nama);
            System.out.println("Pendidikan: " + karyawan[i].pendidikan);
            System.out.println("Status: " + karyawan[i].status);
            System.out.println("Tahun Masuk: " + karyawan[i].thnMasuk);
            System.out.println("Gaji Pokok: " + karyawan[i].hitungGaji(karyawan[i].status));
            System.out.println("Tunjangan: " + karyawan[i].hitungTunjangan(karyawan[i].pendidikan, karyawan[i].thnMasuk));
            System.out.println("================================");
        }
        scanner.close();
    }
}