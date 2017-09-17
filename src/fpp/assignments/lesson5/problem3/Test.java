package mum.lesson5.problem3;

public class Test {
	public static void main(String[] args) {
		Figure[] figArr = new Figure[5];
		figArr[0] = new UpwardHat();
		figArr[1] = new UpwardHat();
		figArr[2] = new DownwardHat();
		figArr[3] = new FaceMaker();
		figArr[4] = new Vertical();
		for(Figure obj: figArr){
			obj.getFigure();
		}
		System.out.println("\n");
		for(Figure obj: figArr){
			System.out.print(obj.getClass().getSimpleName()+":");
			obj.getFigure();
			System.out.println();
		}
	}
}


/*Input and Output:
Output:
	/\/\\/:)||

	UpwardHat:/\
	UpwardHat:/\
	DownwardHat:\/
	FaceMaker::)
	Vertical:||
*/
	