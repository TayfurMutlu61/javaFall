package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		
		List<Integer>tekrarsiz=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
				
				
			}
		}
		
		System.out.println(tekrarsiz);
		
		int tekrarsizArray[]=new int [tekrarsiz.size()];
		for (int i = 0; i < tekrarsizArray.length; i++) {
			tekrarsizArray[i]=tekrarsiz.get(i);
			
			
			
		}
		System.out.println("tekrarsiz list :"+Arrays.toString(tekrarsizArray));
	}

}
