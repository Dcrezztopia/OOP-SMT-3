public class Kursi {
    private String nomor;
    Penumpang penumpang;

    Kursi(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public boolean isTerisi() {
        return penumpang != null;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }

}
