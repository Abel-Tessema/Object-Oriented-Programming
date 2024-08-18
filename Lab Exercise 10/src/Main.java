// Write a program that determines and prints the number of odd, even, and zero digits in an integer value read from the keyboard.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        String numString = Integer.toString(num);
        char lastDigit = numString.charAt(numString.length() - 1);
        int oddCounter = 0;
        int evenCounter = 0;
        int zeroCounter = 0;

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == '0')
                zeroCounter++;
            if (numString.charAt(i) == '1' || numString.charAt(i) == '3' || numString.charAt(i) == '5' || numString.charAt(i) == '7' || numString.charAt(i) == '9')
                oddCounter++;
            if (numString.charAt(i) == '0' || numString.charAt(i) == '2' || numString.charAt(i) == '4' || numString.charAt(i) == '6' || numString.charAt(i) == '8')
                evenCounter++;
        }

        System.out.println("The number of odd digits in the number " + num + " is: " + oddCounter + ".");
        System.out.println("The number of even digits in the number " + num + " is: " + evenCounter + ".");
        System.out.println("The number of 0's in the number " + num + " is: " + zeroCounter + ".");

    }
}