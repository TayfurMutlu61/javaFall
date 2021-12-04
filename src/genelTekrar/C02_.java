package genelTekrar;

import java.util.Scanner;

public class C02_ {

	public static void main(String[] args) {
		/**
		 * Problem Tanımı
	        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
	        Örnek Ekran Çıktısı
	        birinci kenar: 12
	        ikinci kenar: 5
	        hipotenus: 13
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ilk kenari yaazininz: ");
		double a=scan.nextDouble();
		
		System.out.println("ikinci kenari yaazininz: ");
		
		double b=scan.nextDouble();
		
		double c=((Math.pow(a, 2))+(Math.pow(b, 2)));
		
		
		System.out.println(Math.sqrt(c));
		
		
		
	}

}
