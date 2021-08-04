package oopsdemo1;
class Test{
	public void finalize()//override finalize methosd of  object class
	{
		System.out.println("object destroyedd and garbage collected\"");
	}
}
public class DestructorDemo {

	public static void main(String[] args) {
		Test t1=new Test();//initialise object -- call default constructor allocate mmemory
		Test t2=new Test();
		
		
		t1=null;//de allocate mmemory
		t2=null;
		
		System.gc();
		System.out.println("in main method");
		

	}

}
