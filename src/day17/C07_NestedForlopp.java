package day17;

import java.util.Scanner;

public class C07_NestedForlopp {

	public static void main(String[] args) {
	
		//String str="Java ogenmek cok kolay     ";
		//String sayi1="9";
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		
		String isim=scan.nextLine();
		
		System.out.println(isim.lastIndexOf(2));
		
		System.out.println("lutfen soyisminizi giriniz");
		String soyisim=scan.nextLine();
		
		System.out.println("lutfen 16 haneli kk kartinizi 4 sayili gruplar halinde yaziniz");
		
		String kkno=scan.nextLine();
		
		String isimformatli=isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimFormatli=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w", "*");
		
		
		
		String kkFormatli="**** **** **** "+ kkno.substring(12);
	
		System.out.println("isim-soyisim: "+isimformatli+" "+soyisimFormatli);
		
		System.out.println("kart no: "+kkFormatli);
		
		System.out.println(isim.indexOf(1));
	}
		 
		 
		 

}
