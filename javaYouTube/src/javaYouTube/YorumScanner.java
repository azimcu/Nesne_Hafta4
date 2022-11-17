package javaYouTube;

import java.util.Scanner;

public class YorumScanner {

	public static void main(String[] args) {
		
		//yorum
		
		/*
		 * yorum
		 * yorum
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Bir kelime giriniz: ");
		String c = scan.nextLine();
		
		
		
		System.out.println("Bir sayi girin: ");
		int a = scan.nextInt();
		
		
		
		double b;
		System.out.println("Bir double sayi girin: ");
		b = scan.nextDouble();
		
		
		
		System.out.println("a.int: " + a);
		System.out.println("b.double: " + b);
		System.out.println("c.string: " + c);
		
		/*
		 *Break: Döngüyü sona erdirir
		 *Continue: Altındaki işlemleri yapmadan döngünün en başına gider 
		 */

	}

}
