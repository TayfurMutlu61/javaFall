package day28_ConstructorCall_StaticKeyword;

public class C03 {

	public static void main(String[] args) {
		C02 obje1 = new C02();
		System.out.println("obe1 icin x: " + obje1.x + " obe1 icin y: " + obje1.y);

		obje1.x++;
		obje1.y++;

		System.out.println("obe1 icin x: " + obje1.x + " obe1 icin y: " + obje1.y);

		C02 obje2 = new C02();
		System.out.println("obe icin x: " + obje2.x + " obe2 icin y: " + obje2.y);

		obje2.x++;
		C02.y++;

		System.out.println("obe icin x: " + obje2.x + " obe2 icin y: " + obje2.y);

		C02 obje3 = new C02();
		System.out.println("obje3 icin x: " + obje3.x + " obe3 icin y: " + obje3.y);

		obje3.x = 20;
		obje3.y = 40;

		System.out.println("obje3 icin x: " + obje3.x + " obe3 icin y: " + obje3.y);

		
		
	} 

}
