package day19_whileLoopDowhileLOOp;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		
		
		for (char i = 'm'; i > 'c'; i--) {  ///for loop ile yapilis
			System.out.print(i+", ");
		}
		System.out.println();
		char krk='m';    // while lopp ile yapilis
		while(krk>'c') {
			System.out.print(krk+", ");
			krk--;
			
		}System.out.println();
		
		char harf='m';
		do {
			System.out.print(harf+", ");   ////do while ile yapilisi
			harf--;
			
		}while(harf>'c');
		
	}

}
