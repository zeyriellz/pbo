package UTS;

public class Main {
    public static void main(String[] args) {
    
        Pemilik p1 = new Pemilik("Budi", "Jl. Melati No. 5"); // Constructor Pemilik

        Kucing kucing1 = new Kucing("Mimi", "2 tahun", p1, "Putih"); // Constructor Kucing
        Ayam ayam1 = new Ayam("Koko", "1 tahun", p1, "Ayam Bangkok");// Constructor Ayam

        System.out.println("------------------------------------------------------------------------");
        System.out.println("==== Data Pemilik =====");
        System.out.println("Nama Pemilik : " + p1.getNama()); 
        System.out.println("Alamat       : " + p1.getAlamat());
        System.out.println("------------------------------------------------------------------------");

        kucing1.periksa(); 
        ayam1.periksa();

        System.out.println("------------------------------------------------------------------------");

        KartuPerawatan kartu1 = new KartuPerawatan(kucing1, "2025-10-15", "Vaksin rabies");
        System.out.println(kartu1.getInfo());// Menampilkan info kartu perawatan  
        RuangPerawatan ruang1 = new RuangPerawatan(101);
        ruang1.tambahHewan(kucing1); // Memanggil method tambahHewan
        System.out.println();
        KartuPerawatan kartu2 = new KartuPerawatan(ayam1, "2025-10-14", "Sakit kaki");
        System.out.println(kartu2.getInfo());// Menampilkan info kartu perawatan
        ruang1.tambahHewan(ayam1, "Sulit berjalan"); // Memanggil method tambahHewan dengan parameter tambahan

        System.out.println("------------------------------------------------------------------------");

    }
}
