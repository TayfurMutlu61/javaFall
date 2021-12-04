package proje_Sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		/**
		 * Soru 8 : ***** Tugba Hanim ***** Veri tipi int olan bir sayı verildiğinde
		 * 
		 * 0 dan başlayarak verilen sayıya kadar olan tum cift sayıları print edin.
		 * 
		 * Example 1: int input = 10;
		 * 
		 * print 0 2 4 6 8 10 olmalı
		 * 
		 * 
		 * Example 2: int input = 15;
		 * 
		 * print 0 2 4 6 8 10 12 14 olmalı
		 */
		
		System.out.println("lutfen bir sayi giriniz : ");
		Scanner scan = new Scanner(System.in);
		int sayi=scan.nextInt();
		List<Integer> list=new ArrayList<>();
		
		
		for (int i = 0; i <=sayi; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				
				
				
			}
			
			
		}	
		

	}

}
