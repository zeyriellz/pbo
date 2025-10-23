package UTS;

    public class Ayam extends Hewan { // Kelas Ayam yang mewarisi kelas Hewan
    private String jenis;

    public Ayam(String nama, String umur, Pemilik pemilik, String jenis) {
        super(nama, umur, pemilik);
        this.jenis = jenis;
    }

    public void periksa() {
        System.out.println("Sedang memeriksa ayam bernama " + getNama() + ", jenis: " + jenis);
    }
}
