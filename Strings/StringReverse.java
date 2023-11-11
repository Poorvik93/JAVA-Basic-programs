import java.util.Scanner;

public class StringReverse {
 public static void main(String[] args) {
    // Approach 1:-convert string into char array
    // String str="hello";
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.next();
    // Approach 1 A 
    char [] arr=str.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
    System.out.println();
    // Approach 1 B
    char [] arr1=str.toCharArray();
    for(int i=arr1.length-1;i>=0;i--){
        System.out.print(arr1[i]);
    }
        System.out.println();

    // Approach 2:-- Using charAt()  method

    for(int i=str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
    System.out.println();
    // Approach 3:-- pre defined reverse class using StringBuffer mehode

    StringBuffer sb=new StringBuffer(str);
    System.out.print(sb.reverse());
    System.out.println();
    // Approach 4:-- pre defined reverse class using StringBuilder mehode

    StringBuilder build=new StringBuilder(str);
    System.out.println(build.reverse());

    }
}

// OUTPUT:- 
// olleh
// olleh
// olleh
// olleh
