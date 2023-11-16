package sistemNilai;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Mahasiswa1 mhs1 = new Mahasiswa1();
        Dosen ds1 = new Dosen();
        Matakuliah mk1 = new Matakuliah();
        Matakuliah mk2 = new Matakuliah();
        Scanner sc = new Scanner(System.in);
        String matkul;
        int tugas, kuis, uts, uas;

        System.out.println("==============================================");
        System.out.println("\t\t\tSistem Penilaian\t\t");
        System.out.println("==============================================");

        System.out.println("Tampilkan Daftar Mata Kuliah: ");
        mk1.nama = "PBO";
        mk1.sks = 3;
        mk1.ListMatkul();   
        mk2.nama = "Basdat";
        mk2.sks = 2;
        mk2.ListMatkul();

        System.out.print("Pilih Mata Kuliah: ");
        matkul = sc.nextLine();
        System.out.println("Masukkan nilai: ");
        // sc.nextLine();
        System.out.print("Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Kuis : ");
        kuis = sc.nextInt();
        System.out.print("UTS  : ");
        uts = sc.nextInt();
        System.out.print("UAS  : ");
        uas = sc.nextInt();

        mhs1.nim = "2241720002";
        mhs1.nama = "Dicky Desmond";
        mhs1.kelas = "TI-1E";
        mhs1.jenisKel = 'L';
        mhs1.semester = 2;
        mhs1.jurusan = "Teknologi Informasi";
        mhs1.prodi = "D4 - Teknik Informatika";
        mhs1.biodataMHS();

        System.out.println();

        ds1.nip = "12300890";
        ds1.nama = "Joni Jubaedi";
        ds1.jenisKel = 'L';
        ds1.bidangKeahlian = "Teknologi Informasi";
        ds1.biodataDosen();

        System.out.println();

        System.out.println("Daftar Nilai: ");
        System.out.println("Mata kuliah: " + matkul);
        System.out.println("Tugas      : " + tugas);
        System.out.println("Kuis       : " + kuis);
        System.out.println("UTS        : " + uts);
        System.out.println("UAS        : " + uas);

    }
}
