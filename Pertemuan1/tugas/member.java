package tugas;

public class member{
    String id;
    String nama;
    String game;
    int harga;
    
    void tampilTransaksi(){
        System.out.println("===========================================");
        System.out.println("\tDaftar Transaksi Anda");
        System.out.println("===========================================");
        System.out.println("ID         : " +id);
        System.out.println("Nama       : " +nama);
        System.out.println("Judul Game : " +game);
        System.out.println("Harga      : " +harga);
        System.out.println("===========================================");
        System.out.println("\tTerima Kasih");
        System.out.println("===========================================");
    }

    
}
