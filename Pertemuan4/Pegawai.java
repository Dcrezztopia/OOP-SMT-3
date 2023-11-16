public class Pegawai {
    private String nip;
    private String nama;

    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String newNip) {
        nip = newNip;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String info() {
        String info = " ";
        info += "Nip : " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
