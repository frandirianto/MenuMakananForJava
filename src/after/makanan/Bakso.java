package makanan;

public class Bakso extends Makanan {
	
	public Bakso(int harga) {
		setHarga(harga);
	}

	@Override
	protected void setHarga(int harga) {
		super.harga = harga;
	}

	public static Bakso getInstance(){
		return new Bakso(8000);
	}
}
