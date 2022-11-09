package ders2;

public class Ders2 {

	public static void main(String[] args) {
		
		//System.out.println("Buyuk numara " + Math.max(9,7));
		
		//show();
		
		//toplam(20, 30);
		
		int deneme = toplam2(10,7);
		String s = "Yazi ";
		
		show2(s,deneme);

	}
	
	static void show() {
		
		System.out.println("This is an example of static void");
		
	}
	
	static void toplam(int a, int b) {
		
		int toplam = a + b;
		System.out.println("Sayilarin toplami = " + toplam);
		
	}
	
	static int toplam2(int a, int b) {
		
		int toplam = a + b;
		return (toplam);
		
	}
	
	static void show2(String s, int yazi) {
		
		System.out.println(s + yazi);
	}
	
}
