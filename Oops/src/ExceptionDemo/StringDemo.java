package ExceptionDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello World";
		String s2=null;
	try
	{
	        System.out.println(s1.length());
	        System.out.println(s2.length());

	}
	catch(Exception a)
	{
		System.out.println("Exception occured :"+a);
	}
	}

}
