package oopsdemo3;
class Test{
int a;//default varible
private int b;
protected int c;//can be access in subclass
public int d;

public Test(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = 500;
}

public void display()
{
	System.out.println("Private variable :"+b);
	}

}
class Test2 extends Test
{

	public Test2(int a, int b, int c) {
		super(a, b, c);
	}
		public void display()
		{
			System.out.println("Protected variable :"+c);
			
	}
	
}

public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		Test t1=new Test(100,200,300);
		t1.display();
		//t1.b=50; compiler error
		System.out.println("Default Variable:"+t1.a);				
	}

}
