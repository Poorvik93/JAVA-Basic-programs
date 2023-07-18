class NumberApp {
    static void checkNumber(int number) {
    	// Check if the number is greater than zero
        if (number > 0) {
            System.out.println("Positive number");
        }
        // Check if the number is less than zero	

        else if (number < 0) {
            System.out.println("Negative number");
        } 
        // If the number is neither greater than nor less than zero, it must be zero

        else {
            System.out.println("Zero");
        }
    }
}