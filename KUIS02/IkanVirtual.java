package KUIS02;

public class IkanVirtual extends HewanPeliharaan implements ISwimmable {
    private String jenisAir;

    public IkanVirtual(String nama, int energi, String jenisAir) {
        super(nama, energi);
        this.jenisAir = jenisAir;
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " sedang bergerak lincah di dalam " + jenisAir + ".");
        setEnergi(getEnergi() - 2);
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " sedang berenang cepat di sungai");
        setEnergi(getEnergi() - 2);
    }

    public String getInfo() {
        return "Nama: " + getNama() + " | Jenis air: " + jenisAir + " | Energi: " + getEnergi();
    }
}
