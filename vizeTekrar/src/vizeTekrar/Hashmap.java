package vizeTekrar;

import java.util.HashMap;
import java.util.LinkedList;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> classe = new HashMap<String,Integer>();
		
		classe.put("12-A", 25);
		classe.put("12-B", 27);
		classe.put("12-C", 23);
		classe.put("12-D", 29);
		
		for(String i:classe.keySet()) {
			System.out.println("Key: "+i+", Value: "+classe.get(i));
		}
		//------------------------------------------------------
		
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Opel");
		cars.add("Volkswagen");
		
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		String a = cars.get(1);
		
		if(a == "Mercedes") {
			System.out.println("Esitlik saglandi");
		}
		else if(a.equals(cars.get(1))) {
			System.out.println("equals saglandi");
		}
		else {
			System.out.println("Esitlik saglanmadi");
		}
	}

}
