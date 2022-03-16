import java.util.Arrays;
import java.util.Scanner;

public class FindingMissingNumberInArray {

	public static void main(String[] args) {

		int temp,n; 

		
		System.out.println("Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.\n---");
		
		Scanner sm = new Scanner(System.in);
		System.out.print("Enter the total number of elements (N): ");

		n= sm.nextInt();
		
		if (n<2) {
			System.out.println("Enter valid number of elements!");
			end();
		}
		int[] a = new int[n-1]; //declaring array
		System.out.println("Now enter N-1 elements: ");
		
		for (int i = 0; i < n-1 ; i++) {
			temp= sm.nextInt();
			if (temp==0) {
				System.out.println("Invalid Input. Value should be greater than 0.");
			}
			a[i] = temp;
		}
		System.out.println((n-1)+ " elements entered.");
		
		Arrays.sort(a); //Sorting elements of array
		sm.close();
		
		for (int j = 1; j <= n; j++) {
			
			if (a[j-1]!=j) {
				System.out.println( "\n " +j+" is the missing number from the input.");
				//flag = true;
				break;
			}
			else if(j==n-1){
				System.out.println("\n " +n+" is the missing number from the input.");
				break;
			}
		}
		

		
	}

	private static void end() {
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}

}
