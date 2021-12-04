package day04_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		
		byte sayi1=44;
		short sayi2= sayi1;
		
		//esitligin sol tarafi short sag tarafi byte
		// iki data turu farkli oldugu halde java itiraz etmez
		// cunku atama yapilan
		
		System.out.println("sayi2 : " + sayi2);
			
		
		int sayi3= 55;
		double sayi4= sayi3;
		
		System.out.println("sayi4 : " + sayi4);
	
		// atanan degerim data turu degrer atamam variablein tdata turunden kucukse 	
		
	
	}
	

}
