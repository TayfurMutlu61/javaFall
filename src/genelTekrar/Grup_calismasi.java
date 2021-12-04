package genelTekrar;

import java.util.Scanner;

public class Grup_calismasi {

	public static void main(String[] args) {
		//Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		
		Scanner scan = new Scanner(System.in);
		double sayi=scan.nextDouble();
		int sayi2=(int) sayi;
		
		
	    int sayi1 = scan.nextInt();
	    int yil, gun;
	    
	    gun=sayi1/1440;
	    
	    yil=gun/365;
	    
	   
	    
	   System.out.println();

	    System.out.println(sayi1+" dakika yaklasik "+yil+" yil "+gun/365+" gundur ");
	       
	
		

	}

}
