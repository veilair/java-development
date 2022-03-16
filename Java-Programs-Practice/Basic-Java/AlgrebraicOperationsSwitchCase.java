import java.util.Scanner;

public class AlgrebraicOperationsSwitchCase {
	public static void main(String args[]) {

		//Declaring variables
		double n1,n2,res = 0;
		
		System.out.println("Algebraic Operations of two Numbers with Switch Case Loop\n---");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
		n1 = scanner.nextDouble();
		
		System.out.println("Enter the number 2: ");
		n2 = scanner.nextDouble();
		
		System.out.println("---\nEnter 1 for addition or\n2 for subtraction or\n3 for multiplication or\n4 for division");
		int operator = scanner.nextInt();
		
		//Solving by switch case loop for simpler code.
		switch(operator) {
			case 1:
				res = n1+n2;
				break;
			case 2:
				res = n1-n2;
				break;
			case 3:
				res = n1*n2;
				break;
			case 4:
				res = n1/n2;
				break;
			default:
				System.out.println("You have chosen a wrong option.\nPlease choose from the above given options.");
				end();
		}
		System.out.println(res);
		end();
		scanner.close();
	}
	
	static void end() {
		System.out.println("---\nEnter Y to continue or any key to exit!");
		
		Scanner getEndOption= new Scanner(System.in);
		String option = getEndOption.next();
		if(option.equalsIgnoreCase("Y")) {
			main(null);
		}
		else {
			System.out.println("The Program has ended. Please run the program again.");
		}
		getEndOption.close();
	}

}

