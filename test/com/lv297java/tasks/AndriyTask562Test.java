package com.lv297java.tasks;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
* Test class for AndriyTask562.class.
* Test methods: getArmstrongNumbers().
*
* @version 1.0
* @since 2018-12-02
* @author Vadym Teslytskyy
*/
public class AndriyTask562Test {
	
	AndriyTask562 aTest;
	
	@Before
    public void setUp() throws Exception {
		aTest = new AndriyTask562();
    }

    @After
    public void tearDown() throws Exception {
    	aTest = null;
    }
	@Test
	public void testGetArmstrongNumbers() {
		List<Integer> expectedList = new LinkedList<>();
		List<Integer> actualList;
		expectedList.add(153);
		expectedList.add(370);
		expectedList.add(371);
		expectedList.add(407);
		expectedList.add(1634);
		expectedList.add(8208);
		expectedList.add(9474);
		actualList = aTest.getArmstrongNumbers();
		assertEquals(expectedList, actualList);
	}

}
