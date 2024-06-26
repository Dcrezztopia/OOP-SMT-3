public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    Pelanggan() {
    }

    public String getNama() {
        return nama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setMobil(Mobil newMobil) {
        mobil = newMobil;
    }

    public void setSopir(Sopir newSopir) {
        sopir = newSopir;
    }

    public void setHari(int newHari) {
        hari = newHari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
