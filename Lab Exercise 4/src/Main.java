// Generate five random numbers between 10 and 20, and find the smallest.

class Main {
    public static void main(String[] args) {
        System.out.print("The five random numbers between 10 and 20 that are generated are: ");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10 + 11);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < smallest)
                smallest = numbers[i];

        System.out.println("The smallest of these is: " + smallest + ".");

    }
}