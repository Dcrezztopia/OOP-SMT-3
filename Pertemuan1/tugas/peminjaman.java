package tugas;

import java.util.Scanner;

public class peminjaman {
    public static void main(String[] args) {
        member m = new member();
        String id, nama, game;
        int harga;
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("\tSelamat Datang di Rental Game");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Masukkan data diri:");
        System.out.print("ID        : ");
        id = sc.nextLine();
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("Judul Game: ");
        game = sc.nextLine();
        System.out.print("Total   : ");
        harga = sc.nextInt();
        m.id = id;
        m.nama = nama;
        m.game = game;
        m.harga = harga;
        m.tampilTransaksi();
    }
}
