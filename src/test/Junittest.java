package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junittest {
	
	@BeforeAll
	public static void BeforeAllMethod() {
		System.out.println("Inside Before All");
		
	}
	
	@BeforeEach
	public void BeforeEachMethod() {
		System.out.println("Inside BeforeEach");
		
	}
	
	@Test
	public void testcase1() {
		System.out.println("Inside Testcase1");
	}

	@AfterEach
	public void AfterEachMethod() {
	
		System.out.println("Inside AfterEach");
	}
}
