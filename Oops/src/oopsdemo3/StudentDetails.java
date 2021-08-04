package oopsdemo3;



public class StudentDetails implements CollegeData,HostelData {

	College c1=new College("Mary",500,"delhi university","MCA");
	Hostel h1=new Hostel("Ram","Block A");
	
	

	@Override
	public void hostelDetails() {
		
		System.out.println("****Hostel Details********");
		System.out.println("hostel name:"+h1.getName());
		System.out.println("location:"+h1.getLocation());

	}

	@Override
	public void collegeDetails() {
System.out.println("*collehge deyails**");
System.out.println("college name: "+c1.getName());
System.out.println("collegeid: "+c1.getId());
System.out.println("course: "+c1.getCourse());
System.out.println("university: "+c1.getUniversiy());



	}

	@Override
	public void studentDetails() {
		System.out.println("student can join courses : MCA, MTech, BCA, BTech");
			
	}
	
	public void studentRecord() {
		System.out.println("Students selected on the basis of percentage and Financial situation");
		
	}

public static void main(String[] args) {
	
	StudentDetails s1=new StudentDetails();
	s1.collegeDetails();
	s1.studentDetails();
	s1.hostelDetails();
	s1.studentRecord();
}
}
