public class MainQuiz1 {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(3);

        Pegawai pegawai1 = new Pegawai("007", "Maul", "Jl. Baik 07");
        Dosen dosen1 = new Dosen("111", "Athiyan", "Jl. Damai 53");

        dosen1.setSKS(10);
        pegawai1.setSKS(5);
        daftarGaji.addPegawai(pegawai1);
        daftarGaji.addPegawai(dosen1);

        daftarGaji.printSemuaGaji();
    }
}