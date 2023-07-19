import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int Length=sc.nextInt();
		System.out.println("Enter the Breadth");
		int Breadth=sc.nextInt();
		RectangleApp rs=new RectangleApp();
		rs.main(Length, Breadth);
		
	}

}
