import java.util.Scanner;

public class ValidateBinary {
	
	static String output = "";

public static void main(String[] args) {
	
	int num, binaryInput;
	
	System.out.println("Program to check if the entered number is Binary Code or not.\n---");
	
	Scanner sm = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	
	binaryInput = sm.nextInt();
	
	//checkBinary(binaryInput);
	
	if(checkBinary(binaryInput)) {
		
	}
	else {
		System.out.println("The number you entered is Binary Code.");
	}
	end();		
}
	
	static boolean checkBinary(int n) {
		int x;
		boolean flag = false;
		while(n>0) {
			x=n%10;
			
			if(flag ==true) {
				System.out.println("Entered String is not a binary number.");
				break;
				}
			else {
				if(x==1 || x==0) {

				}
				else {
					flag = true;
				}
			}
			n=n/10;
		}
		
		return flag;
		
	}
	
	static void end() {
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}


}