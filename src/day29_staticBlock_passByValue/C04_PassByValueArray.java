package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {
		
		int[] sayilar= {3,4,5,6,};
		
		elemanDegistir(sayilar);
		System.out.println("elemanDegistirden sonra"+Arrays.toString(sayilar));
		
		arrayiDegisir(sayilar);
		System.out.println("elemanDegistirden sonra2"+Arrays.toString(sayilar));
	}

	private static void arrayiDegisir(int[] sayilar) {
		sayilar=new int[6];
		System.out.println("elemanDegistirde yeni 6 eleman"+Arrays.toString(sayilar));
		
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar[0]=10;
		System.out.println("elemanDegistirde"+Arrays.toString(sayilar));
		
	}

}
