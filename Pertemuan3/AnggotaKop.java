public class AnggotaKop {
    private String nik;
    private String nama;
    private double limit;
    private double pinjaman;
    private double angsuran;

    AnggotaKop(String nik, String nama, double limit) {
        this.nik = nik;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public double getLimit() {
        return limit;
    }

    // public double getPinjaman(){
    // if (pinjaman > limit){
    // System.out.println("Maaf, jumlah pinjaman melebihi limit.");
    // } else{
    // return pinjaman;
    // }
    // }

    public void Pinjam(double jumlah) {
        if (jumlah > limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            pinjaman = jumlah;
            System.out.println("Jumlah pinjaman saat ini: " + pinjaman);
        }
    }

    public void Angsur(double angsur) {
        if (angsur < (pinjaman * 10 / 100)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            System.out.println("Angsuran per-bulan: " + angsur);
        }
    }
}
