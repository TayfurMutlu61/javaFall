package halukhoca02;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

    	Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bes sayi giriniz yaziniz");
    	
	int toplam=0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("sayi "+i+" giriniz: ");
			int sayi=scan.nextInt();
			if (sayi>5 && sayi<10) {
				System.out.println("girilen sayi 5 ile 10 oldu ve isleme alinmadi");
				
				continue;
			} 
			toplam+=sayi;
			
			System.out.println("girilen sayilarin toplami: "+toplam);
			
			
			
		}
		
		
		
		
		
    }

}
