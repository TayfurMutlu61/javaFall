package day_Grup_Calismasi;

import java.util.Scanner;

public class day4 {

	public static void main(String[] args) {

		/**
		 * Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına
		 * dönüştürmek için bir Java programı yazın.
		 * 
		 * INPUT:
		 * 
		 * Dakika sayısı: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yaklaşık 6 yıl 210 gündür
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("dakika gir");
		int dakika = scan.nextInt();
		int yil=dakika/525600;
		int gun=(dakika-yil*525600)/1440;
		
		System.out.println(dakika+" dakika yaklasik "+yil+" yil "+gun+" gundur");
		
		
		
		
	}

}
