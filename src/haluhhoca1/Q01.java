package haluhhoca1;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
       

    	Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir string giriniz yaziniz");
    	
		String str=scan.nextLine();
		
		
		ilkIkisiz(str);
		
		
	
    	
    }

			public static String ilkIkisiz(String str) {
		
				String kalanHarfler="";
				
				if (str.startsWith("gh")) {
					
					kalanHarfler=str;
					
				} else if(str.startsWith("g"))  {
					kalanHarfler=str.charAt(0)+str.substring(2);
				}else if (str.charAt(1)=='h') {
					kalanHarfler=str.charAt(0)+str.substring(2);
					
					
				} else {
					System.out.println(str.substring(1));
					
				}
				return str;
	}
}
