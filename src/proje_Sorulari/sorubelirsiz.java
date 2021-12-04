package proje_Sorulari;

import java.util.Scanner;

public class sorubelirsiz {

	public static void main(String[] args) {
		/******
		 * Tugba Hanim ***** Pozitif bir int num verildiğinde, return edildiği zaman num
		 * tamkare ise true veren değilse false veren bir fonksiyon yazın.
		 * 
		 * Not: sqrt gibi fonksiyonları kullanmayın.
		 * 
		 * Example 1: Input: 16 Output: true Not: bu sayı tamkare çünkü 4*4 = 16
		 * 
		 * Example 2: Input: 25 Output: true Note: bu sayı tamkare çünkü 5*5=25
		 * 
		 * 
		 * Example 3: Input: 14 Output: false
		 */

		methodSayi();

	}

	private static int methodSayi() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi <= 0) {
			System.out.println("Yalnis sayi girdiniz pozitif bir sayi girin lutfen");

		} else {

			for (int i = 1; i <= sayi; i++) {

				if (sayi == i * i) {
					System.out.print(true);
					System.out.println(" bu sayi tam kare cunku " + i + "*" + i + "=" + sayi);
					break;

				}

				else if (i == sayi) {
					System.out.println(false);
					
				}
			}

		}
		return sayi;
	}
}
