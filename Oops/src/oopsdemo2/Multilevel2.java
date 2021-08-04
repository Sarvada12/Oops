package oopsdemo2;
class staff{
	private int empId;
	private String name;
	protected float salary,hra;
	
	
	public staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void getHRA()
	{
		hra=(salary*60)/100;
		System.out.println("HRA:"+hra);
	}
	void display()
	{
		System.out.println("**********Employee Details***********");
	System.out.println(empId+" "+name+" "+salary);
	}
	
	
}

class Manager extends staff
{
protected float da;
private float gross;
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
		
	}
	void getDA()
	
	{
		da=(salary*80)/100;
		System.out.println("DA is:"+da);
	}
	void getgross()
	{
		gross=salary+hra+da;
		System.out.println("Gross salary og director is:"+gross);
		}
	
	}

class Director extends Manager
{
	float ta,gross;
public Director(int empId, String name, float salary)
{  
	

		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}
void getTA()
{
	ta=(salary*30)/100;
	System.out.println("TA is:"+ta);
	}
void getgross()
{
	gross=salary+hra+da+ta;
	System.out.println("Gross salary og director is:"+gross);
	}
}

public class Multilevel2 {

	public static void main(String[] args) {
		Director d1=new Director(101,"kean",50000);
		System.out.println("****Director Details****");
		d1.display();
		d1.getHRA();
		d1.getDA();
		d1.getTA();
		d1.getgross();
		Manager m1=new Manager(201,"Mary",4000);
		System.out.println("*****Manager details*********");
		
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getgross();
		
		staff s1=new staff(301,"Helen",2000);
		System.out.println("*****Staff details*********");
		s1.display();
		s1.getHRA();
		
		
	}

}
