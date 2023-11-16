import java.util.ArrayList;

class DaftarGaji {
    private ArrayList<Pegawai> listPegawai;

    public DaftarGaji(int kapasitas) {
        listPegawai = new ArrayList<Pegawai>(kapasitas);
    }

    public void addPegawai(Pegawai pegawai) {
        listPegawai.add(pegawai);
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            System.out.println("Nama Pegawai: " + pegawai.getNama());
            System.out.println("Gaji Pegawai: " + pegawai.getGaji());
            System.out.println("------------------------");
        }
    }
}