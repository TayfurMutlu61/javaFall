package replit_sorulari;

import java.util.Scanner;

public class Ternary_3harfliIsim8_soru {

	public static void main(String[] args) {

		/**
		 * Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından
		 * oluşan yeni bir String yazdırın
		 * 
		 * Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  ilk ismi giriniz : ");

		String isim = scan.nextLine();
		String tekrar=isim.substring(isim.length()-2, isim.length());
		
		
		System.out.println(tekrar+tekrar+tekrar);
	}

}
