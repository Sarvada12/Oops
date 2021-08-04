package oopsdemo3;

public class ShapeTest {

	public static void main(String[] args) {
//prg for iinterface not implementation
		Shape shape=new Circle(10);

		System.out.println("Using Interface:"+shape.LABLE);
		shape.draw();
		System.out.println("Area of circle is :"+shape.getArea());
		
		//switching from one implementation to another easily
		shape=new Rectangle(10,8);
		
		shape.draw();
		System.out.println("Area of Rectangle is :"+shape.getArea());

	}

}
