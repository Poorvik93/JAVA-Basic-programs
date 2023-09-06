public class TablePrinter {
    public static void main(String[] args) {
        // Change this to the desired number
        int number = 5;
        // Change this to the desired limit 
        int limit = 10; 
        printTable(number, 1, limit);
    }

    public static void printTable(int number, int current, int limit) {
        if (current > limit) {
            // Base case: stop when the current value exceeds the limit
            return;
        }
        System.out.println(number + " x " + current + " = " + (number * current));
        printTable(number, current + 1, limit); 
    }
}
