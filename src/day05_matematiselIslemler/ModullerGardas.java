package day05_matematiselIslemler;

import java.util.Scanner;

public class ModullerGardas {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("lutfen 3 basamakli bir sayi giriniz");
        
        int sayi=scan.nextInt();
        
        int rakamlarToplami=0;
      
        
        int rakam=sayi%10;
        
        
        
       rakamlarToplami+=rakam;
       
        System.out.println(sayi);
        
        
        
        

	}

}
