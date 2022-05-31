package com.epam.training.iaroslav_bulimov.module_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int summa = 0;
        int currentValue;
        int countNumbers = 0;
        while (true) {
            currentValue = sc.nextInt();
            if (currentValue == 0) {
                break;
            } else {
                summa += currentValue;
                ++countNumbers;
            }
        }
        int result = summa / countNumbers;
        System.out.println(result);
    }
}
