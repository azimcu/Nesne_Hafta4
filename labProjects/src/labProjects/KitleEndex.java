package labProjects;

import java.util.Scanner;

public class KitleEndex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double boy, kilo;
		
		System.out.println("Kilonuzu giriniz (kg): ");
		kilo = scan.nextDouble();
		
		System.out.println("Boyunuzu giriniz (m): ");
		boy = scan.nextDouble();
		
		double bmi = kilo / (boy * boy);
		
		System.out.println(bmi);
		
		if (bmi <= 18.5)
			System.out.println("Zayif");
		
		else if (18.5 < bmi && bmi <= 24.9)
			System.out.println("Normal");
		
		else if (24.9 < bmi && bmi <= 29.9)
			System.out.println("Sisman");
		
		else if (29.9 < bmi)
			System.out.println("Obez");
		

	}

}
