import java.util.*;
public class NumberTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		NumberTableApp tab=new NumberTableApp();
		tab.main(num);
	}

}
