package halukhoca02;

import java.util.Scanner;

public class Q14 {

    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {



       
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    	Scanner scan=new Scanner(System.in);
    	int sayi=scan.nextInt();
    	System.out.println("sayi giriniz");
    	
    	for (int satir = 1; satir < sayi; satir++) {
    		
    		for (int bosluk = satir; bosluk < sayi; bosluk++) {
				System.out.print(" ");
			}
    		for (int sutun = 1; sutun <= satir; sutun++) {
				System.out.print("*");
			}
			System.out.println("");
		}
    	
    	

    	for (int satir = 1; satir < sayi; satir++) {
    		
    		for (int bosluk = satir; bosluk <=satir; bosluk++) {
				System.out.print("         ");
			}
    		for (int sutun = 1; sutun <= satir; sutun++) {
				System.out.print(" "+"*");
			}
			System.out.println("");
		}

    	
        
        
    }
}
