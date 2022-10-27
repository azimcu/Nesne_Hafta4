package arrays;

public class InitArray {

	public static void main(String[] args) {
		
		int[] array = {32,27,3,4,18,95,14,90,70,60,37};
		
		int b = array.length - 1;
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter = 0; counter < array.length; counter++) {
			
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		
		for(int counter = 0; counter < b; counter++) {
			
			int a;
			
			a = array[counter];
			
			
			array[counter] = array[b];
			
			array[b] = a;
					
			b--;
			
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
				
		for (int counter = 0; counter < array.length; counter++) {
					
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

}
