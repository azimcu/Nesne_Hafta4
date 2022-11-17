package inherit;

public class Memur extends Person {
	
	protected Memur(String adi, String soyadi, String email, String bolum) {
		super(adi, soyadi, email);	//ata sınıfından geliyor (Person)
		this.bolum = bolum;
	}

	
	
	protected String bolum;

	
	
	
	protected String getBolum() {
		return bolum;
	}

	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	
	protected String giris() {
		return "-> Personel kapisindan Giris Yapti";
	}
	
}
