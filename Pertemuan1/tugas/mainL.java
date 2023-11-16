package tugas;

import java.util.Scanner;

public class mainL {
    public static void main(String[] args) {
        lingkaran li = new lingkaran();
        Scanner sc = new Scanner(System.in);
        double phi, r, hasil;
        System.out.print("Sistem Hitung Lingkaran\n1. Hitung Luas\n2. Hitung Keliling\nMasukkan pilihan: ");
        int pilih = sc.nextInt();
        System.out.print("Masukkan phi: ");
        phi = sc.nextDouble();
        System.out.print("Masukkan jari-jari: ");
        r = sc.nextDouble();
        li.phi = phi;
        li.r = r;
        if (pilih == 1) {
            hasil = li.hitungLuas();
            System.out.println("Hasil Luas: " + hasil);
        } else {
            hasil = li.hitngKeliling();
            System.out.println("Hasil Keliling: " + hasil);
        }
    }
}
