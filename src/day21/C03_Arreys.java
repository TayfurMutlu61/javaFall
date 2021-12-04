package day21;

import java.util.Arrays;

public class C03_Arreys {

	public static void main(String[] args) {
		
		String arr[]=new String[4];
		
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";
		
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"};
		
		arr2[0]="Can";
		arr2[2]="Gul";
		
		
		System.out.println(arr2[1]); //Veli 
		
		System.out.println(arr[arr.length-1]); //Fatma
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	
			String name="q";
	System.out.println(name);

	
	}

}
