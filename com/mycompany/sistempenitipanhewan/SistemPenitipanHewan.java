package com.mycompany.sistempenitipanhewan;

import java.util.Scanner;
import model.Service;

public class SistemPenitipanHewan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service(scanner);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n==========================================");
            System.out.println("     SISTEM PENITIPAN HEWAN PELIHARAAN");
            System.out.println("==========================================");
            System.out.println("1. Tambah Data Hewan");
            System.out.println("2. Tampilkan Data Hewan");
            System.out.println("3. Update Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Cari Data Hewan");
            System.out.println("6. Tambah Data Penitipan");
            System.out.println("7. Tampilkan Data Penitipan");
            System.out.println("8. Update Data Penitipan");
            System.out.println("9. Hapus Data Penitipan");
            System.out.println("10. Keluar");
            System.out.println("------------------------------------------");

            int pilihan;

            try {

                System.out.print("Pilih Menu : ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Input menu harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {

                case 1:
                    service.tambahHewan();
                    break;

                case 2:
                    service.tampilkanHewan();
                    break;

                case 3:
                    service.updateHewan();
                    break;

                case 4:
                    service.hapusHewan();
                    break;

                case 5:
                    service.cariHewan();
                    break;

                case 6:
                    service.tambahPenitipan();
                    break;

                case 7:
                    service.tampilkanPenitipan();
                    break;

                case 8:
                    service.updatePenitipan();
                    break;

                case 9:
                    service.hapusPenitipan();
                    break;

                case 10:
                    berjalan = false;
                    System.out.println("\nTerima kasih telah menggunakan sistem.");
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        }

        scanner.close();
    }
}
