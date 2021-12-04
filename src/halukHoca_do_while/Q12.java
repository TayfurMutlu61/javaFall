package halukHoca_do_while;

import java.util.Scanner;

public class Q12 {

    //Bir top 220 m  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	System.out.println("topun birakildigi yukseklik");
        double yukseklik =scan.nextDouble();
    	double topunToplamYol=0;
    	int vurmaSayisi=0;
    	
    	do {
			vurmaSayisi++;
			topunToplamYol+=yukseklik;
			yukseklik*=(0.75);
			topunToplamYol+=yukseklik;
			
		} while (yukseklik>=1);
    	System.out.println("topun vurma sayisi: "+vurmaSayisi);
    	System.out.println("topun toplam yol: "+topunToplamYol);
    	
    	
    	
    	
    	
    	
    	
    }
}
