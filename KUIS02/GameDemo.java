package KUIS02;

public class GameDemo {
    public static void main(String[] args) {

        KucingVirtual kucing = new KucingVirtual("Pompom", 10, "Putih");
        IkanVirtual ikan = new IkanVirtual("Bubbles", 20, "Air Laut");
        AnjingVirtual anjing = new AnjingVirtual("Runo", 30, "Pelacak");

        System.out.println();
        System.out.println("[ DATA HEWAN PELIHARAAN VIRTUAL ]");

        System.out.println("_____________________________________________________________________________");
        System.out.println(kucing.getInfo());
        System.out.println("_____________________________________________________________________________");

        System.out.println("..............................................................................");
        kucing.makan();
        kucing.bergerak();
        kucing.bersuara();
        System.out.println("Energi akhir kucing: " + kucing.getEnergi() + " kalori");
        System.out.println("..............................................................................");
        System.out.println();

        System.out.println("_____________________________________________________________________________");
        System.out.println(ikan.getInfo());
        System.out.println("_____________________________________________________________________________");

        System.out.println("..............................................................................");
        ikan.makan();
        ikan.bergerak();
        ikan.berenang();
        System.out.println("Energi akhir ikan: " + ikan.getEnergi() + " kalori");
        System.out.println("..............................................................................");
        System.out.println();

        System.out.println("_____________________________________________________________________________");
        System.out.println(anjing.getInfo());
        System.out.println("_____________________________________________________________________________");

        System.out.println("..............................................................................");
        anjing.makan();
        anjing.bergerak();
        anjing.bersuara();
        anjing.berenang();
        System.out.println("Energi akhir anjing: " + anjing.getEnergi() + " kalori");
        System.out.println("..............................................................................");
        System.out.println();

        System.out.println("_____________________________________________________________________________");
        System.out.println("[ ENERGI AKHIR SEMUA HEWAN ]");
        System.out.println("_____________________________________________________________________________");

        System.out.println("..............................................................................");
        System.out.println("Energi " + kucing.getNama() + "  : " + kucing.getEnergi() + " kalori.") ;  //energi awal 10 + makan 50 = [60] - bergerak 2 = [58] - bersuara 2 = 56
        System.out.println("Energi " + ikan.getNama() + "  : " + ikan.getEnergi() + " kalori.");  //energi awal 20 + makan 50 = [70] - bergerak 2 = [68] - berenang 2 = 66
        System.out.println("Energi " + anjing.getNama() + " : " + anjing.getEnergi() + " kalori.");  //energi awal 30 + makan 50 = [80] - bergerak 2 = [78] - bersuara 2 = [76] - berenang 2 = 74
        System.out.println("..............................................................................");
        System.out.println();
    }
}
