package ExceptionDemo;

import java.io.IOException;

public class ThrowsExample {
	void MyMethod(int a)throws IOException,ArithmeticException
	{
		if(a==1)
			throw new IOException("IO Exception occured");
		else 
			throw new ArithmeticException("ArithmeticException");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsExample t= new ThrowsExample();
try {
	t.MyMethod(1);
	
}
catch(Exception ex)
{
	System.out.println(ex);
	}

	}

}
