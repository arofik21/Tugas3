package Hariketiga;

public class LargestElemen {
    public static void main(String[] args) {
        int[] angka = {3, 7, 2, 8, 1};
        int maksimum = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimum) {
                maksimum = angka[i];
            }
        }

        System.out.println(maksimum);
    }
}
