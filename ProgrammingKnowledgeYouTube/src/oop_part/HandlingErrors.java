package oop_part;
import java.util.Scanner;

public class HandlingErrors {
	
	public static int retInt(int someInteger) {
		try {
			Integer.sum(someInteger, 0);
		}
		catch (Exception numExc) {
			System.out.println("You didn't input a number. Returning a 0");
			someInteger=0;
		}
		return someInteger;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.println("Please input a number: ");
		String userVariable = input.nextLine();
		double userNumVariable;
		System.out.println("Handling Exceptions");
		
		int a[] = new int[2];
		int a1;
		
		try {
			userNumVariable= Double.parseDouble(userVariable);
		}
		catch (Exception WrongInputType) {
			System.out.println(WrongInputType);
			System.out.println("You didn't input a valid number, so we have assigned you a -1");
			userNumVariable=-1;
		}
		System.out.println("Your number is "+Double.toString(userNumVariable));
		
		System.out.println("Please input another integer: ");
		userVariable = input.nextLine();
		int theInteger;
		try {
			theInteger = retInt( Integer.parseInt(userVariable) );
		}
		catch (NumberFormatException e) {
			theInteger = 100;
		}
		
		System.out.println( Integer.toString(theInteger) ) ;		
		
		try {
			System.out.println("Value of b = "+a[2]);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This line is always exectued");
			System.out.println("This is useful when you want to release resources");
			
		}
		System.exit(0);
		
	}// end of public static void main(String[] args) {


}//end of public class HandlingErrors {

