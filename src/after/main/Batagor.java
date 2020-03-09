package main;

public class Batagor extends Food {
	
	public Batagor(int price) {
		setPrice(price);
	}

	@Override
	protected void setPrice(int price) {
		super.price = price;
	}

	public static Batagor getInstance(){
		return new Batagor(7000);
	}

}
