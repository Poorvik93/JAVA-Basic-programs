//20.Question Title: Rectangle Area Calculator
//Question Description: You are developing a tool for a construction company that
//calculates the area of various shapes. The company primarily works with
//rectangular plots. Write a Java method named calculateRectangleArea that
//accepts the length and width of a rectangle as parameters and returns the area of
//the rectangle using a return statement.
//Note: The method calculateRectangleArea should be a public static method
//which returns a double and takes two parameters: 'length' and 'width' both of type
//double.

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		 // Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		// take the user input length
		System.out.println("Enter the length");
		double l=sc.nextDouble();
		// take the user input Breadth
		System.out.println("Enter the Breadth");
		double b=sc.nextDouble();
		// calculate the area
		double c=l*b;
		System.out.println(c);
	}

}
