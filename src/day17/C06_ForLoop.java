package day17;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
        System.out.print("lutfen 1. sayi giriniz...");
        int sayi1=scan.nextInt();
		
		
        
        int faktoryel1=1;
        for (int i =sayi1;i>0;i--) {
        	faktoryel1*=i;
        	
        	System.out.print(faktoryel1);
        }

	}

}
