package zaman;

import java.util.Scanner;

public class ZamanTest {

	public static void main(String[] args) {
		
		int hour;
		int minute;
		int second;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Saati giriniz: ");
		hour = input.nextInt();
		
		System.out.println("Dakikayi giriniz: ");
		minute = input.nextInt();
		
		System.out.println("Saniyeyi giriniz: ");
		second = input.nextInt();
		
		Time1 z = new Time1 (hour, minute,second);
		
		System.out.println(z.display());

	}

}
