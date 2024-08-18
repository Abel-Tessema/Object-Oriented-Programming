// Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;

        while (true) {
            boolean stringIsAlphabetic = true;
            System.out.print("Enter a string with alphabetic characters only: ");
            string = new Scanner(System.in).next();
            for (int i = 0; i < string.length(); i++) {
                if (!Character.isAlphabetic(string.charAt(i))) {
                    System.out.println("The string you entered has non-alphabetic characters!");
                    stringIsAlphabetic = false;
                    break;
                }
            }
            if (stringIsAlphabetic) break;
        }

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U' ||
                string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
                    vowels++;
        consonants = string.length() - vowels;

        System.out.println("The number of vowels in the word \"" + string + "\" is: " + vowels + ".");
        System.out.println("The number of consonants in the word \"" + string + "\" is: " + consonants + ".");
    }
}