public abstract class TenagaMedis {
    String id;
    String nama;
    String umur;
    String jenisKelamin;

    public abstract void melayani();

    public void istirahat() {
        System.out.println("Tenaga medis sedang beristirahat.");
    }
}


