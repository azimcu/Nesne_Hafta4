package inherit;

public class Person {
	
	protected Person(String adi, String soyadi, String email) {	//class a sağ tık/source/gen. cons. using fiels
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
	}

	
	
	protected String adi, soyadi, email;
	
	

	
	protected String getAdi() {		//class a sağ tık/source/gen. setters and getters
		return adi;
	}

	protected void setAdi(String adi) {
		this.adi = adi;
	}

	protected String getSoyadi() {
		return soyadi;
	}

	protected void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}
	
	
	
	protected String giris() {
		return "-> Giris Yapti";
	}
	

}
