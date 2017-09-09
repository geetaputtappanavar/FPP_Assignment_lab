package fpp.assignments.lesson3.problem4;

public final class Triangle {
	private final double base;
	private final double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public double computeArea(){
		return (base*height)/2;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
}
