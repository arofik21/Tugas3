package Hariketiga;

public class VowelStrig {
    public static void main(String[] args) {
        String input = "programming";
        int jumlahVokal = 0;
        for (int i = 0; i < input.length(); i++) {
            char huruf = input.charAt(i);
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' ||
                    huruf == 'u')
            {jumlahVokal++;}
        }

            System.out.println("Input: \"" + input + "\"");
            System.out.println("Output: " + jumlahVokal);
        }
}
