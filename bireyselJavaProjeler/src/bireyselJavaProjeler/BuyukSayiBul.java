package bireyselJavaProjeler;

import java.util.Scanner;

public class BuyukSayiBul {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("1. Sayiyi Giriniz: ");
		n1 = scan.nextInt();
		System.out.println("2. Sayiyi Giriniz: ");
		n2 = scan.nextInt();
		System.out.println("3. Sayiyi Giriniz: ");
		n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("En buyuk sayi: " + n1);
		}
		
		else if (n2 >= n1 && n2 >= n3) {
			System.out.println("En buyuk sayi: " + n2);
		}
		
		else {
			System.out.println("En buyuk sayi: " + n3);
		}
		
	}

}
