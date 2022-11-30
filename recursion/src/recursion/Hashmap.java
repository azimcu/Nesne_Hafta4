package recursion;

import java.util.HashMap;
import java.util.LinkedList;

public class Hashmap {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		
		HashMap<String,Integer> people = new HashMap<String,Integer>();	//name<key, value>;
		
		people.put("Umit", 25);
		people.put("Ahmet", 30);
		people.put("Mehmet", 35);
		
		for(String i:people.keySet()) {
			System.out.println("Key: " + i + ", Value: " + people.get(i));
		}
		
		//----------------------------------------------------
		
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Opel");
		cars.add(1,"Tata");
		
		String a = cars.get(1);
		
		if(a == "Mercedes") {	//cars.get(1) de "Tata var"
			System.out.println("Esitlik saglandi");
		}
		else if(a.equals(cars.get(1))) {
			System.out.println("equals saglandi");
		}
		else {
			System.out.println("Esitlik saglanmadi");
		}
		
		//----------------------------------------------------
		
		try {	//hata oluştuğunda try bloğunu kesip catch bloğuna gidiyor
			
			int[] dizi = {1, 2, 3};
			System.out.println(dizi(10));
			System.out.println("Buraya ulasti");
		}
		catch(Exception e) {
			
			System.out.println("Birseyler yanlis gidiyor");
		}
	}

	private static char[] dizi(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
