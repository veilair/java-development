package Crypto;

import java.util.Scanner;

public class CaesarsCipher {

	public static void main(String[] args) {
		
		int type=0;
		
		System.out.println("Program to Perform Caesar\'s Cipher Algorithm\n---");
		
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter the word. (Do not use Spaces or Special Characters): ");
		String input = sm.nextLine();
		 
		System.out.println("Enter 0 for Encode or 1 for Decode.");
		type= sm.nextInt();
		
		if (type<0 || type>1) {
			System.out.println("Invalid Operator!");
			end();
		}		
		System.out.println("Output: "+caesarCipher(input, type));
		end();
	}

	private static String caesarCipher(String input, int type) {
		
		int value = 0;
		String output = "";

		if (type==0) {
			for(int i = 0; i<input.length(); i++) {
				value = input.charAt(i);
				value +=3;
				output +=Character.toString ((char) value);
			}
		}
			else {
				
				for(int i = 0; i<input.length(); i++) {
					value = input.charAt(i);
					value -=3;
					output +=Character.toString ((char) value);
			}	
		}
		return output;	
	}
	private static void end() {
		System.out.println("---\nThe Program has ended");
		System.exit(0);
	}
}
