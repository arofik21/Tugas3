package Hariketiga;
public class ReverseString {
    public static void main(String[] args) {
        // Initialize the string to be reversed
        String input = "hello";
        // Initialize an empty string to store the reversed result
        String reversed = "";

        // Iterate from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += input.charAt(i);
        }

        // Print the input string
        System.out.println("Input: \"" + input + "\"");
        // Print the reversed string
        System.out.println("Output: \"" + reversed + "\"");
    }
}
