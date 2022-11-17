package inherit;

public abstract class AkademikPersonel extends Person {	//abstract: ben bu sınıfı pas geçiyorum. Herhangi bir nesne oluşturmayacağım
	
	protected AkademikPersonel(String adi, String soyadi, String email, String departman) {
		super(adi, soyadi, email);
		this.departman = departman;
	}
	
	

	protected String departman;
	
	
	

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	
	
	protected String giris() {
		return "-> Fakulte kapisindan Giris Yapti";
	}
	
	
	protected abstract String cikis();
	
	/*
	 * protected String cikis() {
		return "Fakulte kapisindan cikis yapildi.";
	   }
	   bu şekildeydi. abstract yaptığında donksiyon boys sini sileriz. devamı hocada
	 */
}
