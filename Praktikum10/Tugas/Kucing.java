package Praktikum10.Tugas;

public class Kucing extends Hewan implements Gerak {

    public Kucing(String nama, String jenisMakanan) {
        super(nama, jenisMakanan);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " berjalan dengan empat kaki.");
    }

    @Override
    public String getInfo() {
        return "Kucing -> " + super.getInfo();
    }
}
