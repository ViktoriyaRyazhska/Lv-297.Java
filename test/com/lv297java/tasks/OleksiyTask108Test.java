package com.lv297java.tasks;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test for task number 108
 * Created by Yura Katola on 12.02.18.
 */
@RunWith(Parameterized.class)
public class OleksiyTask108Test {
	
	private OleksiyTask108 oTest;
	private int fInput;
	private int fExpected;
	
	@Before
    public void setUp() throws Exception {
		oTest = new OleksiyTask108();
    }

    @After
    public void tearDown() throws Exception {
    	oTest = null;
    }
	
	@Parameters
	public static Collection<Integer[]> data() {
		return Arrays.asList(new Integer[][] {{3, 4}, {15, 16},
			{ 67, 128}, { 129, 256}});
	}
	
	public OleksiyTask108Test(int input, int expected) {
		fInput = input;
		fExpected = expected;
	}
	
	@Test
	public void returnNumber() {
		assertEquals(fExpected, (int) oTest
				.returnNumber(fInput));
	}
}
