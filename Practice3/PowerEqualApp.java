

public class PowerEqualApp {


    public static void main(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
	        System.out.println("Result: " + result);
        }
    }
   }