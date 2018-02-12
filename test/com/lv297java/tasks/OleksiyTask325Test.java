package com.lv297java.tasks;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test for task number 325
 * Created by Yura Katola on 12.02.18.
 */
@RunWith(Parameterized.class)
public class OleksiyTask325Test {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {{3, true}, {6, false}, {10, false}, {7, true}});
	}
	
	private int fInput;
	private boolean fExpected;
	
	public OleksiyTask325Test(int input, boolean expected) {
		fInput = input;
		fExpected = expected;
	}
	
	@Test
	public void isSimpleNumber() {
		assertEquals(fExpected, OleksiyTask325.isSimpleNumber(fInput));
	}

}
