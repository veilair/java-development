import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Program to check if the entered Strings are anagram or not!\n---");

		String s1, s2;
		
		Scanner sm = new Scanner(System.in);
		System.out.print("Enter first string: ");
		s1 = sm.nextLine();
		
		System.out.print("Enter second string: ");
		s2 = sm.nextLine();
		
		sm.close();
		if(anagramCheck(s1,s2)) {
			System.out.println("The Strings you entered are anagram.");
		}
		else {
			System.out.println("The Strings you entered are not anagram.");
		}
		end();
	}

	private static boolean anagramCheck(String s1, String s2) {

		boolean bb = true, flag = false;

		if(!(s1.length()==s2.length())) {
			System.out.println("The lengths of both string are not equal.");
			end();
		}
		else {
//			System.out.println("V1 Pass: Length is equal.");		
			char[] a1 = new char[s1.length()];
			char[] a2 = new char[s2.length()];
			
			for(int i = 0 ; i<s1.length(); i++) {
				a1[i]= s1.charAt(i);
				a2[i]= s2.charAt(i);
			}
			
			Arrays.sort(a1); //Sorting elements of Array
			Arrays.sort(a2);
			
			for(int j = 0 ; j<s1.length(); j++) {
					if(a1[j]!=a2[j]) {
						flag = true;
					}					
					if(flag==true) {
						bb=false;
						break;
					}
				}
		}		
		return bb;
		}
	
	static void end() {
			System.out.println("---\nProgram has ended.");
			System.exit(0);
		}
	
}
