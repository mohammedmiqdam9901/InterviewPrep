package Test;


import java.util.Arrays;
import java.util.Arrays;

public class Rangoli {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        int size = 5;
        String[] rangoli = new String[size - 1];

        for (int i = 0; i < size - 1; i++) {
            rangoli[i] = "";
            for (int j = size - 2 - i; j >= 0; j--) {
                rangoli[i] += ALPHABET.charAt(j);
            }
            for (int j = 1; j <= i; j++) {
                rangoli[i] += ALPHABET.charAt(j);
            }
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(String.join("-", rangoli[i]));
        }
    }
}