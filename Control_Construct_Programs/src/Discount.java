//3. Write a Java program that prints "Discount Applicable" if the purchase is above
//$100.
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		 // Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the perchase ammount");
		int amount=sc.nextInt();
		// Create an instance of AdultageApp class
		DiscountApp am=new  DiscountApp();
		am.Discount(amount);
	}

}
