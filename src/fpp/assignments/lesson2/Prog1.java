package fpp.assignments.lesson2;

public class Prog1 {

	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(0, 9);
		System.out.println("x = "+x+"\nPI to the power x = "+Math.pow(Math.PI, x));
		int y = RandomNumbers.getRandomInt(0, 9);
		System.out.println("y = "+y+"\ny to the power PI = "+Math.pow(y, Math.PI));
	}
}

/*########Output#######
 x = 9
PI to the power x = 29809.0993334462
y = 9
y to the power PI = 995.041644892855
 */