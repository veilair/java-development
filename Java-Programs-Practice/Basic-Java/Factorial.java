import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Program to find factorial of a number\n---");

		int num;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the number: ");
		num = scanner.nextInt();
		
		if (num>20 || num< -20) {
			System.out.println("Cannot perform factorial for input greater than or lesser than 20.");
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

	private static long factorial(int num) {
		
		long n = num, output = 1;
		
		while (n>0) {
			output = output*n;
			n-=1;
		}
		return output;
	}

	private static void end() {
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}
	
}
