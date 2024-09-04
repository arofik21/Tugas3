package Hariketiga;
public class SumDigit {
    public static void main(String[] args) {
        // Creating an array to store input
        int[] numbers = {1, 2, 3, 4};

        // Calculating the sum of all numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Displaying the result
        System.out.println(sum);
    }
}
