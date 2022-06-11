package gitLab_practise;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void test() {
		calculator calculator = new calculator();
		int a = 90;
		int b = 10;
		 int expected = 100;
		 int actual = calculator.add(a,b);
		 
		 assertEquals(expected, actual);
	}

}
