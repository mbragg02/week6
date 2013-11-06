package findBugsOnce;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	
	/**
	 * Normal test.
	 */
	@Test
	public void testNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt"; 
		String output = p.getInitials(input); 
		String expected = "DRY"; 
		assertEquals(output, expected);
	}
	
	/**
	 * Test for extra spaces
	 */
	@Test
	public void testExtraSpaces() {
		Person p = new Person();
		String input = "Dereck    Robert"; 
		String output = p.getInitials(input); 
		String expected = "DR"; 
		assertEquals(output, expected);
	}
	
	/**
	 * Test for spaces at start of the String
	 */
	@Test
	public void testStartSpaces() {
		Person p = new Person();
		String input = " Dereck Robert  "; 
		String output = p.getInitials(input); 
		String expected = "DR"; 
		assertEquals(output, expected);
		
	}

}
