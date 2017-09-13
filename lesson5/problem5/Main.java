package mum.lesson5.problem5;

public class Main {
	public static void main(String[] args) {
		Computer c1 = new Computer("HP", "I7", 8, 1000, 2.5);
		Computer c2 = new Computer("Sony", "I3", 4, 500, 1.5);
		Computer c3 = new Computer("HP", "I7", 8, 1000, 2.5);
		Computer[] cArr = {c1, c2, c3};	
		for(Computer c:cArr){
			System.out.println("Power of "+c.getManufacturer()+" is "+c.computePower());
		}
		if(c1.equals(c2)){
			System.out.println("\nThe computers c1 and c2 are same");
		}else{
			System.out.println("\nThe computers c1 and c2 are not same");
		}
		if(c1.equals(c3)){
			System.out.println("\nThe computers c1 and c3 are same");
		}else{
			System.out.println("\nThe computers c1 and c3 are not same");
		}
	}
}

/*Input and Output:
	
Output:
	Power of HP is 20.0
	Power of Sony is 6.0
	Power of HP is 20.0

	The computers c1 and c2 are not same

	The computers c1 and c3 are same
*/
