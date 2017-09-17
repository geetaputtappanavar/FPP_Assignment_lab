package fpp.assignments.lesson4;

public class Problem4_palindrome {
	public static void main(String[] args) {
		Problem4_palindrome obj = new Problem4_palindrome();
		String str = "gadag";
		if(obj.checkForPalindorme(str)){
			System.out.println("The given string "+str+" is palindrome");
		}
	}
	
	public boolean checkForPalindorme(String input){
		if(input.length()<=1){
			return true;
		}
		if(input.charAt(0)==input.charAt(input.length()-1)){
			return checkForPalindorme(input.substring(1,  input.length()-1));
		}
		return false;
	}
}


/*#############Input and Output##############
Input: 
gadag
	
	
Output:	
The given string gadag is palindrome
*/
