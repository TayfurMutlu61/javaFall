package day26_forEaachLoop_constructor;

public class C02_For_Each_Loop {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 77 ,3,6,5,1,8,749};
		int top = 1;
		for (int i : arr) {
			top *= i;
			System.out.println("Arrayin elemanllari çarpımi :" + top);

		}
		 for (int j : arr) {
				System.out.print(j+" ");
				}
	}

}
