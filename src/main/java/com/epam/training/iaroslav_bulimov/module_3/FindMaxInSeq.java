package com.epam.training.iaroslav_bulimov.module_3;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        int currentValue;
        int inputCounter = 0;
        while (true) {
            currentValue = sc.nextInt();
            if (currentValue == 0) {
                break;
            } else {
                inputCounter++;
            } if (inputCounter == 1) {
                maxValue = currentValue;
            } else if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        FindMaxInSeq getMax = new FindMaxInSeq();

        int max = getMax.max();

        System.out.println(max);
    }
}
