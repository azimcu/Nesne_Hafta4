package inheritLab2;

public class Employee {
	
	protected Employee(String isim, String soyisim, int tc) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.tc = tc;
	}
	
	
	protected String isim, soyisim;
	protected int tc;
	
	
	protected String getIsim() {
		return isim;
	}
	protected void setIsim(String isim) {
		this.isim = isim;
	}
	protected String getSoyisim() {
		return soyisim;
	}
	protected void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	protected int getTc() {
		return tc;
	}
	protected void setTc(int tc) {
		this.tc = tc;
	}
	
	
	protected void write() {
		
		System.out.println("Kisi: " + isim + " " + soyisim);
		System.out.println("TC numarasi: " + tc);
	}

}
