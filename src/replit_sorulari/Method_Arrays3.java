package replit_sorulari;

import java.util.Arrays;

public class Method_Arrays3 {

	public static void main(String[] args) {

		/**
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 */
		
		String isim="ade1r4d3";
		String arr[]=isim.split("");
		System.out.println(Arrays.toString(arr));
		
		
		int toplam=0;
		
		
		
		
		
		for (int i = 0; i <arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(0))) {
				toplam+=Integer.valueOf(arr[i]);
				
			} 
			
		}System.out.println(toplam);
		
		
		
		

	}

}
