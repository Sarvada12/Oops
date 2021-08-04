package oopsdemo2;

public class AggressionDemo {

	public static void main(String[] args) {
		Address ad1=new Address("bengal","MH","INDIA",41500);
		Address ad2=new Address("babi","MH","INDIA",415530);
		
		Student s1=new Student(101,"ravi",ad1);
		Student s2=new Student(105,"mike",ad2);
		
		s1.display();
		s2.display();
	}

}
