package fonksiyonlarMetodlar;

import java.util.Scanner;

public class fonksiyonlar {
	
	
	public static void selamlama() {
		
		System.out.println("Herkese selamlar");
	}
	
	
	public static void faktoriyel() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("sayi: ");
		int sayi = scan.nextInt();
		
		int faktoriyel = 1;
		
		while (sayi > 0) {
			
			faktoriyel *= sayi;
			
			sayi--;
		}
		
		System.out.println("Sayinin faktoriyeli: " + faktoriyel);
	}
	
	
	public static void isimselam(String isim) {
		
		System.out.println("Selam " + isim);
	}
	
	
	public static void sayıtoplama(int a, int b, int c) {
		
		System.out.println("toplam: " + (a+b+c));
	}
	

	public static void main(String[] args) {
		
		//selamlama();
		
		//faktoriyel();
		
		//isimselam("Azim");
		
		//sayıtoplama(10, 20, 30);
	}

}
