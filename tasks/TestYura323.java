import java.util.Scanner;

public class TestYura323 extends AbstractTest{
	
	private int n;
	private Scanner sc;
	
	public TestYura323() {
		super("323(3)");
		sc = new Scanner(System.in);
	}

	@Override
	public void execute() {
		System.out.println("Naturally prime number n is given. Find all naturally prime numbers " + 
				" smaller than n and relative prime with n.");
		
		System.out.println("Enter the naturally number n: ");
		n = sc.nextInt();
		
		for (int i = 2; i < n; i++) {
			if(gcd(n, i) == 1)
				System.out.print(i + " ");
		}
	}
	
	private int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
	// second commit
}
