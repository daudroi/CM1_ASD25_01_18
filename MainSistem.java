import java.util.Scanner;

public class MainSistem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    dataBarang dataBarang = new dataBarang();
    dataTransaksi dataTransaksi = new dataTransaksi();
    service serviceTransaksi = new service(dataTransaksi.dataTransaksi);

    int pilihan01;
        do {
            System.out.println("======== TOKO Manasuka ========");
            System.out.println("BANK MENU:");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Exit");
            System.out.print("Chose Menu(1-6): ");
            pilihan01 = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan01) {
                case 1:
                   dataBarang.tampil();
                    break;
                case 2:
                    dataTransaksi.tampil1();
                    break;
                case 3:
                System.out.print("Masukkan nama pembeli yang dicari: ");
                String cariNama = sc.nextLine();
                serviceTransaksi.pencarian(cariNama);
                    break;
                case 4:
                 
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan01 != 5);

        sc.close();
    }
}