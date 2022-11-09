package hafta5Proje;

import java.util.ArrayList;
import java.util.Scanner;

public class Anket {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		ArrayList<String> sorular = new ArrayList<String>();
		sorular.add("Anasinifi sizin icin ne kadar onemli: ");
		sorular.add("Ilkokul sizin icin ne kadar onemli: ");
		sorular.add("Ortaokul sizin icin ne kadar onemli: ");
		sorular.add("Lise sizin icin ne kadar onemli: ");
		sorular.add("Universite sizin icin ne kadar onemli: ");
		
		int[][] puan = new int[5][11];
		
		int durum = 1;
		int kisi = 0;
		
		
		System.out.println("Lutfen size yoneltilen sorulari 1-10 arasinda puanlayin\n1:En kotu, 10:En iyi\n");
		
		
		
		while (durum == 1) {
			for (int i = 0; i < sorular.size(); i++) {
				
				System.out.println(sorular.get(i));
				
				int cevap = scan.nextInt();
				puan[i][cevap - 1] = 1;
			}
			
			kisi ++;
			System.out.println("Ankete devam etmek ister misiniz ?");
			System.out.println("Evet: 1, Hayir: 0");
			durum = scan.nextInt();
		}
		
		
		
		
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				int a = puan[i][j];
				System.out.printf(a + " ");
			}
			System.out.printf("\n");
		}
		System.out.println(kisi);
		

	}

}
