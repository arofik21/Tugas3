package Hariketiga;

public class sortAnArray {
    public static void main(String[] args) {
        int[] angka = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Sebelum diurutkan:");
        for (int n : angka) {
            System.out.print(n + " ");
            }
            System.out.println();

            // Pengurutan
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length - 1; j++) {
                if (angka[j] > angka[j + 1]) {
                        // Tukar posisi
                        int temp = angka[j];
                        angka[j] = angka[j + 1];
                        angka[j + 1] = temp;
                }
            }
        }

        System.out.println("Setelah diurutkan:");
        for (int n : angka) {
            System.out.print(n + " ");
        }
    }
}
