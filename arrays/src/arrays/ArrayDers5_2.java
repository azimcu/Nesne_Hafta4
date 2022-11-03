package arrays;

public class ArrayDers5_2 {

	public static void main(String[] args) {
		
		//copy array intArray into array intArrayCopy
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArrayCopy, 0, intArray, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		//compare intArray and intArrayCopy for equality
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%n intArray &s intArrayCopy%n");
			(b ? "==" : "!=");
			
		//compare intArray and filledIntArray for equality
			b = Arrays.equals(intArray, filledIntArray);
			System.out.printf("intArray %s filledIntArray%n");
				(b ? "==" : "!=");

	}

}
