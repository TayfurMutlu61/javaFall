package genelTekrar;

public class If_Else_Tekrar {

	public static void main(String[] args) {

		int sayi = 2;
		if (sayi <= 2) {
			System.out.println("kucuk");
		} else if (sayi == 20) {
			System.out.println("esit");
		} else if (sayi != 20) {
			System.out.println("ndeir");
		} else if (sayi > 20) {
			System.out.println("buyuk");

		} else {
			System.out.println("sayi degil");
		}

		notHesapla();

		forDongusu();

		whileDongusu();

		

	}

	
			
			
		
		
		
		
		
		
		
		
	

	private static void forDongusu() {
		// for

		for (int i = 1; i < 9; i++) {
			System.out.print("*");
		}
		System.out.println(" for dongusu bitti");

	}

	private static void whileDongusu() {
		// while
		int i = 2;

		while (i < 10) {
			System.out.print(i);
			i++;
		}
		System.out.println(" while dongusu bitti");
	}

	private static void notHesapla() {
		char grade = 'A';

		switch (grade) {

		case 'å':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("orta");
			break;

		case 'D':
			System.out.println("gectin");
			break;
		case 'F':
			System.out.println("kaldin");
			break;

		default:
			System.out.println("gecersiz not girdin");

		}

	}

}
