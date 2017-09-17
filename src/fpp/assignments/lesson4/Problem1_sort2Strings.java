package fpp.assignments.lesson4;

public class Problem1_sort2Strings {
	
	public static void main(String[] args) {
		Problem1_sort2Strings obj = new Problem1_sort2Strings();
		obj.sort2Strings("afbed", "aef");
		System.out.println("Sorted string: "+obj.sort2Strings("afbed", "aef"));
	}
	
	public String sort2Strings(String str1, String str2){
		return sortHelper(str1+str2);
	}
	public String sortHelper(String strToSort){
		if(strToSort.length()<2){
			return strToSort;
		}
		char firstElt = strToSort.charAt(0);
		int pos = 0;
		for(int i=1;i<strToSort.length();i++){
			if(strToSort.charAt(i)<firstElt){
				firstElt = strToSort.charAt(i);
				pos = i;
			}
		}	
		return firstElt+sortHelper(strToSort.substring(0, pos)+strToSort.substring(pos+1));
	}
}


/*#####input and output
input: 
afbed

output:
Sorted string: abdef*/

