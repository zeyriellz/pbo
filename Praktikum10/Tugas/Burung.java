package Praktikum10.Tugas;

public class Burung extends Hewan implements IGerak, ITerbang {

    public Burung(String nama, String jenisMakanan) {
        super(nama, jenisMakanan);
    }

    @Override
    public void IBergerak() {
        System.out.println(getNama() + " melompat di tanah.");
    }

    @Override
    public void ITerbang() {
        System.out.println(getNama() + " terbang tinggi di langit.");
    }

    @Override
    public String getInfo() {
        return "Burung -> " + super.getInfo();
    }
}

