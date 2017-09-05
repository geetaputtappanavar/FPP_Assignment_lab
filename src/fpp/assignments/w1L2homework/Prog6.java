package fpp.assignments.w1L2homework;

import java.util.Arrays;

//remove duplicates
public class Prog6 {
	public static void main(String[] args) {
		String[] strArr = {"horse", "dog", "cat", "horse","dog"};
		/*String[] strArrWithOutDup = new String[strArr.length];
		boolean dupFlag = false;
		int count = 0;*/
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr.length;j++) {
				if(i!=j) {
				if(strArr[i]==strArr[j]) {
					//dupFlag = true;
					strArr[j] = null;
				}
			}
				/*if(!dupFlag) {
					strArrWithOutDup[count] = strArr[j];
					count++;
				}*/
			}
			
		}
		System.out.println(Arrays.toString(strArr));
	}
}


/*#############Output###########

[horse, dog, cat, null, null]*/