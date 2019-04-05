package Assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerName_Test {

	PlayerName testPlayerDetails = new PlayerName();
	
	/*
	 * This is the Unit testing for Use-case 1: Enter a user-name
	 */
	
	@Test
	public void testvalidUserName_WhileEmpty() { // false if the input is an empty space.

		assertEquals(false,testPlayerDetails.validUserName(""));
	
	}
	
	@Test
	public void testvalidUserName_WhileString() { // true if the input is a String.

		assertEquals(true,testPlayerDetails.validUserName("Nitin"));
		assertEquals(true,testPlayerDetails.validUserName("Jonas"));
		assertEquals(true,testPlayerDetails.validUserName("Topias"));
	}
	

}
