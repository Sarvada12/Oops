package oopsdemo1;

public class constructordemo {
	int id; 
	String name;
	float salary;
	
	
	constructordemo()  //implicite constructor
	{System.out.println("i am default constructor;");
		id=0;
		name="";
		salary=5000.00f;
	}
	void input()
	{
		
	}
void display()
{
	System.out.println(salary);
	}
	public static void main(String[] args) {
		constructordemo cd1=new constructordemo();
		constructordemo cd2=new constructordemo();
		constructordemo cd3=new constructordemo();

		cd1.display();

	}

}
/*int a;//variable declaration
int a=10;//variable declaration and initilazation
int a();//method declartion*/