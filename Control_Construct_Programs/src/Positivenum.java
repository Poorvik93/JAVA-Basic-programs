//7. Write a Java program that checks whether a number is positive or negative.

import java.util.*;
public class Positivenum {
//creating a main method
	public static void main(String[] args) {
//		creating the scaanner class
		Scanner sc =new Scanner(System.in);
//		taking user input
		System.out.println("Enter the number");
//		store the user input to veriable a
		int a=sc.nextInt();
		PositivenumApp p=new  PositivenumApp();
//		call the positive method
		p.positive(a);
	}

}
