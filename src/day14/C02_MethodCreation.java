package day14;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// // Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra entere basiniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("girilen sayilarin kareler toplamini istiyorsaniz 2 "
				+ "\nkupler toplamini istiyorsaniz 3'e basin");
		int secim=scan.nextInt();
		
		switch(secim) {
		
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kupTopla(sayi1,sayi2);
			break;
			default :
				System.out.println("Lutfen istenileni yaz ");
		
		}
		scan.close();

	}

	private static void kupTopla(double sayi1, double sayi2) {
		double kuplerToplami=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
		System.out.println("Grirlen sayilarin kupler toplami = "+kuplerToplami);
		
	}

	private static void kareTopla(double sayi3, double sayi4) {
		
		double karelerToplami=sayi3*sayi3+sayi4*sayi4;
		System.out.println("Grirlen sayilarin kareler toplami = "+karelerToplami);
		
		*/
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra entere basiniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
	
		System.out.println("girilen sayilarin kareler toplamini istiyorsaniz 2 "
				+ "\nkupler toplamini istiyorsaniz 3'e basin");
		
		int secim=scan.nextInt();
		
		
		switch (secim) {
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kupTopla(sayi1,sayi2);
			break;
		default:
			System.out.println("istenileni gir");
			break;
		}
		
		
		
	}

	
		
	

	public static void kupTopla(double sayi1, double sayi2) {
		
		
		double sayiKup=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
		
		System.out.println("kup toplami: "+sayiKup);
	}





	public static void kareTopla(double sayi33, double sayi44) {
		
		double toplam=sayi33*sayi33+sayi44*sayi44;
		
		System.out.println("kareler toplami: "+toplam);
	}

}
