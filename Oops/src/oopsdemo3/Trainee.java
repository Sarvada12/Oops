package oopsdemo3;

public abstract class Trainee {

	private String name;
    private String address;
    private int number;
    
    
	public Trainee(String name, String address, int number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	
	
	
	public abstract double calculatorMarks();
	
	
	void  show()
	{
		System.out.println("display marks:"+this.name +" "+this.address);
	}


	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	
}
