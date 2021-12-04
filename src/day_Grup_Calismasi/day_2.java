package day_Grup_Calismasi;

import java.util.Scanner;

public class day_2 {

	public static void main(String[] args) {
		/*Problem Tanimi
        Kullanicidan bir tarihi gun, ay ve yil seklinde alip bu tarihi
        ay, gun, yil ve yil, ay, gun siralarina cevirerek yazan bir kod yaziniz.
        Ornek Ekran ciktisi
        Lutfen gun giriniz: 10
        Lutfen ayigiriniz: 02
        Lutfen yili giriniz: 2009
        Gun ay yil: 10.02.2009
        Ay gun yil: 02.10.2009
        Yil ay gun: 2009.02.10
     */
     Scanner scan =new Scanner(System.in);
     
     System.out.println("Lütfen gun giriniz");
     String gun =scan.next();// int kullanınca 02 yazmıyor 2 yazıyor
     System.out.println("Lütfen ay giriniz");
     String ay =scan.next();
     System.out.println("Lütfen yil giriniz");
     String yil =scan.next();
      
     System.out.println("gun ay yil :" + gun+"."+ay+"."+yil );//:02.10.2009 
     System.out.println("ay gun yil :" + ay+"."+gun+"."+yil );//10.02.2009
     System.out.println("yil ay gun :" + yil+"."+ay+"."+gun );//2009.10.02
     
     scan.close();
	}

}






/**
 * name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluÅŸturun
                  e.g:
                 name1= mehmet
                 name2= ahmet
                 Print ==> mehahmetmet*/


/**
 * // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
 */

