package day17;

import java.util.Scanner;

public class C02ForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
        String str=scan.nextLine();
        
        
        for (int i=str.length()-1;i>=0;i--) {
        	
        	
        	
        	System.out.print(str.substring(i,i+1));
        }
        
        

	}

}
