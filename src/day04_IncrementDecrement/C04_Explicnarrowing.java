package day04_IncrementDecrement;

public class C04_Explicnarrowing {

	public static void main(String[] args) {
		
		int sayi1= 3000;
		short sayi2= (short) sayi1; //(byte) da olur
		
		System.out.println("sayi2 : " + sayi1);
		
		byte sayi3= (byte) sayi2;
		
		
		System.out.println("sayi3 : " + sayi3);
		
		
		
		double sayi4= 87.9;
		int sayi5 = (int) sayi4;
		System.out.println("sayi5 : " + sayi5);
		
		
		
		int sayi6= 27;
		int sayi7=4;
		System.out.println(sayi6 / sayi7);
		
		
		
		double sayi8=4;
		double sayi9= 17;
		
		
		System.out.println(sayi6 / sayi8); // 6,75 
		 
		System.out.println(sayi9 / sayi7);
		
		
		
		
		
		
		
		

	}

}
