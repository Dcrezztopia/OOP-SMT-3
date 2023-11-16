package tugas;

import java.util.Scanner;

public class mainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama;
        int hD;
        float disk;

        System.out.println("==================================================");
        System.out.println("\tSistem Informasi Penjualan");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("Masukkan data barang: ");
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama barang: ");
        nama = sc.nextLine();
        System.out.print("Harga dasar: ");
        hD = sc.nextInt();
        System.out.print("Diskon     : ");
        disk = sc.nextFloat();
        barang b = new barang(nama, nama, hD, disk);
        b.tampilData();

    }
}
