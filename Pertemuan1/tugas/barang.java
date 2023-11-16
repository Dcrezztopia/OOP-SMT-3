package tugas;

public class barang {
    String kode;
    String nama;
    int hargaDasar;
    float diskon;

    public barang(String a, String b, int c, float d) {
        this.kode = a;
        this.nama = b;
        this.hargaDasar = c;
        this.diskon = d;
    }

    int hitungHargaJual() {
        float hargaJual = hargaDasar - (diskon * hargaDasar);
        return (int) hargaJual;
    }

    void tampilData() {
        System.out.println("====================================");
        System.out.println("\tData Barang");
        System.out.println("====================================");
        System.out.println();
        System.out.println("Kode       : " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon     : " + diskon);
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
}
