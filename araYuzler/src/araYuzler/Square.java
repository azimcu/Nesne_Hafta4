package araYuzler;

public class Square implements Poligon {
	
	public void getArea() {
		int kenar = 5;
		int area = kenar * kenar;
		System.out.println("Karenin alani " + area);
	}
	public void getSide() {
		System.out.println("Karenin esit 4 kenari vardir");
	}

}
