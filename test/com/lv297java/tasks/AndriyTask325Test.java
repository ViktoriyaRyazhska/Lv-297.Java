package com.lv297java.tasks;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;
/**
* Test class for AndriyTask325.class.
* Test methods: getAllNumbersDivisors().
*
* @version 1.0
* @since 2018-12-02
* @author Vadym Teslytskyy
*/
public class AndriyTask325Test {

	AndriyTask325 aTest;
	
	@Before
    public void setUp() throws Exception {
		aTest = new AndriyTask325();
    }

    @After
    public void tearDown() throws Exception {
    	aTest = null;
    }
    
	@Test
	public void testGetAllNumbersDivisors() {
		List<Integer> expectedList = new LinkedList<>();
		List<Integer> actualList;
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(6);
		aTest.inputNumber = 6;
		actualList = aTest.getAllNumbersDivisors();
		assertEquals(expectedList, actualList);
	}

}
