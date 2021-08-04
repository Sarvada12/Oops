package oopsdemo2;

public class Addition
{
	void add() 
	{
	System.out.println("Method overloading Demo");
	
	}
	void add(int a,int b)
	{
		System.out.println("addition of two no is:"+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("addition of two no is:"+(a+b));
	}
	void add(int a,int b ,int c)
	{
		System.out.println("addition of three no is:"+(a+b+c));
	}
	void add(String s1,String s2)
	{
		System.out.println("addition of two String no is:"+(s1+s2));

	}
}
