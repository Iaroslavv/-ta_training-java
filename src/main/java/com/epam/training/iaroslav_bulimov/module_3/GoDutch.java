package com.epam.training.iaroslav_bulimov.module_3;
import java.util.Scanner;
public class GoDutch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = sc.nextInt();
        int totalFriends = sc.nextInt();
        if (totalAmount < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (totalFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            int percents = ( (int)(totalAmount*(10.0f/100.0f)) ) / totalFriends;
            int result = (totalAmount / totalFriends) + percents;
            System.out.println(result);
        }
    }
}
