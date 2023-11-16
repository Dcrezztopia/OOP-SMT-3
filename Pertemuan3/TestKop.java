import java.util.Scanner;

public class TestKop {
    public static void main(String[] args) {
        AnggotaKop donny = new AnggotaKop("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimit());

        System.out.print("Masukkan jumlah pinjaman: ");
        double jumlah = sc.nextDouble();
        System.out.print("Masukkan angsuran per-bulan: ");
        double angsur = sc.nextDouble();

        donny.Pinjam(jumlah);
        donny.Angsur(angsur);
    }
}
