package com.epam.training.iaroslav_bulimov.module_4;

import java.util.Arrays;
class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length != 0) {
            int ind = array.length - 1;
            int tmp = array[ind];
            System.arraycopy(array, 0, array, 1, ind);
            array[0] = tmp;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        for (int j=0; j<shift; j++)
        {
            for (int i=array.length-1; 0 < i; i--)
            {
                int temp=array[i-1];
                array[i-1]=array[i];
                array[i]=temp;
            }
        }
    }
    static public void main(String[] args) {
        int[] array = new int[]{ 7, 8, 9, 1, 2, 3, 4, 5, 5, 6};
        CycleSwap.cycleSwap(array, 9);
        System.out.println(Arrays.toString(array));
    }
}
