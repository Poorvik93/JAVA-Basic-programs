import java.util.*;
public class reverse{ 
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int num =sc.nextInt();
 int rev_num=0;
 for(int i=num; i!=0; i=i/10){
        // int remainder = i % 10;
        rev_num = rev_num * 10 + i % 10;
    }
    System.out.println("Reversed number: " + rev_num);
}
}