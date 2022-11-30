package inheritLab;

public class Square extends TwoDimShape {
	
	protected Square(String sekil, int kenar) {
		super();
		this.sekil = sekil;
		this.kenar = kenar;
	}
	
	protected String sekil;
	protected int kenar;
	
	
	protected String getSekil() {
		return sekil;
	}
	protected void setSekil(String sekil) {
		this.sekil = sekil;
	}
	protected int getKenar() {
		return kenar;
	}
	protected void setKenar(int kenar) {
		this.kenar = kenar;
	}
	
	protected double alanHes(int kenar) {
		return kenar * kenar;
	}

}
