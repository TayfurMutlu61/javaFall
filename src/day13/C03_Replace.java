package day13;

public class C03_Replace {

	public static void main(String[] args) {
		
		
		String str= "java ogrernmek cok kolay";
		System.out.println(str.replace(" ", ""));
		
		System.out.println(str.replace("cok", "asiri"));
System.out.println(str.replace(str.charAt(1), str.charAt(2)));
	System.out.println(str.concat(str));


	}

}
