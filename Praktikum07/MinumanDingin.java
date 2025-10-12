public class MinumanDingin extends Minuman {
    private String toppingMinuman;

    public MinumanDingin(String namaMinuman, String jenisMinuman, String ukuranMinuman, String toppingMinuman){
        super (namaMinuman, jenisMinuman, ukuranMinuman);
        this.toppingMinuman = toppingMinuman;
    }

    public void tampilInformasi(){
        super.tampilInformasi();
        System.out.println("Topping         : " + toppingMinuman);
    }
}
