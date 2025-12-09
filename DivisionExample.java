public class DivisionExample {

    public static void divide(int a, int b) {
        try {
            int result = a / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        divide(10, 2);   
        divide(8, 0);   
    }
}
