package labProjects;

import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14;
		double alan, cevre;
		
		System.out.println("Yaricap giriniz: ");
		int r = scan.nextInt();
		
		alan = pi * (r * r);
		cevre = 2 * pi * r;
		
		System.out.println("Dairenin alani: " + alan + ", cevresi: " + cevre);
		
	}

}
