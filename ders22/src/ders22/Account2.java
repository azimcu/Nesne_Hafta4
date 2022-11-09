package ders22;

import java.util.Scanner;

public class Account2 {

	public static void main(String[] args) {
		
		String isim, soyisim;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Adinizi giriniz: ");
		isim = s.nextLine();
		
		System.out.println("Soyadinizi giriniz: ");
		soyisim = s.nextLine();
		
		Account person = new Account(isim,soyisim);
		
		System.out.println("Hosgeldin " + person.getName() + " " + person.getSurname());

	}

}
