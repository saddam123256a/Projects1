package in.ashokit.bean;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
	//logic
		System.out.println("Debit Card Paymentsuccful");
		return true;
	}
 
}
