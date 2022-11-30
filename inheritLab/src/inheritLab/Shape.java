package inheritLab;

public class Shape {	//bu örnek yetişmedi
	
	protected Shape(String adi, double alan) {
		super();
		this.adi = adi;
		this.alan = alan;
	}
	
	
	protected String adi;
	protected double alan;
	
	
	protected String getAdi() {
		return adi;
	}
	protected void setAdi(String adi) {
		this.adi = adi;
	}
	protected double getAlan() {
		return alan;
	}
	protected void setAlan(double alan) {
		this.alan = alan;
	}

}
