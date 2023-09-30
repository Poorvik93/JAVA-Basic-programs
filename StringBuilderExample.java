public class StringBuilderExample {

    public static void main(String[] args) {
        // Create a StringBuilder instance
        StringBuilder stringBuilder = new StringBuilder();

        // Append a string to the StringBuilder
        stringBuilder.append("Hello, ");

        // Append a variable to the StringBuilder
        int age = 25;
        stringBuilder.append("I am ")
                     .append(age)
                     .append(" years old.");

        // Print the contents of the StringBuilder
        System.out.println("StringBuilder content: " + stringBuilder.toString());

        // String formatting using String.format()
        String formattedString = String.format("My age is %d years old.", age);

        // Print the formatted string
        System.out.println("Formatted String: " + formattedString);
    }
}
