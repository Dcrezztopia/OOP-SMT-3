public class Pegawai {
    public String nip, nama, alamat;

    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNip() {
        return nip;
    }

    public int getGaji(Dosen dosen) {
        return dosen.getGaji();
    }
}
