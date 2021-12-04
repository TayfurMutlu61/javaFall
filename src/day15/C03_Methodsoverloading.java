package day15;

public class C03_Methodsoverloading {

	public static void main(String[] args) {
		
		
		
		String str="Java harikadir";
		
		int sayi1=4;
		int sayi2=5;
		int sayi3=10;
		int sayi4=20;
		
		topla(2,4);
		

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("4 sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("3 sayinin toplami : "+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayinin toplami id: "+(sayi1+sayi2));
		
	}
	/*private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami ii: "+(sayi1+sayi2));
		
	}*/
	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayinin toplami dd: "+(sayi1+sayi2));
		
	}
	
	
}
