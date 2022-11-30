package araYuzler;

public class Rectangle implements Poligon {
	
	public void getArea() {
		int en = 6;
		int boy = 5;
		int area = en * boy;
		System.out.println("Dikdortgenin alani: " + area);
	}
	public void getSide() {
		System.out.println("Dikdortgenin 4 kenari vardir");
	}

}
