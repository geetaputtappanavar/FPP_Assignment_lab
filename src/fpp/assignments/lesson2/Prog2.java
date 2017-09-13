package fpp.assignments.lesson2;

public class Prog2 { 
	public static void main(String[] args) {
		float f1 = 1.27f;
		float f2 = 3.881f;
		float f3 = 9.6f;
		float floatSum = f1+f2+f3;
		System.out.println("sum of float numbers = "+floatSum);
		int intSum = (int)(floatSum); 
		System.out.println("the sum of the floats as an integer, obtained by casting the sum to type int = "+intSum);
		System.out.println("float sum as integer using Math.round = "+Math.round(floatSum));
	}
}


/*########Output##########

sum of float numbers = 14.751
the sum of the floats as an integer, obtained by casting the sum to type int = 14
float sum as integer using Math.round = 15*/