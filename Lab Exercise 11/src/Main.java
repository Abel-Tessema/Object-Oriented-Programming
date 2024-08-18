// Write a program that reads a string from the user and prints it one character per line.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String string = new Scanner(System.in).nextLine();
        for (int i = 0; i < string.length(); i++)
            System.out.println(string.charAt(i));
    }
}