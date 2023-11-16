package tugas;

public class lingkaran {
    double phi;
    double r;

    double hitungLuas(){
        double hasil = phi*r*r;
        return hasil;
    }

    double hitngKeliling(){
        double hasil = phi*(r+r);
        return hasil;
    }
}
