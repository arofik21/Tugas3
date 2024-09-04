package Hariketiga;

public class Fibonacci {
    public static void main(String[] args) {
        // Number of Fibonacci numbers to generate
        int n = 6;
        // Initialize the first two numbers in the Fibonacci sequence
        int a = 0, b = 1;

        // Print the label for the output
        System.out.print("Output: ");

        // Loop to generate and print the first 'n' Fibonacci numbers
        for (int i = 0; i < n; i++) {
            // Print the current number
            System.out.print(a + " ");
            // Calculate the next number in the sequence
            int temp = a + b;
            // Update 'a' to the next number in the sequence
            a = b;
            // Update 'b' to the new number
            b = temp;
        }
    }
}
