import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        int arr[] = new int[5];  // Create an array to store 5 integers
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read input

        System.out.println("Enter the elements for an array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Read integers from the user and store in the array
        }
        System.out.println();  // Print a newline for formatting

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element of the array followed by a space
        }

        // Print the array in reverse order
        System.out.println("\nArray in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");  // Print each element of the array in reverse order followed by a space
        }
    }
}
