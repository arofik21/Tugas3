package Hariketiga;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan operasi: ");
        String input = scanner.nextLine().replaceAll("\\s+", "");

        int a = input.charAt(0) - '0'; //ASII
        int b = input.charAt(2) - '0';
        char operator = input.charAt(1);

        int hasil = 0;

        if (operator == '+') {
            hasil = a + b;
        } else if (operator == '-') {
            hasil = a - b;
        } else if (operator == '*') {
            hasil = a * b;
        } else if (operator == '/') {
            hasil = a / b;
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}
