package hafta4_Proje;

import java.util.Scanner;

public class Kuresel_isinma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dogru = 0;
		
		String[] cevaplar = {"A","B","C","D"};
		
		
		
		//SORU-1
		
		System.out.println("1.En cok sera gazi yayan ulke:\n");
		System.out.println("A.Cin\nB.Hindistan\nC.ABD\nD.Japonya");
		
		String cevap1 = scan.nextLine();
		
		if (cevap1.equals(cevaplar[0])) {
			System.out.println("dogru");
			System.out.println("------------------------------------");
			
			dogru++;
		}
		else {
			System.out.println("yanlis");
			System.out.println("------------------------------------");
		}
		
		//SORU-2
		
		System.out.println("2.Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir:\n");
		System.out.println("A.Jupiter\nB.Venus\nC.Mars\nD.Merkur");
				
		String cevap2 = scan.nextLine();
				
		if (cevap2.equals(cevaplar[1])) {
			System.out.println("dogru");
			System.out.println("------------------------------------");
					
			dogru++;
		}
		else {
			System.out.println("yanlis");
			System.out.println("------------------------------------");
		}
		
		//SORU-3
		
		System.out.println("3.Iklim degisikligi nedeniyle yilda kac kisi olmektedir:\n");
		System.out.println("A.1500\nB.100.000\nC.150.000\nD.500.000");
				
		String cevap3 = scan.nextLine();
				
		if (cevap3.equals(cevaplar[2])) {
			System.out.println("dogru");
			System.out.println("------------------------------------");
					
			dogru++;
		}
		else {
			System.out.println("yanlis");
			System.out.println("------------------------------------");
		}
		
		//SORU-4
		
		System.out.println("4.Hangi ampul en az eneji harcar:\n");
		System.out.println("A.Akkor\nB.Halojen\nC.Floresan\nD.Akkor2");
				
		String cevap4 = scan.nextLine();
				
		if (cevap4.equals(cevaplar[2])) {
			System.out.println("dogru");
			System.out.println("------------------------------------");
					
			dogru++;
		}
		else {
			System.out.println("yanlis");
			System.out.println("------------------------------------");
		}
		
		//SORU-5
		
		System.out.println("5.Iklim degisikligine en savunmasiz hayvan:\n");
		System.out.println("A.Kar Leopar\nB.Kutup ayisi\nC.Deniz Gergedani\nD.Tukan");
				
		String cevap5 = scan.nextLine();
				
		if (cevap5.equals(cevaplar[2])) {
			System.out.println("dogru");
			System.out.println("------------------------------------");
					
			dogru++;
		}
		else {
			System.out.println("yanlis");
			System.out.println("------------------------------------");
		}
		
		System.out.println("Testdeki dogru sayiniz: " + dogru + " / 5\n");
		
		if (dogru == 5) {
			System.out.println("Mukkemmel");
		}
		else if (dogru == 4) {
			System.out.println("Cok iyi");
		}
		else {
			System.out.println("Kuresel isinme hakkindaki bilgilerinizi gelistirmeniz lazim");
		}

	}

}
