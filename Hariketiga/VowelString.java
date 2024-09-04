package Hariketiga;

public class VowelString {
    public static void main(String[] args) {
        // Initialize the input string
        String input = "programming";
        // Initialize a counter for vowels
        int vowelCount = 0;

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            // Check if the character is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        // Print the input string
        System.out.println("Input: \"" + input + "\"");
        // Print the count of vowels
        System.out.println("Output: " + vowelCount);
    }
}
