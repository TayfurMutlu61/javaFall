package day04_IncrementDecrement;

import java.util.Scanner;

public class Calisma {

	public static void main(String[] args) {
		
		int sayi1=3;
		sayi1++;
		int sayi2=5;
		sayi2*=7;
		
		System.out.println(sayi1 + sayi2);
		
		
		
		 Scanner scan=new Scanner(System.in);
		    System.out.println("Lutfen gecerl� b�r gun ad� g�r�n�z:");
		        String gun=scan.next().toLowerCase();
		        
		        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("�ar�amba") || gun.equals("per�embe")||gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar ")) {
		    		System.out.println(gun.toUpperCase().charAt(0)+""+gun.toLowerCase().charAt(1)+""+gun.toLowerCase().charAt(2));
		    	} else {
		            System.out.println("Ge�erli g�n ismi giriniz");
		    	}
		        scan.close();
		    

		
		

	}

}
