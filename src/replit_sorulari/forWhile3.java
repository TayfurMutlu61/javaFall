package replit_sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class forWhile3 {

	public static void main(String[] args) {
		/**
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */

		/**
		 * for (int i = 0; i < str.length(); i++) { }
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen kelime giriniz");
		
		List<String> list=new ArrayList<>();
		
		String kelime = scan.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			int sayac=0;
			
			for (int j = i+1; j <kelime.length() ;j++) {
			if (kelime.charAt(i)==kelime.charAt(j)) {
				sayac++;
				
			}	
				
			}
			if (sayac>1 && !list.contains(kelime.substring(i,i+1))) {
				list.add(kelime.substring(i,i+1));
			
				
			}
			
			
		}
		
		
		System.out.println(list);
		System.out.println(list);
		
		
		
		
		
	}

}
