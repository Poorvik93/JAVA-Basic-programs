//5. Write a Java program that prints "Capital Letter" if the given character is a capital
//letter.
import java.util.Scanner;

public class Capitalletter {

	public static void main(String[] args) {
		
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
     // Read user input as a string and extract the first character
        char inputCharacter = scanner.nextLine().charAt(0);
        // Call the checkCharacter method to determine if the character is a capital letter
        CapitalApp.checkCharacter(inputCharacter);
        // Close the Scanner object to release system resources
        scanner.close();
    }
}