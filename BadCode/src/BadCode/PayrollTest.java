package BadCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PayrollTest
{

	 Cntrctr c; hourly hourly; Salar salar; Payroll payroll;

		@BeforeEach 
	void setUp() throws Exception {
			c = new Cntrctr("Nancy", 50);
	hourly = new hourly("Dave", 20);
	salar = new Salar("Alex", 25);
	payroll = new Payroll();

	        payroll.addEmp(c); payroll.addEmp(hourly); payroll.addEmp(salar);
	// barry benson would approve
		}
		
		@Test
		 void testhourlyOvertime() {
			hourly.sethrs(45); // 45 h, 5 h overtime
	        assertEquals((20 * 40) + (20 * 1.5 * 5), hourly.calculatePay(), "Hourly overtime pay calculation should match expected value.");
		}
		
		@Test
	    void testsalarPay() {
	        salar.sethrs(40);
	        assertEquals(1000, salar.calculatePay(), "salaried pay calculation should match expected value.");
	    }
		
		@Test
	    void testCntrctrPay() {
	        c.sethrs(40);
	        assertEquals(2000, c.calculatePay(), "Cntrctr pay calculation should match expected value.");
	    }
		
		@Test
	    void testPayrollPayments() {
	        c.sethrs(40);
	        hourly.sethrs(45);
	        salar.sethrs(40);

	        double[] payments = payroll.calculate();

	        assertAll("Emps paid correctly",
	            () -> assertEquals(2000, payments[0], "Cntrctr payment should match expected value."),
	            () -> assertEquals((20 * 40) + (20 * 1.5 * 5), payments[1], "Hourly payment should match expected value."),
	            () -> assertEquals(1000, payments[2], "salaried payment should match expected value.")
	        );
	    }


}
