import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Find the factorial of what number: ");
		int number = scanner.nextInt();
		System.out.println(factorial(number));
		
	}
	
	private static BigInteger factorial(int n) {
		
		BigInteger temp = BigInteger.valueOf(n);
		if(n ==0)
			return BigInteger.ONE;
		else 
			return temp.multiply(factorial(n-1));
		
	}

}
