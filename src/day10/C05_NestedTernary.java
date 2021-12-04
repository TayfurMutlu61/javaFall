package day10;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// 

		
		char cinsiyet ='K';
		int yas=57;
		
		String sonuc = cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin" : "Emekli olamazsin"):
										(yas>=65 ? "Emekli olabilirsin" : "Emekli olamazsin");
		
		
		System.out.println(sonuc);
		
		
		
	}

}
