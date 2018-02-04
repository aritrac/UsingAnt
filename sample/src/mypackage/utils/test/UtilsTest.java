package mypackage.utils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mypackage.utils.Utils;

public class UtilsTest {
	
	@Test
	public void testAdditionOfTwoIntegers() {
		Utils ut = new Utils();
		//assert statements
		assertEquals("6 + 4 must be 10",10, ut.addNumbers(6, 4));
	}
	
	@Test
	public void testLineLength() {
		Utils ut = new Utils();
		assertEquals("line length must be 10",10,ut.printLine().length());
	}
	
}
