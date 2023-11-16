public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisi;

    public float getA() {
        return alas;
    }

    public float getS() {
        return sisi;
    }

    public float getT() {
        return tinggi;
    }

    public void setA(float alas) {
        this.alas = alas;
    }

    public void setS(float sisi) {
        this.sisi = sisi;
    }

    public void setT(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float hitungKeliling() {
        return 3 * sisi;
    }

    @Override
    public float hitungLuas() {
        return (alas * tinggi) / 2;
    }
}
