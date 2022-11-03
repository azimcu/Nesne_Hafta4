package arrays;
import java.util.Arrays;

public class ArrayDers5 {

	public static void main(String[] args) {
		
		//sort doubleArray into ascending order
		double[] doubleArray = {8, 4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		
		System.out.println("%ndoubleArray: ");
		
		for (double value : doubleArray) {
			System.out.printf("%.1f ", value);
		}
		
		//fill 10-element array with 7s
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");
	}

}
