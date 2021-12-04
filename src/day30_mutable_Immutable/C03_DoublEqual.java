package day30_mutable_Immutable;

public class C03_DoublEqual {

	public static void main(String[] args) {
		String str1 = "Ali";
		String str2 = "Ali";
		String str3 = new String("Ali");
		String str4 = new String("Ali");

		System.out.println(str1 == str3);

		System.out.println(str1.equals(str3));

		System.out.println(str4 == str3);

		System.out.println(str4.equals(str3));
		
		System.out.println(str1 == str2);

		
		
		
		
	}

}
