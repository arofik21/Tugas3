package Hariketiga;
public class SumDigit {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan input
        int[] angka = {1, 2, 3, 4,};

        // Menghitung jumlah dari semua angka
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        // Menampilkan hasil
        System.out.println(jumlah);
    }
}