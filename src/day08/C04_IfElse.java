package day08;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		/**
		 *  Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
		
		birbirine esit ise ekrana �Eskenar ucgen� yazdirin. Diger durumlarda ekrana 
		�Eskenar degil� yazdirin
	 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgenin bir kenar uzunluklarini yaziniz \nilk kenari girdikten sonra diger");

			double kenar1=scan.nextDouble();
			double kenar2=scan.nextDouble();
			double kenar3=scan.nextDouble();
			
		
			
			if (kenar1==kenar2 && kenar2==kenar3 ) {
				System.out.println("eskenar ucgen");
			} else {
				System.out.println("eskenar 3gen degil");
			}
	}

}
