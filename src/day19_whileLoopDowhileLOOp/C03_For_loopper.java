package day19_whileLoopDowhileLOOp;

import java.util.Scanner;

public class C03_For_loopper {

	public static void main(String[] args) {
		
		

		Scanner scan=new Scanner(System.in);
		System.out.print("rakamlar toplamini bumak icin pozitif bi sayi   gir");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;

		
		String sayiStr=""+sayi;
		
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
			
		}
		System.out.println("girdiginiz sayinin rakamlar toplami: "+rakamlarToplami);
		

	}

}
