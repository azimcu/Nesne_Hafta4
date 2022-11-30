package araYuzler;

public class Triangle implements Poligon {
	
	protected int a, b, c;
	protected double s, area;
	
	Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		s = 0;
	}
	public void getArea() {
		s = (double)(a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Ucgenin alani: " + area);
	}
	
}
