package labProjects;

import java.util.Scanner;

public class Sayiters {

public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.print("Girdiginiz sayinin tersi: ");
        
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            
            sayi /= 10;
        }
    }

}
