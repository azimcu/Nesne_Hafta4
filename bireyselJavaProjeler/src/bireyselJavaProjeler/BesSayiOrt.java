package bireyselJavaProjeler;

import java.util.Scanner;

public class BesSayiOrt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float ortalama = 0;
		float sayi;
		int i = 0;
		
		while (i < 5) {
			
			System.out.println("Bir sayi giriniz: ");
			
			sayi = scan.nextFloat();
			
			ortalama = ortalama + sayi;
			
			i++;
		}
		
		ortalama = ortalama / 5;
		
		System.out.println("Girilen 5 sayinin ortalamasi: " + ortalama);
	}

}
