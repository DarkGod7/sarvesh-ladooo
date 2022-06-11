//RBCA 20-221
package gitLab_practise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class bankAccountTest {

	static bankAccount b1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		b1 = new bankAccount(new BankAccountParameter("Sarvesh", 108, 5000));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testdeposit() {
		int exp = 6000;
		int act = b1.deposit(1000);
		assertEquals(exp,act);
	}
	
	@Test
	public void testwithdraw() {
		int exp = 5500;
		int act = b1.withdraw(500);
		assertEquals(exp,act);
	}
	
	@Test
	public void testgetBalance() {
		int exp = 5000;
		int act = b1.getBalance();
		assertEquals(exp,act);
	}

}
