import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args) {

		System.out.println("Program to find factorial of a number\n---");

		int num, limit = 200; //recommended limit is 200 for RAM; can be upto 700
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the number: ");
		num = scanner.nextInt();
		
		if (num>limit || num< -limit) {
			System.out.println("Cannot perform factorial for input greater than or lesser than "+limit+".");
			end();
		}
		scanner.close();
		
		if (num<0) {
			num = -num;
			System.out.println("-"+num+"! = -"+factorial(num));
			end();
			//For numbers lesser than zero.
		}
		else {
			System.out.println(num+"! = "+factorial(num));
			end();
			//For numbers greater than or equal to zero.
		}
		
	}

	private static Object factorial(int num) {
		
		long n = num; 
			BigInteger output = new BigInteger("1");
		
		while (n>0) {
			output = output.multiply(BigInteger.valueOf(n));
				n-=1;
		}
		return output;
	}

	private static void end() {
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}
	
}
