package proje_Sorulari;

import java.util.Scanner;

public class soru11 {

	public static void main(String[] args) {
		/**
		 * Soru 11 : ***** Gokhan Bey ***** Bir String verildiğinde
		 * 
		 * Eger String harf sayisi tek ise true print et değilse false print et
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  ilk kelimeyi giriniz : ");

		String str = scan.nextLine();
		
		
		
		if (str.length()%2==0) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
			
		}
		
		
	}

}
