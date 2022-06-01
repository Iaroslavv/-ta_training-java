package com.epam.training.iaroslav_bulimov.module_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalMaximaRemove {
    public static int[] removeLocalMaxima(int[] array) {
        List<Integer> arrayToAdd = new ArrayList<Integer>();
        if (array[0] <= array[1]) {
            arrayToAdd.add(array[0]);
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1] || array[i] <= array[i - 1]) {
                arrayToAdd.add(array[i]);
            }
        }
        if (array[array.length - 2] >= array[array.length - 1]) {
            arrayToAdd.add(array[array.length - 1]);
        }

        int[] arr = new int[arrayToAdd.size()];
        for (int i = 0; i < arrayToAdd.size(); i++) {
            arr[i] = arrayToAdd.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }
}
