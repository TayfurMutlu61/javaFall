package day21;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[]= {3,5,7,9,7,6,5,4,4,3,6,7,8};
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
				
		}System.out.println("elementlerin toplami : "+ toplam);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1; i >=0;  i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		int tersArray[]=new int[arr.length];
		
		
	}

}
