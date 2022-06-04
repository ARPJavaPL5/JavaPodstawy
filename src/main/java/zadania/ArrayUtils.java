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


    // tab = [10, 22, 10, 20, 11, 22]
    // dlugosc = tab.length
    // 10
    //  10 - 22
    //  10 - 10 - duplikat
    // [10, 22, 22, 20, 11, 10]
    // dlugosc = dlugosc - 1
    // 22
    //   22 - 22 - duplikat
    // [10, 22, 11, 20, 22, 10]

    // result = tablica[dlugosc]
    // [10, 22, 11, 20]

    public static int[] removeDuplicates(int[] tab) {
        int dlugosc = tab.length;

        for (int i = 0; i < tab.length - 1 - (tab.length - dlugosc); i++) {
            for (int j = i + 1; j < tab.length - (tab.length - dlugosc); j++) {
                if (tab[i] == tab[j]) {
                    swap(tab, j, dlugosc - 1);
                    dlugosc--;
                }
            }
        }

        int[] result = new int[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            result[i] = tab[i];
        }

        return result;
    }

    public static void insertSort(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int j = i;
            while (j > 0 && tab[j - 1] > tab[j]) {
                swap(tab, j, j - 1);
                j--;
            }
        }
    }

    public static void insertSortUsingFor(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            for (int j = i; j > 0 && tab[j - 1] > tab[j]; j--) {
                swap(tab, j, j - 1);
            }
        }
    }

    private static void swap(int[] tab, int index1, int index2) {
        int tmp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = tmp;
    }

    public static String swap(String str, int index1, int index2) {
        char[] chars = str.toCharArray();
        char tmp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = tmp;

        return String.valueOf(chars);
    }
}
