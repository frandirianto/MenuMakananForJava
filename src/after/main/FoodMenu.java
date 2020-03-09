package main;

public class FoodMenu {

	public FoodMenu() {
		showMenu();
		new MenuController();
	}

	private void showMenu() {
		System.out.println("Menu Makanan : ");
        System.out.println("===============================================");
        System.out.println("No Nama Harga");
        System.out.println("1. Siomay Rp 5000,00");
        System.out.println("2. Batagor Rp 7000,00");
        System.out.println("3. Bakso Rp 8000,00");
        System.out.println();
	}
}
