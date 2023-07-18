//10. Write a Java program that checks whether a number is a multiple of 10.
import java.util.*;
public class MultipleNumber {

	    public static void main(String[] args) {
	    	// Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        // Read the user input as an integer
	        int inputNumber = scanner.nextInt();
	     // Create an instance of NumberCheckerApp class
	        MultipleNumberApp numberChecker = new MultipleNumberApp();

	        numberChecker.isMultipleOfTen(inputNumber);
	    }

}
