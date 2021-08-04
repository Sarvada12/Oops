package newfeatures;

import java.time.LocalDate;

interface MyInterface
{
	public void square(int a);//abstract method
	//default method
	default void display(String a)
	{
		System.out.println("Hello"+a);
	}
	
	//static method
	static void printDate()
	{
		System.out.println("Todays date :"+LocalDate.now());
	}
	}
public class DefaultMethodDemo implements MyInterface {


	@Override
	public void square(int a) {
System.out.println("The square of Number is :"+(a*a));		
	}

	public static void main(String[] args) {

		
		DefaultMethodDemo d1=new DefaultMethodDemo();
		d1.square(5);
		
		//call default method in interface
		d1.display("Default method");
		
		//call static method in interface
		MyInterface.printDate();
	}

}
