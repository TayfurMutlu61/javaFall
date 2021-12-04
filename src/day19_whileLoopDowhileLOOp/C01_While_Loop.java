package day19_whileLoopDowhileLOOp;

import java.util.Scanner;

public class C01_While_Loop {

	public static void main(String[] args) {
		// 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bolenleri bulmak icin + sayi   gir");
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen+" ");
				sayac++;
			} 
			bolen++;
			
			
		}
		System.out.println( sayi+"sayisisnin "+sayac+"adet tam boleni vardir");
	}

}
