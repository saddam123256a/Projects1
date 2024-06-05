package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
	System.out.println("Credit card Payment sucessful");
		return true;
	}

}
