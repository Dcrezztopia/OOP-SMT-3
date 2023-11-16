public class Buku {
    String iSBN, judul;
    Penulis penulis;
    int harga;

    public String getISBN() {
        return iSBN;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
