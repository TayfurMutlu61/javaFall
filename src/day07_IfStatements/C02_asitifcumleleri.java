package day07_IfStatements;

import java.util.Scanner;

public class C02_asitifcumleleri {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tam sayi giriniz");
		int sayi=scan.nextInt();
		
		
		if(sayi%2==0) {
			System.out.println("Girdiginiz sayi cift sayi");
			
		}
		if(sayi%2==1) {
			System.out.println("Girdiginiz sayi tek sayi");
		}
		
		
	}

}
