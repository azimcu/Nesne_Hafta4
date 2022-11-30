package inheritLab;

public class Circle extends TwoDimShape {
	
	protected Circle(String sekil, int r) {
		super();
		this.sekil = sekil;
		this.r = r;
	}
	
	
	protected String sekil;
	protected int r;
	
	
	protected String getSekil() {
		return sekil;
	}
	protected void setSekil(String sekil) {
		this.sekil = sekil;
	}
	protected int serR() {
		return r;
	}
	protected void setR(int r) {
		this.r = r;
	}
	
	protected double alanHes(int r) {
		int pi = 3;
		return 2 * pi * r;
	}
}
