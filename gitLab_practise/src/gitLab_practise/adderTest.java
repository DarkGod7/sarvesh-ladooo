package gitLab_practise;

import static org.junit.Assert.*;

import org.junit.Test;

public class adderTest {

	@Test
	public void test() {
		adder adder = new adder(10,20);
//		int a = 90;
//		int b = 10;
		 int expected = 100;
		 int actual = adder.add(90, 10);
		 
		 assertEquals(expected, actual);
	}

}
