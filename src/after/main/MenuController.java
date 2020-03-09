package main;

public class MenuController {

	
	private static final String BAKSO_STR = " Bakso";
	private static final String BATAGOR_STR = " Batagor";
	private static final String SIOMAY_STR = " Siomay";
	int baksoPrice, batagorPrice, siomayPrice, totalPrice;
	String menu;

	public MenuController() {
		foodInitialize();
		Character y = 'Y';
		
        for (String i = y.toString(); i.equals(y.toString()) || i.equals(y.toString());){
            System.out.println("_______________________________________________");
            System.out.println("Masukan Nomer Pesanan : ");
            System.out.println("_______________________________________________");
            
            int orderNumber = Main.ScanInteger();
            order(orderNumber);
          
            System.out.println("Apakah anda mau melanjutkan? [Y/T]");
            
            y = Main.ScanCharacter();
            i = y.toString();
            
            showReport();
        }	
	}

	private void order(int orderNumber) {
		if (orderNumber == 1) {
            getReport(SIOMAY_STR, orderNumber, baksoPrice);
        } else if (orderNumber == 2) {
            getReport(BATAGOR_STR, orderNumber, batagorPrice);
        } else if (orderNumber == 3) {
            getReport(BAKSO_STR, orderNumber, siomayPrice);
        }
	}
	
	private void showReport() {
		System.out.println("_____________________________________________");
		System.out.println("Total pembayaran sebesar " + totalPrice + ".");
		System.out.println("Terimakasih atas kunjungannya.");
		System.out.println("*___________________________________________*");
	}

	private void getReport(String menu, int orderNumber, int price) {
		this.menu = menu;
		System.out.println("Pilihan anda nomer " + orderNumber + this.menu);
		totalPrice = totalPrice + price;
	}

	private void foodInitialize(){
		baksoPrice = Siomay.getInstance().getPrice();
		batagorPrice = Batagor.getInstance().getPrice();
		siomayPrice = Bakso.getInstance().getPrice();
	}
	
}
