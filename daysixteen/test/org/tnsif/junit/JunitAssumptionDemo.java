package org.tnsif.junit;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(3<4);  // expression is skipped if the expression in parameter is false
		Assumptions.assumeTrue(3>4);  
	}
	
	@Test
	void display() {
		
		Assumptions.assumeTrue(3>4);  
	}

}
