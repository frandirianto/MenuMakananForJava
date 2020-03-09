package main;

public abstract class Food {	
	
	protected int price;
	
	public Food() {}

	protected abstract void setPrice(int price);
	
	public int getPrice(){
		return this.price;
	}
}
