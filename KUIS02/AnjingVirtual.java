package KUIS02;

public class AnjingVirtual extends HewanPeliharaan implements IAudible, ISwimmable { 
    private String jenisPekerjaan; 

    public AnjingVirtual(String nama, int energi, String jenisPekerjaan) { 
        super(nama, energi); 
        this.jenisPekerjaan = jenisPekerjaan; 
    }

    @Override 
    public void bergerak() {
        System.out.println(getNama() + " sedang berlari dengan semangat menjalankan tugas sebagai " + jenisPekerjaan + ".");
        setEnergi(getEnergi() - 2);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " sedang menggonggong keras mengeluarkan suara GUK GUK");
        setEnergi(getEnergi() - 2);
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " sedang berenang dengan santai di kolam renang.");
        setEnergi(getEnergi() - 2);
    }

    public String getInfo() {
        return "Nama: " + getNama() + " | Jenis pekerjaan: " + jenisPekerjaan + " | Energi: " + getEnergi();
    }
}
