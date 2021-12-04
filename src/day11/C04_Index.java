package day11;

public class C04_Index {

	public static void main(String[] args) {
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf("J"));
		
		
		int index=str.indexOf("r");
		
		System.out.println(index);
		
		System.out.println(str.indexOf('ä')); // -1 olur string icinde olmayan krk girilirse'
		
		System.out.println(str.indexOf('A'));
		
		System.out.println(str.indexOf("va og"));
		
		System.out.println(str.indexOf('e', 15));
		
		
	}

}
