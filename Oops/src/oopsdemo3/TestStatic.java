package oopsdemo3;

public class TestStatic {

	public static void main(String[] args) {
		Student.collegeChange();
		Student s1=new Student (101," mike ");
		Student s2=new Student (101," john");
		Student s3=new Student (101," Mary");
		s1.display();
		s2.display();
		s3.display();
	}

}
