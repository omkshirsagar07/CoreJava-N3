package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//program to demonstrate on first junit5 testing
class FirstJavaProgramTesting {

	@Test
	@DisplayName("SimpleJunitTestingMethod") 
	void test() {
		System.out.println("Test implemented");
	}
	
	//@Test
	void display() {
		System.out.println("Display implemented");
	}


}
