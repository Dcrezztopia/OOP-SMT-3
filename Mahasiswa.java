public class Mahasiswa {
    String nim, nama, alamat;     
    char jenisKelamin; 
     
    Mahasiswa(String nim, String nama, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
     
    public static void main(String[] args) { 
        String nim, nama, alamat;
        nim = "02130";
        nama = "Joni";
        alamat = "Bandung";
        Mahasiswa m = new Mahasiswa(nim, nama, alamat);
    } 

}
