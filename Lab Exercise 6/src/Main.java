// Insert a string using scanner and count the number of 'a' in the string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String string = new Scanner(System.in).nextLine();

        int counter = 0;

        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == 'a')
                counter++;

        System.out.println("The number of times the letter 'a' appears in the string \"" + string + "\" is: " + counter + ".");
    }
}