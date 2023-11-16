package sistemNilai;

public class Mahasiswa1 {
    public String nim, nama, kelas, jurusan, prodi;
    public char jenisKel;
    public int semester;

    public void biodataMHS() {
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Jenis Kelamin\t: " + jenisKel);
        System.out.println("Jurusan\t\t: " + jurusan);
        System.out.println("Program Studi\t: " + prodi);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("Semester\t\t:" + semester);
    }
}
