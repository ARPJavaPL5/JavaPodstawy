package zadania;

public class ArrayUtils {

    /*
    Odwrócenie tablicy
     */
    public static int[] reverse(int[] table) {
        int[] result = new int[table.length];

        // [1, 2, 3, 4]
        for (int i = table.length - 1; i >= 0; i--) {
            result[result.length - 1 - i] = table[i];
        }

        // [4, 3, 2, 1]
        return result;
    }
}
