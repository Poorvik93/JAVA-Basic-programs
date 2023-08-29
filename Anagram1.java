
import java.util.*;
class Anagram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str1=sc.nextLine();
        System.out.println("Enter the secondt string :");
        String str2=sc.nextLine();
        Anagram.Anagramstring1( str1, str2) ;
        Anagram.Anagramstring2( str1, str2) ;
        boolean result = Anagramstring3(str1, str2);
        
        // Print the result
        if (result) {
            System.out.println("The input strings are anagrams.");
        } else {
            System.out.println("The input strings are not anagrams.");
        }        sc.close();

        
    }
        public static void Anagramstring1(String str1,String str2) {
            if (str1.length()!=str2.length()){
                System.out.println("Not a anagram");  
            }
            else{
            char []arr1=str1.toCharArray();
            char []arr2=str2.toCharArray();
    
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            String s1 = new String(arr1);
            String s2 = new String(arr2);

            if (s1.equals(s2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }  
    public static void Anagramstring2(String str1,String str2) {
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

    public static boolean Anagramstring3(String str1, String str2) {
                // Convert input strings to character arrays
                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2.toCharArray();
                
                // Sort the character arrays
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                
                // Check if the sorted arrays are equal
                if (Arrays.equals(arr1, arr2)) {
                    return  true; // Strings are anagrams
                } else {
                    return  false; // Strings are not anagrams
                }
            }

}

// Output:-
//     Enter the first string :
//     poorvik
//     Enter the secondt string :
//     poorvik
// Anagram
// It is an anagram.
// The input strings are anagrams.
