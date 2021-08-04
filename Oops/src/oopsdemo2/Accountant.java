package oopsdemo2;

public class Accountant extends Employee //child class
{
	String task,tech;
 public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);
		this.task=t1;
		this.tech=t2;
	}
void display()
{
	super.display();//invoke base class method
	System.out.println("Accountant TASk"+task);
	System.out.println("software used"+tech);
	}

}
