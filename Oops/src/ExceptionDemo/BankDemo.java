package ExceptionDemo;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckingAccounts c1=new CheckingAccounts(101);
System.out.println("Depositing 3000...........");
	c1.deposit(5000);
	try {
		System.out.println("withdrswing 1000$");
		c1.withdraw(1000);
		System.out.println("withdrswing 2000$");
		c1.withdraw(6000);
	}
	
	catch(InsufficientFunds e)
	{
		System.out.println("sorry "+c1.getBalance());
		e.printStackTrace();
	}
	}

}
