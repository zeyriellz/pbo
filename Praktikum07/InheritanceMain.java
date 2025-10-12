public class InheritanceMain {
    public static void main(String[] args) {
        Minuman.tampilDaftarHarga();

        MinumanDingin matchaLatte = new MinumanDingin("Matcha Latte", "Dingin", "Gelas Large", "Ice Cream");
        MinumanPanas caramelLatte = new MinumanPanas("Caramel Latte", "Panas", "Gelas Medium", "Seduh Langsung");

        System.out.println("===== MINUMAN DINGIN =====");
        matchaLatte.tampilInformasi();
        System.out.println();

        System.out.println("===== MINUMAN PANAS =====");
        caramelLatte.tampilInformasi();
    }
}
