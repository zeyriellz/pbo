public class Perawat extends TenagaMedis {
    String shift;

    public Perawat(String id, String nama, String umur, String jenisKelamin, String shift) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.shift = shift;
    }

    public void melayani() {
        System.out.println("Perawat " + nama + " sedang melayani pasien dengan mengecek obatnya.");
    }
}


