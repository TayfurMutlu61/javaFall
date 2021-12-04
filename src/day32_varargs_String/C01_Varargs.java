package day32_varargs_String;

public class C01_Varargs {

	public static void main(String[] args) {

		topla(5, 8, 10, 13, 15, 0);

	}

	private static void topla(int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;

		}
		System.out.println(toplam);

	}

}
