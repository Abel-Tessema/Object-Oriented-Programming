/*
Define a class Product with members name, price, qty, calcCost(), and calcTax().
Input values:
  - using a constructor
  - using input from the keyboard (Scanner)
  - what if for 'n' products?
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of products you want to enter: ");
        int numberOfProducts = scanner.nextInt();
        Product[] products = new Product[numberOfProducts];

        String tempName;
        double tempPrice;
        int tempQty;
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter the information for product " + (i + 1) + ":");
            System.out.print("Name: ");
            tempName = scanner.next();
            System.out.print("Price: ");
            tempPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            tempQty = scanner.nextInt();
            products[i] = new Product(tempName, tempPrice, tempQty);
        }
        System.out.println();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Product " + (i + 1) + " (" + products[i].getName() + ", $" + products[i].getPrice() + ", " + products[i].getQty() + " items)");
            System.out.println("Total cost including taxes: $" + String.format("%.2f", products[i].calcCost()));
            System.out.println();
        }
    }
}