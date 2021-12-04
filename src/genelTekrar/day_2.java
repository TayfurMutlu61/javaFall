package genelTekrar;

import java.util.Scanner;

public class day_2 {

	public static void main(String[] args) {
		// kullanicinin ad soyad yas boy kilosunu  yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ismini gir: ");
		String ad=scan.nextLine();
		
		System.out.println("soyismini gir. ");
		String soyad=scan.nextLine();
		
		System.out.println("boyunu cm cinsinden gir: ");
		int boy=scan.nextInt();
		
		System.out.println("kilonu gir: ");
		int kilo=scan.nextInt();
		
		
		System.out.println("isminiz: "+ad+"\n"+"soyadinin: "+soyad+"\nkilonuz: "+kilo+"kg"+"\nboyunuz: "+boy+"cm");
		
		
	}

}
