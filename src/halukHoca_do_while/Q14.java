package halukHoca_do_while;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("sayi gir");
      int sayi =scan.nextInt();
    	int faktoryel=1;
    	while (sayi>0) {
			faktoryel*=sayi;
			sayi--;
			
		}
    	
    	System.out.println("faktoryel: "+faktoryel);
    	
    	

    }
}


