package main;

public class MenuMakanan {

	private static final String BAKSO = " Bakso";
	private static final String BATAGOR = " Batagor";
	private static final String SIOMAY = " Siomay";
	private int hargaBakso, hargaBatagor, hargaSiomay, totalHarga;
	
	public MenuMakanan() {
		Menu();
		FoodInitialize();
		String input;
        String y = "Ya";
        
		do{
            System.out.print("Masukan Nomor Pesanan : ");
            
            int orderNumber = Main.ScanInteger();
            Order(orderNumber);
          
            System.out.println("Apakah Anda Mau Melanjutkan Pemesanan ? [Ya/Tidak]");
            
            input = Main.scan.nextLine();
            
            ShowReport();
		}while(input.equals(y));
		
        System.out.println("Terima Kasih");
	}

	private void Order(int orderNumber) {
		if (orderNumber == 1) {
            GetReport(SIOMAY, orderNumber, hargaBakso);
        } else if (orderNumber == 2) {
            GetReport(BATAGOR, orderNumber, hargaBatagor);
        } else if (orderNumber == 3) {
            GetReport(BAKSO, orderNumber, hargaSiomay);
        }
	}
	
	private void ShowReport() {
		System.out.println("Total Pembayaran : " + totalHarga + ".");
	}

	private void GetReport(String menu, int orderNumber, int price) { 
		System.out.println("Pilihan anda nomor " + orderNumber + menu);
		totalHarga = totalHarga + price;
	}

	private void FoodInitialize(){
		hargaBakso = Siomay.getInstance().getHarga();
		hargaBatagor = Batagor.getInstance().getHarga();
		hargaSiomay = Bakso.getInstance().getHarga();
	}

	private void Menu() {
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
}
