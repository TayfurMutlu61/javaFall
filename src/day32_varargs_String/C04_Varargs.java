package day32_varargs_String;

public class C04_Varargs {

	public static void main(String[] args) {
		KafanaGoreIslem(5, 10, 13, 0);

	}

	private static void KafanaGoreIslem(int sayi1,int sayi2,int sayi3,int sayi4,int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;

		}
		System.out.println("ilk girilen sayi ile geri kalanin toplami: "+sayi1*toplam);

	}

}
