/*
Write a program that accepts 5 integers and display:
  1. the smallest
  2. only evens
  3. count only integers > 50

 */

import java.util.Scanner;

class Main {
    static int[] numbers = new int[5];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Find the smallest");
            System.out.println("2. Show only even numbers");
            System.out.println("3. Count the integers greater than 50");
            System.out.println("4. Exit program");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int smallest = findSmallestInteger();
                    System.out.println("The smallest number is " + smallest + ".\n");
                    break;
                case 2:
                    showEvenNumbers();
                    break;
                case 3:
                    int counter = largeNumberCounter();
                    System.out.println("The number of integers greater than 50 is: " + counter + ".\n");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice number!");
                    break;
            }
        }
    }

    public static int findSmallestInteger() {
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        return smallest;
    }

    public static void showEvenNumbers() {
        System.out.print("The even numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\n");
    }

    public static int largeNumberCounter() {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                counter++;
            }
        }
        return counter;
    }
}