package oopsdemo2;

public class overloadDemo {

	public static void main(String[] args)
	{
		Addition a1=new Addition();
		
		//invoking add overload method
		a1.add();
		a1.add(20,30 );
		a1.add(20.0f, 053.4f);
		a1.add(20,40 , 250);
		a1.add("hello", "savi");
		}

}
