
public class bos {

	

	public static void main(String[] args) {
		
		
		
		String isim="Ali";
	
		System.out.println(isim.concat("Can"));
		
		int sayi = 6;

		System.out.println(faktoriyel(sayi));

	}

	// ozyinelemeli metodlar ===Recursive Mothods

	private static int faktoriyel(int sayi) {

		if (sayi <= 0)  return 1 ;
	
		return sayi * faktoriyel(sayi - 1);
	}
	
	
	
	
}
