
package oopsdemo2;

public class Savingbank extends Account 
{
	int min_bal,balance;
	public Savingbank(int accno, String name,int mb,int b)
	{ 
		super(accno, name);
		this.min_bal= mb;
		this.balance= b;
		
	}

    
	void display()
 {​​​​​​​​
	                super.display();
	                System.out.println ("Minimum Balance: " +min_bal);
	                System.out.println ("Saving Balance: " +balance);
	        }​​​​​​​​
}
