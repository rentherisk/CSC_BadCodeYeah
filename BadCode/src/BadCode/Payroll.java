package BadCode;

import java.util.ArrayList;
import java.util.List;

public class Payroll
{

private List<Emp> employees;
	
	public Payroll() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmp(Emp employee) {
		employees.add(employee);
	}
	
	public double[] calculate() {
		double[] payments = new double[employees.size()];
		
		for (int i = 0; i < employees.size(); i++) {
			payments[i] = employees.get(i).calculatePay();
		}
	
		return payments;
	}

}
