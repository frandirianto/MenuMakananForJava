package menu;

import java.util.Scanner;
import makanan.Bakso;
import makanan.Batagor;
import makanan.Siomay;

public class MenuMakanan {


	public Scanner scan;
	private final String BAKSO = "Bakso";
	private final String BATAGOR = "Batagor";
	private final String SIOMAY = "Siomay";
	private int hargaBakso, hargaBatagor, hargaSiomay, totalHarga;

	public MenuMakanan() {
		
		menu();
		init();
		String input;

		do{
			pilihMenu();

			System.out.print("Apakah Anda Mau Melanjutkan Pemesanan ? [Ya/Tidak]");
			input = scan.nextLine();
			printLaporan();
		}while(input.equals("Ya"));

		System.out.println("Terima Kasih");
	}

	private void init(){
		scan = new Scanner(System.in);
		hargaBakso = Siomay.getInstance().getHarga();
		hargaBatagor = Batagor.getInstance().getHarga();
		hargaSiomay = Bakso.getInstance().getHarga();
	}

	public int scanInteger() {
		int number = -1;
		try {
			number = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Input harus angka");
			number = -1;
		}
		scan.nextLine();
		return number;
	}
	
	private void pilihMenu() {
		System.out.print("Masukan Nomor Pesanan : ");
		int noPemesanan = scanInteger();
		orderMakanan(noPemesanan);
	}
	
	private void orderMakanan(int noPemesanan) {
		if (noPemesanan == 1) {
			getReport(SIOMAY, noPemesanan, hargaBakso);
		} else if (noPemesanan == 2) {
			getReport(BATAGOR, noPemesanan, hargaBatagor);
		} else if (noPemesanan == 3) {
			getReport(BAKSO, noPemesanan, hargaSiomay);
		}
	}

	private void printLaporan() {
		System.out.println("Total Pembayaran : " + totalHarga + ".");
	}

	private void getReport(String makanan, int noPemesanan, int harga) { 
		System.out.println("Pilihan anda nomor " + noPemesanan + " " +  makanan);
		totalHarga = totalHarga + harga;
	}
	
	private void menu() {
		System.out.println("Menu Makanan : ");
		System.out.println("===============================================");
		System.out.println("| No |          Nama          |     Harga     |");
		System.out.println("===============================================");
		System.out.println("| 1. | Siomay                 | Rp 5000,00    |");
		System.out.println("| 2. | Batagor                | Rp 7000,00    |");
		System.out.println("| 3. | Bakso                  | Rp 8000,00    |");
		System.out.println("===============================================");
		System.out.print("Choose > ");
	}

	public static void main(String[] args) {
		new MenuMakanan();
	}
}
