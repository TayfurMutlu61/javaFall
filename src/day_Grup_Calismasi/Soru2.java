package day_Grup_Calismasi;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/**
		 * Problem Tanimi
       Kullanicidan uc adet sayi alarak bu sayilarin
       bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod   
      yaziniz.
       (Yardim: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
       baglantisindan yararlanabilirsiniz)   
	 Ornek Ekran ciktisi
       birinci kenari giriniz: 2
       ikinci kenari giriniz 15
       ucuncu kenari giriniz: 7     
	          Bu bir dik ucgen degildir.
                  Bu bir dik üçgendir
		 */
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. kenari giriniz");
		
		int kenar1=scan.nextInt();
		System.out.println("Lutfen 2. kenari giriniz");
		
		int kenar2=scan.nextInt();
		System.out.println("Lutfen 3. kenari giriniz");
		int kenar3=scan.nextInt();
		
		if (kenar1*kenar1+kenar2*kenar2==kenar3*kenar3) {
			System.out.println("Bu bir dik üçgendir");
		} else {
			System.out.println("Bu bir dik üçgendir");
		}
		
		

	}

}
