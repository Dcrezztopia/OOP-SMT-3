public class Sopir {
    private String nama;
    private int biaya;

    Sopir() {
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
