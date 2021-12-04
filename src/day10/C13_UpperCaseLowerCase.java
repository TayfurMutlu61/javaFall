package day10;

import java.util.Locale;

public class C13_UpperCaseLowerCase {

	public static void main(String[] args) {
		// 
		
		String isim="aLi";
		System.out.println(isim.toUpperCase().charAt(0)+
				 			isim.toLowerCase().charAt(1)+ isim.toLowerCase().charAt(2));
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));	
		
		
		

	}

}
