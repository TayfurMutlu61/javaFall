package day24_Array_List;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();
		System.out.println("bos liste " + isimler);

		isimler.add("Ali");

		System.out.println("1. liste " + isimler);

		isimler.add("Veli");
		System.out.println("2. liste " + isimler);

		isimler.add("DDeli");
		System.out.println("3. liste " + isimler);

		isimler.add(1, "Ayse");
		
		System.out.println("birinci indexe ayse ekledike " + isimler);

		isimler.add(4, "m");
		System.out.println("bir liste " + isimler);

		List<String> liste2 = new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste2 : " + liste2);

		isimler.addAll(4, liste2);
		System.out.println("sona liste2yi ekledik : " + isimler);

		isimler.addAll(liste2);
		System.out.println("index olmadam  liste2yi ekledik : " + isimler);
	}

}
