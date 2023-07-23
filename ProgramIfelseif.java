import java.util.*;
public class ProgramIfelseif {

	public static void main(String[] args) 
	{
//		creating the object of Scanner class
		Scanner scan=new Scanner(System.in);
//		asking to enter the number
		System.out.println("Enter the number");
//		Storing the number in variable num
		int num =scan.nextInt();
//		Checking whether the number is in the range from 1 to 10
		if(num>=0 && num<=10) {
			System.out.println("Range 1");
		}
//		Checking whether the number is in the range from 10 to 20
		else if(num>10 && num<=20) {
			System.out.println("Range 2");
		}
//		Checking whether the number is in the range from 20 to 30
		else if(num>20 && num<=30) {
			System.out.println("Range 3");
		}
//		Checking whether the number is in the range from  30 to 40
		else if(num>30 && num<=40) {
			System.out.println("Range 4");
		}
//		Checking whether the number is in the range from  40 to 50
		else if(num>40 && num<=50) {
			System.out.println("Range 5");
		}
//		Checking whether the number is in the out of range
		
		else {
			System.out.println("out of range");
		}
	}

}
