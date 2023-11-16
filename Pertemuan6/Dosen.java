public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int tarif_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return jumlahSKS * tarif_SKS;
    }
}
