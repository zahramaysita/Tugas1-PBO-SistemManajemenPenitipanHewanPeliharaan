package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private ArrayList<Penitipan> daftarPenitipan = new ArrayList<>();

    private Scanner scanner;

    public Service(Scanner scanner) {
        this.scanner = scanner;
    }

    // =========================
    // VALIDASI INPUT ANGKA
    // =========================

    private int inputAngka(String pesan) {

        while (true) {

            System.out.print(pesan);

            try {

                int angka = scanner.nextInt();
                scanner.nextLine();

                return angka;

            } catch (Exception e) {

                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
            }
        }
    }

    // =========================
    // TAMBAH DATA HEWAN
    // =========================

    public void tambahHewan() {

        System.out.println("\n===== TAMBAH DATA HEWAN =====");

        int id = inputAngka("ID Hewan       : ");

        if (id <= 0) {
            System.out.println("ID hewan tidak valid!");
            return;
        }

        for (Hewan hewan : daftarHewan) {

            if (hewan.idHewan == id) {
                System.out.println("ID hewan sudah digunakan!");
                return;
            }
        }

        System.out.print("Nama Hewan     : ");
        String nama = scanner.nextLine();

        if (nama.isEmpty()) {
            System.out.println("Nama hewan tidak boleh kosong!");
            return;
        }

        System.out.print("Nama Pemilik   : ");
        String pemilik = scanner.nextLine();

        if (pemilik.isEmpty()) {
            System.out.println("Nama pemilik tidak boleh kosong!");
            return;
        }

        System.out.println("\nJenis Hewan:");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");

        int pilihan = inputAngka("Pilih Jenis    : ");

        Hewan hewan;

        if (pilihan == 1) {

            System.out.print("Ras Kucing     : ");
            String ras = scanner.nextLine();

            if (ras.isEmpty()) {
                System.out.println("Ras kucing tidak boleh kosong!");
                return;
            }

            hewan = new Kucing(id, nama, pemilik, ras);

        } else if (pilihan == 2) {

            System.out.print("Ras Anjing     : ");
            String ras = scanner.nextLine();

            if (ras.isEmpty()) {
                System.out.println("Ras anjing tidak boleh kosong!");
                return;
            }

            hewan = new Anjing(id, nama, pemilik, ras);

        } else {

            System.out.println("Jenis hewan tidak tersedia!");
            return;
        }

        daftarHewan.add(hewan);

        System.out.println("Data hewan berhasil ditambahkan!");
    }

    // =========================
    // TAMPILKAN DATA HEWAN
    // =========================

    public void tampilkanHewan() {

        System.out.println("\n===== DATA HEWAN =====");

        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
            return;
        }

        for (Hewan hewan : daftarHewan) {

            hewan.tampilkanInfo();

            System.out.println("----------------------------");
        }
    }

    // =========================
    // UPDATE DATA HEWAN
    // =========================

    public void updateHewan() {

        System.out.println("\n===== UPDATE DATA HEWAN =====");

        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
            return;
        }

        int id = inputAngka("Masukkan ID Hewan : ");

        Hewan hewanDitemukan = null;

        for (Hewan hewan : daftarHewan) {

            if (hewan.idHewan == id) {
                hewanDitemukan = hewan;
                break;
            }
        }

        if (hewanDitemukan == null) {
            System.out.println("Data hewan tidak ditemukan!");
            return;
        }

        System.out.print("Nama Hewan Baru   : ");
        String namaBaru = scanner.nextLine();

        if (namaBaru.isEmpty()) {
            System.out.println("Nama hewan tidak boleh kosong!");
            return;
        }

        System.out.print("Nama Pemilik Baru : ");
        String pemilikBaru = scanner.nextLine();

        if (pemilikBaru.isEmpty()) {
            System.out.println("Nama pemilik tidak boleh kosong!");
            return;
        }

        hewanDitemukan.namaHewan = namaBaru;
        hewanDitemukan.namaPemilik = pemilikBaru;

        if (hewanDitemukan instanceof Kucing) {

            System.out.print("Ras Kucing Baru   : ");
            String rasBaru = scanner.nextLine();

            if (rasBaru.isEmpty()) {
                System.out.println("Ras kucing tidak boleh kosong!");
                return;
            }

            ((Kucing) hewanDitemukan).setRasKucing(rasBaru);

        } else if (hewanDitemukan instanceof Anjing) {

            System.out.print("Ras Anjing Baru   : ");
            String rasBaru = scanner.nextLine();

            if (rasBaru.isEmpty()) {
                System.out.println("Ras anjing tidak boleh kosong!");
                return;
            }

            ((Anjing) hewanDitemukan).setRasAnjing(rasBaru);
        }

        System.out.println("Data hewan berhasil diperbarui!");
    }

    // =========================
    // HAPUS DATA HEWAN
    // =========================

    public void hapusHewan() {

        System.out.println("\n===== HAPUS DATA HEWAN =====");

        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
            return;
        }

        int id = inputAngka("Masukkan ID Hewan : ");

        Hewan hewanDitemukan = null;

        for (Hewan hewan : daftarHewan) {

            if (hewan.idHewan == id) {
                hewanDitemukan = hewan;
                break;
            }
        }

        if (hewanDitemukan == null) {
            System.out.println("Data hewan tidak ditemukan!");
            return;
        }

        daftarHewan.remove(hewanDitemukan);

        System.out.println("Data hewan berhasil dihapus!");
    }

    // =========================
    // CARI DATA HEWAN
    // =========================

    public void cariHewan() {

        System.out.println("\n===== CARI DATA HEWAN =====");

        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
            return;
        }

        int id = inputAngka("Masukkan ID Hewan : ");

        for (Hewan hewan : daftarHewan) {

            if (hewan.idHewan == id) {

                System.out.println("\nData ditemukan!");
                System.out.println("----------------------------");

                hewan.tampilkanInfo();

                return;
            }
        }

        System.out.println("Data hewan tidak ditemukan!");
    }

    // =========================
    // TAMBAH DATA PENITIPAN
    // =========================

    public void tambahPenitipan() {

        System.out.println("\n===== TAMBAH DATA PENITIPAN =====");

        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
            System.out.println("Tambahkan data hewan terlebih dahulu.");
            return;
        }

        int idPenitipan = inputAngka("ID Penitipan    : ");

        for (Penitipan penitipan : daftarPenitipan) {

            if (penitipan.getIdPenitipan() == idPenitipan) {
                System.out.println("ID penitipan sudah digunakan!");
                return;
            }
        }

        int idHewan = inputAngka("ID Hewan        : ");

        boolean hewanAda = false;

        for (Hewan hewan : daftarHewan) {

            if (hewan.idHewan == idHewan) {
                hewanAda = true;
                break;
            }
        }

        if (!hewanAda) {
            System.out.println("ID hewan tidak ditemukan!");
            return;
        }

        System.out.print("Tanggal Masuk   : ");
        String tanggalMasuk = scanner.nextLine();

        if (tanggalMasuk.isEmpty()) {
            System.out.println("Tanggal masuk tidak boleh kosong!");
            return;
        }

        int lama = inputAngka("Lama Penitipan  : ");

        if (lama <= 0) {
            System.out.println("Lama penitipan tidak valid!");
            return;
        }

        String status = "Aktif";

        Penitipan penitipan = new Penitipan(
                idPenitipan,
                idHewan,
                tanggalMasuk,
                lama,
                status
        );

        daftarPenitipan.add(penitipan);

        System.out.println("Data penitipan berhasil ditambahkan!");
    }

    // =========================
    // TAMPILKAN DATA PENITIPAN
    // =========================

    public void tampilkanPenitipan() {

        System.out.println("\n===== DATA PENITIPAN =====");

        if (daftarPenitipan.isEmpty()) {
            System.out.println("Belum ada data penitipan.");
            return;
        }

        for (Penitipan penitipan : daftarPenitipan) {

            penitipan.tampilkanInfo();

            System.out.println("----------------------------");
        }
    }

    // =========================
    // UPDATE DATA PENITIPAN
    // =========================

    public void updatePenitipan() {

        System.out.println("\n===== UPDATE DATA PENITIPAN =====");

        if (daftarPenitipan.isEmpty()) {
            System.out.println("Belum ada data penitipan.");
            return;
        }

        int id = inputAngka("Masukkan ID Penitipan : ");

        Penitipan penitipanDitemukan = null;

        for (Penitipan penitipan : daftarPenitipan) {

            if (penitipan.getIdPenitipan() == id) {
                penitipanDitemukan = penitipan;
                break;
            }
        }

        if (penitipanDitemukan == null) {
            System.out.println("Data penitipan tidak ditemukan!");
            return;
        }

        int idHewan = inputAngka("ID Hewan Baru        : ");

        boolean hewanAda = false;

        for (Hewan hewan : daftarHewan) {

            if (hewan.idHewan == idHewan) {
                hewanAda = true;
                break;
            }
        }

        if (!hewanAda) {
            System.out.println("ID hewan tidak ditemukan!");
            return;
        }

        System.out.print("Tanggal Masuk Baru   : ");
        String tanggal = scanner.nextLine();

        if (tanggal.isEmpty()) {
            System.out.println("Tanggal masuk tidak boleh kosong!");
            return;
        }

        int lama = inputAngka("Lama Penitipan Baru  : ");

        if (lama <= 0) {
            System.out.println("Lama penitipan tidak valid!");
            return;
        }

        System.out.print("Status Baru          : ");
        String status = scanner.nextLine();

        if (status.isEmpty()) {
            System.out.println("Status tidak boleh kosong!");
            return;
        }

        penitipanDitemukan.setIdHewan(idHewan);
        penitipanDitemukan.setTanggalMasuk(tanggal);
        penitipanDitemukan.setLamaPenitipan(lama);
        penitipanDitemukan.setStatus(status);

        System.out.println("Data penitipan berhasil diperbarui!");
    }

    // =========================
    // HAPUS DATA PENITIPAN
    // =========================

    public void hapusPenitipan() {

        System.out.println("\n===== HAPUS DATA PENITIPAN =====");

        if (daftarPenitipan.isEmpty()) {
            System.out.println("Belum ada data penitipan.");
            return;
        }

        int id = inputAngka("Masukkan ID Penitipan : ");

        Penitipan penitipanDitemukan = null;

        for (Penitipan penitipan : daftarPenitipan) {

            if (penitipan.getIdPenitipan() == id) {
                penitipanDitemukan = penitipan;
                break;
            }
        }

        if (penitipanDitemukan == null) {
            System.out.println("Data penitipan tidak ditemukan!");
            return;
        }

        daftarPenitipan.remove(penitipanDitemukan);

        System.out.println("Data penitipan berhasil dihapus!");
    }
}