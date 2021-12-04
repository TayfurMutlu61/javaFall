package genelTekrar;

import java.util.Scanner;

public class kullanicidanDegeralma {

	public static void main(String[] args) {
		// Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
		
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("lutfen kenar uzunluk girin...");
	   double sayi1 = scan.nextDouble();
		
		System.out.println("Karenin alani: "+sayi1*sayi1);
		System.out.println("Karenin cevresi: "+sayi1*4);

		
		System.out.println();
	}

}
