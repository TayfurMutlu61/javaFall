package replit_sorulari;

import java.util.Scanner;

public class ifSwitchternary2 {

	public static void main(String[] args) {
		/**
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen adinizi giriniz");
		String isim=scan.nextLine();
		
		System.out.print("Lutfen soyisim giriniz");
		String soyisim=scan.nextLine();
		
		System.out.print("Lutfen kredi kartinizi giriniz");
		String kkNo=scan.nextLine();
		
		System.out.println(isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w", "*")
				+soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w", "*"));
		
		//System.out.println(kkNo.substring(kkNo),"*");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
