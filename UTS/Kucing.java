package UTS;

    public class Kucing extends Hewan { // Kucing yang mewarisi kelas Hewan
    private String warna;

    public Kucing(String nama, String umur, Pemilik pemilik, String warna) { // Constructor
        super(nama, umur, pemilik);
        this.warna = warna;
    }

    public void periksa() {
        System.out.println("Sedang memeriksa kucing bernama " + getNama() + ", warna: " + warna);
    }
}

