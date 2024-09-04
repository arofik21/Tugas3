package Hariketiga;

public class LargestElement {
    public static void main(String[] args) {
        // Creating an array to store the input numbers
        int[] numbers = {3, 7, 2, 8, 1};

        // Initializing the maximum variable with the first element of the array
        int maximum = numbers[0];

        // Iterating through the array to find the largest number
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }

        // Displaying the largest number
        System.out.println(maximum);
    }
}
