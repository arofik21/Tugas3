package Hariketiga;

public class CheckString {
    public static void main(String[] args) {
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

        // Contoh kedua
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
}

