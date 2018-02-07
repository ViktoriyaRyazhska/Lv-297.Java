import java.util.Scanner;

public class TestYura87 extends AbstractTest{
	
	private int n;
	private int m;
	private Scanner sc;
	
	public TestYura87() {
		super("87(2)");
		sc = new Scanner(System.in);
	}

	@Override
	public void execute() {
		System.out.println("Naturally numbers n, m is given. Find m last digits sum of number n.");
		
		System.out.println("Enter the naturally number n: ");
		n = sc.nextInt();
		
		System.out.println("Enter the naturally number m: ");
		m = sc.nextInt();
		
		int sum = 0;
		
		while(m > 0) {
			sum += n % 10;
			n = n / 10;
			m--;
		}
		
		System.out.println("Last digits sum of number n = " + sum );
		
		}
	
}
