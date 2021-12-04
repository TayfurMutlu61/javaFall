package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {

		int fiyat = 100;

		//

		indirimYap25(fiyat);
		System.out.println("methoddan sonra main methoddaki fiyat = "+fiyat);
		
		indirimYap10(fiyat);
		System.out.println("methoddan sonra main methoddaki fiyat = "+fiyat);
	}

	private static void indirimYap25(int fiyat) {
		fiyat *= 0.75;
		System.out.println("%25 inddirimli fiyat = " + fiyat);

	}

	private static void indirimYap10(int fiyat) {
		fiyat *= 0.90;
		System.out.println("%10 inddirimli fiyat = " + fiyat);

	}

}
