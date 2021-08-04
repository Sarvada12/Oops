package oopsdemo1;

import java.util.Scanner;

class person
{
	String name,constituency;
	int age;
	Scanner s;
	
	
	public person() { //default constructor
		System.out.println("Voter Eligibility App");
		age=0;
		constituency="bengaluru";
		s=new Scanner(System.in);
		
	}
	
	public person(String name, int age) { //parameterized constructor
		this.name = name;
		this.age = age;
		constituency="Mumbai";
	}
	
	person(String n,int a,String c)//parameterized constructor
	{
		this.name=n;
		age=a;
		constituency=c;
		
	}
	
	
	void input()
	{
		System.out.println("Enter ur name:");
		name=s.nextLine();
		System.out.println("Enter ur age:");
		age=s.nextInt();
		
	}
	void print()
	{
		System.out.println("name is:"+name);
		System.out.println("age:"+age);
		System.out.println("constituency is:"+constituency);
	}
	
	
	
	
	}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person ObjPerson1=new person();
		ObjPerson1.input();
		ObjPerson1.print();
		
		System.out.println("--------------------");
		person ObjPerson2=new person("Mike",45);
		ObjPerson2.print();

		System.out.println("----------------------");
		person ObjPerson3=new person("Ravi",35,"Delhi");
		ObjPerson3.print();

	}

}
