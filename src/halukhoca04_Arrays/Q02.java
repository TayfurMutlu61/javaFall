package halukhoca04_Arrays;

import java.util.Arrays;

public class Q02 {
	public static void main(String[] args) {

		// multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
		// birer bulan
		// ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
		// yazdıran programı yaziniz.
		// input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

		int arr1[][] = { { 10, 20, 30 }, { 4 }, { 6, 7, 20 } };
		int arrYeni[] = new int[arr1.length];
		for (int kat = 0; kat < arr1.length; kat++) {
			for (int dire = 0; dire < arr1[kat].length; dire++) {
				arrYeni[kat] += arr1[kat][dire];
			}
		}
		System.out.println(Arrays.toString(arrYeni));

		/**
		 * Scanner scan = new Scanner(System.in); System.out.println("Lutfen outer
		 * arrayin eleman sayisini giriniz: "); int arrboy = scan.nextInt();
		 * System.out.println("Lutfen inner arrayin eleman sayisini giriniz: "); int
		 * arrinnerboy = scan.nextInt(); int arr[][]= new int[arrboy][arrinnerboy];
		 * 
		 * 
		 * int arrtoplam []=new int[arrboy];
		 * 
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
		 * j++) { System.out.println((i+1) + ".arrayin " + (j+1) + ". elemanini giriniz:
		 * "); arr[i][j]=scan.nextInt(); }
		 * 
		 * }System.out.println(Arrays.deepToString(arr));
		 * 
		 * 
		 * 
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
		 * j++) { arrtoplam[i]+= arr[i][j];
		 * 
		 * 
		 * } }System.out.println(Arrays.toString(arrtoplam));
		 */

	}
}
