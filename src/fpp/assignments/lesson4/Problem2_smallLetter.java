package fpp.assignments.lesson4;

public class Problem2_smallLetter {
	
	public static void main(String[] args) {
		Problem2_smallLetter obj = new Problem2_smallLetter();
		String str = "dbeaf";
		System.out.println("smallest letter in "+str+" is: "+obj.findMinChar(str.charAt(0), str));
	}
	public char findMinChar(char minChar, String input){
		//char minChar = input.charAt(0);
		/*for(int i=1;i<input.length();i++){
			if(input.charAt(i)<minChar){
				minChar = input.charAt(i);
				pos= i;
			}
		}*/
		if(input.length()<2){
			return minChar;
		}
		if(input.charAt(1)<minChar){
			minChar = input.charAt(1);
		}
		
		return findMinChar(minChar, input.substring(1));
	}
}

/*############Input and Output##########
Input: 
	dbeaf
Output:	
	smallest letter in dbeaf is a*/
