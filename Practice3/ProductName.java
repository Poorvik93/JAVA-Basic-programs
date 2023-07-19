//Write a Java program that simulates a vending machine. The program should take a product code as input and output the product name.

import java.util.*;
public class ProductName {

		    public static void main(String[] args) {
				 // Create a Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the product code: ");
		        String productCode = scanner.nextLine().toUpperCase();
		        //creating instance variable
		        ProductNameApp pd= new ProductNameApp();
		        // calling the method
		        pd.main(productCode);
		        
		}

	}


