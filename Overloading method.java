
This is Method for overloading in java.
public class MethodOverloadingExample {

   
    public int add(int a, int b) {
        return a + b;
    }
    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        MethodOverloadingExample obj = new MethodOverloadingExample();

     
        int intResult = obj.add(10, 20);
        System.out.println("Sum of two integers: " + intResult);


        float floatResult = obj.add(10.5f, 20.5f);
        System.out.println("Sum of two floating-point numbers: " + floatResult);
    }
}
