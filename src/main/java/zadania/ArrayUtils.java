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

    // dodanie dwóch tablic
    // [1, 2, 3] + [1, 2, 3] = [1, 2, 3, 1, 2, 3]
    public static int[] addTables(int[] table1, int[] table2) {
        int[] result = new int[table1.length + table2.length];

        for (int i = 0; i < table1.length; i++) {
            result[i] = table1[i];
        }

        for (int i = 0; i < table2.length; i++) {
            result[table1.length + i] = table2[i];
        }

        return result;
    }
}
