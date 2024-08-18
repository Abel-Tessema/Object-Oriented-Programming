// Write a program that counts all words in a string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String string = new Scanner(System.in).nextLine();
        int spaceCounter = 0;

        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
                spaceCounter++;

        System.out.println("There are " + (spaceCounter + 1) + " words in the string you entered.");
    }
}