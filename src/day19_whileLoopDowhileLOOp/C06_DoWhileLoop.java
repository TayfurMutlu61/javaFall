package day19_whileLoopDowhileLOOp;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
		// baya afillisoru
		
		
		
		
		Scanner scan=new Scanner(System.in);
		String sifre="";
		boolean khk=false;
		boolean bhk=false;
		
		
		do {
			System.out.print("sifreni gir");
			 sifre=scan.nextLine();
			
			khk=kucukHarfKontrol(sifre);
			buyukHarfKontrol(sifre);
			//ozelKarakterKontrol=(sifre);
			//uzunlukKontrol=(sifre);
			
		} while (!khk && !bhk);
		System.out.println("sifren basarili sekilde kaydedildi");
		
	}

	 	private static boolean buyukHarfKontrol(String sifre) {
	 		boolean bhk=false;
	 		String harfler="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 		
	 		for (int i = 0; i < sifre.length(); i++) {
				
				
				
				if (harfler.contains(sifre.substring(i,i++))) {
					bhk=false;
				}
			}
			
			if (!bhk) {
				System.out.println("sifren en az bir buyuk har icermeli");
			}
			
			return bhk;
	 		
	 		
	}

		private static boolean kucukHarfKontrol(String sifre) {
		boolean khk=false;
		
		String harfler="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < sifre.length(); i++) {
			
			
			
			if (harfler.contains(sifre.substring(i,i++))) {
				khk=true;
			}
		}
		
		if (!khk) {
			System.out.println("sifren en az bir kucuk har icermeli");
		}
		
		return khk;
	}
			
	

}
