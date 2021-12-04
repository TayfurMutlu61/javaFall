package day10;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// 
		
		
		
		char krk='å';
		String sonuc = (krk>'a' && krk<='z') ? "Kucuk Harf" : (
						(krk<='A'&& krk>'Z') ? "Buyuk harf" : "girilen karakter harf degil"
						);
		System.out.println(sonuc);

	}

}
