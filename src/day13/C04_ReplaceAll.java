package day13;

import java.util.Scanner;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim =scan.nextLine();
		
		isim=isim.replaceAll("\\S", "*");
		
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		soyisim=soyisim.replaceAll("\\S", "*");
		System.out.println(isim+" " +soyisim);
		
		
		
	}

}
