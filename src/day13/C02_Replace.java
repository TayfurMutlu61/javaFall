package day13;

public class C02_Replace {

	public static void main(String[] args) {
		
		
		
		String sonuc="100";
		
		
		sonuc=sonuc.replace(".", "");
		
		
		
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("bulunan sonuc sayisi 10000'den cok");
		} else {
			System.out.println("bulunan sonuc sayisi 10000'den az");
		}
		 

	}

}
