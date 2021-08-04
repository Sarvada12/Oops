package oopsdemo2;
class Bank
{
	int getRateofinterest()
	{
		return 0;
		
	}
	void display()
	{
		System.out.println("Welcome to Bank");
	}
	}

class SBI extends Bank
{
	int getRateofinterest()
	{
		return 5;
		
	}
	}

class ICICI extends Bank
{
	int getRateofinterest()
	{
		return 7;
		
	}
	}

class Axis extends Bank
{
	int getRateofinterest()
	{
		return 6;
		
	}
	}
public class overridesDemo {

	public static void main(String[] args) 
	{
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		Axis b3=new Axis();
		
		b1.display();
		System.out.println("The interest rate of SBI :"+b1.getRateofinterest());;
		
		b2.display();
		System.out.println("The interest rate of ICICI :"+b2.getRateofinterest());;
		
		b3.display();
		System.out.println("The interest rate of Axis :"+b3.getRateofinterest());;


	}

}
