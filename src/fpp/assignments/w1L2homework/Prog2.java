package fpp.assignments.w1L2homework;

public class Prog2 { 
	public static void main(String[] args) {
		float f1 = 1.27f;
		float f2 = 3.881f;
		float f3 = 9.6f;
		float floatSum = f1+f2+f3;
		System.out.println(floatSum);
		int intSum = (int)(floatSum); 
		System.out.println("the sum of the floats as an integer, obtained by casting the sum to type int = "+intSum);
		System.out.println("float sum as integer using Math.round = "+Math.round(floatSum));
	}
}
