package day20_scope;

public class StaticVariables {
	
	
	static int no=20;
	
	static int sayi;
	static String adres="Erzurum";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	int sayi1=4;
	
	
	

	public static void main(String[] args) {
		
		no++;
		System.out.println(no);
		
		
		staticMethod();
		System.out.println(no);
		
		//StaticVariables obje=new StaticVariables;
		
	}
	
	public static void staticMethod() {
		
		no++;
		System.out.println("static methodda 'no': "+ no);
		
		
	}

	 public void staticOlmayanMethod() {
		 
		 
		 
		 no++;
		 System.out.println("static olmayan methodda 'no': "+ no);
		 
	 }
	
	
	
	
	
	
	
	
	
	
}
