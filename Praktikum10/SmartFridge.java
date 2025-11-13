package Praktikum10;

public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public void naikkanVolume(int increment) {
        volume += increment;
        System.out.println("Volume SmartFridge dinaikkan menjadi " + volume);
    }

    public void turunkanVolume(int decrement) {
        volume -= decrement;
        System.out.println("Volume SmartFridge diturunkan menjadi " + volume);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getInfo() {
    return "SmartFridge: Jumlah pintu = " + getJumlahPintu() + " || Volume = " + volume + " || Merk = " + getMerk() + " || Warna = " + getWarna() + " || Harga = " + getHarga();
}

}
