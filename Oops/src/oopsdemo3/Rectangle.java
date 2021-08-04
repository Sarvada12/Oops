package oopsdemo3;


//Rectangle class is implementing

public class Rectangle implements Shape{
	
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
System.out.println("Drawing Rectangle");		
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}
	
	
}
