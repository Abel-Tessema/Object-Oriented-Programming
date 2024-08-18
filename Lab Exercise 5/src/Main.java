// Generate 5 random numbers between 1 and 50, and find the largest two.

class Main {
    public static void main(String[] args) {
        System.out.print("The five random numbers between 1 and 50 that are generated are: ");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 50 + 1);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int largest = numbers[0];
        int nextToLargest = numbers[0];

        for (int i = 0; i < numbers.length; i++)
            if (largest < numbers[i])
                largest = numbers[i];

        for (int i = 0; i < numbers.length; i++)
            if (nextToLargest < numbers[i] && numbers[i] < largest)
                nextToLargest = numbers[i];

        System.out.println("The largest two of these are: " + nextToLargest + " and " + largest + ".");

    }
}