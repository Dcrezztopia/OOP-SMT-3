public class MainPegawai {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("222884", "Pascalis", "Malang");
        Dosen d2 = new Dosen("222024", "Dewa", "Purwokerto");
        Dosen d3 = new Dosen("222234", "Sandi", "Bekasi");

        d1.tarif_SKS = 50000;
        d1.jumlahSKS = 10;

        d2.tarif_SKS = 50000;
        d2.jumlahSKS = 8;

        d3.jumlahSKS = 9;
        d3.tarif_SKS = 50000;

        DaftarGaji dg = new DaftarGaji(2);

        dg.addPegawai(d1);
        dg.addPegawai(d2);
        dg.addPegawai(d3);

        dg.printSemuaGaji();
    }
}
