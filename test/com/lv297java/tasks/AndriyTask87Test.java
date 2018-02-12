package com.lv297java.tasks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
* Test class for AndriyTask87.class.
* Test methods: getTheSumOfLastElements().
*
* @version 1.0
* @since 2018-12-02
* @author Vadym Teslytskyy
*/
public class AndriyTask87Test {
	
	AndriyTask87 aTest;
	
	@Before
    public void setUp() throws Exception {
		aTest = new AndriyTask87();
    }

    @After
    public void tearDown() throws Exception {
    	aTest = null;
    }
    
	@Test
	public void testGetTheSumOfLastElements() {
		int expected = 8;
		int actual;
		aTest.inputNumber = "444";
		aTest.numberOfLastDigits = "2";
		actual = aTest.getTheSumOfLastElements();
		assertEquals(expected, actual);
	}

}
