class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    

    public Segitiga(double alas, double tinggi) {
        super("Segitiga sama sisi");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas+alas+alas;
    }
}

