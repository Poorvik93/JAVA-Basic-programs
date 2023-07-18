//7. Write a Java program that checks whether a number is positive or negative
import java.util.*;
public class Number {

	public static void main(String[] args) {
	 // Create a Scanner object to read user input

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
     // Read the user input as an integer

        int inputNumber = scanner.nextInt();
     // Call the checkNumber method to determine if the number is positive, negative, or zero

        NumberApp.checkNumber(inputNumber);
        
     // Close the Scanner object to release system resources
        scanner.close();        
	}

}
