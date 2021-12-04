package day30_mutable_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {

		String str = "Ali";
		str.toUpperCase();
		System.out.println(str); // Ali
		System.out.println(str.toUpperCase()); // ALI
		// System.out.println(str.concat("Can"));
		System.out.println(str); // Ali

		List<String> isimler = new ArrayList<>();

		System.out.println(isimler); // []
		isimler.add("Ali");
		System.out.println(isimler);     
		
		isimler.set(0, "Veli");
		System.out.println(isimler);
		
		isimler.remove(0);
		System.out.println(isimler);
		
	}

}
