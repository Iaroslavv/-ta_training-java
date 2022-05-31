package com.epam.training.iaroslav_bulimov.module_2;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSeconds = sc.nextInt();
        int hours = inputSeconds / 3600 % 24;
        int minutes = inputSeconds % 3600 / 60;
        int seconds = inputSeconds % 3600 % 60;
        System.out.println(String.format("%d:%02d:%02d", hours, minutes, seconds));
    }
}
