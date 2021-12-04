package day05_matematiselIslemler;

import java.util.Scanner;

public class C03_Modules {

	public static void main(String[] args) {
		
		
		
		
		// kullanicidan 3 basamakli bir sayi alip
        // rakamlar toplamini yazdiran
        // bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        
        
        
        // sayi 573 olsun
        
        
        int rakamlarToplami=0;
        
        int rakam=sayi%10; //bana birler basamagini verir rakam=3
        
        rakamlarToplami+=rakam; // rakamlar toplami 3 oldu
        
		sayi/=10;
		
		 // 57
		
		
		rakam=sayi%10;
		
		
		rakamlarToplami+=rakam;
		 
		
		// sayi 57
		
		sayi/=10;
		
		
		rakamlarToplami+=sayi;
		System.out.println("Girdiginiz sayinin rakamlar toplami : "+rakamlarToplami);
		

	}

}
