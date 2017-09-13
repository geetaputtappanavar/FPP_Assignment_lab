package mum.lesson5.problem1;

public class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle(String color, double width, double height) {
		super(color);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double calculateArea(){
		return this.width*this.height;
	}
	
	@Override
	public double calculatePerimeter(){
		return (2*this.width)+(2*this.height);
	}
}
