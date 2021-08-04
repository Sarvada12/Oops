package oopsdemo2;

public class SingleinheritanceDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"james Go","JDBC");
		Developer d2=new Developer(102,"janny Go","spring ");
		
		Accountant a1=new Accountant(201,"gaurav sharma","process salary of employee","SAP");
				Accountant a2=new Accountant(208,"uravi sharma","process salary of evendor","TALLY");
	d1.display();//child calss obj.invoke parent class mtd
		d1.display1();//child calss obj.invoke child class mtd
		
		d2.display();
		d2.display1();
		
		// invoke accountant class methods
		a1.display();
		a2.display();
	}

}
