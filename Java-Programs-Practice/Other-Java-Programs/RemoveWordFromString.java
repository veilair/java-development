import java.util.Scanner;

public class RemoveWordFromString {

	public static void main(String[] args) {
		
		System.out.println("Program to remove a word from String.\n---");
		
		String string = "", word = "";
		
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter the String: ");
		string = sm.nextLine();
		
		System.out.print("Enter the word to remove from String: ");
		word = sm.nextLine();
		
		if (string.isEmpty() || string.equals(" ")) { //To check if String is empty.
			System.out.println("The String is empty");
			end();
		}
		else if (word.isEmpty() || word.equals(" ")) { //To check if word is empty.
			System.out.println("The Word entered is blank.");
			end();
		}
		
		if(removeWord(string, word)) {
			end();
		}
		sm.close();
	}

	private static boolean removeWord(String string, String word) {
		
		boolean bb = true;
		
		if (checkWord(string, " "+word)) {  //for words between Strings
			//Now Remove the word from String//
			string = string.replaceAll(" "+word, "");
			System.out.println("Word has been removed from String.");
			System.out.println("Output String: "+string);

		}
		else if (checkWord(string, word+" ")) { //for words at the starting of string
			//Now Remove the word from String//
			string = string.replaceAll(word+" ", "");
			System.out.println("Word has been removed from String.");
			System.out.println("Output String: "+string);

		}
		else if (checkWord(string, word)) { //for words at the end of string
			//Now Remove the word from String//
			string = string.replaceAll(word, "");
			System.out.println("Word has been removed from String.");
			System.out.println("Output String: "+string);

		}
		else {
			System.out.println("Word not found in String");
			System.out.println("Output String: "+string);
			end();
		}
		
		return bb;
	}

	private static boolean checkWord(String string, String word) {	//Function to check if word exist in String
		boolean flag = false;
		
		if (string.contains(word)) {
			System.out.println("Word found in String");
			flag = true;
		}
		return flag;
	}
	
	private static void end() { //Function to end Program
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}
	
}
