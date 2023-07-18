//6. Write a Java program that prints "Pass" if a student's grade is above 50, else it prints
//"Fail".
import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creating the scaanner class
		Scanner sc =new Scanner(System.in);
//		taking user input
		System.out.println("Enter the grade");
		int grade=sc.nextInt();
		PassApp g=new PassApp();
		g.grades(grade);
		
	}

}
