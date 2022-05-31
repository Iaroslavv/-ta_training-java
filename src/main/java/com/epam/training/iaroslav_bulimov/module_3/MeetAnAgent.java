package com.epam.training.iaroslav_bulimov.module_3;
import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        if (password == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
