package in.ashokit;

public class DebitCardPayment implements IPayment{

	@Override   
	public boolean processPayment(double billAmt) {
		//busines logic
		System.out.println("Debit card payment process");
		return true;
	}

}
