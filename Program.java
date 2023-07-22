import java.util.*;
public class Program {

	public static void main(String[] args) {
		 // Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		// user input entering field
		System.out.println("Enter the input");
		int num=sc.nextInt();
		// if num is greater then 1000=
		if(num>100) {
		ProgramApp number=new ProgramApp();
//		Call the all methods present in ProgramApp class
		number.isDivisibleByTwo(num);
		number.isDivisibleByFive(num);
		number.isDivisibleByThree(num);
		number.isDivisibleByThreeTable5(num);
		number.isDivisibleByTwoAndFive(num);
		number.primeNum(num);
		number.evenDivisibleByThree(num);
		number.oddDivisibleByFive(num);
		number.evenPrimeNum(num);
		number.oddPrimeNum(num);
		
		}
	}

}
