package day22;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		System.out.println();
		
		String isimler[] = {"ainagul", "Fero", "Muro","isim4","keko"};
		
		Arrays.sort(isimler);;
		System.out.println(Arrays.toString(isimler));
		
		isimler[4]="Ainagul";
		
		System.out.println(Arrays.toString(isimler));
		
		Arrays.sort(isimler);;
		System.out.println(Arrays.toString(isimler));
		
		System.out.println(Arrays.binarySearch(isimler, "isim4"));
		System.out.println(Arrays.binarySearch(isimler, "Muro"));
		System.out.println(Arrays.binarySearch(isimler, "Jeko"));
		
		System.out.println(Arrays.binarySearch(isimler, "isim4"));
	}

}
