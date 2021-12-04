package day20_scope;

public class InstanceVAr2 {
	
	
	String adres="Erzurum";
	String dogumyeri;
	
	Double notOrt;
	Double yasOrt=12.3;
	
	char gender='M';
	char krk;
	
	boolean ogrenciMi=true;
	boolean  izinliMi;
	
	

	public static void main(String[] args) {
		
		InstanceVAr2 ali=new InstanceVAr2();
		
		System.out.println(ali.adres); //Erzurum        (burada deger degirtirilmemisse eger)
		System.out.println(ali.dogumyeri);// null           (burada deger degirtirilmemisse eger)
		
		System.out.println(ali.notOrt); //0.0          (burada deger degirtirilmemisse eger)
		System.out.println(ali.yasOrt); //12,3          (burada deger degirtirilmemisse eger)
		System.out.println(ali.gender); //M                (burada deger degirtirilmemisse eger)
		System.out.println(ali.krk);    //space           (burada deger degirtirilmemisse eger)
		System.out.println(ali.ogrenciMi); //true              (burada deger degirtirilmemisse eger)
		System.out.println(ali.izinliMi); // flase                   (burada deger degirtirilmemisse eger)
		
	}

	
	public static void staticMethod() {
		
		
		
		
		
		
		
	}
	
	public  void staticOlmayanMethod() {
		
	}
	
	
}
