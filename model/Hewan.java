package model;

public class Hewan {

    protected int idHewan;
    protected String namaHewan;
    protected String namaPemilik;

    public Hewan(int idHewan, String namaHewan, String namaPemilik) {
        this.idHewan = idHewan;
        this.namaHewan = namaHewan;
        this.namaPemilik = namaPemilik;
    }

    public void tampilkanInfo() {
        System.out.println("ID Hewan     : " + idHewan);
        System.out.println("Nama Hewan   : " + namaHewan);
        System.out.println("Nama Pemilik : " + namaPemilik);
    }
}
