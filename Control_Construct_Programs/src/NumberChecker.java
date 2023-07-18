//Write a Java program that accepts an integer and prints whether it's negative,
//positive, or zero.

import java.util.*;
public class NumberChecker {

    public static void main(String[] args) {
    	// Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
     // Read the user input as an integer
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        
     // Create an instance of NumberCheckerApp class

        NumberCheckerApp numberChecker = new NumberCheckerApp();
        
        // Call the checkNumber method on the numberChecker instance

        numberChecker.checkNumber(inputNumber);
    }
}