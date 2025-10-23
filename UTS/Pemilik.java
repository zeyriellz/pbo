package UTS;

public class Pemilik {
    private String namaPemilik;
    private String alamatPemilik;

    public Pemilik(String namaPemilik, String alamatPemilik) {
        this.namaPemilik = namaPemilik;
        this.alamatPemilik = alamatPemilik;
    }

    public String getNama() {
        return namaPemilik; // Getter namaPemilik
    }

    public void setNama(String nama) {
        this.namaPemilik = nama; // Setter namaPemilik
    }
    
    public String getAlamat() {
        return alamatPemilik; // Getter alamatPemilik
    }
}
