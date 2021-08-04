package oopsdemo2;

public class Student {
	int rollno;
	String name;
	Address ad; //Entity Refernce Aggreation-has a relationship
	public Student(int rollno, String name, Address ad) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.ad = ad;
	}
	void display()
	{
		System.out.println("*Studentals Details");
		System.out.println("student ID:"+rollno);
		System.out.println("student Name:"+name);
		System.out.println("address"+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
		
	}

}
