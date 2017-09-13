package fpp.assignments.Test;

public class Test {
	public static void main(String[] args) {
		System.out.println(test("Java"));
	}

	public static int test(String str) {
		if(str==null || str.equals("")) {
			return 0;
		}else {
			return 1+test(str.substring(1));
		}
	}
}
