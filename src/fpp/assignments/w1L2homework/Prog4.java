package fpp.assignments.w1L2homework;

	
public class Prog4 {
	public static void main(String[] args) {
		String str = "life is beautiful";
		System.out.println("Given String: "+str);
		System.out.print("Reversed string with out using Java API: ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}

/*############Output:###################
	Given String: life is beautiful
	Reversed string with out using Java API: lufituaeb si efil*/