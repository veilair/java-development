import java.util.Scanner;

public class CalculateAverageWithArray {

	public static void main(String[] args) {
		
		int num;
		double res,temp = 0;
		
		System.out.println("Program to calculate the Average of the numbers entered in Array.\n---");
		System.out.println("Enter the number of elements:");
		Scanner sm = new Scanner(System.in);
		num = sm.nextInt();
		
		int[] array = new int[num]; //declaring array
		
		System.out.println("---\nEnter the elements: ");
		for(int i = 0; i<num; i++) {
			array[i]= sm.nextInt();
		}
		sm.close();
		for(int j=0; j<num; j++) {
			temp = temp + array[j];
		}
		res = temp/num;
		System.out.println("The average of the entered "+num+" numbers is: "+res);
	}

}
