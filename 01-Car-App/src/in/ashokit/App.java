package in.ashokit;

public class App {
public static void main(String[] args) {
	Car c=new Car();
	c.setEng(new DieselEngine());
	c.drive();
}
}
