import java.util.Scanner;

public class BinaryToDecimal {
	
	static int temp = 0;

	public static void main(String[] args) {
		
		int binaryInput;
		
		System.out.println("Program to convert Binary Code to Decimal.\n---");
		
		Scanner sm = new Scanner(System.in);
		
		System.out.print("Enter the binary code (Make sure it contains only 0's and 1's): ");
		
		binaryInput = sm.nextInt();
		
		if(checkBinary(binaryInput)) {
			end();
		}
		else {
			binaryConvert(binaryInput);
			System.out.println(temp);
			sm.close();
			end();
			}
	}
		
		private static int binaryConvert(int num) {
			
			int  n,x=0;
		
				while (num>0) {
					n = (int) java.lang.Math.pow(2, x);
					temp = temp + (num%10) * n;
					x=x+1;
					num=num/10;
				}
				return temp;
		}
		
		private static boolean checkBinary(int n) {
			int x;
			boolean flag = false;
			while(n>0) {
				x=n%10;
				
				if(flag ==true) {
					System.out.println("Validation Error: The Entered String is not a Binary Number.");
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
		
		private static void end() {
			System.out.println("---\nThe Program has ended.");
			System.exit(0);
		}

}