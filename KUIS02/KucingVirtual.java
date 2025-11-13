package KUIS02;

public class KucingVirtual extends HewanPeliharaan implements IAudible {
    private String warnaBulu;

    public KucingVirtual(String nama, int energi, String warnaBulu) {
        super(nama, energi);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " sedang berjalan dengan aman dan damai.");
        setEnergi(getEnergi() - 2);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " sedang mengeong dengan lembut mengeluarkan suara MEONG~");
        setEnergi(getEnergi() - 2);
    }

    public String getInfo() {
        return "Nama: " + getNama() + " | Warna bulu: " + warnaBulu + " | Energi: " + getEnergi();
    }
}
