package day19_whileLoopDowhileLOOp;

import java.util.Scanner;

public class C02WhileLoop {

	public static void main(String[] args) {
		
		

		Scanner scan=new Scanner(System.in);
		System.out.print("rakamlar toplamini bumak icin pozitif bi sayi   gir");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
		
		
		while(sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
		System.out.println("girdiginiz sayinin rakamlar toplami: "+rakamlarToplami);
		
		
		
		
		
		
		

	}

}
