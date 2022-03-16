import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		int num; //Declaring Variables
		
		System.out.println("Program to check if the entered number (int) is Positive or Negative.\n---");
		
		Scanner sm = new Scanner(System.in);
		
		System.out.print("Please enter the number: ");
		num = sm.nextInt();
		sm.close();
		
		if (num>0) {
			System.out.println("The number you have entered is Positive.");
		}
		else if (num==0) {
			System.out.println("The number you have entered is ZERO.");
		}
		else {
			System.out.println("The number you have entered is Negative.");
		}
		
		System.out.println("---\nThe Program has ended.");
		
	}

}
