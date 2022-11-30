package bireyselJavaProjeler;

import java.util.Scanner;

public class faktoriyelBulma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int sayi;
		int cevap = 1;
		
		System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi giriniz:");
		sayi = scan.nextInt();
		
		while (sayi > 0) {
			
			cevap = cevap * sayi;
			sayi = sayi - 1;
		}
		
		System.out.println(cevap);
	}
}
