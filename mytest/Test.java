package mum.mytest;

public class Test {
	public static void main(String[] args) {
		//printCharsReverse("ACE");
		Book b1 = new Book("ss", 23, "zz");
		Book b2 = new Book("mm", 23, "zz");
		System.out.println("b1"+b1.hashCode());
		System.out.println("b2"+b2.hashCode());
	}

	public static void printCharsReverse(String str) {
		

		if (str == null || str.equals(""))
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
	

}
