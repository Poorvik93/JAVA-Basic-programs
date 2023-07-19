//. Question Title: Power Calculator
//Question Description: You are creating a mathematical tool for a group of scientists.
//They often need to calculate powers of numbers. Write a Java program using a for
//loop to calculate the power of a number. The program should take two integer
//parameters: the base and the exponent, and return the base raised to the power of
//the exponent.
//Sample Input 1: 2, 3
//Sample Output 1: 8
//Sample Input 2: 5, 4
//Sample Output 2: 625


import java.util.*;

public class PowerEqual {
	 public static void main(String[] args) {
		 //
	        Scanner scanner = new Scanner(System.in);
	        // Taking user input for the base

	        System.out.print("Enter the base: ");
	        int base = scanner.nextInt();
	        // Taking user input for the exponent

	        System.out.print("Enter the exponent: ");
	        int exponent = scanner.nextInt();
			// Create an instance of PowerEqualApp class
	        PowerEqualApp res=new PowerEqualApp();
	        //call the Method
	        PowerEqualApp.main(base, exponent);
	 }
}
