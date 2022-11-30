package inheritLab;

public class Test {

	public static void main(String[] args) {
		
		Circle c = new Circle("Cember", 5);
		System.out.println(c.getSekil() + "'in alani: " + c.alanHes(5));
		
		Square s = new Square("Kare", 5);
		System.out.println(s.getSekil() + "'nin alani: " + s.alanHes(5));
		
		Triangle t = new Triangle("Ucgen", 5);
		System.out.println(t.getSekil() + "'in alani: " + t.alanHes(5));
		
		

	}

}
