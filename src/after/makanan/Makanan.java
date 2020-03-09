package makanan;

public abstract class Makanan {	
	
	protected int harga;
	
	public Makanan() {}

	protected abstract void setHarga(int harga);
	
	public int getHarga(){
		return this.harga;
	}
}
