package halukhoca02;

import java.util.Scanner;

public class Q06 {

	/*
	 * Problem Tanımı 2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp
	 * yazan kodu yazınız.
	 * 
	 * Örnek Ekran çıktısı 1 2 3 4 5 2 4 6 8 10 3 6 9 12 15 4 8 12 16 20 5 10 15 20
	 * 25
	 * 
	 * Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir, isterseniz
	 * boyutları klavyeden okuyup istenen boyutlara göre ekrana basan bir kod
	 * yazabilirsiniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("carpim tablosunun boyutunu giriniz: ");

		int boyut = scan.nextInt();
		for (int satir = 1; satir < boyut; satir++) {
			for (int sutun = 1; sutun < args.length; sutun++) {
				System.out.println(" "+satir*sutun);
			}
			System.out.println();
		}
	
		
	
	
	
	
	
	
	
	
	
	}
}