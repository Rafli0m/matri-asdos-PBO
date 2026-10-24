import java.util.Scanner;

public class Tess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Hitung Diskon Kasir ===");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.println("3. Non-Member");
        System.out.print("Pilih tipe member (1/2/3): ");
        int tipeMember = input.nextInt();

        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();

        double diskon, nominalDiskon, totalBayar;

        // Setiap kondisi menghitung dan menampilkan struknya masing-masing
        if (tipeMember == 1 && totalBelanja > 1000000) {
            diskon = 0.20;
            nominalDiskon = totalBelanja * diskon;
            totalBayar = totalBelanja - nominalDiskon;
            
            System.out.println("\n=== Struk Pembayaran (VIP) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 20% (Rp " + nominalDiskon + ")");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);

        } else if (tipeMember == 1 && totalBelanja <= 1000000) {
            diskon = 0.15;
            nominalDiskon = totalBelanja * diskon;
            totalBayar = totalBelanja - nominalDiskon;
            
            System.out.println("\n=== Struk Pembayaran (VIP) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 15% (Rp " + nominalDiskon + ")");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);

        } else if (tipeMember == 2 && totalBelanja > 1000000) {
            diskon = 0.10;
            nominalDiskon = totalBelanja * diskon;
            totalBayar = totalBelanja - nominalDiskon;
            
            System.out.println("\n=== Struk Pembayaran (Reguler) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 10% (Rp " + nominalDiskon + ")");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);

        } else if (tipeMember == 2 && totalBelanja <= 1000000) {
            diskon = 0.05;
            nominalDiskon = totalBelanja * diskon;
            totalBayar = totalBelanja - nominalDiskon;
            
            System.out.println("\n=== Struk Pembayaran (Reguler) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 5% (Rp " + nominalDiskon + ")");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);

        } else if (tipeMember == 3 && totalBelanja > 1000000) {
            diskon = 0.02;
            nominalDiskon = totalBelanja * diskon;
            totalBayar = totalBelanja - nominalDiskon;
            
            System.out.println("\n=== Struk Pembayaran (Non-Member) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 2% (Rp " + nominalDiskon + ")");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);

        } else if (tipeMember == 3 && totalBelanja <= 1000000) {
            diskon = 0.0;
            nominalDiskon = 0;
            totalBayar = totalBelanja;
            
            System.out.println("\n=== Struk Pembayaran (Non-Member) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 0% (Rp 0)");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);

        } else {
            System.out.println("\nTipe member tidak valid! Dianggap Non-Member tanpa diskon.");
            diskon = 0.0;
            nominalDiskon = 0;
            totalBayar = totalBelanja;
            
            System.out.println("\n=== Struk Pembayaran (Non-Member) ===");
            System.out.println("Total Belanja Awal : Rp " + totalBelanja);
            System.out.println("Diskon Didapat     : 0% (Rp 0)");
            System.out.println("Total Bayar Akhir  : Rp " + totalBayar);
        }

        input.close();
    }
}