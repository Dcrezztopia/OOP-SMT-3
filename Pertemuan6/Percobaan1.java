public class Percobaan1 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        ClassA angka = new ClassA();
        angka.x = 20;
        angka.y = 30;
        hitung.z = 5;
        angka.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();

    }
}
