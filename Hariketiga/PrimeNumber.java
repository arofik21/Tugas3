package Hariketiga;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(17)); // Output: true
        System.out.println(isPrime(4));  // Output: false
    }

    public static boolean isPrime(int number) {
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Loop from 2 to one less than the number
        for (int i = 2; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }
}
