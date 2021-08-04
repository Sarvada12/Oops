package newfeatures;
interface hello
{
	void welcome();
	}

public class MethodReferenceDemo {

	
	public static void display()
	{
		System.out.println("Hello from method reference");
	}
	
	public void print()
	{
		System.out.println("Instance method using Method Reference");
		
	}
	
	
	 MethodReferenceDemo() {
		 System.out.println("In constructor");
	}

	public static void main(String[] args) {

		hello h=MethodReferenceDemo::display;
		
		h.welcome();
		
		MethodReferenceDemo d1=new MethodReferenceDemo();
		hello h1=d1::print;
		h1.welcome();
		hello h2=MethodReferenceDemo::new;
		h2.welcome();
		
	}

}