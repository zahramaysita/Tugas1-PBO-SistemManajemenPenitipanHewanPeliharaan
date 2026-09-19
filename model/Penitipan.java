package model;

public class Penitipan {

    private int idPenitipan;
    private int idHewan;
    private String tanggalMasuk;
    private int lamaPenitipan;
    private String status;

    public Penitipan(int idPenitipan, int idHewan, String tanggalMasuk,
                     int lamaPenitipan, String status) {

        this.idPenitipan = idPenitipan;
        this.idHewan = idHewan;
        this.tanggalMasuk = tanggalMasuk;
        this.lamaPenitipan = lamaPenitipan;
        this.status = status;
    }

    public int getIdPenitipan() {
        return idPenitipan;
    }

    public int getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(int idHewan) {
        this.idHewan = idHewan;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public void setLamaPenitipan(int lamaPenitipan) {
        this.lamaPenitipan = lamaPenitipan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanInfo() {
        System.out.println("ID Penitipan   : " + idPenitipan);
        System.out.println("ID Hewan       : " + idHewan);
        System.out.println("Tanggal Masuk  : " + tanggalMasuk);
        System.out.println("Lama Penitipan : " + lamaPenitipan + " hari");
        System.out.println("Status         : " + status);
    }
}