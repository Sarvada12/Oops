package oopsdemo2;

public class Developer extends Employee {
	String techology;
	private String technology;
	

	public Developer(int empId, String name,String tech) {
		super(empId, name);  // invoke base class constructor
		this.techology=tech;
		
		
	}
	void display1()
	{
		System.out.println("Technology used:"+technology);
	}

}
