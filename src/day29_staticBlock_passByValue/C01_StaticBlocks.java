package day29_staticBlock_passByValue;

public class C01_StaticBlocks {
	
	static {
		System.out.println("static blok ne zaman calisir");
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Javada once main method calisir");

	}
	static {
		System.out.println("static blok nerede olursa olsun main methoddan once calisir");
	
		
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("selam");
		}
	}

	static {
		System.out.println("birden fazla static block varsa yukardakini java once calistirir");
	}
}
