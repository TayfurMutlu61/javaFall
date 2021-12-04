package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAslist {

	public static void main(String[] args) {
		// 
		
		
		
		Integer arr[]= {3,5,7,10};
		
		List<Integer>arraydenList=Arrays.asList(arr);
		
		System.out.println(arraydenList);
		//arraydenList.set(0, 15);
		//arraydenList.add(11);
		
		System.out.println("eklendi "+arraydenList);
		System.out.println(Arrays.toString(arr));
	}

}
