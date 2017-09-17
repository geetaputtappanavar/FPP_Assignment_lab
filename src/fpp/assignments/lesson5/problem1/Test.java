package mum.lesson5.problem1;

public class Test {
	static Shape[] shapeObjs = new Shape[5];
	public static void main(String[] args) {		//are		peri
		shapeObjs[0] = new Circle("Yellow", 3.5); // 38.4895
		shapeObjs[1] = new Rectangle("Purple", 4.5, 5.5);//24.75
		shapeObjs[2] = new Square("red", 3.5, 3.5);		//12.5
		shapeObjs[3] = new Rectangle("black", 6.7, 9.8);//65.66
		shapeObjs[4] = new Square("pink", 7.8, 7.8);//60.84
		printTotal(shapeObjs);
	}
	
	public static void printTotal(Shape[] shapes){
		double totalPeri = 0;
		double totalArea = 0;
		for(Shape obj :shapeObjs){
			totalPeri+=obj.calculatePerimeter();
			totalArea+=obj.calculateArea();
		}
		System.out.println("Total perimeter = "+totalPeri+"\n"+"Total Area = "+totalArea);
	 }
}

/*###########Input and Output############3

output:
Total perimeter = 120.19114857512855
Total Area = 201.98451000647498*/
