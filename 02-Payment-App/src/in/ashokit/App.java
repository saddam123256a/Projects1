package in.ashokit;

public class App {
public static void main(String[] args) {
	IPayment p1=new CreditCardPayment();
	IPayment p2=new DebitCardPayment();
	
	//constructor Injection
	PaymentService ps=new PaymentService(p1);
	
	//setter Injection
	ps.setPayment(p2);
	ps.doPayment(100);
	
	
}
}
