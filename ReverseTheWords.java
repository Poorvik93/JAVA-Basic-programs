package com.practies.string04_09_2023;

import java.util.Scanner;

public class ReverseTheWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");

        String s = sc.nextLine();
        // Split the input string into words using space as a delimiter
        String[] str = s.split(" "); 
        for (int i = 0; i < str.length; i++) {
        	// Convert the current word to a character array
            char[] ch = str[i].toCharArray(); 
            // Create an array to store the reversed characters
            char[] ch1 = new char[ch.length];
            // Reverse the characters within the current word
            for (int j = 0; j < ch.length; j++) {
            	// Reverse characters by placing them in the opposite order
                ch1[ch1.length - 1 - j] = ch[j]; 
            }

            String str3 = new String(ch1); // Create a new string from the reversed character array
            System.out.print(str3 + " "); // Print the reversed word followed by a space
        }
        sc.close();
    }
}
