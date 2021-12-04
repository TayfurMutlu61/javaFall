package day24_Array_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		
		 
		List<String> harfler=new ArrayList<>();
		
		harfler.add("B");
		harfler.add("A");
		harfler.add("d");
		harfler.add("b");
				
		System.out.println(harfler);
		
		 
		
		harfler.remove(1);
		
		
		System.out.println(harfler);
		harfler.remove(2);
		
		
		System.out.println(harfler);
		System.out.println(harfler.remove("d"));
		System.out.println(harfler);
		
		System.out.println(harfler.remove("b"));
		System.out.println(harfler);
		
		
		
		/*System.out.println(harfler.remove("B"));
		System.out.println(harfler);*/
		
		harfler.add("B");
		harfler.add("okkø");
		harfler.add("HB");
		System.out.println(harfler);
		System.out.println(harfler.remove("B"));
		System.out.println(harfler);
		harfler.add("B");
		System.out.println(harfler);
		
		//System.out.println(harfler.removeAll("B"));
		List<String> silinecekharfler=new ArrayList<>();
		
		silinecekharfler.add("A");
		silinecekharfler.add("B");
		silinecekharfler.add("F");
		System.out.println(harfler);;
		System.out.println(silinecekharfler);
		
		System.out.println(harfler.removeAll(silinecekharfler));
		System.out.println(harfler);
		System.out.println(silinecekharfler);
		
	}
	
	

}
