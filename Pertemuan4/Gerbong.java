public class Gerbong {
    private String kode;
    private Kursi[] kursi;

    private void initKursi() {
        for (int i = 0; i < kursi.length; i++) {
            this.kursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.kursi = new Kursi[jumlah];
        this.initKursi();
    }

    public String getKode() {
        return kode;
    }

    public Kursi[] kursi() {
        return kursi;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        Kursi kursi = this.kursi[nomor - 1];
        if (!kursi.isTerisi()) {
            kursi.setPenumpang(penumpang);
        } else {
            System.out.println("Kursi nomor " + nomor + " sudah terisi.");
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : kursi) {
            info += kursi.info();
        }
        return info;
    }

}
