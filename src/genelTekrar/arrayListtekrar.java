package genelTekrar;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayListtekrar {

	public static void main(String[] args) {
		List<Integer> isim1 = new ArrayList<>();
		List<Integer> isim2 = new ArrayList<>();
		
		isim1.add(2010);
		isim1.add(2011);

		isim1.add(1992);
		isim1.add(2015);

		isim1.add(1997);
		

		int arr[] = { 1, 2, 3, 6, 5, 4 };

		System.out.println(isim1);
		System.out.println(arr[2]);

		System.out.println(isim1.size());
		System.out.println(isim1.isEmpty() + "--.isEmpty");
		System.out.println(isim1.remove(0));

		System.out.println(isim1.size() + "--.size");
		System.out.println(isim1.set(0, 1453));

		System.out.println(isim1.set(1, 1999) + "--.set");
		System.out.println(isim1);
		System.out.println(isim1.get(0) + "--.getindex");
		System.out.println(isim1.contains(111)+"---.contains var olup olmadigini kontraol eder");
		Collections.sort(isim1); //buyukten kucuge siralar. array'da .sort idi
		System.out.println(isim1);
		System.out.println(isim1.equals(isim2)+"----esitmi diye bakar");
		isim1.clear(); /// temizler
		
		
		
		//arrayi arry liste cevirmemk
		List<String>list=new ArrayList<>();
		
		String [] arr1 = {"kartal","kedi","tavus"}; 
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
			
			
		}System.out.println(Arrays.toString(arr1)+"arr1");
		
		//List<String>list= Arrays.asList(arr1);
		
		System.out.println(list.size());
		
		System.out.println(list.set(1, "eagle after cat"));
	System.out.println(list);
		
		arr1[0]="new";
		
				System.out.println(list);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println("-----");
		
		
		
		List<String>kartal=new ArrayList<>();
		kartal.add("film");
		kartal.add("cinema");
		kartal.add("konser");
		
		System.out.println(kartal);
		
		Object arr3[]=kartal.toArray();
		System.out.println(Arrays.toString(arr3));
				
	}

}
