package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student(101,"Mike ",19);
		Student s2=new Student(102,"Mike ",29);
		Student s3=new Student(103,"Mike ",39);
		Student s4=new Student(104,"Mike ",49);
		Student s5=new Student(105,"Mike ",59);

		//adding students to list
		a1.add(s2);a1.add(s5);a1.add(s4);a1.add(s3);a1.add(s1);
		Collections.sort(a1);// invoke compare to() method of student 
		
		System.out.println("*****Student sorted list********");
		for(Student s:a1) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
	}

}
