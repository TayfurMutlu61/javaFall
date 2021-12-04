package replit_sorulari;

import java.util.Scanner;

public class for_while4 {

	public static void main(String[] args) {
		/**
		 * Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int faktoreal=1;
		System.out.print(sayi+"!=");
		for (int i = 1; i <=sayi; i++) {
			faktoreal*=i;
			System.out.print(i+"*");
		}
		System.out.print("="+faktoreal);
	}

}
