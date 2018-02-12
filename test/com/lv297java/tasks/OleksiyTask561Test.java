package com.lv297java.tasks;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test for task number 561
 * Created by Yura Katola on 12.02.18.
 */
@RunWith(Parameterized.class)
public class OleksiyTask561Test {
	
	private OleksiyTask561 oTest;
	private int fInput;
	private boolean fExpected;
	
	@Before
    public void setUp() throws Exception {
		oTest = new OleksiyTask561();
    }

    @After
    public void tearDown() throws Exception {
    	oTest = null;
    }
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {{5, true}, {32, false}, {76, true}, {25, true}, {1000, false}});
	}
	
	public OleksiyTask561Test(int input, boolean expected) {
		fInput = input;
		fExpected = expected;
	}
	
	@Test
	public void isAutomorphicNumber() {
		assertEquals(fExpected, oTest.isAutomorphicNumber(fInput));
	}

}
