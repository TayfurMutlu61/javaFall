package day_Grup_Calismasi;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/**
		 * 2 - ) Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle     
      endeksini bulun. Sonucu tamsayi ve ondalikli sayi olarak yazdirin
       VKE= kilo/(boy*boy)             Kilo : kilogram , Boy : metre olmalidir
 Ornek Ekran Ciktisi:
 Input : boy :180 kilo : 80
 Output : Vucut kutle endeksiniz : 24
 Vucut kutle endeksiniz : 24.691...
		 */
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
		
		double boy=scan.nextDouble();
		boy=boy/100;
		System.out.println("Lutfen kilonuzukg olarak giriniz");
		double kilo=scan.nextDouble();
		
		int VKI=(int) (kilo/(boy*boy));
		System.out.println("Vucut kutle endeksiniz : " + VKI);
		System.out.println("Vucut kutle endeksiniz : "+ (kilo/(boy*boy)));
		
				
				
		
		
		
		
		

	}

}
