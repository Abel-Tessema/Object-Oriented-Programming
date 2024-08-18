// Insert 'n' integers from the keyboard and calculate the sum and average.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number of integers you want to input: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;
        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / size;

        System.out.println("Their sum is: " + sum + ".");
        System.out.println("Their average is: " + average + ".");
    }
}