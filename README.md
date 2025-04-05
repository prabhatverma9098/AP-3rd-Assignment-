# AP-3rd-Assignment-
This is Method for overloading in java.
public class MethodOverloadingExample {

    // Method that adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method that adds two floating-point numbers
    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating an object of MethodOverloadingExample
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Calling the add() method with integers
        int intResult = obj.add(10, 20);
        System.out.println("Sum of two integers: " + intResult);

        // Calling the add() method with floating-point numbers
        float floatResult = obj.add(10.5f, 20.5f);
        System.out.println("Sum of two floating-point numbers: " + floatResult);
    }
}
