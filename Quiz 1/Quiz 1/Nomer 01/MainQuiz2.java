import java.util.Scanner;
public class MainQuiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis bangun datar (Segitiga sama sisi / PersegiPanjang / Lingkaran):");
        String jenisBangun = input.nextLine();

        if (jenisBangun.equalsIgnoreCase("Segitiga sama sisi")) {
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();

            Segitiga segitiga = new Segitiga(alas, tinggi);
            segitiga.cetak();
            System.out.println("Luas: " + segitiga.hitungLuas());
            System.out.println("Keliling: " + segitiga.hitungKeliling());
        } else if (jenisBangun.equalsIgnoreCase("PersegiPanjang")) {
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();

            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            persegiPanjang.cetak();
            System.out.println("Luas: " + persegiPanjang.hitungLuas());
            System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
        } else if (jenisBangun.equalsIgnoreCase("Lingkaran")) {
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();

            Lingkaran lingkaran = new Lingkaran(jariJari);
            lingkaran.cetak();
            System.out.println("Luas: " + lingkaran.hitungLuas());
            System.out.println("Keliling: " + lingkaran.hitungKeliling());
        } else {
            System.out.println("Jenis bangun datar tidak valid.");
        }

        input.close();
    }
}


