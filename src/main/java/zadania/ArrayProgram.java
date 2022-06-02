package zadania;

import java.util.Arrays;

public class ArrayProgram {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverse = ArrayUtils.reverse(tab);

        System.out.println(Arrays.toString(reverse));
    }
}
