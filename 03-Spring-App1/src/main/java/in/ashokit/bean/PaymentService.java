package in.ashokit.bean;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService(IPayment payment) {
	this.payment=payment;
	}
	private void doPayment(double billAmt) {
		boolean status=payment.processPayment(billAmt);

		if(status) {
System.out.println("Recipt printing");			
		}else {
			System.out.println("Card Declined....");
		}
			}
}
