package fpp.assignments.w1L2homework;

//set of 8 addition problem
public class Prog5 {
	public static void main(String[] args) {
		int[][] doubleArr = {
								{RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99)}, 
								{RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99)},
								{RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99)},
								{RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99)}
							};
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i%2!=0) {
					System.out.print("+");
				}
				else {
					System.out.print(" ");
				}
				if(doubleArr[i][j]-10<0) {
					System.out.print(" ");
				}
				System.out.print(doubleArr[i][j]+"\t\t");				
			}
			System.out.println();
			if(i%2!=0) {
			System.out.println("----"+"\t\t"+"----"+"\t\t"+"----"+"\t\t"+"----"+"\t\t");
			System.out.println("\n\n");
			}
		}
	}
}


/*###########Output############

22			 41		  	  7		 	 22		
+79			+33			+72			+65		
----		----		----		----		



 49		 	 77		  	  2		 	 38		
+49			+80			+56			+85		
----		----		----		----	*/
