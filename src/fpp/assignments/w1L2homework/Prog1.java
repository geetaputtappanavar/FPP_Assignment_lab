package fpp.assignments.w1L2homework;

public class Prog1 {

	public static void main(String[] args) {
		//PI to the power x 
		System.out.println("----Problem 1 - 1-----");
		int x = RandomNumbers.getRandomInt(0, 9);
		System.out.println("hi");
		System.out.println(Math.pow(Math.PI, x));
		
		//y to the power PI
		System.out.println("----Problem 1 - 2-----");
		int y = RandomNumbers.getRandomInt(0, 9);
		System.out.println(Math.pow(y, Math.PI));
	}
}
