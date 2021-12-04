package day07_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {

	public static void main(String[] args) {
		
		/*Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun 
		isimlerini yazdirin 
		Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
		ilkHarf=S output = “Sali”
		*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutferfn gun isimlerinindem birinin ilk harfimim yazimimz");
		
		// kullanicin
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		 
		
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi Veya Persembe");
		}
		if (ilkHarf=='S') {
			System.out.println("Sali");
		}
		if (ilkHarf=='C'|| ilkHarf=='c')
		{
			System.out.println("Carsamba, Cuma veya Cumartesi");
			
			
		}
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S');
		System.out.println("Lutfen gun isimlerimnden birkvhuibv");
		
		
		
	}

}
