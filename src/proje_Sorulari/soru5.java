package proje_Sorulari;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		/**
		 * Soru 5 : ***** Hikmet Bey ***** Scanner class aracılığıyla girilen herhangi
		 * bir sayının faktöriyel değerini bulmak için bir program yazın.
		 * 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi gir : ");
		int sayi = scan.nextInt();
		int faktoriel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriel = faktoriel * i;
		}

		System.out.println(faktoriel);

	}

}
