package Praktikum10;

public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public TV (String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        this.volume += increment;
        System.out.println("Volume TV dinaikkan menjadi " + this.volume);
    }

    @Override
    public void turunkanVolume(int decrement) {
        this.volume -= decrement;
        System.out.println("Volume TV diturunkan menjadi " + this.volume);
    }

    public String getInfo() {
    return "TV: Jenis layar = " + jenisLayar + " || Volume = " + volume + " || Merk = " + getMerk() + " || Warna = " + getWarna() + " || Harga = " + getHarga();
    }

    
}
