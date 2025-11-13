public class Main {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("D111", "Dr Budi. ", "40 Tahun", "Perempuan", "Dokter Anak");
        Perawat perawat1 = new Perawat("P222", "Nurse Dika", "30 Tahun", "Perempuan", "Shift Pagi");

        System.out.println("=== Informasi Dokter ===");
        dokter1.melayani();
        dokter1.istirahat();
        System.out.println();

        System.out.println("=== Informasi Perawat ===");
        perawat1.melayani();
        perawat1.istirahat();
        System.out.println();
    }
}





