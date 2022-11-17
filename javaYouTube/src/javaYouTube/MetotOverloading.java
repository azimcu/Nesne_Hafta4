package javaYouTube;

public class MetotOverloading {
	
	public static void toplama(int a,int b,int c) {
		
		System.out.println("Toplamlari: " + (a+b+c));
	}
	
	public static void toplama(int a,int b) {
		
		System.out.println("Toplamlari: " + (a+b));
	}
	//-----------------------------------------------------
	
	public static void skorHesapla(String name,int score) {
		
		System.out.println(name + " isimli oyuncunun skoru: " + score);
	}
	
	public static void skorHesapla(int score) {
		
		System.out.println("Bilinmiyor" + " isimli oyuncunun skoru: " + score);
	}
	//------------------------------------------------------

	public static void main(String[] args) {

		toplama(3,4,5);
		toplama(10,20);
		
		skorHesapla("Azim", 1690);
		skorHesapla(3000);

	}

}
