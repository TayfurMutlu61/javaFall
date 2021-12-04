package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.nextLine();
		
		System.out.println("Lufen soyisminizi giriniz");
		
		String soyisim=scan.nextLine();
		
		
		
		System.out.println("Girilen isim : "+ isim + " " + soyisim);
		

	}

}
