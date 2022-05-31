package com.epam.training.iaroslav_bulimov.module_3;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (a >= h) {
            System.out.println(1);
        } else if (a<=b) {
            System.out.println("Impossible");
        } else {
            int diff = a - b;
            int result = (h - a) / diff;
            System.out.println(Math.round(result + 1));
        }
    }
}
