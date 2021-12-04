package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		int fiyat = 100;

		//
		System.out.println(indirimYap25(fiyat));
		// indirimYap25(fiyat);
		System.out.println("methoddan sonra main methoddaki fiyat = " + fiyat);
		
		fiyat=indirimYap10(fiyat);
		
		
		
		//System.out.println(indirimYap10(fiyat));
		// indirimYap10(fiyat);
		System.out.println("methoddan sonra main methoddaki fiyat = " + fiyat);
	}

	private static int indirimYap25(int fiyat) {
		fiyat *= 0.75;
		// System.out.println("%25 inddirimli fiyat = " + fiyat);
		return fiyat;
	}

	private static int indirimYap10(int fiyat) {
		fiyat *= 0.90;
		// System.out.println("%10 inddirimli fiyat = " + fiyat);

		return fiyat;

	}

}
