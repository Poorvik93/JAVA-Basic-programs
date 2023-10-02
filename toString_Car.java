class toString_CarApp{
    public static void main(String[] args ){
        toString_Car car=new toString_Car();
  
        //toString() =speciall method that all objects inhertit,
        //that returns a string that "textually represents" an object.
       //can be used both implicitly and explicitly

        System.out.println(car.toString());
        System.out.println(car);

        //above the Calling and printing the toString method OR print the instance veriable car both will give the same out put.

    }
}

public class toString_Car{
    String make="food";
    String model="Mustang";
    String color ="Red";
    int year =2023;

    public String toString(){
        System.out.println();
        // String myStr=make +" " + model+" "+ color + " "+ year;
        return make +" " + model+" "+ color + " "+ year;
    }
}












// The provided code includes two Java classes, toString_CarApp and toString_Car, demonstrating the use of the toString() method for creating a custom string representation of an object.

// toString_CarApp Class:

// This class contains the main method, which is the entry point of the program.
// It creates an instance of the toString_Car class named car.
// It demonstrates the use of toString() implicitly through System.out.println(car.toString()) and explicitly through System.out.println(car).
// toString_Car Class:

// This class represents a car and has member variables for the make, model, color, and year of the car.
// It overrides the toString() method to customize the string representation of the toString_Car object.
// Inside the toString() method, it prints a newline character using System.out.println() (which isn't necessary for creating a string representation).
// It then creates and returns a string representation by concatenating the make, model, color, and year.
// Output Explanation:

// When calling car.toString() or System.out.println(car), the toString() method of the toString_Car class is implicitly called.
// The toString() method returns a string formed by concatenating the car's make, model, color, and year, separated by spaces.
// This string is then printed using System.out.println().
// The output will be the concatenation of the make, model, color, and year of the car.
// Overall, the purpose of this code is to demonstrate how the toString() method can be overridden to provide a custom string representation for an object. In this case, it's used to display information about a car in a specific format.




