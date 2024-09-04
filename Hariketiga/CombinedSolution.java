package Hariketiga;

import java.util.Scanner;

public class CombinedSolution {

    // Soal 1: Menjumlahkan digit dari array
    public static void sumDigits() {
        int[] angka = {1, 2, 3, 4};
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("Jumlah dari array: " + jumlah);
    }

    // Soal 2: Mengecek apakah angka adalah bilangan prima
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

    public static void testPrime() {
        System.out.println("Apakah 17 bilangan prima? " + isPrime(17)); // Output: true
        System.out.println("Apakah 4 bilangan prima? " + isPrime(4)); // Output: false
    }

    // Soal 3: Menemukan elemen terbesar dari array
    public static void findLargestElement() {
        int[] angka = {3, 7, 2, 8, 1};
        int maksimum = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimum) {
                maksimum = angka[i];
            }
        }
        System.out.println("Elemen terbesar: " + maksimum);
    }

    // Soal 4: Kalkulator sederhana
    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan operasi (misal: 3+4): ");
        String input = scanner.nextLine().replaceAll("\\s+", "");

        int a = input.charAt(0) - '0'; // Mengambil angka pertama
        int b = input.charAt(2) - '0'; // Mengambil angka kedua
        char operator = input.charAt(1); // Mengambil operator

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

    // Soal 6: Menghitung jumlah huruf vokal dalam string
    public static void countVowels() {
        String input = "programming";
        int jumlahVokal = 0;
        for (int i = 0; i < input.length(); i++) {
            char huruf = input.charAt(i);
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                jumlahVokal++;
            }
        }
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }

    // Soal 7: Menghasilkan deret Fibonacci
    public static void fibonacciSequence() {
        int n = 6;
        int a = 0, b = 1;

        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // Soal 8: Memeriksa apakah dua string adalah anagram
    public static void checkAnagrams() {
        // Contoh 1
        String kata1 = "listen";
        String kata2 = "silent";

        System.out.println("Input: \"" + kata1 + "\", \"" + kata2 + "\"");

        boolean isAnagram = true;

        if (kata1.length() != kata2.length()) {
            isAnagram = false;
        } else {
            int[] huruf = new int[26];

            for (int i = 0; i < kata1.length(); i++) {
                huruf[kata1.charAt(i) - 'a']++;
                huruf[kata2.charAt(i) - 'a']--;
            }

            for (int count : huruf) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println("Output: " + isAnagram);

        // Contoh 2
        kata1 = "hello";
        kata2 = "world";

        System.out.println("Input: \"" + kata1 + "\", \"" + kata2 + "\"");

        isAnagram = true;

        if (kata1.length() != kata2.length()) {
            isAnagram = false;
        } else {
            int[] huruf = new int[26];

            for (int i = 0; i < kata1.length(); i++) {
                huruf[kata1.charAt(i) - 'a']++;
                huruf[kata2.charAt(i) - 'a']--;
            }

            for (int count : huruf) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println("Output: " + isAnagram);
    }

    // Soal 9: Mencari angka kedua terkecil dalam array
    public static void findSecondSmallest() {
        int[] arr = {5, 3, 8, 1, 2, 9};

        System.out.print("Input: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        int terkecil = arr[0];
        int keduaTerkecil = Integer.MAX_VALUE; // Set keduaTerkecil ke nilai maksimal integer

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < terkecil) {
                keduaTerkecil = terkecil;
                terkecil = arr[i];
            } else if (arr[i] < keduaTerkecil && arr[i] != terkecil) {
                keduaTerkecil = arr[i];
            }
        }

        System.out.println("Output: " + keduaTerkecil);
    }
}
