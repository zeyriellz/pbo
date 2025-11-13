package Praktikum10.Tugas;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kucing", "Karnivora");
        Burung burung = new Burung("Burung", "Omnivora");

        System.out.println();
        System.out.println("===== [ DATA MAKHLUK HIDUP ] =====");

        System.out.println("-----------------------------------------------------");
        System.out.println(kucing.getInfo());
        System.out.println("-----------------------------------------------------");
        System.out.println(burung.getInfo()); 
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("===== [ Tes Kemampuan Hewan ] =====");
        System.out.println("-----------------------------------------------------");
        kucing.bergerak();         
        System.out.println("-----------------------------------------------------");
        burung.bergerak();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("-----------------------------------------------------");
        burung.terbang();
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }
}
