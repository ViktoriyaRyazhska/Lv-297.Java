package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class TestOksana560 extends AbstractTest {

    public TestOksana560() {
        super("560");
    }

    private static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    private static boolean numbersAreFriendly(int a, int b) {
        int sumADivisors = 0;
        int sumBDivisors = 0;

        for (Integer divisor : findDivisors(a)) {
            sumADivisors += divisor;
        }
        for (Integer divisor : findDivisors(b)) {
            sumBDivisors += divisor;
        }

        if (a == sumBDivisors && b == sumADivisors) {
            return true;
        }

        return false;
    }

    @Override
    public void execute() {
        for (int i = 200; i <= 300; i++) {
            for (int j = i; j <= 300; j++) {
                if (numbersAreFriendly(i, j)) {
                    System.out.println(i + " " + j);
                }
            }
        }

        // TODO Виведення, тести
        System.out.println("Test executed.");
    }

}
