package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		
		int sayi1=10;
		Integer sayi2=20;
		
		//sayi1. yazdigimizda metod cikmaz cunku sayi 1int´dir yani primative
		
		// sayi2. yazdihigmza metod gelir cunku non primativ´dir
		
		
		String tel1="3578987";
		
		String tel2="3245434";
	
		System.out.println(tel1+tel2);  //507729285700000000

		// bu sayilari toplamak istersrk 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		
		
		//String caddeNo="B203";
		String caddeNo="203";

		String sokakNo="1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		// metodu strig
		
		
		System.out.println("Hello World");
		
		
		
		
		
		
		
		
		
	}

}
