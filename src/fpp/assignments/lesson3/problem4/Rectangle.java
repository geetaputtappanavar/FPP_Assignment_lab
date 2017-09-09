package fpp.assignments.lesson3.problem4;

public final class Rectangle {
	private final double height;
	private final double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double computeArea(){
		return height*width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
}
