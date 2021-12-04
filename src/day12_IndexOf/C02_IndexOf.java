package day12_IndexOf;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
		
		/**
		 * Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki 
			*kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
			- Girilen kelime cumlede kullanilmamis.
			- Girilen kelime cumlede 1 kere kullanilmis.
			- Girilen kelime cumlede 1�den fazla kullanilmis.

		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bi kelime giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini lontrol etmek icin bi hARF GIRINIZ");
				
		
		String kelime=scan.next();
		
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			System.out.println("Girilen kelime cumlede kullanilmamis");
			
			
		}else if(cumle.indexOf(kelime, index+1)<0){
			System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
			
		}else {
			System.out.println("Girilen kelime cumlede 1�den fazla kullanilmis.");
		}
		
		
		
		
		
		
		
		

	}

}
