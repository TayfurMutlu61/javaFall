package genelTekrar;

import java.util.Scanner;

public class C03_ {

	public static void main(String[] args) {
		// Kullanicidan alacaginiz vize2 vize2 ve final notlarini
		// vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ilk vize notunuzu yaziniz: ");
		int vize1=scan.nextInt();
		
		System.out.println("ikinci vize notunuzu yazininz: ");
		int vize2=scan.nextInt();
		
		System.out.println("final notunuzu yazininz: ");
		int fnl=scan.nextInt();
		
		int vizeOrt= (vize1+vize2)/2;
		int vizeYuzde=(vizeOrt)*
				30/100;
		int fnlOrt=fnl*30/100;
		
		
		System.out.println("notunuz: "+vizeYuzde+fnlOrt);
		
		
		
		

	}

}
