import java.util.*;
public class primenum{    
    public static void main(String[] args){  
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the num"); 
      int num=sc.nextInt();
      int m=num/2;
      boolean flag = false;
      for (int i = 2; i <= m; ++i) {
        // condition for nonprime number
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (!flag)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
    }
  }
