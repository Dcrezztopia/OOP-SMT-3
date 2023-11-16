/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;

public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur){
        this.lembur = lembur;
    }
    
    public int getLembur(){
        return lembur;
    }
    
    public void setGajiLembur(double gajiLembur){
        this.gajiLembur = gajiLembur;
    }
    
    public double getGajiLembur(){
        return gajiLembur;
    }
    
    // Overloading
    public double getGaji(int lembur, double gajiLembur){
        return super.getGaji() + lembur*gajiLembur;
    }
    // Overriding
    public double getGaji(){
        return super.getGaji() + lembur*gajiLembur;
    }
    
    public void lihatInfo(){
        System.out.println("NIP     : " +this.getNip());
        System.out.println("Nama    : " +this.getNama());
        System.out.println("golongan    : " +this.getGolongan());
        System.out.println("Jml Lembur  : " +this.getLembur());
        System.out.printf("Gaji Lembur : %.of\n", this.getGajiLembur());
        System.out.printf("Gaji    : %.of\n", this.getGaji());
    }
}
