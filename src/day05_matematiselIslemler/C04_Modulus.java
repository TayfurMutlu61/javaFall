package day05_matematiselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen 4 basamakli bir sayi giriniz");
	        int sayi=scan.nextInt();
		
		// sayimiz 0571

	        int rakamlarToplami=0;
	        int rakam=sayi%10; 
	        rakamlarToplami+=rakam; 
	        sayi/=10;
	        
	        
	         rakam=sayi%10; 
	        rakamlarToplami+=rakam; 
	        sayi/=10;
	        
	        
	         rakam=sayi%10; 
	        rakamlarToplami+=rakam; 
	        sayi/=10;
	        
	        
	         rakam=sayi%10; 
	        rakamlarToplami+=rakam; 
	        sayi/=10;
	        
	        System.out.println("Girdiginiz sayinin rakamlar toplami : "+rakamlarToplami);
	        
		
	        
	        
	        
	        
	        
		
	}

}