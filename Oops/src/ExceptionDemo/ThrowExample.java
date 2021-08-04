package ExceptionDemo;

public class ThrowExample {
	
	public static void checkEligibility(int age,int weight)
	{
		if (age<12 && weight <40)
		{
			throw new ArithmeticException("Student is not Eligible for Regstration");
		}
		else {
			System.out.println("Student with age :"+age+" and "+weight+"is eligible");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to sport eligibility process ..");
	checkEligibility(20,45);
	System.out.println("Thank you");
	checkEligibility(10,25);

	}

}
