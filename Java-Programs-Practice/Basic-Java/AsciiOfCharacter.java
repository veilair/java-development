import java.util.Scanner;

public class AsciiOfCharacter {

	public static void main(String[] args) {

		System.out.println("Program to get ASCII Value of Character.\n---");
		Scanner sm = new Scanner(System.in);
		
		System.out.print("Enter the Character: ");
		char input = sm.next().charAt(0);
		
		int output = (char)input;
		
		System.out.println("The ASCII Value of '"+input+"' is: "+output);
		
		sm.close();
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
		
	}
	
	
	
}
