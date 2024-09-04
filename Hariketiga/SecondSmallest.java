package Hariketiga;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 9};

        System.out.print("Input: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        int terkecil = arr[0];
        int keduaTerkecil = arr[0];

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
