
public class ProgramApp {
	// create the method for isDivisibleByTwo
	public void  isDivisibleByTwo(int num) {
		System.out.println("the numbers is divisible by 2 are :" );
	// condition for checking isDivisibleByTwo
		for (int i=1;i<=num;i++) {
			if(i %2==0) {
				System.out.print(i+ " ");
			}
		
		}
		System.out.print( "\n ");

	}
	
	// create the method for isDivisibleByThree
	public void  isDivisibleByThree(int num) {
		System.out.println("the numbers is divisible by 3 are :");
		// condition for checking isDivisibleByThree

		for (int i=1;i<=num;i++) {
			if(i %3==0) {
				System.out.print( i+ " ");
			}
		
		}
		System.out.print( "\n ");

	}
	// create the method for isDivisibleByFive
	public void  isDivisibleByFive(int num) {
		System.out.println("the numbers is divisible by 5 are :");
		// condition for checking isDivisibleByFive
		for (int i=1;i<=num;i++) {
			if( i %5==0) {
				System.out.print(i+ " ");
			}
		
		}
		System.out.print( "\n ");

	}
	// create the method for isDivisibleByTwoAndFive

	public void  isDivisibleByTwoAndFive(int num) {
		System.out.println("the numbers is divisible by 2 and 5 are :");
		// condition for checking isDivisibleByTwoAndFive
		for (int i=1;i<=num;i++) {
			if(i%2==0 && i %5==0) {
				System.out.print(i+ " ");
			}
		
		}
		System.out.print( "\n ");
	}
	// create the method for isDivisibleByThreeTable5
	public void  isDivisibleByThreeTable5(int num) {
		System.out.println("the numbers is divisible by 3 and comes in table of 5 :");
		// condition for checking isDivisibleByThreeTable5
		for (int i=1;i<=num;i++) {
			if(i %3==0 && i%5==0) {
				System.out.print(i + " ");
			}
		
		}
		System.out.print( "\n ");

	}
	// create the method for primeNum

	public void  primeNum(int num) {
		System.out.println("Prime numbers are");
		// condition for checking primeNum
		for( int j=2;j<=num;j++) {
			int count =0;
			for (int i=1; i<=j;i++) {
				if (j%i==0) {
					count++;
				}
			}
			if(count == 2)
				System.out.print(j+ " ");
		}
		System.out.println("\n");
	}
	// create the method for evenDivisibleByThree
	public void  evenDivisibleByThree(int num) {
		System.out.println("even number divisuble by 3 are :");
		// condition for checking evenDivisibleByThree
		for (int i=1;i<=num;i++) {
			if(i%2==0 && i%3==0) {
				System.out.print(i + " ");
			}
		}
		System.out.print( "\n ");

	}
	// create the method for oddDivisibleByFive
	public void  oddDivisibleByFive(int num) {
		System.out.println("odd number divisuble by 5 are :");
		// condition for checking oddDivisibleByFive
		for (int i=1;i<=num;i++) {
			if(i%2!=0 && i%5==0) {
				System.out.print(i + " ");
			}
		}
		System.out.print( "\n ");

	}
	// create the method for evenPrimeNum
	public void  evenPrimeNum(int num) {

		System.out.print("Even Prime numbers are : ");
		// condition for checking evenPrimeNum
		for( int j=2;j<=num;j++) {
			int count =0;
			for (int i=1; i<=j;i++) {
				if (j%i==0 && j%2==0) {
					count++;
				}
			}
			if(count == 2)
				System.out.println(j+ " ");
		}
		System.out.println("\n");
	
	}
	// create the method for oddPrimeNum
	public void  oddPrimeNum(int num) {

		System.out.print("odd Prime numbers are :");
		// condition for checking oddPrimeNum
		for( int j=2;j<=num;j++) {
			int count =0;
			for (int i=1; i<=j;i++) {
				if (j%i==0 && j%2!=0) {
					count++;
				}
			}
			if(count == 2)
				System.out.print(j+ " ");
		}
		System.out.println("\n");
	
	}
	
	
}



