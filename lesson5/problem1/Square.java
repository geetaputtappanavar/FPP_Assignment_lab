package mum.lesson5.problem1;

public class Square extends Rectangle{
	
	public Square(String color, double height, double width) {
		super(color, height, width);
	}

	@Override
	public double calculateArea(){
		return this.height*this.width;
	}
	
	@Override
	public double calculatePerimeter(){
		return 2*this.width+2*height;
	}
}
