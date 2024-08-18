// Check if an inserted string is a palindrome or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String string = new Scanner(System.in).nextLine();
        String reverseString = "";

        for (int i = 0; i < string.length(); i++)
            reverseString += string.charAt(string.length() - i - 1);

        if (string.equals(reverseString)) System.out.println("The word \"" + string + "\" is a palindrome.");
        else  System.out.println("The word \"" + string + "\" is not a palindrome.");
    }
}