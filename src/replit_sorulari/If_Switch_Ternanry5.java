package replit_sorulari;

import java.util.Scanner;

public class If_Switch_Ternanry5 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("istediginiz ay sayisini giriniz");
		
		int ay=scan.nextInt();
		int yil=scan.nextInt();
		switch (ay) {
		
		
		case 1:
			System.out.println("Ocak "+yil+ "31 gun");
		break;
		case 2:
			if (yil%4==0) {
				System.out.println("Subat "+yil+ " 29 gun");
			} else {
				System.out.println("Subat "+yil+ " 28 gun");
			}
			
			
		break;
		case 3:
			System.out.println("mart "+yil+ "31 gun");
		break;
		case 4:
			System.out.println("nisan "+yil+ "30 gun");
		break;
		case 5:
			System.out.println("mayis "+yil+ "31 gun");
		break;
		case 6:
			System.out.println("haziran "+yil+ "31 gun");
		break;
		case 7:
			System.out.println("temmuz "+yil+ "302"
					+ "1993 gun");
		break;
		case 8:
			System.out.println("agustos "+yil+ "31 gun");
		break;
		case 9:
			System.out.println("september "+yil+ "31 gun");
		break;
		
		case 10:
			System.out.println("october "+yil+ "31 gun");
		break;
		case 11:
			System.out.println("november "+yil+ "30 gun");
		break;
		case 12:
			System.out.println("december "+yil+ "31 gun");
		break;
		
		default: System.out.println("tekrar yaziniz");
		}
		

	}

}
