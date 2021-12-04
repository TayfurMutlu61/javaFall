package day12_IndexOf;

import java.util.Scanner;

public class C012_IndexOf {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bi cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini lontrol etmek icin bi hARF GIRINIZ");
				
		
		char krk=scan.next().charAt(0);
		

		int index=cumle.indexOf(krk);
		
		if (index==(-1)) {
			System.out.println("Girilen harf verilen cumlede yo");
			
		} else {
			System.out.println("Girilen harf verilen cumlede var");
		}
		
				
		
		

	}

}
