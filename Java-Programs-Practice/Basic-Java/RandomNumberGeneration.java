import java.util.Scanner;

public class RandomNumberGeneration {

	public static void main(String[] args) {

		System.out.println("Program to generate a Random Number\n---");
		int option = 0;
		
		Scanner sm = new Scanner(System.in); 
		
		System.out.print("Enter 0 to generate any random number OR "
				+ "\nEnter 1 to generate a random number between a range"
				+ "\nEnter 2 to generate a random of fixed length: ");
		
		// DEFINED SEPARATELY FOR BETTER UNDERSTANDING
		
		option = sm.nextInt();
		if (option ==0) {
			generateRandom(); 			
		}
		else if (option ==1) {
			generateRandomBetweenRange();			
		}
		else if (option ==2) {
			generateRandomWithLength();
		}
		else {
			System.out.println("Invalid Option. Try Again");
			end();
		}		
		sm.close();
	}
	

	private static void generateRandom() {
	    int a = (int) ((Math.random()*((10000-0)+1))+0);
	    System.out.println("OUTPUT: "+a);
	    end();
	}

	private static void generateRandomBetweenRange() {
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter lower limit: ");
		int lower = ss.nextInt();
		System.out.print("Enter upper limit: ");
		int upper = ss.nextInt();
		ss.close();
		
		if (upper<lower) {
			System.out.println("Upper cannot be lesser than lower"); //RECOMMENDED
			end();
		}
		
		if(upper<0 ||lower<0) {
			System.out.println("Limits cannot be lesser than zero"); //RECOMMENDED
			end();
		}
		
		int a = (int) ((Math.random()*((upper-lower)+1))+lower);
	    System.out.println("OUTPUT: "+a);
	    end();
	}
	

	private static void generateRandomWithLength() {
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter the length (int max =10): ");
		int len = ss.nextInt();
		
		int a = (int) (Math.random()*(Math.pow(10, len)));
		System.out.println("OUTPUT: "+a);
		ss.close();
		end();
	}

	
	private static void end() {
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}

}
