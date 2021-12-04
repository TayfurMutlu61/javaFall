package day32_varargs_String;

public class C03_Vararrgs {

	public static void main(String[] args) {
		KafanaGoreTopla(5, 8, 10, 13, 0);

	}

	private static void KafanaGoreTopla(int sayi1, int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;

		}
		System.out.println("girilen sayi ile geri kalanin toplami: "+sayi1*toplam);

	}

}
