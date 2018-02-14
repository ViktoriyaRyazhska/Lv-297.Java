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
public class Ivan86aTaskTest {

    private IvanTask86a test;
    private int fInput;
    private int fExpected;

    @Before
    public void setUp() throws Exception {
        test = new IvanTask86a();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][] {{4, 1}, {22, 2},
                { 333, 3}, { 4444, 4},{ 55555, 5}});
    }

    public Ivan86aTaskTest(int input, int expected) {
        fInput = input;
        fExpected = expected;
    }

    @Test
    public void testCountDigitsCounter() {
        assertEquals(fExpected,  test.countDigitsCounter(fInput));
    }

}
