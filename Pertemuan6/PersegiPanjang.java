public class PersegiPanjang extends BangunDatar {
    private float p;
    private float l;

    public float getP() {
        return p;
    }

    public float getL() {
        return l;
    }

    public void setP(float p) {
        this.p = p;
    }

    public void setL(float l) {
        this.l = l;
    }

    @Override
    public float hitungKeliling() {
        return 2 * (p + l);
    }

    @Override
    public float hitungLuas() {
        return p * l;
    }
}
