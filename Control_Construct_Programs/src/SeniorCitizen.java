//8. Write a Java program that determines if a person is eligible for a senior citizen
//discount based on their age.
import java.util.*;
public class SeniorCitizen {

	public static void main(String[] args) {
		// Create a Scanner object and class to read user input
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter age: ");
	     // Read the user input as an integer
	        int inputAge = scanner.nextInt();

	        boolean isEligible = SeniorCitizenApp.isEligibleForDiscount(inputAge);
	     // Check the eligibility status
	        if (isEligible) {
	            System.out.println("Eligible for senior citizen discount");
	        } else {
	            System.out.println("Not eligible for senior citizen discount");
	        }
	        // Close the Scanner object to release system resources
	        scanner.close();
	}

}
