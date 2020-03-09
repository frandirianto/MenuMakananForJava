package main;

public class Bakso extends Food {
	
	public Bakso(int price) {
		setPrice(price);
	}

	@Override
	protected void setPrice(int price) {
		super.price = price;
	}

	public static Bakso getInstance(){
		return new Bakso(8000);
	}
}
