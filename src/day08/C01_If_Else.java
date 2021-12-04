package day08;

import java.util.Scanner;

public class C01_If_Else {

	public static void main(String[] args) {
	
		
		/**
		 * Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup 
olmadigini yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen diktorgenin bir kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		System.out.println("Lutfen diktorgenin diger kenar uzunlugunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen olcu karedir");
		} else {

			System.out.println("kare degildir");
			
			
			
		}
		
		

	}

}
