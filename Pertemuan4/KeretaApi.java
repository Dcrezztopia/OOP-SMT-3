public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai Masinis;
    private Pegawai Asisten;

    KeretaApi(String nama, String kelas, Pegawai Masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.Masinis = Masinis;
    }

    KeretaApi(String nama, String kelas, Pegawai Masinis, Pegawai Asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.Masinis = Masinis;
        this.Asisten = Asisten;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setKelas(String newKelas) {
        kelas = newKelas;
    }

    public String info() {
        String info = "";
        info += "Nama   : " + this.nama + "\n";
        info += "Kelas  : " + this.kelas + "\n";
        info += "Masinis: " + this.Masinis.info() + "\n";
        info += "Asisten: " + this.Asisten.info() + "\n";
        return info;
    }

    public String infoMasinis() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.Masinis.info() + "\n";
        return info;
    }

}
