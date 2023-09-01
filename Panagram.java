import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        boolean isPangram = checkPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
        sc.close();
    }
    
    public static boolean checkPangram(String sentence) {
        // Create a boolean array to mark presence of letters (26 letters in English alphabet)
        boolean[] alphabet = new boolean[26];
        
        // Convert the sentence to lowercase to handle both uppercase and lowercase letters
        sentence = sentence.toLowerCase();
        
        // Iterate through the sentence and mark the presence of letters
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Convert character to array index (a=0, b=1, ...)
                alphabet[index] = true;
            }
        }
        
        // Check if all letters are present in the array
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }
        
        return true;
    }
}


// 2nd metode..

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        boolean isPangram = checkPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    
    public static boolean checkPangram(String sentence) {
        boolean[] letters = new boolean[26];
        int count = 0;
        
        // Convert the sentence to lowercase to handle both uppercase and lowercase letters
        sentence = sentence.toLowerCase();
        
        // Iterate through the sentence and mark the corresponding letter index as true
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    count++;
                }
            }
        }
        
        // Check if all letters of the alphabet are present
        return count == 26;
    }
}



// }
