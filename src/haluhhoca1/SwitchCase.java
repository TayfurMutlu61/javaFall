package haluhhoca1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		//girilen bir ay numaraasina gore ayn kac gun oldugu ayin kac gun oldugunu sayi ile yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("gununu merak ettigin ay no gir");
		
		int ayNo=scan.nextInt();
		
		switch (ayNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("girdiginiz ay 31 gun");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("girdiginiz ay 30 gun");
			break;
				case 2:
					System.out.print("yili giriniz: ");
					int yil=scan.nextInt();
					
					if (yil%4==0){
						
					}else {
						System.out.println("girdiginiz ay 28 gun");
					}
			
			
			
			
			
					break;
			
			
		default:
			System.out.println("hatali giris");
			
		}
		
System.out.println("dewamkee");
	} 

}
