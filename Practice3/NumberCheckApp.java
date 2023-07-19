
public class NumberCheckApp {

	void main(int a,int b,int c) {
		if (a==b && b==c) {
		System.out.println("All are equal");
		}
		else {
			 if(a>b && a>c) {
				System.out.println("large"+a);
				}
				else if(b>c) {
				System.out.println("large " + b);
				}
				else
				{
					System.out.println("large"+c);
			}
		}
	}
}


