package javaYouTube;

import java.util.Scanner;

public class FonksiyonlarMetotlar {
	
	
	public static void selamlama1() {
		System.out.println("Herkese merhaba");
	}
	
	public static void selamlama2 (String isim, String soyisim) {
		System.out.println("Selam " + isim + " " + soyisim);
	}
	
	
	public static void faktoriyelVoid() {
		Scanner scan = new Scanner(System.in);
		
		int fak = 1;
		
		System.out.printf("Faktoriyelini hesaplamak istediginiz sayiyi giriniz: ");
		int a = scan.nextInt();
		
		for(int i = a; i > 0; i--) {
			fak = fak * i;
		}
		
		System.out.println(fak);
	}
	
	public static int faktoriyelReturn() {
		Scanner scan = new Scanner(System.in);
		
		int fak = 1;
		
		System.out.printf("Faktoriyelini hesaplamak istediginiz sayiyi giriniz: ");
		int a = scan.nextInt();
		
		for(int i = a; i > 0; i--) {
			fak = fak * i;
		}
		
		return (fak);
	}
	
	

	public static void main(String[] args) {
		
		selamlama1();
		selamlama2("Azim", "Unal");
		
		faktoriyelVoid();
		System.out.println(faktoriyelReturn());
		
		
		

	}

}
