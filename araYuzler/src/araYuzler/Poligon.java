package araYuzler;

public interface Poligon {
	
	void getArea();
	
	default void getSide() {
		System.out.println("Poligon kenar sayisi: ");
	}
	default void getPerimeter(int ... sides) {	//çevre
		int perimeter = 0;
		for(int side: sides) {
			perimeter += side;
		}
		System.out.println("Cokgenin cevresi: " + perimeter);
	}
	
	
	
}
