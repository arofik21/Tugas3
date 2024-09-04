package Hariketiga;

public class SecondSmallest {
    public static void main(String[] args) {
        // Create an array with the given numbers
        int[] arr = {5, 3, 8, 1, 2, 9};

        // Print the input array
        System.out.print("Input: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Initialize the smallest and second smallest values
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE; // Set to maximum possible value

        // Iterate through the array to find the smallest and second smallest values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                // Update second smallest and smallest values
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                // Update second smallest if the current element is smaller
                secondSmallest = arr[i];
            }
        }

        // Print the second smallest value
        System.out.println("Output: " + secondSmallest);
    }
}
