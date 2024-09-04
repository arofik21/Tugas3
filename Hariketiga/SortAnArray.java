package Hariketiga;

public class SortAnArray {
    public static void main(String[] args) {
        // Create an array with unsorted numbers
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // Print the array before sorting
        System.out.println("Before sorting:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Sorting the array using bubble sort algorithm
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the positions of numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the array after sorting
        System.out.println("After sorting:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
