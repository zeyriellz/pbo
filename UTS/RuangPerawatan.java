package UTS;

import java.util.ArrayList;
import java.util.List;

public class RuangPerawatan {
    private int nomorHewan;
    private List<Hewan> daftarHewan = new ArrayList<>(); 

    public RuangPerawatan(int nomor) { 
        this.nomorHewan = nomor;
    }

    public void tambahHewan(Hewan hewan) { // Overloading method
        daftarHewan.add(hewan);
        System.out.println("Hewan " + hewan.getNama() + " ditambahkan ke ruang " + nomorHewan);
    }

    public void tambahHewan(Hewan hewan, String catatan) { // Overloading method
        daftarHewan.add(hewan);
        System.out.println("Hewan " + hewan.getNama() + " ditambahkan ke ruang " + nomorHewan + " dengan catatan: " + catatan);
    }

    public List<Hewan> getDaftarHewan() {
        return daftarHewan; 
    }
}