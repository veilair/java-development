package practice;

import java.util.Scanner;

public class FibonacciWhile {

	public static void main(String[] args) {

		System.out.println("Program to generate a fibonacci series using while loop.\n---");
		
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = ss.nextInt();
		
		if (num>20 || num<=0) {
			System.out.println("Out of limit");
			end();
		}
		
		ss.close();
		int lb = 0, ub = 1, temp = 0;

		while (num>0) {
			System.out.print(lb+" ");
			temp = ub + lb;
			lb = ub;
			ub = temp;
			num-=1;
		}
		end();
	}

	private static void end() {
		System.out.println("\n---\nThe Program has ended.");
		System.exit(0);
	}

}
