package com.epam.training.iaroslav_bulimov.module_4;


public class SumOfEvenNumbers {
    public static int sum(int[] sum) {
        int amount = 0;
        if (sum == null || sum.length == 0) {
            return 0;
        }
        for (int elem: sum) {
            if (elem % 2 == 0) {
                System.out.println(elem);
                amount += elem;
            }
        }
        return amount;
    }
    public static void main(String[] args) {
        int[]vals = new int[]{-2,10,0,5};
        int result = SumOfEvenNumbers.sum(vals);
        System.out.println(result);
    }
}
