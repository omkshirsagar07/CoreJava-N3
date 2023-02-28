package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//program to demonstrate on parameterized test
class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void test() {
		System.out.println("Hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void display() {
		assertNotNull("Nia"=="Diya");
	}

}
