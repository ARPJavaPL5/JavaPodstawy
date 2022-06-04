package zadania;

import java.util.Arrays;

public class ArrayProgram {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverse = ArrayUtils.reverse(tab);

        System.out.println(Arrays.toString(reverse));

        int[] sumTable = ArrayUtils.addTables(tab, reverse);
        System.out.println(Arrays.toString(sumTable));

        int[] duplicates = { 10, 22, 10, 20, 11, 22 };
        int[] removeDuplicates = ArrayUtils.removeDuplicates(duplicates);
        System.out.println(Arrays.toString(removeDuplicates));

        duplicates = new int[] {1, 2, 1, 1, 2};
        removeDuplicates = ArrayUtils.removeDuplicates(duplicates);
        System.out.println(Arrays.toString(removeDuplicates));

        String str = "domek";
        String str2 = ArrayUtils.swap(str, 1, 3);
        System.out.println(str2);

        int[] s = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        ArrayUtils.insertSort(s);
        System.out.println(Arrays.toString(s));

        s = new int[] {54, 26, 93, 17, 77, 31, 44, 55, 20};
        ArrayUtils.insertSort(s);
        System.out.println(Arrays.toString(s));

    }
}
