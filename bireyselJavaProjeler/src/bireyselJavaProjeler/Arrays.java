package bireyselJavaProjeler;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int sayac = 0; sayac < 10; sayac++) {
			
			System.out.printf("%5d%8d%n", sayac, arr[sayac]);
		}
		//----------------------------------------------------
		int [] arr2 = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int sayac = 0; sayac < 10; sayac++) {
			
			arr2[sayac] = sayac * 10;
			
			System.out.printf("%5d%8d%n", sayac, arr2[sayac]);
		}
		//-----------------------------------------------------
		String [] arr3 = {"Bu ", "bir ", "array dir\n"};
		
		System.out.printf("\n-------------------------------\n");

		for (int sayac = 0; sayac < 3; sayac++) {
			
			System.out.printf("%s",arr3[sayac]);
		}
		System.out.printf("\n-------------------------------\n");
		//-----------------------------------------------------
		ArrayList<String> oyunlar = new ArrayList<String>();
		oyunlar.add("Black Desert");
		oyunlar.add("Space Engineers");
		oyunlar.add("Paladins");
		oyunlar.add("Minecraft");
		oyunlar.add("Forza Horizon 4");
		oyunlar.add(1, "Euro Truck Simulator 2");
		
		for (int i = 0; i < oyunlar.size(); i++) {
			System.out.println(oyunlar.get(i));
		}
	}

}
