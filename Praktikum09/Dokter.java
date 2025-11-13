public class Dokter extends TenagaMedis {
    String spesialis;

    public Dokter(String id, String nama, String umur, String jenisKelamin, String spesialis) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.spesialis = spesialis;
    }

    public void melayani() {
        System.out.println("Dokter " + nama + " sedang memeriksa tubuh pasien.");
    }
}



