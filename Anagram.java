package com.kodnest.day;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    //taking the user input first number
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
    //taking the user input second number
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
    
    //calling (invoking )the methode 
		if (areAnagrams(num1, num2)) {
			System.out.println("The numbers are anagrams.");
		} else {
			System.out.println("The numbers are not anagrams.");
		}
		scanner.close();

	}

	public static boolean areAnagrams(int num1, int num2) {
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);

		// If lengths are different then they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare sorted character arrays
		return Arrays.equals(charArray1, charArray2);
		
	}
}
