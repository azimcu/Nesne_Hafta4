package araYuzler;

public class Test {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.getArea();
		r.getSide();
		
		Square s = new Square();
		s.getArea();
		s.getSide();
		
		Triangle t = new Triangle(4,5,6);
		t.getArea();
		t.getSide();
	}

}
