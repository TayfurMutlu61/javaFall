package day12_IndexOf;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		/**
		 * Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki 
			*kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
			- Girilen kelime cumlede kullanilmamis.
			- Girilen kelime cumlede 1 kere kullanilmis.
			- Girilen kelime cumlede 1’den fazla kullanilmis.

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bi kelime giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini lontrol etmek icin bi hARF GIRINIZ");
				
		
		char krk=scan.next().charAt(0);
		
		
		int index=cumle.lastIndexOf(krk);
		if (index==-1) {
			System.out.println("harf cumlede kullanilmamis");
		} else {
			System.out.println("harf cumlede kullanilmis");
		}
		
		
		
		
		
		
		
		
		

	}

}
