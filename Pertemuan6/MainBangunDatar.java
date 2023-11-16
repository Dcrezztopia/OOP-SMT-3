public class MainBangunDatar {
    public static void main(String[] args) {
        PersegiPanjang perPan = new PersegiPanjang();
        Segitiga setiga = new Segitiga();
        Lingkaran lingkar = new Lingkaran();

        perPan.setJenis("Persegi Panjang");
        setiga.setJenis("Segitiga");
        lingkar.setJenis("Lingkaran");
        perPan.setP(4);
        perPan.setL(5);

        setiga.setS(6);
        setiga.setA(6);
        setiga.setT(8);

        lingkar.setPhi(3.14f);
        lingkar.setJ(15);

        System.out.println("Jenis Bangun Datar: " + perPan.getJenis());
        System.out.println("Keliling: " + perPan.hitungKeliling());
        System.out.println("Luas: " + perPan.hitungLuas());
        System.out.println();
        System.out.println("Jenis Bangun Datar: " + setiga.getJenis());
        System.out.println("Keliling: " + setiga.hitungKeliling());
        System.out.println("Luas: " + setiga.hitungLuas());
        System.out.println();
        System.out.println("Jenis Bangun Datar: " + lingkar.getJenis());
        System.out.println("Keliling: " + lingkar.hitungKeliling());
        System.out.println("Luas: " + lingkar.hitungLuas());
    }
}
