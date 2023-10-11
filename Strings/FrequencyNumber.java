public class FrequencyNumber {
    public static void main(String args[]) {
        String str = "poorvikgowda";
        frequency(str);
    }

    static final int size = 26;

    // Method to calculate frequency of characters in a string and print them
    public static void frequency(String str) {
        // Array to store character frequency
        int[] arr = new int[size];

        // Calculate character frequency
        int n = str.length();
        for (int i = 0; i < n; i++) {
            arr[str.charAt(i) - 'a']++;
        }

        // Print the frequency of each character
        for (int i = 0; i < n; i++) {
            if (arr[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print(arr[str.charAt(i) - 'a'] + " ");
                arr[str.charAt(i) - 'a'] = 0;
            }
        }
    }
}
