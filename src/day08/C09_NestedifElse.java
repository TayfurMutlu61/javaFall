package day08;

import java.util.Scanner;

public class C09_NestedifElse {

	public static void main(String[] args) {
		
		
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		//Kullanicidan bir sifre girmesini isteyin
		//Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
		//“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		//Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
		//“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetininzin giriniz \nerkek icin E, kadin icin K");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		System.out.println("lutfen yasininiz giriniz");
		
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
			if (yas>65) {
				System.out.println("Emekkli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin");
			}
			
		} else if(cinsiyet=='K') {
			if (yas>60) {
				System.out.println("Emekkli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin");
			}
			

		}else {
			System.out.println("Lutfen gecerli bir harf sec gardas");
		}
		
	}

}
