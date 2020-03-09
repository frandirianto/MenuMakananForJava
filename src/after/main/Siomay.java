package main;

public class Siomay extends Food {
	
	private Siomay(int price) {
		setPrice(price);
	}

	@Override
	protected void setPrice(int price) {
		super.price = price;
	}
	
	public static Siomay getInstance(){
		return new Siomay(5000);
	}
}
