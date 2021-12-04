package halukhoca02;

import java.util.Scanner;

public class Q10 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!
    

     */

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
        
		System.out.print("harf giriniz : ");
		String girHarf=scan.nextLine();
		String sesliHarf="aeuioAUOIE";
		String sessizHarf="bcdfghjklmnprstvyxzwqBCDFGJKLMNPRSTVYZXWQ";
		
		if (girHarf.length()==1) {
			for (int i = 0; i < sesliHarf.length(); i++){
				
			if (girHarf.charAt(0)==sesliHarf.charAt(i)) {
				System.out.println("girilen harf sesli");
				break;
				
			} else if(girHarf.charAt(0)==sessizHarf.charAt(i)) {
				System.out.println("girilen harf sessiz");
				break;
				
			} 
			System.out.println("agam beyau yanlis akarter girdin");
			
			
		
	
    	
			}
    	
    	
		}	
    }
    	
    	
}    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
    	
		
   


