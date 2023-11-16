public class Lingkaran extends BangunDatar {
    private float phi;
    private float jari;

    public float getJ() {
        return jari;
    }

    public float getPhi() {
        return phi;
    }

    public void setJ(float jari) {
        this.jari = jari;
    }

    public void setPhi(float phi) {
        this.phi = phi;
    }

    @Override
    public float hitungKeliling() {
        return phi * (2 * jari);
    }

    @Override
    public float hitungLuas() {
        return phi * jari * jari;
    }
}
