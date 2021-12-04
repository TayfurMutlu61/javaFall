package day10;

public class C07_SwitchCase {

	public static void main(String[] args) {
		//Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		
		
		int gunNo=10;
		
		switch (gunNo) {
		
		
		case 1:
			System.out.println("PAzartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
			
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("PAzar");
			break;
			
			
		default:
			System.out.println("gecerli bi gun no yazininz");
			
			
			
		}
		

	}

}
