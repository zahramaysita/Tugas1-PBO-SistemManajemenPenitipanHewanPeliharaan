package model;

public class Anjing extends Hewan {

    private String rasAnjing;

    public Anjing(int idHewan, String namaHewan, String namaPemilik, String rasAnjing) {
        super(idHewan, namaHewan, namaPemilik);
        this.rasAnjing = rasAnjing;
    }

    public void setRasAnjing(String rasAnjing) {
        this.rasAnjing = rasAnjing;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Hewan  : Anjing");
        System.out.println("Ras Anjing   : " + rasAnjing);
    }
}