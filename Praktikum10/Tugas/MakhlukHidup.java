package Praktikum10.Tugas;

public class MakhlukHidup {
    private String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        return "Nama: " + nama;
    }
}
