package testClass;

/**
 * Created by Администратор on 13.02.18.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class Ivan86bTaskTest {
    private IvanTask86b test;
    private int fInput;
    private int fExpected;

    @Before
    public void setUp() throws Exception {
        test = new IvanTask86b();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][] {{1, 1}, {12, 3},
                { 123, 6}, { 1234, 10},{ 12345, 15},{ 123456, 21},{ 1234567, 28}
                ,{ 12345678, 36} ,{ 123456789, 45}});
    }

    public Ivan86bTaskTest(int input, int expected) {
        fInput = input;
        fExpected = expected;
    }

    @Test
    public void testAddDigitsInNumber() {
        assertEquals(fExpected,  test.addDigitsInNumber(fInput));
    }
}
