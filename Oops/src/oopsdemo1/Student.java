package oopsdemo1;

import java.util.Scanner;

//instance class
public class Student {
	int rollNumber;
	String name,course;
	float m1,m2,m3,total;
	Scanner s=new Scanner(System.in);
	
	//instance methods/functions
	
	void input()
	{
		System.out.println("enter roll no,name,course:");
		rollNumber =s.nextInt();
		name=s.next();
		course=s.next();
		
		System.out.println("enter marks of 3 subject:");
		m1=s.nextFloat();
		m2=s.nextFloat();
		m3=s.nextFloat();
		
	}
	float calculate()
	{
		total=m1+m2+m3;
		return total;
	}
void display()
{
	System.out.println("******Students Details************");
	System.out.println("Roll no:"+rollNumber);
	System.out.println("name"+name);
	System.out.println("course"+course);
	System.out.println("Total Marks"+total);
	
}
	
}
