package testClass;

/**
 * Created by Администратор on 13.02.18.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class Ivan330TaskTest {

    private IvanTask330 test;

    @Before
    public void setUp() throws Exception {
        test = new IvanTask330();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }




        @Test
        public void testAddDigitsInNumber() {

            int []perfectNumbers = {6,28,496,8128};
            List<Integer> listOfPerfectNumbers = test.findPerfectNumbers(10000);
            for(int i = 0; i < perfectNumbers.length; ++i)
            assertEquals((int)perfectNumbers[i],(int)listOfPerfectNumbers.get(i));
        }


}
