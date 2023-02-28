package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//program to demonstrate code meets the expected value with actual value
class JunitAssertion {

	@Test
	void test() {
		assertEquals(12, 12);    //assertFalse(expectedValue,ActualValue);
		//assertEquals(12, 4);
	}
	

	@Test
	void dispay() {
		assertFalse(12==12);			//assertFalse(Expression); ----> gives failure when the expression is true
		
	}

}
