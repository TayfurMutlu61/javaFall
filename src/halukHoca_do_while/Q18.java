package halukHoca_do_while;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

     // STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
    	Scanner scan = new Scanner(System.in);
		
		
		
		String systemPin="javacanlara selamlar";
		
		int girisHakki=3;
		while (true) {
			
			System.out.print("pin kodu giriniz");
			String userPin = scan.next();
			if (userPin.equals(systemPin)) {
				System.out.println("basaarili giris");
				//9break;
				
			} else {
				System.out.println("hatali giris yapildi");
			
				girisHakki--;
				System.out.println("kalan deneme hakkiniz:"+girisHakki);
			if (girisHakki == 0) {
				System.out.println("agam hakkin kalmadi bekleme yapma dewamkee :)");
				break;
			}
			
			
			}
			
			
		}
		
		
		
		


    }


}
