package com.epam.training.iaroslav_bulimov.module_3;
import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number = Integer.valueOf(sc.nextLine());
        if (number < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            for (int i = 0; i < number; i++) {
                String stranger = sc.nextLine();
                System.out.println("Hello, " + stranger);
            }
        }
    }
}
