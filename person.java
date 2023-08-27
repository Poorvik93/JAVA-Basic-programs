package com.practices25_08_23.revission;

// Define a class named Person to represent a person's name and age
public class Person {
    // Instance variables to store the person's name and age
    String name;
    int age;
    
    // Constructor to initialize the person's name and age when an object is created
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display the person's name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // The main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Person class named person1
        // Initialize it with the name "arun" and age 23
        Person person1 = new Person("arun", 23);
        
        // Call the display method on the person1 object to show the person's details
        person1.display();
    }
}


// Explination:-

// Class Name: I capitalized the class name to follow Java naming conventions (classes start with an uppercase letter).

// Removed Static Modifiers: I removed the static modifier from the name and age variables because they should be instance variables, not shared among all instances of the class.

// Corrected Method Signature: In the main method, I changed String args[] to String[] args for a more standard method signature.

// Instance Method: The display method should be an instance method to access instance variables. I removed the static modifier from it.

// Indentation and Formatting: I corrected the indentation and formatting for better readability and adherence to Java coding conventions.
