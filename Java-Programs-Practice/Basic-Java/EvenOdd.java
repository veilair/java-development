import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num,flag;
		System.out.println("Program to check if the number is even or odd!\n---");
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		
		flag = num % 2;
		if(flag == 0) {
			System.out.println("The number you entered is even.");
		}
		else {
			System.out.println("The number you entered is odd.");
		
		}
	
	}
}
