//Write a Java program that categorizes people based on their age: Child (0-12), Teen
//(13-19), Adult (20-59), Senior (60+)
import java.util.*;
public class CategorizePeople {

	public static void main(String[] args) {
		 // Create a Scanner object to read user input

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age of person");
		int age=sc.nextInt();
		
		// Create an instance of CategorizePeopleApp class
		CategorizePeopleApp people =new CategorizePeopleApp();
		//call the  method
		people.main(age);
	}

}
