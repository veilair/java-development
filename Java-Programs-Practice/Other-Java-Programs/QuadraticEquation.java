package practice;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		System.out.println("Program to find real values for a Quadratic Equation.\n---");
		
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter the integer values of a, b and c as for equation = ax2 + bx+ c:");
		int a,b,c;
		
		System.out.print("a: ");
		a= sm.nextInt();
		System.out.print("b: ");
		b= sm.nextInt();
		System.out.print("c: ");
		c= sm.nextInt();
		
		sm.close();
		
		double d=discriminant(a,b,c);
		
		if (d>0) {
			System.out.println("D > 0\n2 Real Solutions.");
			//if discriminant is real;
			findRealValues(a,b,c,d);
		}
		
		else if (d==0) {
			System.out.println("1 Real Solution.");
			//if discriminant is real;
			findRealValues(a,b,c,d);
		}
		
		else if (d<0) {
			System.out.println("D < 0\n2 Imaginary Solutions.");
			System.out.println("Cannot perform calculation as there are no Real Solutions.");
			end();
		}
		
		else {
			System.out.println("Unknown Error");
			end();
		}

	}

	private static double discriminant(int a, int b, int c) {
		
		double d = ((b*b)-(4*a*c));
		System.out.println("D = "+d);
		return d;
	}
	
	private static void findRealValues(int a, int b, int c, double d) {
			
		String ss = "";
		
		double x1= (((-b)+(Math.sqrt(d)))/(2*a));
		double x2= (((-b)-(Math.sqrt(d)))/(2*a));
		
		ss = ss + x1 + ", " +x2;
		System.out.println("Answer: "+ ss);
		
		end();
	}
	

	private static void end() {
		System.out.println("---\nThe Program has ended.");
		System.exit(0);
	}


}
