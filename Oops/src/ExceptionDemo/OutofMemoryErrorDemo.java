package ExceptionDemo;

import java.io.IOException;

public class OutofMemoryErrorDemo {
	
	public void createArray(int size)
	{
		try{
			Integer [] a=new Integer[size];
			
		}
		catch(OutOfMemoryError e){
			System.err.println("Array size too large"+e);
			System.err.println("Max JVM memory"+Runtime.getRuntime().maxMemory());
			
			System.err.println("Java version"+Runtime.version());
			//System.err is a PrintStream. System.err works like System.out except it is normally only used to output error texts. Some programs (like Eclipse) will show the output to System.err in red text, to make it more obvious that it is error text.

			
		
		}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
OutofMemoryErrorDemo d1=new OutofMemoryErrorDemo();

d1.createArray(1000*1000*1000);

// open notepad
try {
	Runtime.getRuntime().exec("notepad");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

