package day04_IncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen cemberin yaricapini giriniz");
		
		double yaricap=scan.nextDouble();
		
		double cevre= 2*3.14*yaricap; 
		
		double alan=3.14*yaricap*yaricap;
		
		
		System.out.println("cebmerin alani : " + cevre);
		System.out.println("dairenin alani : "+ alan);
		
		scan.close();
		
		
		
		

	}

}
