package UTS;

public class KartuPerawatan {
    private Hewan hewan;
    private String tanggal;
    private String deskripsi;

    public KartuPerawatan(Hewan hewan, String tanggal, String deskripsi) {
        this.hewan = hewan;
        this.tanggal = tanggal;
        this.deskripsi = deskripsi;
    }

    public String getInfo() {
        return "Perawatan untuk " + hewan.getNama() + " pada " + tanggal + ": " + deskripsi;
    }
}
