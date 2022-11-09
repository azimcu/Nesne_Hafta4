package algoritmaGenelProje;

import java.util.Scanner;

//Döngüler,karar yapıları, fonksiyon çağırma gibi genel şeylerin bir provası

public class Genel {
	
	public static int katHesapla (int kat1, int kat2) {
		
		int sayac = 22;
		
		while (21 < sayac < 147) {
			
			if (sayac % kat1 = 0) {
				System.out.println(sayac);
			}
			
			
			sayac++;
		}
		
	}
	
	public class void deneme() {
		
		if (sayac % kat1 = 0) {
			System.out.println(sayac);
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("kaç tane olduğunu hesaplamak istediğiniz kat1 giriniz: ");
		int kat1 = scan.nextInt();
		
		System.out.println("kaç tane olduğunu hesaplamak istediğiniz kat2 giriniz: ");
		int kat2 = scan.nextInt();
		
		katHesapla (kat1, kat2);
		
		
		

	}

}
