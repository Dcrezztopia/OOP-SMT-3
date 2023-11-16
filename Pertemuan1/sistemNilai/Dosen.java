package sistemNilai;

public class Dosen {
    public String nip, nama, bidangKeahlian;
    public char jenisKel;

    void biodataDosen() {
        System.out.println("Nama Dosen\t\t: " +nama);
        System.out.println("NIP\t\t\t: " +nip);
        System.out.println("Jenis Kelamin\t\t: " +jenisKel);
        System.out.println("Bidang Keahlian\t: " +bidangKeahlian);
    }
}
