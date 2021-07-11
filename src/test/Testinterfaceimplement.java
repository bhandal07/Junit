package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Testinterfaceimplement implements Testinterface  {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside class");
		
	}
	
	@Test
	public void test2() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	

}
