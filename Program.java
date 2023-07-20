import java.util.*;
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int num=sc.nextInt();
		if(num>100) {
		ProgramApp number=new ProgramApp();
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
