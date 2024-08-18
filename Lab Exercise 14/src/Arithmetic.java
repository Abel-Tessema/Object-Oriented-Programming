public class Arithmetic {
    Arithmetic(double num1, double num2) {
        Arithmetic.num1 = num1;
        Arithmetic.num2 = num2;
    }
    public void add() {
        System.out.println("Their sum is: " + (num1 + num2));
    }
    public static void add(double firstNum, double secondNum) {
        System.out.println("Their sum is: " + (firstNum + secondNum));
    }

    public void subtract() {
        System.out.println("Their difference is: " + (num1 - num2));
    }
    public static void subtract(double firstNum, double secondNum) {
        System.out.println("Their difference is: " + (firstNum - secondNum));
    }

    public void multiply() {
        System.out.println("Their product is: " + (num1 * num2));
    }
    public static void multiply(double firstNum, double secondNum) {
        System.out.println("Their product is: " + (firstNum * secondNum));
    }
    public void divide() {
        if (num2 != 0) System.out.println("Their quotient is: " + (num1 / num2));
        else System.out.println("Division by zero is not allowed.");
    }
    public static void divide(double firstNum, double secondNum) {
        if (secondNum != 0) System.out.println("Their quotient is: " + (firstNum / secondNum));
        else System.out.println("Division by zero is not allowed.");
    }

    private static double num1;
    private static double num2;
}