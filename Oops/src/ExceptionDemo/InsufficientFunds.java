package ExceptionDemo;

public class InsufficientFunds extends Exception {

	
	
	private double amount;

	public InsufficientFunds(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
}
