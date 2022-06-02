package zadania;

import java.util.Arrays;

public class Binary {

    public static void main(String[] args) {

        int liczba = 123;
        int binary = 0;

        String binaryString = "";
        int binaryInt = 0;
        int mnoznik = 1;

        int[] binaryTab = new int[0];

        while (liczba != 0) {
            binary = liczba % 2;
            liczba = liczba / 2;

            // String
            binaryString = binary + binaryString;

            // int
            binaryInt = binary * mnoznik + binaryInt;
            mnoznik = mnoznik * 10;

            // array
            binaryTab = addToArray(binaryTab, binary);
        }

        System.out.println(binaryString);
        System.out.println(binaryInt);
        System.out.println(Arrays.toString(binaryTab));
    }

    private static int[] addToArray(int[] tab, int val) {
        // tab = [1, 2, 3] val = 4
        // result = [4, 1, 2, 3]

        int[] result = new int[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            result[i + 1] = tab[i];
        }
        result[0] = val;

        return result;
    }
}