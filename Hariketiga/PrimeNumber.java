package Hariketiga;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(17)); // Output: true
        System.out.println(isPrime(4));// Output: false
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
