public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {
    }

    public String getMerk() {
        return merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
