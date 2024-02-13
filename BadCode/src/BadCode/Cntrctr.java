package BadCode;

public class Cntrctr extends Emp
{  /* is an employee The dictionary definition of “employee” says succinctly that an employee is “a person who works for another in return for financial or other compensation.”3 Under that definition, independ- ent cs would appear to be employees. An employee is someone that another person or company hires to perform a service. Business owners compensate employees for their work to grow and maintain their business. Emps typically have a specified pay rate and a written or implied employment contract with the party they work for.
	*/

	public Cntrctr(String rate, double n) {
		super(rate, n);
	}
	
@Override 
public double calculatePay() {
return rate * hrs;
	}


}
