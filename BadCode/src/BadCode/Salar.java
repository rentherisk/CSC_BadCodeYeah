package BadCode;

public class Salar extends Emp
{ // is an employee
	public Salar(String n, double rate) {
		super(n, rate);
	}
	@Override
	public double calculatePay() {
			return rate * 40;
	}

}
