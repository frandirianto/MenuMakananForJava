package makanan;

public class Batagor extends Makanan {
	
	public Batagor(int harga) {
		setHarga(harga);
	}

	@Override
	protected void setHarga(int harga) {
		super.harga = harga;
	}

	public static Batagor getInstance(){
		return new Batagor(7000);
	}

}
