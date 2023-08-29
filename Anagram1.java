import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class Anagram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str1=sc.nextLine();
        System.out.println("Enter the secondt string :");
        String str2=sc.nextLine();
        Anagram.Anagramstring( str1, str2) ;
    }
        public static void Anagramstring(String str1,String str2) {
            char []arr1=str1.toCharArray();
            char []arr2=str2.toCharArray();
    
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            // boolean areNotEqual=true;
            if (arr1.length!=arr2.length){
                System.out.println("Not a anagram");  
            }
            else {
                boolean areEqual=true;
                for (int i=0;i<arr1.length;i++){
                    if(arr1[i]!=arr2[i]){
                        areEqual=false;
                        break;
                    }
                }
                if (areEqual) {
                    System.out.println("It is an anagram.");
                } else {
                    System.out.println("It is not an anagram.");
                }
            }
    }   



}

// // // second type


// import java.util.Scanner;
// import java.util.Arrays;

// class Anagram {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first string:");
//         String str1 = sc.nextLine();
//         System.out.println("Enter the second string:");
//         String str2 = sc.nextLine();
        
//         // Call the function to check if the input strings are anagrams
//         boolean result = checkAnagram(str1, str2);
        
//         // Print the result
//         if (result) {
//             System.out.println("The input strings are anagrams.");
//         } else {
//             System.out.println("The input strings are not anagrams.");
//         }
//     }
    
//     public static boolean checkAnagram(String str1, String str2) {
//         // Convert input strings to character arrays
//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();
        
//         // Sort the character arrays
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
        
//         // Check if the sorted arrays are equal
//         if (Arrays.equals(arr1, arr2)) {
//             return true; // Strings are anagrams
//         } else {
//             return false; // Strings are not anagrams
//         }
//     }
// }
