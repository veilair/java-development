import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		int lm1=1, hm1=1, lm2=1, hm2=1; //length of matrices 1/2; height of matrices 1/2
		//minimum length is 1
		
		Scanner getArrayLength = new Scanner(System.in);
		System.out.println("Enter length and height of Array 1: ");
		lm1 = getArrayLength.nextInt();
		hm1 = getArrayLength.nextInt();

		System.out.println("Enter length and height of Array 1: ");
		lm2 = getArrayLength.nextInt();
		hm2 = getArrayLength.nextInt();
		
		getArrayLength.close();
		
		double array1[][] = new double[lm1][hm1];
		double array2[][] = new double[lm2][hm2];
		
		//enter elements in array 1
		System.out.println("Enter the elements of first array: ");
		Scanner sm = new Scanner(System.in);
		for(int x = 0; x <lm1; x++) {
			for (int y = 0; y< hm1; y++) {
				array1[x][y]= sm.nextDouble();
			}
		}

		//enter elements in array 1
		System.out.println("---\nEnter the elements of second array: ");
		for(int x = 0; x <lm2; x++) {
			for (int y = 0; y< hm2; y++) {
				array2[x][y]= sm.nextDouble();
			}
		}
		sm.close(); // closing the scanner
		
		multiplication(array1, array2, lm1, lm2, hm1, hm2);
		
		System.out.println("---\nThe Program has ended.");
	}
	
	static double multiplication(double[][] array1, double[][] array2, int lm1, int lm2, int hm1, int hm2) {
		double result = 0, temp=0;
		for(int i=0;i<lm1;i++) {
			for(int j=0; j<hm2; j++) {
			temp = array1[i][j]* array2[j][i];
			result = result + temp;
			System.out.println(array1[i][j] +" * "+ array2[j][i]+ " temp = "+temp+" res = "+result);

			}
		}
		System.out.println("The final result of multiplication is: "+result);
		return result;
	}
	
}
