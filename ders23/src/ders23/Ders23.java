package ders23;

public class Ders23 {
	
	public static void main(String args[]) {
		
		int r, sum = 0, temp;
		
		int n = 454;
		
		temp = n;
		
		while (n > 0) {
			
			r = n % 10;
			
			sum = (sum * 10);
			
			n = n / 10;
			
		}
		if (temp == sum)
			System.out.println("Palidrome number");
		
		else
			System.out.println("Not palidrome number");
		
		
	}
	

}
