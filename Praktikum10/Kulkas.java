package Praktikum10;

public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }q

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public String getInfo() {
    return "Kulkas: Jumlah pintu = " + jumlahPintu + " || Merk = " + getMerk() + " || Warna = " + getWarna() + " || Harga = " + getHarga();
    }
}

