package genelTekrar;

import java.util.Scanner;

public class KUllanicidanArralma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen arrayin boyutunun yaziniz");

		int boyut = scan.nextInt();

		int arr[] = new int[boyut];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin " + (i + 1) + ". giriniz");
			arr[i]=scan.nextInt();
			
			int [] arr1= {1,2,3,4,5,6,7,9};
			
			
					
			
	}
		
		
		
		
		
		
		
		
		int topla=0;
		
		for (int i = 0; i < arr.length; i++) {
			topla+=arr[i];
			
		}
		int ortalama=topla/boyut;
		
		System.out.println("arrnin toplami: "+topla+"\nortalamasi:  "+ortalama);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<ortalama) {
				System.out.println(arr[i]+ " ");
				
			} else {

			}
		}

	}

}
