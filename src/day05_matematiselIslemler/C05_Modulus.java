package day05_matematiselIslemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 6 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
	
	// sayimiz 05711

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
        
        rakam=sayi%10; 
        rakamlarToplami+=rakam; 
        sayi/=10;
        
        rakam=sayi%10; 
        rakamlarToplami+=rakam; 
        sayi/=10;
        
        System.out.println("Girdiginiz sayinin rakamlar toplami : "+rakamlarToplami);
        
        

	}

}
