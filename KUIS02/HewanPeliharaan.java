package KUIS02;

public abstract class HewanPeliharaan { 
    private String nama; 
    private int energi ;

    public HewanPeliharaan(String nama, int energi) { 
        this.nama = nama; 
        this.energi = energi; 
    }

    public String getNama() {
        return nama;
    }

    public int getEnergi() { 
        return energi; 
    }

    public void setEnergi(int energi) { 
        this.energi = energi; 
    }

    public void makan() { 
    energi += 50;
    System.out.println(nama + " sedang makan dan energinya sekarang adalah " + energi + " kalori."); 
    }

    public abstract void bergerak(); 
}
