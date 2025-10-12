public class MinumanPanas extends Minuman {
    private String caraPenyajian;

    public MinumanPanas (String namaMinuman, String jenisMinuman, String ukuranMinuman, String caraPenyajian){
        super (namaMinuman, jenisMinuman, ukuranMinuman);
        this.caraPenyajian = caraPenyajian;
    }

    public void tampilInformasi(){
    super.tampilInformasi();
    System.out.println("Cara Penyajian  : " + caraPenyajian);
    System.out.println();
    }
}
