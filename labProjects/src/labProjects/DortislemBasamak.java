package labProjects;

import java.util.Scanner;

public class DortislemBasamak {
	
	public static void dortislem(int a, int b) {
		
		System.out.println("Toplam: " + (a+b));
		System.out.println("Fark: " + (a-b));
		System.out.println("Carpim: " + (a*b));
		System.out.println("Bolum: " + (a/b));
		
		
	}
	
	public static void basamakHesapla(int sayi) {
		
		int bas5 = sayi / 10000;
		int bas4 = (sayi - (bas5 * 10000)) / 1000;
		int bas3 = (sayi - (bas5 * 10000 + bas4 * 1000)) / 100;
		int bas2 = (sayi - (bas5 * 10000 + bas4 * 1000 + bas3 * 100)) / 10;
		int bas1 = (sayi - (bas5 * 10000 + bas4 * 1000 + bas3 * 100 + bas2 * 10)) / 1;
		
		System.out.print((bas5 * 10000) + " + ");
		System.out.print((bas4 * 1000) + " + ");
		System.out.print((bas3 * 100) + " + ");
		System.out.print((bas2 * 10) + " + ");
		System.out.print((bas1 * 1));
		
	}

	public static void main(String[] args) {
		
		//Dört işlem kısmı:
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dort islem yapmak istediginiz ilk sayiyi giriniz: ");
		int sayi1 = scan.nextInt();
		
		System.out.println("Dort islem yapmak istediginiz ikinci sayiyi giriniz: ");
		int sayi2 = scan.nextInt();
		
		dortislem(sayi1, sayi2);
		
		//Basamak hesaplama:
		
		System.out.println("Basamak hesaplamak istediginiz bes basamakli sayiyi giriniz: ");
		int basamak = scan.nextInt();
		
		basamakHesapla(basamak);
		

	}

}
