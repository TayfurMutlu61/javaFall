package day22;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok kolay"

		String isimler="Java ogrenmek cok kolay";
		
		String kelimeler[] = isimler.split(" ");
		
		
		System.out.println(Arrays.toString(kelimeler));
		
		 for (int i = kelimeler.length-1; i >=0; i--) {
			System.out.print(kelimeler[i]+" ");
			
			
			
			
			
		}
		
	}
}
