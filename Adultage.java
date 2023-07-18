//2. Write a Java program that prints "Adult" if the age is above 21.

import java.util.Scanner;

public class Adultage {
		//creating a main method
		public static void main(String[] args) {
			// Create a Scanner object to read user input
			Scanner sc =new Scanner(System.in);
//			taking user input
			System.out.println("Enter the Age");
//			store the user input to veriable a
			int age=sc.nextInt();
			// Create an instance of AdultageApp class
			AdultageApp ag=new  AdultageApp();
//			call the  method
			ag.PersonAge(age);
	}

}
