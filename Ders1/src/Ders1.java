import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		
		int a = scan.nextInt();
		
		System.out.println("Enter a double:");
		
		double b = scan.nextDouble();
		
		System.out.println("Enter a string:");
		
		String c = scan.nextLine();
		
		System.out.println("Integer is : " + a);
		System.out.println("Double is : " + b);
		System.out.println("String is : " + c);

	}

}
