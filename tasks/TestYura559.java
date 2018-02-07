import java.util.Scanner;

public class TestYura559 extends AbstractTest{
	
	private Scanner sc;
	
	public TestYura559() {
		super("559");
		sc = new Scanner(System.in);
	}

	@Override
	public void execute() {
		System.out.println("Naturally number n is given. Find all Mersen numbers smaller than n.");

		System.out.println("Enter the naturally number n: ");
		int n = sc.nextInt();

		int temp = 1;
		int mersenNum; 
		
		do {
			temp *= 2;
			mersenNum = temp - 1;
			
			if(mersenNum < n)
				System.out.println(mersenNum + " ");
			
		} while (mersenNum < n);
		
	}
	
}
