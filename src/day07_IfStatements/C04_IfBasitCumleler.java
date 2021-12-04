package day07_IfStatements;

import java.util.Scanner;

public class C04_IfBasitCumleler {

	
	public static void main(String[] args) {
	
		
		/**
		 * Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup 
olmadigini yazdirin

		*/
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen diktorgenin bir kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		System.out.println("Lutfen diktorgenin diger kenar uzunlugunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2) { 

			System.out.println("girilen diktoergen kare");
			
		}
			if (kenar1!=kenar2) {
				System.out.println("girilen diktoretgen kar3e degilll");
			}
			
				scan.close();
				
	}

}
