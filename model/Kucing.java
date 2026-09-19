package model;

public class Kucing extends Hewan {

    private String rasKucing;

    public Kucing(int idHewan, String namaHewan, String namaPemilik, String rasKucing) {
        super(idHewan, namaHewan, namaPemilik);
        this.rasKucing = rasKucing;
    }

    public void setRasKucing(String rasKucing) {
        this.rasKucing = rasKucing;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Hewan  : Kucing");
        System.out.println("Ras Kucing   : " + rasKucing);
    }
}
