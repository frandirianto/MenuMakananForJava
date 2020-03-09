package makanan;

public class Siomay extends Makanan {
	
	private Siomay(int harga) {
		setHarga(harga);
	}

	@Override
	protected void setHarga(int harga) {
		super.harga = harga;
	}
	
	public static Siomay getInstance(){
		return new Siomay(5000);
	}
}
