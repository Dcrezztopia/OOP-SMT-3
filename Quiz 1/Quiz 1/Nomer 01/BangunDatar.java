import java.util.Scanner;

class BangunDatar {
    private String jenis;

    public BangunDatar(String jenis) {
        this.jenis = jenis;
    }

    public void cetak() {
        System.out.println("Ini adalah bangun datar " + jenis);
    }
}
