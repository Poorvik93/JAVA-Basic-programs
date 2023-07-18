//4. Write a Java program that prints "Vote Eligible" if a person's age is 18 or above.

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
//		creating the scaanner class
		Scanner sc =new Scanner(System.in);
//		taking user input
		System.out.println("Enter the Age");
//		store the user input to veriable a
		int a=sc.nextInt();
		VoteApp ag=new  VoteApp();
//		call 
		ag.ageVote(a);
	}

}
