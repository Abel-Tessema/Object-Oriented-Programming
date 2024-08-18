/*
Define four static methods of a simple arithmetic calculator.
Input values:
  - using constructor
  - using input from keyboard (Scanner)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println();

        Arithmetic arithmetic = new Arithmetic(num1, num2);
        arithmetic.add();
        arithmetic.subtract();
        arithmetic.multiply();
        arithmetic.divide();

        System.out.println();

        Arithmetic.add(num1, num2);
        Arithmetic.subtract(num1,num2);
        Arithmetic.multiply(num1,num2);
        Arithmetic.divide(num1,num2);
    }
}