package oopsdemo2;

/* Multi Level Inheritance
 *  Account  --- > SavingsBank ---> AccountDetails
 */

public class AccountDetails extends Savingbank
{
	int withdraw ,deposit,finalbalance;

	public AccountDetails(int accno, String name, int mb, int b,int dep,int w)
	{
		super(accno, name, mb, b);
		
		this.withdraw=w;
	
		this.deposit=dep;
	}
	void display()
	{ super.display();
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdraw);
            finalbalance=(balance+deposit)-withdraw;
            System.out.println("Final Balance:"+finalbalance);
    
	}
}
​​​
