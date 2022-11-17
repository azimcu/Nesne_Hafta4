package inherit;

public class Student extends Person {
	
	protected Student(String adi, String soyadi, String email, int ogr_id) {
		super(adi, soyadi, email);
		this.ogr_id = ogr_id;
	}
	
	

	protected int ogr_id;
	
	
	

	protected int getOgr_id() {
		return ogr_id;
	}

	protected void setOgr_id(int ogr_id) {
		this.ogr_id = ogr_id;
	}
	
	
	protected String giris() {
		return super.giris();	//super class ından çekti. Giris fonksiyonunu hiç yazmamakla aynı kapıya çıkıyor
	}
}
