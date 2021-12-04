package day14;

public class C01_MethodCreation1 {

	public static void main(String[] args) {
		
	//verilen sayilarin toplaminin ve carpimini yazdiran 2 method olustur
		
		
		int sayi1=15;
		int sayi2=10;
		
		
		
		
		carpma(sayi1,sayi2);
		toplama(sayi1,sayi2);
		
	}

	
	private static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi: "+ sayi1*sayi2);
		
	}


	private static void toplama(int sayi1, int sayi2) {
		
		System.out.println("sayilarin toplami: "+(sayi1+sayi2));
		
	}
	
	
	
	

}
