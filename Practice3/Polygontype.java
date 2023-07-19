import java.util.*;
public class Polygontype {

	public static void main(String[] args) {
		 // Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of polygon");
		int sides=sc.nextInt();
		PolygontypeApp polygon=new PolygontypeApp();
		polygon.Pollygon(sides);
	}

}
