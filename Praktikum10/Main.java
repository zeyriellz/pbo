package Praktikum10;

public class Main {
    public static void main(String[] args) {

        Kipas kipas = new Kipas("Dinding", 300000, "Putih", "Miyako");
        TV tv = new TV("LED", 10, 2500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 3500000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(5, 2, 7500000, "Abu-abu", "Panasonic");

        System.out.println();
        System.out.println("===== [ DATA ALAT ELEKTRONIK ] =====");

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(kipas.getInfo());
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println(tv.getInfo());
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println(kulkas.getInfo());
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println(smartFridge.getInfo());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("===== [ Tes Kapabilitas Audible ] =====");
        System.out.println("-----------------------------------------");
        tv.naikkanVolume(5);
        tv.turunkanVolume(2);
        System.out.println("-----------------------------------------");
        smartFridge.naikkanVolume(3);
        smartFridge.turunkanVolume(1);
        System.out.println("-----------------------------------------");
        System.out.println();

        System.out.println("===== [ Volume Akhir ] =====");
        System.out.println("-----------------------------------------");
        System.out.println("Volume TV sekarang          : " + tv.getVolume());
        System.out.println("-----------------------------------------");
        System.out.println("Volume SmartFridge sekarang : " + smartFridge.getVolume());
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}
