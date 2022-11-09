import java.util.Scanner;

package ders223;

public class Ders223 {
	
	public static void main(String[] args) {
		
		int number, i;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the limit: ");
		
		number = sc.nextInt();
		
		i = 1;
		
		System.out.println("Lit of odd numbers: ");
		
		while (i <= number) {
			
			System.out.print(i + " ");
			
			i = i + 2;
			
		}
		
	}

}
