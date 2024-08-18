// Write a program that reverses the digits of a given positive integer number entered from the keyboard (don't use array).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 123;
        while (true) {
            System.out.print("Enter a positive integer: ");
            num = scanner.nextInt();
            if (num > 0) break;
            System.out.println("The number entered is not a positive integer!");
        }

        String numString = Integer.toString(num);
        System.out.println(numString);

        String reverseNumString = "";
        for (int i = 0; i < numString.length(); i++)
            reverseNumString += numString.charAt(numString.length() - i - 1);

        System.out.println("The reverse of the number " + num + " is: " + reverseNumString + ".");

    }
}
