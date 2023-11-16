public class testBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku();
        Penulis p1 = new Penulis();
        p1.setNama("Bambang Soesatyo");
        p1.setAlamat("Jl. Kaliurang No. 20, Bandung");
        b1.setISBN("0123");
        b1.setJudul("Java Programming");
        b1.setPenulis(p1);
        b1.setHarga(25000);
        System.out.println("\nData buku : ");
        System.out.println("ISBN    : " + b1.getISBN());
        System.out.println("Judul   : " + b1.getJudul());
        System.out.println("Penulis : " + b1.getPenulis().getNama() + "\t");
        System.out.println("Harga   : " + b1.getHarga());
    }
}
