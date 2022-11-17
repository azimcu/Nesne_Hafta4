package inherit;

public class Hoca extends AkademikPersonel {

	protected Hoca(String adi, String soyadi, String email, String departman, String unvan) {
		super(adi, soyadi, email, departman);	//ata sınıfından geliyor (Person), Bir üst sınıfından da departman geliyor
		this.unvan = unvan;
	}

	
	
	protected String unvan;

	
	
	
	protected String getUnvan() {
		return unvan;
	}

	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	
	protected String giris() {
		return "-> Fakulte A kapisindan Giris Yapti";
	}
	
	
	protected String cikis() {
		return "Fakulte kapisindan cikis yapildi.";
	}
}
