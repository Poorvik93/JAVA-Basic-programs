import java.util.*;
public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		NumberCheckApp lg=new NumberCheckApp();
		lg.main(a, b, c);

	}

}
