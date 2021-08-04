package oopsdemo3;

public class Student {
private int rollno;
private String name;
private static String college="SRM";

static void collegeChange()
{
	college="RVCE";
	}

public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
void display()
{
	System.out.println(rollno+""+name+" "+college);}

}
