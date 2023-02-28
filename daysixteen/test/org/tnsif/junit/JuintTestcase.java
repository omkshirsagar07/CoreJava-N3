package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

 @TestInstance(Lifecycle.PER_METHOD)
//program to demonstrate @AfterAll @BeforeEach @AfterEach @Test @Disable annotations  
 
 /*
  * 
  * 
  */
class JuintTestcase {


	@Test
	@DisplayName("SimpleJunitTestingMethod") 
	void test() {
		System.out.println("Test implemented");
	}
	
	@Test
	@BeforeAll
	static void display() {
		System.out.println("Display implemented");
	}
	
	@Test
	@BeforeEach
	@Disabled       //use not to perform the method in 
	void runrun() {
		System.out.println("Runrun implemented");
	}
	
	@Test
	@AfterAll
	static void accept() {
		System.out.println("Accept implemented");
	}
	
	@Test
	@AfterEach
	 void bhagmilkhabhag() {
		System.out.println("BhagMilkhaBhag implemented");
	}
	
	
}
