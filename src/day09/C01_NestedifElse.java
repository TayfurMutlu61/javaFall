package day09;

import java.util.Scanner;

public class C01_NestedifElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		//Kullanicidan bir sifre girmesini isteyin
		//Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
		//Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		//Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
		//Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifrenizi giriniz");
		
		char ilkKarakter=scan.next().charAt(0);
		if (ilkKarakter>='A' && ilkKarakter<='Z') {
			if (ilkKarakter=='A') {
				System.out.println("Gecerli Sifre");
			} else {
				System.out.println("Gecersiz Sifre");
			}	
		} else if(ilkKarakter>='a' && ilkKarakter<='z') {
			if (ilkKarakter=='z') {
				System.out.println("Gecerli Sifre");
			} else {
				System.out.println("Gecersiz Sifre");
			}
		}else {
			System.out.println("lutfen gecerli bi sifre olmasi icin harf ile baslayin");
		}
		
		
	}

}
