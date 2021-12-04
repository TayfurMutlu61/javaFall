package day07_IfStatements;

import java.util.Scanner;

public class C03_IfBasitCumleler {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun ismi girinizn");
		String gun=scan.next().toLowerCase();
		
		
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Haftasonu");	
	}
		
		
		if (gun.equals("pazartesi") || gun.equals("sali") ||gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
			System.out.println("Haftaici");	
			
	}

		
		
		
	}

}
