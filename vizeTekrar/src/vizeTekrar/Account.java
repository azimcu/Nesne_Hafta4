package vizeTekrar;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		
		String isim, soyisim;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi giriniz: ");
		isim = scan.nextLine();
		
		System.out.println("Soyadinizi giriniz: ");
		soyisim = scan.nextLine();
		
		Account2 person = new Account2(isim,soyisim);
		
		System.out.println("Hosgeldin " + person.getName() + " " + person.getSurname());
		
		

	}

}
