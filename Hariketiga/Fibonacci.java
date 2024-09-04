package Hariketiga;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int a = 0, b = 1;

        System.out.print("Output: ");

        for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        int temp = a + b;
        a = b;
        b = temp;
        }
    }
}
