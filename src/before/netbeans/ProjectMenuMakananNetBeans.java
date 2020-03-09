package before.netbeans;

import java.util.Scanner;

public class ProjectMenuMakananNetBeans {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu Makanan : ");
        System.out.println("===============================================");
        System.out.println("No Nama Harga");
        System.out.println("1. Siomay Rp 5000,00");
        System.out.println("2. Batagor Rp 7000,00");
        System.out.println("3. Bakso Rp 8000,00â€�");
        System.out.println("");

        int harga = 0;
        int h1 = 5000, h2 = 7000, h3 = 8000;
        String menu;

        for (String i = "Y"; i.equals("Y") || i.equals("y"); ) {
            System.out.println("_______________________________________________");
            System.out.println("Masukan Nomer Pesanan : ");
            int inNomer = scan.nextInt();
            System.out.println("_______________________________________________");

            if (inNomer == 1) {
                menu = " Siomay";
                System.out.println("Pilihan anda nomer " + inNomer + menu);
                harga = harga + h1;
            } else if (inNomer == 2) {
                menu = " Batagor";
                System.out.println("Pilihan anda nomer " + inNomer + menu);
                harga = harga + h2;
            } else if (inNomer == 3) {
                menu = " Bakso";
                System.out.println("Pilihan anda nomer " + inNomer + menu);
                harga = harga + h3;
            }
            {
                System.out.println("Apakah anda mau melanjutkan? Y/T");
                i = scan.next();
            }
            System.out.println("_____________________________________________");
            System.out.println("Total pembayaran sebesar " + harga + ".");
            System.out.println("Terimakasih atas kunjungannya.");
            System.out.println("*___________________________________________*");
        }
    }
}
