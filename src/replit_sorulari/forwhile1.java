package replit_sorulari;

import java.util.Scanner;

public class forwhile1 {

	public static void main(String[] args) {
		/**
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */
		

		Scanner scan = new Scanner(System.in);
		System.out.println("isim giriniz");

		String isim = scan.nextLine();
		System.out.println("karakter giriniz");
		char karakter = scan.next().charAt(0);
		int sayac = 0;

		for (int i = 0; i < isim.length(); i++) {

			if (karakter == isim.charAt(i)) {
				sayac++;

			}

		}
		System.out.println("number of  " + karakter + " = " + sayac);

		/**
		 * Scanner scan = new Scanner(System.in); //System.out.println("dakika gir");
		 * 
		 * 
		 * String name ="John came late";
		 * 
		 * String isim = scan.nextLine(); System.out.println("Lutfen bir karakter
		 * giriniz"); String karakter = scan.next();
		 * 
		 * int sayac = 0;
		 * 
		 * for (int i = 0; i <= isim.length() - 1; i++) { if (karakter.charAt(0) ==
		 * isim.charAt(i)) { sayac++;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("Number of " + karakter.charAt(0) + " = " + sayac);
		 */

	}

}
