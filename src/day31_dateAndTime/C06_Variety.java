package day31_dateAndTime;

public class C06_Variety {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		int f = 60;

		topla(a, b);
		topla(a, b, c);
		topla(a, b, c, d);
		topla(a, b, c, d, e);
		topla(a, b, c, d, e, f);

	}

	private static void topla(int... a) {
		System.out.println("variety calisir");

	}

	private static void topla(int a, int b, int c) {
		System.out.println("3 sayinin toplami: " + (a + b + c));

	}

	private static void topla(int a, int b) {
		System.out.println("iki sayinin toplami: " + (a + b));

	}

}
