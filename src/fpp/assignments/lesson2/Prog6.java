package fpp.assignments.lesson2;

import java.util.Arrays;

//remove duplicates
public class Prog6 {
	public static void main(String[] args) {
		String[] strArr = {"horse", "dog", "cat", "horse", "dog"};
		int strArrLength = strArr.length;
		for(int i=0;i<strArrLength;i++){
			for(int j=i+1;j<strArrLength;j++){
				if(strArr[i]==strArr[j]){
					strArr[j]=strArr[strArrLength-1];
					strArrLength--;
					j--;
				}
			}
		}
		
		String[] strArrWithoutDup = Arrays.copyOf(strArr, strArrLength);
		System.out.println(Arrays.toString(strArrWithoutDup));
	}
}


/*#############Input and Output###########
Input: {"horse", "dog", "cat", "horse", "dog"}

Output: [horse, dog, cat]*/