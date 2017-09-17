package fpp.assignments.lesson4;

import java.util.Arrays;

public class Problem3_BinarySearch {
	static Problem3_BinarySearch obj = new Problem3_BinarySearch();
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5, 6, 7};	
		int key = 7;
		//System.out.println(obj.binarySearch(intArr, key));
		if(obj.binarySearch(intArr, 7)==1){
			System.out.println("The given element "+key+" is present in the array"+Arrays.toString(intArr));
		}
	}
	public int binarySearch(int[] intArr, int key){
		int lowestElt = intArr[0];
		int highestElt = intArr[intArr.length-1];
		return obj.helper(intArr, key, lowestElt, highestElt);
	}
	private int helper(int[] intArr, int key, int lowestElt, int highestElt){
		int mid = (lowestElt+highestElt)/2;
		if((key>intArr[intArr.length-1]||(key<intArr[0]))){
			return -1;
		}
		if(key==intArr[mid]){
			return 1;
		}
		else if(key<intArr[mid]){
			return helper(intArr, key, lowestElt, mid-1);
		}else if(key>intArr[mid]){
			return helper(intArr, key, mid+1, highestElt);
		}else{
			return -1;
		}
	}
}

/*##########Input and Output#############
Input:
{1, 2, 3, 4, 5, 6, 7}

Output:
The given element 7 is present in the array[1, 2, 3, 4, 5, 6, 7]*/
