package day_Grup_Calismasi;

import java.util.Arrays;
import java.util.Scanner;

public class methodlust {
	
	static int topla = 0;
    static int boyut = 0;
    static int ortalama = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen arrayin boyutini yazin");
        boyut = scan.nextInt();
        int arr[] = new int[boyut];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arrayin " + (i + 1) + " .elamanini giriniz " + "");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ortalama(arr);
        ortalamaninUstu(arr);
        ortalamaninAlti(arr);
    }
    public static void ortalamaninAlti(int[] arr) {
        System.out.print("Ortalamanin altindeki sayilar: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ortalama) {
                //
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void ortalamaninUstu(int[] arr) {
        System.out.print("Ortalamanin ustundeki sayilar: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                //
                System.out.print(arr[i] + "   ");
            }
        }
    }
    public static void ortalama(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            topla += arr[i];
        }
        ortalama = topla / boyut;
        System.out.println("arr toplami " + topla + "\nortalama aliyoruz " + ortalama);
    }
//  public static void ortalama(arr[]) {
//
//      
//  
}
