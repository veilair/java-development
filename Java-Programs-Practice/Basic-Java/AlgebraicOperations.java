import java.util.Scanner;

public class AlgebraicOperations {
	public static void main(String args[]) {

		//Declaring variables
		double n1,n2,res = 0;
		
		System.out.println("Algebraic Operations of two Numbers\n---");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
		n1 = scanner.nextDouble();
		
		System.out.println("Enter the number 2: ");
		n2 = scanner.nextDouble();
		
		System.out.println("---\nEnter 1 for addition,\n2 for subtraction\n3 for multiplication\n4 for division");
		int operator = scanner.nextInt();
		
		//Solving by if else loops
		if(operator==1) {
			res =n1+n2;	
			}
		else if(operator==2) {
			res =n1-n2;	
			}

		else if(operator==3) {
			res =n1*n2;	
			}

		else if(operator==4) {
			res =n1/n2;	
			}

		else{
			System.out.println("Error!");
			end();
		}
			
		System.out.println(res);
		end();
		scanner.close();
	}
	
	static void end() {
		System.out.println("Enter Y to continue or any key to exit!");
		
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
