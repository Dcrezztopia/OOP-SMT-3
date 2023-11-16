// import java.util.ArrayList;
public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jumlahPegawai = 0;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
        kapasitas = 0;
    }

    public void addPegawai(Pegawai pegawai) {

        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar pegawai sudah penuh.");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlahPegawai; i++) {
            if (listPegawai[i] instanceof Dosen) {
                Dosen dosen = (Dosen) listPegawai[i];
                System.out.println(
                        "NIP: " + dosen.getNip() + "  Nama: " + dosen.getNama() + ", Gaji: " + dosen.getGaji());
            }
        }
    }
}
