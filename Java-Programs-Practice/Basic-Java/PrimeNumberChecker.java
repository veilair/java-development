import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
		long number,i;
		boolean flag = false;
		
		System.out.println("A Program to check if the entered number is a Prime Number or not.\n---");
		Scanner sm = new Scanner(System.in);
		
		System.out.print("Enter the Natural Number: ");
		number = sm.nextInt();
		
		if (number==1) {
			System.out.println("1 is not a Prime Number."
					+ "\n---\nExplanation: "
					+ "A natural number (i.e. 1, 2, 3, 4, 5, 6, etc.) is called a prime number\n(or a prime) if it has exactly two positive factors, 1 and the number itself.\n1 has only one positive factor i.e. no. 1 only. Hence 1 is neither prime nor composite.");
			System.exit(0);
			}
		if (number<1) {
			System.out.println("Error: Input is negative or zero.\nTry Again!\n---");
			main(null);
		}
		
		
		for (i=2; i<number/2; i++) {
			if(number%i==0) {
				System.out.println(number+" is not a Prime Number. It is divisible by: "+i);
				flag=true;
				break;
			}
			if(flag) {
				break;
			}
		}
		if (flag==false) {
			System.out.println(number+" is a Prime Number.");
		}
		
		sm.close();
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}

}
