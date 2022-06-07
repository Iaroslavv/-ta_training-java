package com.epam.training.iaroslav_bulimov.module_4;
import java.util.Arrays;

public class SumOfPrevious {
    public static boolean[] getSumCheckArray(int[] values) {
        boolean[] array = new boolean[values.length];
        array[0] = false;
        array[1] = false;
        for (int i = 2; i < values.length; i++) {
            if (values[i] == values[i - 2] + values[i - 1]) {
                array[i] = true;
            } else {
                array[i] = false;
            }
        }
        return array;

    }
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(array)));

    }
}
