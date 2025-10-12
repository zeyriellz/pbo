public class Minuman {
    public String namaMinuman;
    public String jenisMinuman;
    public String ukuranMinuman;

    public Minuman (String namaMinuman, String jenisMinuman, String ukuranMinuman){
        this.namaMinuman = namaMinuman;
        this.jenisMinuman = jenisMinuman;
        this.ukuranMinuman = ukuranMinuman;
    }

    public void tampilInformasi(){
            System.out.println("Nama Minuman    : " + namaMinuman);
            System.out.println("Jenis Minuman   : " + jenisMinuman);
            System.out.println("Ukuran Minuman  : " + ukuranMinuman);
    }

    public static void tampilDaftarHarga(){
        System.out.println();
        System.out.println("===== DAFTAR HARGA DAN PILIHAN UKURAN MINUMAN =====");
        System.out.println("Gelas Small : Rp 10.000,00");
        System.out.println("Gelas Medium: Rp 15.000,00");
        System.out.println("Gelas Large : Rp 20.000,00");
        System.out.println();
    } 
}
