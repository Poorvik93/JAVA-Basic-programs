import java.util.*;
class String_Reverse_EachWord{
    public static void main(String [] args){
        String str="Java Program";
        String revStr="";
        //Approach --1

        // Split the each word storing inthe array.
        String [] words=str.split(" ");
        for (String word:words){
            String revword="";
            //reverse the word
            for(int i=word.length()-1;i>=0;i--){
                revword+=word.charAt(i);
            }
            revStr+=revword+" ";
        }   
        System.out.println(revStr);      
    }
}
