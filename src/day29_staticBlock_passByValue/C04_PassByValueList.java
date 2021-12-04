package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {

		List<String> harfler = new ArrayList<>();

		harfler.add("A");
		harfler.add("B");
		harfler.add("C");

		listElemanlarDegirstir(harfler);
		System.out.println("methodda degistridigimiz list : "+harfler);
		
		
		listDegistir(harfler);
		System.out.println("lste yeni list atadiktan somra Main methoda donunce : "+harfler);
	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		System.out.println("liste yeni deger atayinca : "+harfler);
		
		
	}

	private static void listElemanlarDegirstir(List<String> harfler) {

		harfler.set(0, "D");
		
		System.out.println("methodda degistridigimiz list : "+harfler);
		
		
		
		
		
	}

}
