package UTS;

    public class Hewan { 
    private String namaHewan;
    private String umurHewan;
    private Pemilik pemilik;

    public Hewan(String namaHewan, String umurHewan, Pemilik pemilik) { // Constructor
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.pemilik = pemilik;
    }

    public String getNama() {
        return namaHewan;
    }

    public void setNama(String nama) {
        this.namaHewan = nama;
    }

    public String getUmur() {
        return umurHewan;
    }

    public Pemilik getPemilik() {
        return pemilik;
    }

    public void periksa() { // Method
        System.out.println("Memeriksa hewan: " + namaHewan + ", Umur: " + umurHewan + ", Pemilik: " + pemilik.getNama());
    }
}

