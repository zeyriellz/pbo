package Praktikum10.Tugas;
public class Hewan extends MakhlukHidup {
    private String jenisMakanan;

    public Hewan(String nama, String jenisMakanan) {
        super(nama);
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " || Jenis Makanan: " + jenisMakanan;
    }
}
