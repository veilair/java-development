
import java.util.Collections;
import java.util.Scanner;


public class StarPattern {

	public static void main(String[] args) {
		
		System.out.println("Program to get a star Pattern for an input.\n---");
		Scanner sm = new Scanner(System.in);
		
		System.out.print("Enter an integer value: ");
		int val = sm.nextInt();
		
		if (val>10 || val<1) {
			System.out.println("Out of limit");
			end();
		}
		else {
			
			for (int i = val; i > 0; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			end();
		}
		
		
	}

	private static void end() {

		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}

}
