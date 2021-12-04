package day20_scope;

public class InstanceVar {

	int notMat = 50;
	int notFen;

	public static void main(String[] args) {

			//System.out.println(notMat); //yuazdirmaz. main method static oldugu icin static olmayan v
		
		
		
		InstanceVar isim=new InstanceVar();
		System.out.println(isim.notMat);//50
		
		InstanceVar isim2=new InstanceVar();
		
		isim2.notMat=70;
		System.out.println(isim2.notMat);//70
		
		System.out.println(isim.notMat); //50
		
		
		isim.notMat=90;
		System.out.println(isim.notMat+"main ");
		
		
		isim.method2();
		
		
	}
	
	public static void voidstaticMethod( ) {
		//System.out.println(notFen); //instance variablelara direkt ulasilamaz
		
		
		
	}
	
	public void method2( ) {
		
		
		System.out.println("method2'deki"+notFen);//static olmadigi icin ulasilir
		
		notFen=100;
		System.out.println("method2'deki1 ;"+notFen);
	}

}
