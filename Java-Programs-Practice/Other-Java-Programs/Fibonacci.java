package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Program to generate a fibonacci series!\n---");
		
		Scanner ss = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		int n = ss.nextInt();
		
		if (n>30 || n<0) {
			System.out.println("Out of limit");
			end();
		}
		
		ss.close();
		int lb = 0, ub = 1, temp = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print(lb+" ");
			temp = ub + lb;
			lb = ub;
			ub = temp;
		}
		end();
		
	}

	private static void end() {
		System.out.println("\n---\nThe Program has ended.");
		System.exit(0);
	}

}
