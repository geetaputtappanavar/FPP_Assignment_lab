package mum.lesson5.problem1;

public class Circle extends Shape{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea(){
		return Math.PI*this.radius*this.radius;
	}
	
	@Override
	public double calculatePerimeter(){
		return 2*Math.PI*this.radius;
	}
}
