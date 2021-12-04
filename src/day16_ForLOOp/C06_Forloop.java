package day16_ForLOOp;

import java.util.Scanner;

public class C06_Forloop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("100den kucuk sayi giriniz");
		double num = scan.nextDouble();
		int sayi=(int) num;
		
		
		if (num<0) {
			System.out.println("negatif sayi giremezsiniz");
		} else if(sayi!=num) {
			System.out.println("lutfen tam sayi giriniz");
			
		} else if(sayi>100) {
			System.out.println("100den kucuk sayi girinizz");	
		}else 

			for (int i =1; i <=num;i++) {
				if (i%3==0) {
					System.out.println(i+", ");
				}
		
		}

	}

}
